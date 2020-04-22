package com.example.semiosoft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cardiovascular.*
import kotlinx.android.synthetic.main.activity_main.*

class CardiovascularActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardiovascular)

        inspecaoPalpacaoButton.setOnClickListener{
            val inspecaoPalpacao = Intent(applicationContext,InspecaoPalpacaoActivity::class.java)
            startActivity(inspecaoPalpacao)
        }
    }
}
