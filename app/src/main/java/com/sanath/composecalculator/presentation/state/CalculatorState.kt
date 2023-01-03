package com.sanath.composecalculator.presentation.state

import com.sanath.composecalculator.domain.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null,
)
