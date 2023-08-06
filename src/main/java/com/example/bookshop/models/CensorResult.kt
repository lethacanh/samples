package com.example.bookshop.models

open class CensorResult {
    inner class NoCensor : CensorResult()
    inner class Censored : CensorResult() {
        var newContent: String? = null
    }

    inner class Banned : CensorResult() {
        var reason: String? = null
    }
}