package com.mts2792.camera.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.mts2792.camera.R
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : SimpleActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        setupLicense()
        setupGPlus()
    }

    fun setupLicense() {
        about_license.setOnClickListener {
            val intent = Intent(applicationContext, LicenseActivity::class.java)
            startActivity(intent)
        }
    }

    fun setupGPlus() {
        about_gplus.setOnClickListener {
            val link = "https://plus.google.com/communities/113769215740955801290"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(link)))
        }
    }
}