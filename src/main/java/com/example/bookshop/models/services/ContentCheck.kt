package com.example.bookshop.models.services

import com.example.bookshop.models.services.Censor.CensorResult.*

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
            is Censored -> censorResult.newContent
            is NoCensor -> content
            is Banned -> throw TheTitleHasBeenBannedException(censorResult.reason)
        }
    }
    private fun translate(content: String, locale: String): String {
        TODO("Not yet implemented")
    }

    class TheTitleHasBeenBannedException(reason: String) : RuntimeException()

}