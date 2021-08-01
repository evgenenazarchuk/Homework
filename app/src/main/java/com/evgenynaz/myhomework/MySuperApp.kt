package com.evgenynaz.myhomework

import android.app.Application
import com.evgenynaz.myhomework.homework16.Homework16ViewModel
import com.evgenynaz.myhomework.homework16.database.DatabaseConstructor
import com.evgenynaz.myhomework.homework16.database.MessageDatabase
import com.evgenynaz.myhomework.homework16.database.MessageRepository
import com.evgenynaz.myhomework.homework17.Homework17ViewModel
import com.evgenynaz.myhomework.homework17.restApi.CurrencyRepository
import com.evgenynaz.myhomework.homework17.restApi.CurrencyService
import com.evgenynaz.myhomework.sharedpref.SharedPrefsKeys
import com.evgenynaz.myhomework.sharedpref.SharedPrefsUtils
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MySuperApp : Application() {
//    OLD
//    private val messageDatabase: MessageDatabase by lazy {
//        Room.databaseBuilder(this, MessageDatabase::class.java, "message_database").build()
//    }
//    private val messageDao: MessageDao by lazy { messageDatabase.MessageDao() }
//
//    val messageRepository: MessageRepository by lazy { MessageRepository(messageDao) }
//
//    val currencyRepository: CurrencyRepository by lazy {
//        CurrencyRepository(CurrencyService.getCurrencyService())
//    }

    override fun onCreate() {
        super.onCreate()

        SharedPrefsUtils.sharedPrefs =
            applicationContext.getSharedPreferences(SharedPrefsKeys.PREFS_KEY, MODE_PRIVATE)

       /* SharedPrefsLocationUtils.sharedPrefs =
            applicationContext.getSharedPreferences(SharedPrefsLocationUtils.PREFS_KEY,
                MODE_PRIVATE)*/

        startKoin {
            androidContext(this@MySuperApp)
            modules(listOf(repositoryModule, viewModels, currencyApi, storageModule))
        }
    }

    private val viewModels = module {
        viewModel { Homework17ViewModel(get()) }
        viewModel { Homework16ViewModel(get()) }
        //viewModel { WeatherViewModel(get()) }
    }

    private val repositoryModule = module {  //создаем репозитории
        factory { CurrencyRepository(get()) }
        factory { MessageRepository(get()) }
       // factory { WeatherRepository(get()) }
    }

    private val currencyApi = module {
        factory { CurrencyService.getCurrencyService() }
     //   factory { WeatherApiService.getWeatherService() }
    }

    private val storageModule = module {
        single { DatabaseConstructor.create(get()) }  //создаем синглтон базы данных
        factory { get<MessageDatabase>().MessageDao() } //предоставляем доступ для конкретной Dao (в нашем случае MessageDao)
    }
}