package com.scitechbd.sknote.feature_nib.data.remote

import com.scitechbd.sknote.feature_nib.data.remote.dto.UserDetailsDto
import retrofit2.http.GET

interface NibApi {

    @GET("api/v1/user/getUserDetails")
    suspend fun getUserDetails(email:String, password:String): UserDetailsDto

}