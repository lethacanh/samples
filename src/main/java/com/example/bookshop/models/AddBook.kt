package com.example.bookshop.models

import com.example.bookshop.models.core.Money

data class AddBook(val title: String, val content: String, val price: Money)
