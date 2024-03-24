package com.example.proj

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    //start view
    fun start(){
        setContentView(R.layout.hha_main)
        val btn_ai: Button = findViewById(R.id.btn_ai)
        val btn_my: Button = findViewById(R.id.btn_my)
        val btn_search = findViewById<ImageButton>(R.id.btn_search)
        val btn_basket = findViewById<ImageButton>(R.id.btn_basket)

        btn_ai.setOnClickListener{
            ai()
        }
        btn_my.setOnClickListener{
            my()
        }
        btn_search.setOnClickListener{
            search()
        }
        btn_basket.setOnClickListener{
            basket()
        }
    }

    fun ai() {
        setContentView(R.layout.hha_ai_main)
        val btn_home = findViewById<ImageButton>(R.id.btn_home)
        val btn_my: Button = findViewById(R.id.btn_my)
        val btn_search = findViewById<ImageButton>(R.id.btn_search)
        val btn_basket = findViewById<ImageButton>(R.id.btn_basket)
        val btn_result: Button = findViewById(R.id.btn_result)

        btn_home.setOnClickListener{
            start()
        }
        btn_my.setOnClickListener{
            my()
        }
        btn_search.setOnClickListener{
            search()
        }
        btn_basket.setOnClickListener{
            basket()
        }
        btn_result.setOnClickListener{
            aiResult()
        }

    }
    fun my() {
        setContentView(R.layout.hha_client_first)
        val btn_home = findViewById<ImageButton>(R.id.btn_home)
        val btn_ai: Button = findViewById(R.id.btn_ai)
        val btn_search = findViewById<ImageButton>(R.id.btn_search)
        val btn_basket = findViewById<ImageButton>(R.id.btn_basket)

        btn_home.setOnClickListener{
            start()
        }
        btn_ai.setOnClickListener{
            ai()
        }
        btn_search.setOnClickListener{
            search()
        }
        btn_basket.setOnClickListener{
            basket()
        }
    }

    fun search() {
        setContentView(R.layout.hha_search_main)

        val btn_back = findViewById<ImageButton>(R.id.btn_back)

        btn_back.setOnClickListener{
            start()
        }
    }

    fun basket(){
        setContentView(R.layout.hha_basket_main)

        val btn_back = findViewById<ImageButton>(R.id.btn_back2)

        btn_back.setOnClickListener{
            start()
        }
    }

    fun aiResult() {
        setContentView(R.layout.hha_ai_reesult)

        val btn_home = findViewById<ImageButton>(R.id.btn_home)
        val btn_ai: Button = findViewById(R.id.btn_ai)
        val btn_my: Button = findViewById(R.id.btn_my)
        val btn_search = findViewById<ImageButton>(R.id.btn_search)
        val btn_basket = findViewById<ImageButton>(R.id.btn_basket)

        btn_home.setOnClickListener{
            start()
        }
        btn_ai.setOnClickListener{
            ai()
        }
        btn_my.setOnClickListener{
            my()
        }
        btn_search.setOnClickListener{
            search()
        }
        btn_basket.setOnClickListener{
            basket()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        start()
    }
}