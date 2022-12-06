package kg.nurtelecom.chat_engine.base.chat.adapter.message_vh

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.nurtelecom.chat_engine.custom_views.message.ImageMessageView
import kg.nurtelecom.chat_engine.databinding.ChatEngineItemImageMessageBinding
import kg.nurtelecom.chat_engine.model.Message
import kg.nurtelecom.chat_engine.model.MessageContentType

class ImageMessageViewHolder(private val vb: ChatEngineItemImageMessageBinding) : RecyclerView.ViewHolder(vb.root) {

    fun onBind(message: Message) = with (vb.imageMessage) {
        loadImage(message)
        setupMessageType(message.messageType)
        setupMessageStatus(message.status)
    }

    private fun ImageMessageView.loadImage(message: Message) {
        when (message.contentType) {
            MessageContentType.IMAGE_URL -> loadImageFromUrl(message.content)
            MessageContentType.IMAGE_FILE_PATH -> loadImageFormFilePath(message.content)
            else -> {}
        }
    }

    companion object {
        fun create(parent: ViewGroup): ImageMessageViewHolder {
            val view = ChatEngineItemImageMessageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            return ImageMessageViewHolder(view)
        }
    }
}