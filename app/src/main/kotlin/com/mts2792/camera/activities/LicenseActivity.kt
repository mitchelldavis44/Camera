package com.mts2792.camera.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.mts2792.camera.R
import kotlinx.android.synthetic.main.activity_license.*

class LicenseActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_license)

        license_kotlin_title.setOnClickListener { openUrl(R.string.kotlin_url) }
        license_glide_title.setOnClickListener { openUrl(R.string.glide_url) }
        license_filepicker_title.setOnClickListener { openUrl(R.string.filepicker_url) }
    }

    private fun openUrl(id: Int) {
        val url = resources.getString(id)
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)
    }
}
