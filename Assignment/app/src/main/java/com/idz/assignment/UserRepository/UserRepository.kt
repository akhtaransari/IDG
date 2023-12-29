package com.idz.assignment.UserRepository

import com.idz.assignment.dao.UserDao
import kotlinx.coroutines.flow.Flow
import com.idz.assignment.model.User

class UserRepository(private val userDao: UserDao) {

    val allUsers: Flow<List<User>> = userDao.getAllUsers()

    suspend fun insert(user: User) {
        userDao.insert(user)
    }
}
