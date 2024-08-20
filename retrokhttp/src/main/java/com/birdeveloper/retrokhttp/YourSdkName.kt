package com.birdeveloper.retrokhttp

import android.content.Context

class YourSdkName private constructor() {

    companion object {
        private var instance: YourSdkName? = null

        fun getInstance(): YourSdkName {
            if (instance == null) {
                instance = YourSdkName()
            }
            return instance!!
        }
    }

    fun initialize(context: Context) {
        // SDK başlatma işlemleri
    }
}