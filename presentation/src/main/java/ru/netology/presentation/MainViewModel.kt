package ru.netology.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.netology.domain.Model
import ru.netology.domain.Repo
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repo: Repo
): ViewModel() {

    val data = MutableLiveData<Model>()

    fun setData() {
        CoroutineScope(Dispatchers.Main).launch {
            data.postValue(repo.getData())
        }
    }
}