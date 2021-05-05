package com.peacecodes.kotlinlistviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.peacecodes.kotlinlistviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null
    var adapter:FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setUpFact()
        setContentView(binding?.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
    fun setUpFact() {
        adapter = FactAdapter(this, DummyData.facts)
        binding?.factListView?.adapter = adapter
    }
}