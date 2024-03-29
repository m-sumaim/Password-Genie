 package com.sumaim.passwordgenie.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sumaim.passwordgenie.utils.Helper

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent.action == Intent.ACTION_INSERT_OR_EDIT) {
            
        }

        if (Helper.getIsFirstRun(this)) {
            val intent = Intent(this, NewLogin::class.java)
            startActivity(intent)
            finish()
        }else {
            val intent = Intent(this, Authentication::class.java)
            startActivity(intent)
            finish()
        }
    }
}