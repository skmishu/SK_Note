package com.scitechbd.sknote.feature_nib.domain.model

data class UserDetails(
    val id: Int, val jwtToken: String, val createdDate: String,
    val updatedDate: String, val email: String
)