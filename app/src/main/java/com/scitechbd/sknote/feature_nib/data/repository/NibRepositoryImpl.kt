package com.scitechbd.sknote.feature_nib.data.repository

import com.scitechbd.sknote.feature_nib.data.remote.NibApi
import com.scitechbd.sknote.feature_nib.data.remote.dto.UserDetailsDto
import com.scitechbd.sknote.feature_nib.domain.repository.NibRepository
import javax.inject.Inject


class NibRepositoryImpl @Inject constructor(private val api: NibApi):NibRepository{

    override suspend fun getUserDetails(email:String, password:String): UserDetailsDto {
        return api.getUserDetails(email, password)
    }

    override suspend fun getBloodSample(coinId: String): String {
        return ""
    }

}