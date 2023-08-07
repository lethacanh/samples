package com.example.bookshop.usecases

import com.example.bookshop.models.domain.Book
import com.example.bookshop.models.domain.BookRepository
import com.example.bookshop.models.services.ContentCheck
import com.example.bookshop.models.services.Licensing
import java.util.*

class DefineBookHandler(
    private val bookRepository: BookRepository,
    private val licensing: Licensing,
    private val contentCheck: ContentCheck,
) {
    fun handle(addBookDefinition: AddBookDefinition) {
        licensing.verifyLicense(addBookDefinition.title)
        val content: String = contentCheck.check(addBookDefinition.content)
        bookRepository.addNew(
            Book(
                UUID.randomUUID().toString(),
                addBookDefinition.title,
                content,
                addBookDefinition.price
            )
        )
    }
}
