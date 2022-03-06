package com.scitechbd.sknote.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Date(orderType: OrderType) : NoteOrder(orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType)

    // if we want to change order type to ascending and descending also with the order type info
    fun copy(orderType: OrderType): NoteOrder {
        return when (this) {
            is Title -> Title(orderType)
            is Color -> Color(orderType)
            is Date -> Date(orderType)
        }
    }
}