package com.miu.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var menusList = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            btnAddFood.setOnClickListener {
                val newMenu: String? = editFoodName.text.toString()
                if (newMenu != null) {
                    menusList.add(newMenu)
                    tvMenu.text = newMenu
                    editFoodName.setText("add new food...")
                }
            }

        btnDecide.setOnClickListener {
            tvMenu.text = menusList.random()
        }
    }


}