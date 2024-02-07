package com.example.nineg.data.db.remote

import com.example.nineg.data.db.dto.GoodyDto
import com.example.nineg.retrofit.RetrofitService
import okhttp3.MultipartBody
import retrofit2.Response
import javax.inject.Inject

class GoodyRemoteDataSourceImpl @Inject constructor(private val service: RetrofitService) : GoodyRemoteDataSource {
    override suspend fun registerGoody(
        deviceId: String,
        missionTitle: String,
        title: String,
        content: String,
        photoUrl: String,
        image: MultipartBody.Part
    ): Response<GoodyDto> {
        val param = HashMap<String, String>()
        param["deviceId"] = deviceId
        param["missionTitle"] = missionTitle
        param["title"] = title
        param["content"] = content
        param["photo_url"] = photoUrl

        return service.registerGoody(param, image)
    }

    override suspend fun removeGoody() {
        TODO("Not yet implemented")
    }

    override suspend fun updateGoody() {
        TODO("Not yet implemented")
    }

    override suspend fun getGoody() {
        TODO("Not yet implemented")
    }

    override suspend fun getGoodyList() {
        TODO("Not yet implemented")
    }
}