package com.example.bookshop.models

class ContentVerifier(
    private val censor: Censor,
) {
    fun verifyBookContent(content: String): String {
        val censorResult = censor.handle(content)
        val content: String = when (censorResult) {
            is CensorResult.Censored -> censorResult.newContent
            is CensorResult.NoCensor -> content
            is CensorResult.Banned -> throw TheTitleHasBeenBannedException(censorResult.reason)
        }
        return content
    }
}