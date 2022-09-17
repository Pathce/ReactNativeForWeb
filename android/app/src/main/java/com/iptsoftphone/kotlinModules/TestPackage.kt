package com.iptsoftphone.kotlinModules

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager
import java.util.*

class TestPackage: ReactPackage {

    // TestModule
    override fun createNativeModules(reactContext: ReactApplicationContext): MutableList<TestModule> {
        return mutableListOf(TestModule(reactContext))
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<View, ReactShadowNode<*>>> {
        return Collections.emptyList()
    }
}