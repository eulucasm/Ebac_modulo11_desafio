package com.omelhordobrasil.kotlinbr.tamojunto.lucao.jokenpodesafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import com.omelhordobrasil.kotlinbr.tamojunto.lucao.jokenpodesafio.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    lateinit var bottomNav: BottomNavigationView
    lateinit var drawer: DrawerLayout
    lateinit var navDrawer: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)
        setSupportActionBar(binding.toolbar2)

        drawer = binding.root
        navDrawer = binding.navView
        bottomNav = binding.bottomNav

        setupDrawer()
        setupBottomNavigation()
    }

    private fun setupDrawer() {
        navDrawer.setNavigationItemSelectedListener {
            drawer.closeDrawers()
            when (it.itemId) {
                R.id.bottom_option_1 -> {
                    val intent = Intent(this, MainActivity2::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.bottom_option_2 -> {
                    val intent = Intent(binding.root.context, MainActivity3::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        drawer.openDrawer(GravityCompat.START)
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_segunda_tela, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_setings -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
                true
            }
            else -> false
        }
    }

    private fun setupBottomNavigation() {
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_option_1 -> {
                    true
                }
                R.id.bottom_option_2 -> {
                    val intent = Intent(this, MainActivity3::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

}

