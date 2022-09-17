package com.iptsoftphone.kotlinModules

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class TestModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "TestModule"
    }

    @ReactMethod
    public fun testModule(param: String) {
        Toast.makeText(reactApplicationContext, "TEST", Toast.LENGTH_SHORT).show()
    }
}