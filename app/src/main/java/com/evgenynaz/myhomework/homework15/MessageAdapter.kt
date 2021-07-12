package com.evgenynaz.myhomework.homework15

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evgenynaz.myhomework.databinding.MessageActivity15Binding

class MessageAdapter(
    private val messageList: MutableList<Message>,
    private val clickListener: (Message) -> Unit
) : RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    override fun getItemCount(): Int = messageList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder =
        MessageViewHolder(
            MessageActivity15Binding.inflate(LayoutInflater.from(parent.context)), clickListener
        )


    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.bind(messageList[position])
    }

    fun update(reloadMessage: MutableList<Message>) {
        messageList.clear()
        messageList.addAll(reloadMessage)
        notifyDataSetChanged()
    }

    class MessageViewHolder(
        private val bindingView: MessageActivity15Binding,
        private val clickListener: (Message) -> Unit
    ) :
        RecyclerView.ViewHolder(bindingView.root) {

        fun bind(item: Message) {
            bindingView.tvText.text = item.message
            bindingView.tvDate.text = item.date

            itemView.setOnLongClickListener {
                clickListener(item)
                true
            }
        }
    }
}