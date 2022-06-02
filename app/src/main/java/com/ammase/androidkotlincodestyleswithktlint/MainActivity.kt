package com.ammase.androidkotlincodestyleswithktlint

import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.ammase.androidkotlincodestyleswithktlint.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    private val mainAd by lazy { mainAdapter() }

    override fun setup(savedInstanceState: Bundle?) {
        super.showBackBar(false, "Menu Utama")

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = mainAd
        }

        mainAd.setResultList(dataModule.items)
    }
}
