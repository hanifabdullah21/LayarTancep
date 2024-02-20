package com.praktisimengajar.layartancep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.praktisimengajar.layartancep.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //todo 24.1 : Menyiapkan variabel untuk ViewBinding
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //todo 24.2 : Inisiasi ViewBinding lalu menyambungkan dengan tampilan
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //todo 25.1 : Mengatur toolbar untuk activity
        setSupportActionBar(binding.toolbar)

        //todo 25.2 : Mengatur Bottom Navigation
        val navView : BottomNavigationView = binding.bottomnav
        val navController = findNavController(R.id.fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_fav
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}