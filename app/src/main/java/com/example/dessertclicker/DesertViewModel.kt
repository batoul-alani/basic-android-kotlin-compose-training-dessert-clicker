package com.example.dessertclicker

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.model.DesertUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DesertViewModel : ViewModel() {
    private val _desertUiState = MutableStateFlow(DesertUiState())
    val uiState: StateFlow<DesertUiState> = _desertUiState.asStateFlow()

    fun changeRevenueValue(revenue: Int) {
        _desertUiState.update {
            currentState -> currentState.copy( revenue = revenue)
        }
    }

    fun changeDessertsSold (dessertsSold : Int){
        _desertUiState.update {
                currentState -> currentState.copy(dessertsSold = dessertsSold)
        }
    }

    fun changeCurrentDessertIndex (currentDessertIndex: Int){
        _desertUiState.update {
                currentState -> currentState.copy(currentDessertIndex = currentDessertIndex)
        }
    }

    fun changeCurrentDessertPrice (price : Int) {
        _desertUiState.update {
                currentState -> currentState.copy(currentDessertPrice = price)
        }
    }

    fun changeCurrentDessertImageId (id: Int){
        _desertUiState.update {
                currentState -> currentState.copy(currentDessertImageId = id)
        }
    }
}