package com.example.firebasesignin.authentication.data.state

data class SignOutState(
    val isLoading: Boolean = false,
    val isSuccess: String? = "",
    val isError: String? = "",
)