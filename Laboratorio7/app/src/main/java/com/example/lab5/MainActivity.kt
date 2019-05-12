package com.example.lab5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navController)
        var cajas= product("Caja de cerveza", "Cajas")
        var f1= row(cajas, 24)
        var papas= product("Pizzas de pricemart congeladas", "Pizza")
        var f2= row(papas, 8)
        var gas= product("Coca cola", "Gas")
        var f3= row(gas, 6)
        var lista = inventory.dinventory
        lista.add(f1)
        lista.add(f2)
        lista.add(f3)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController((R.id.myNavHostFragment))
        return navController.navigateUp()
    }
}
