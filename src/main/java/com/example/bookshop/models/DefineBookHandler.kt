package com.example.bookshop.models

import com.example.bookshop.models.CensorResult.Banned
import com.example.bookshop.models.CensorResult.Censored
import com.example.bookshop.models.core.Book

class DefineBookHandler {
    private val licensing: Licensing? = null
    private val censor: Censor? = null
    fun handle(addBookDefinition: AddBookDefinition) {
        licensing!!.verifyLicense(addBookDefinition.title())
        val censorResult = censor!!.handle(addBookDefinition.content())
        val content: String?
        when (censorResult.javaClass.getSimpleName()) {
            "NoCensor" -> {
                content = addBookDefinition.content()
            }

            "Censored" -> {
                content = (censorResult as Censored).newContent
            }

            "Banned" -> {
                throw TheTitleHasBeenBannedException((censorResult as Banned).reason)
            }

            else -> {}
        }
        val b = Book(addBookDefinition.title(), content)
    }

    class AddBookDefinition {
        fun title(): String? {
            return null
        }

        fun content(): String? {
            return null
        }
    }
}
