package com.geektech.counter

interface CounterView {
    fun showNewCount(count:Int)

    fun showToast(msg:String)

    fun colorGreen(color:Int)
}