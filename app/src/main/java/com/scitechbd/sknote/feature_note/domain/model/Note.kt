package com.scitechbd.sknote.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.scitechbd.sknote.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        // define that a note can have which colors
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)