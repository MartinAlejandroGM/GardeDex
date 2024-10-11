package com.andro_sk.gardedex.utils

import android.content.Context
import android.net.ConnectivityManager

object TestInternetConnection {
    fun isInternetConnectionAvailable(context: Context): Boolean {
        val service = Context.CONNECTIVITY_SERVICE
        val manager = context.getSystemService(service) as ConnectivityManager?
        val network = manager?.activeNetwork
        return (network != null)
    }
}