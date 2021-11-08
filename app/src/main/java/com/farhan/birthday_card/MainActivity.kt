package com.farhan.birthday_card

//import android.widget.TextView
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun CreateBdaycard(view: android.view.View) {
        val name = textPersonName.editableText.toString()
        val intent = Intent(this,Birthday_greeting::class.java)
        intent.putExtra(Birthday_greeting.NAME_EXTRA,name)
        startActivity(intent)
    }

}