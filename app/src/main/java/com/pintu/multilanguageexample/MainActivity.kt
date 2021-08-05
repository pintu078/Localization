package com.pintu.multilanguageexample

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.inflationx.viewpump.ViewPumpContextWrapper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mypreference: Mypreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        welcome_text.setOnClickListener {
            startActivity(Intent(this,SettingsActivity::class.java))
        }
    }
    override fun attachBaseContext(newBase: Context?) {
        mypreference = Mypreference(newBase!!)
        val lang:String = mypreference.getLoginCount()
        //super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
        super.attachBaseContext(MyContextWrapper.wrap(newBase,lang))
    }
}