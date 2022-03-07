package com.scitechbd.sknote.feature_nib.domain.repository

import com.scitechbd.sknote.feature_nib.data.remote.dto.UserDetailsDto


interface NibRepository {

    suspend fun getUserDetails(email:String, password:String): UserDetailsDto

    suspend fun getBloodSample(coinId: String): String
}