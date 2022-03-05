package com.scitechbd.sknote.feature_note.data.repository

import com.scitechbd.sknote.feature_note.data.data_source.NoteDao
import com.scitechbd.sknote.feature_note.domain.model.Note
import com.scitechbd.sknote.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val dao: NoteDao) : NoteRepository {
    // we can do network logic implementation here
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteByID(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}