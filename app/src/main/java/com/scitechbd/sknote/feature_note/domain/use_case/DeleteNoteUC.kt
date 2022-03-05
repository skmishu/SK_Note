package com.scitechbd.sknote.feature_note.domain.use_case

import com.scitechbd.sknote.feature_note.domain.model.Note
import com.scitechbd.sknote.feature_note.domain.repository.NoteRepository

class DeleteNoteUC(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}