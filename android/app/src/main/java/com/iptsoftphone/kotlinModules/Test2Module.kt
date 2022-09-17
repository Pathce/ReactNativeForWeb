package com.iptsoftphone.kotlinModules

import android.os.Build
import android.os.Handler
import android.os.Looper
import androidx.annotation.RequiresApi
import com.facebook.react.bridge.*
import java.text.SimpleDateFormat
import java.util.*

import com.facebook.react.bridge.ReactMethod
import com.facebook.react.modules.core.DeviceEventManagerModule
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class Test2Module(context: ReactApplicationContext) : ReactContextBaseJavaModule() {

    private val _mainHandler = Handler(Looper.getMainLooper())
    private val rContext: ReactApplicationContext = context
    var secondCount = 0

    @RequiresApi(Build.VERSION_CODES.O)
    @ReactMethod
    fun getCurrentTime(promise: Promise) {
        val date = ZonedDateTime.now( ZoneOffset.UTC ).format( DateTimeFormatter.ISO_INSTANT )
        promise.resolve(date)
    }

    @ReactMethod
    fun addListener(eventName: String?) {
        // Keep: Required for RN build in Event Emitter Calls.
    }

    @ReactMethod
    fun dispatchEventEverySecond() {
        // 여기서 부터 작성 필요
    }

    override fun getName(): String {
        return "Clock"
    }
}