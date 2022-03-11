package com.sargis.khlopuzyan.unittesting.generalTesting

/**
 * Created by Sargis Khlopuzyan on 3/7/2022.
 */
object RegistrationUtil {

    val existingUsers = listOf("Peter", "Carl", "Sargis")

    /**
     * The input is not valid if ...
     * ... the username/password is empty
     * ... the username is already taken
     * ... the conformed password is not the same as the real password
     * ... the password contains less then 2 digits
     * */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String,
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }

}