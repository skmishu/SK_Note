package com.scitechbd.sknote.feature_nib.data.remote.dto

data class UserDetailsDto(
    val `data`: Data,
    val errors: List<Any>? = null,
    val status: String="",
    val statusCode: Int
)