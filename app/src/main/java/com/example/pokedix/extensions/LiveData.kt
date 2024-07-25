package com.example.pokedix.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.launch

inline fun <T> LiveData<Result<T>>.observe(
    owner: LifecycleOwner,
    crossinline onSuccess: (T) -> Unit,
    crossinline onError: (Throwable) -> Unit,
    crossinline onLoading: (T?) -> Unit = {}) {
    observe(owner) {
        when (it) {
            is Result.Success<T> -> onSuccess(it.data)
            is Result.Error<T> -> onError(it.error)
            is Result.Loading<T> -> onLoading(it.data)
        }
    }
}