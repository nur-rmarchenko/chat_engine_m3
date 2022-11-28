package kg.nurtelecom.chat_engine.model

data class ChatButton(
    val buttonId: String,
    val title: String,
    val style: ButtonStyle
) : MessageAdapterItem  {

    override fun areItemsTheSame(other: Any): Boolean {
        return if (other is ChatButton) other.buttonId == this.buttonId
        else false
    }

    override fun areContentTheSame(other: Any): Boolean {
        return if (other is ChatButton) other == this
        else false
    }
}

