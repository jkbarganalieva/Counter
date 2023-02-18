package com.geektech.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.geektech.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private val presenter = Presenter()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.fillCounterView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnIncrement.setOnClickListener {
                presenter.increment()
            }
            btnDecrement.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showNewCount(count: Int) {
        binding.tvResult.text = count.toString()
    }
    override fun showToast(msg:String) {
        val toast = Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun colorGreen(color: Int) {
        binding.tvResult.setTextColor(color)
    }
}