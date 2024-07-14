package com.example.firebasesignin.authentication.domain.repository

import com.example.firebasesignin.util.Resource
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun loginUser(email: String, password: String): Flow<Resource<AuthResult>>
    suspend  fun registerUser(email: String, password: String): Flow<Resource<AuthResult>>
    suspend  fun signOutUser(): Flow<Resource<Unit>>
    suspend fun googleSignIn(credential: AuthCredential): Flow<Resource<AuthResult>>


}