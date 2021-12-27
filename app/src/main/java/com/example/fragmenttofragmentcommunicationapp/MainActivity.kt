package com.example.fragmenttofragmentcommunicationapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.fragmenttofragmentcommunicationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Communicator {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val firstFragment = FirstFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, firstFragment)
            .commit()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInput)
        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentSecond = SecondFragment()
        fragmentSecond.arguments = bundle
        transaction.replace(R.id.fragment_container, fragmentSecond)
        transaction.commit()
    }


}