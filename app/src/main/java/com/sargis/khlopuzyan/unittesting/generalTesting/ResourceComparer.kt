package com.sargis.khlopuzyan.unittesting.generalTesting

import android.content.Context

/**
 * Created by Sargis Khlopuzyan on 3/9/2022.
 */
class ResourceComparer {

    fun isEqual(context: Context, resId: Int, string: String): Boolean {
        return context.getString(resId) == string
    }

}