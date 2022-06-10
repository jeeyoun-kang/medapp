package com.example.medapp

import com.example.medapp.databinding.ActivityNavDrawerBinding



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*


class MainActivity : AppCompatActivity() {
    private lateinit var appbarc: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNavDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val nhf = supportFragmentManager.findFragmentById(R.id.fragment2) as NavHostFragment
        val topDest = setOf(R.id.homeFragment, R.id.page1Fragment, R.id.page2Fragment,R.id.endFragment)
        appbarc= AppBarConfiguration(topDest, binding.drawerLayout)
        setupActionBarWithNavController(nhf.navController, appbarc)
        //binding.NavigationView.setupWithNavController(nhf.navController)
        binding.NavigationView.setNavigationItemSelectedListener {
            binding.drawerLayout.close()
            when (it.itemId) {
//                R.id.callAction -> {
//                    startActivity(Intent().setAction(Intent.ACTION_DIAL))
//                    true
//                }
//                R.id.endFragment{
//                    startActivity{}
//                }
                else -> {
                    it.onNavDestinationSelected(nhf.navController)
                }
            }
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.fragment2).navigateUp(appbarc) || super.onSupportNavigateUp()
    }
}