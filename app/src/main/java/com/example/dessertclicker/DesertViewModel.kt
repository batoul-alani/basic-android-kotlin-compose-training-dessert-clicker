package com.example.dessertclicker

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.model.DesertUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DesertViewModel : ViewModel() {
    private val _desertUiState = MutableStateFlow(DesertUiState())
    val uiState: StateFlow<DesertUiState> = _desertUiState.asStateFlow()

    fun changeRevenueValue(revenue: Int) {
//        _revenue.value = revenue
    }
}