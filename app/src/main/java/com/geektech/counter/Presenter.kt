package com.geektech.counter

import android.graphics.Color

class Presenter {

    private val model = Model()
    private lateinit var counterView: CounterView

    fun increment() {
        model.increment()

        counterView.showNewCount(model.count)

        if (model.count == 10) {
            counterView.showToast("Поздравляем!!!")
        }
        if (model.count == 15) {
            counterView.colorGreen(Color.GREEN)
        } else {
            counterView.colorGreen(Color.BLACK)
        }
    }

    fun decrement() {
        model.decrement()
        counterView.showNewCount(model.count)
        if (model.count == 10) {
            counterView.showToast("Поздравляем!!!")
        }
        if (model.count == 15) {
            counterView.colorGreen(Color.GREEN)
        } else {
            counterView.colorGreen(Color.BLACK)
        }
    }

    fun fillCounterView(counterView: CounterView) {
        this.counterView = counterView
    }
}