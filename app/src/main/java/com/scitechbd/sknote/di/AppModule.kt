package com.scitechbd.sknote.di

import android.app.Application
import androidx.room.Room
import com.scitechbd.sknote.feature_note.data.data_source.NoteDatabase
import com.scitechbd.sknote.feature_note.data.repository.NoteRepositoryImpl
import com.scitechbd.sknote.feature_note.domain.repository.NoteRepository
import com.scitechbd.sknote.feature_note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun providesNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotesUC = GetNotesUC(repository),
            getNoteUC = GetNoteUC(repository),
            deleteNoteUC = DeleteNoteUC(repository),
            addNoteUC = AddNoteUC(repository)
        )
    }
}