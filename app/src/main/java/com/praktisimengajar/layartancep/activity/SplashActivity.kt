package com.praktisimengajar.layartancep.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.praktisimengajar.layartancep.R

//todo 9 : Buat Activity baru dengan nama SplashActivity
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //todo 14 : Buat fungsi loading / jeda
        //setelah X milidetik, akan menjalankan kode yang ada di dalam body
        Handler().postDelayed({
            //jalankan fungsi disini setelah X milidetik

            //Membuka halaman / Activity baru yang bernama LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))

            //Berhentikan SplashActivity
            finish()
        }, 3000)
    }
}