package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "A day to remember", description = "a very beautiful day"),
            Note(title = "Another day to remember", description = "another very beautiful day"),
        )
    }
}