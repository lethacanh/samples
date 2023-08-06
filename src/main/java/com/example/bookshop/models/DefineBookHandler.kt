package com.example.bookshop.models

import com.example.bookshop.models.core.Book
import com.example.bookshop.models.core.BookRepository

class DefineBookHandler(
    private val bookRepository: BookRepository,
    private val licensing: Licensing,
    private val contentCheck: ContentCheck,
) {
    fun handle(addBookDefinition: AddBook) {
        licensing.verifyLicense(addBookDefinition.title)
        val content: String = contentCheck.check(addBookDefinition.content)
        bookRepository.addNew(Book(addBookDefinition.title, content))
    }
}
