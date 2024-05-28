package ru.suleymanovtat

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import api.HomeRepository
import data.Results
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _users = MutableStateFlow<List<Results>>(emptyList())
    val users = _users.asStateFlow()

    private val homeRepository = HomeRepository()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            homeRepository.getUsers().catch {
                Log.e("my", "catch ${it.message}")
            }.collect { users ->
                Log.e("my", "users ${users}")
                _users.update { it + users }
            }
        }
    }

}