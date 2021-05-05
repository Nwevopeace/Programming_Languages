package com.peacecodes.kotlinlistviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.peacecodes.kotlinlistviewexample.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private var binding:ActivityDetailsBinding? = null
    private var logo:Int = 0
    private var name:String? = null
    private var detail:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAs,0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAs)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAs)
        setUpFactDetail()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
    fun setUpFactDetail() {
        binding?.detailTv?.text = detail
        binding?.detailLogoIv?.setImageResource(logo)
        title = name
    }
}