package com.sample.test.utils.extension

import java.text.DecimalFormat



fun Double.format(): String {
    val df = DecimalFormat()
    df.maximumFractionDigits = 1
    return df.format(this)
}

fun Double.formatTwoDigits(): String {
    val df = DecimalFormat()
    df.maximumFractionDigits = 2
    return df.format(this)
}
