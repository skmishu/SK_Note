package com.scitechbd.sknote.feature_note.domain.use_case

import com.scitechbd.sknote.feature_note.domain.model.Note
import com.scitechbd.sknote.feature_note.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {
    // we have to validate the insertion of a note
    suspend operator fun invoke(note:Note){
        repository.insertNote(note)
    }
}