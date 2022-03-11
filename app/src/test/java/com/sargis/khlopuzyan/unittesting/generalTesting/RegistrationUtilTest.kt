package com.sargis.khlopuzyan.unittesting.generalTesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test


/**
 * Created by Sargis Khlopuzyan on 3/7/2022.
 */
class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Gagarin",
            "123aa",
            "123aa"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sargis",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sargis",
            "",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and password incorrect repeated password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sargis",
            "123",
            "999"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and password contains less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sargis",
            "111",
            "111"
        )
        assertThat(result).isFalse()
    }
}