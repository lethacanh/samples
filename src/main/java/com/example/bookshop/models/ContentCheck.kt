package com.example.bookshop.models

class ContentCheck(
    private val censor: Censor,
) {
    fun check(content: String): String {
        var result = translate(content,"VN")
        result = censor(result)
        return result
    }


    private fun censor(content: String): String {
        val censorResult = censor.handle(content)
        return when (censorResult) {
            is CensorResult.Censored -> censorResult.newContent
            is CensorResult.NoCensor -> content
            is CensorResult.Banned -> throw TheTitleHasBeenBannedException(censorResult.reason)
        }
    }
    private fun translate(content: String, locale: String): String {
        TODO("Not yet implemented")
    }
}