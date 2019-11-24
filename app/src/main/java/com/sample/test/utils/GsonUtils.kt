package com.sample.test.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken



fun Any.toJson(): String {
    return Gson().toJson(this)
}

inline fun <reified T> Gson.fromJson(json: String) =
    this.fromJson<T>(json, object : TypeToken<T>() {}.type)
