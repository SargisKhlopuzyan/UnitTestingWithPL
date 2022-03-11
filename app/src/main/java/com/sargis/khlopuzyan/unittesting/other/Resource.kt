package com.sargis.khlopuzyan.unittesting.other

/**
 * Created by Sargis Khlopuzyan on 3/10/2022.
 */
data class Resource<out T>(val status: Status, val data: T?, val message: String?) {

    companion object {
        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESS, data, null)
        }

        fun <T> error(msg: String, data: T?): Resource<T> {
            return Resource(Status.ERROR, data, msg)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }
    }

}

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}