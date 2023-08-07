package com.example.bookshop.usecases

import com.example.bookshop.models.domain.Money

data class AddBookDefinition(val title: String, val content: String, val price: Money)
