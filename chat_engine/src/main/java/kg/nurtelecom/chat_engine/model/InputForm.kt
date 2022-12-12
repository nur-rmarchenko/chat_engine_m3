package kg.nurtelecom.chat_engine.model

import java.io.Serializable

data class InputForm(
    val formId: String,
    val title: String,
    val formItems: List<FormItem>? = null
): Serializable
