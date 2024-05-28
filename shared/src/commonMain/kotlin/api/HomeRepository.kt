package api

import data.ResponseResultUser
import data.Results
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.flow.flow

class HomeRepository {

    suspend fun getRandomUsers(): ResponseResultUser {
        val response = httpClient.get("https://randomuser.me/api/?page=1&results=20&seed=abc")
        return response.body()
    }

    fun getUsers() = flow {
        emit(getRandomUsers().results)
    }

    suspend fun getUsersWithoutflow(): List<Results> {
        return getRandomUsers().results
    }

}