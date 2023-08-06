package com.example.bookshop.models

sealed class CensorResult {
    inner class NoCensor : CensorResult()
    inner class Censored(val newContent: String) : CensorResult() {
    }

    inner class Banned(var reason: String) : CensorResult() {
    }
}