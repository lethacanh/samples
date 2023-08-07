package com.example.bookshop.controller;

import com.example.bookshop.models.DefineBookHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Api {
    private final DefineBookHandler defineBookHandler;

    public Api(DefineBookHandler defineBookHandler) {
        this.defineBookHandler = defineBookHandler;
    }

    @PostMapping(value = "/book/define")
    public ResponseEntity<?> defineBook(
            @RequestBody PostDefineBook postDefineBook){

        defineBookHandler.handle(new DefineBookHandler.AddBookDefinition(postDefineBook));
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Location", "/slots/%s/available".formatted(scheduleDay.toCommand().date()))
                .body(null);
    }

     class PostDefineBook {
        String bookTitle;
        String bookContent;
    }
}
