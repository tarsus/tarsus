package com.tarsus.scratch;

public class Post {

    private String _text;
    private User _author;

    public String get_text() {
        return _text;
    }

    public void set_text(String _text) {
        this._text = _text;
    }

    public User get_author() {
        return _author;
    }

    public void set_author(User _author) {
        this._author = _author;
    }
}
