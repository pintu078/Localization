package com.pintu.multilanguageexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    lateinit var mypreference: Mypreference
    var languageList: Array<String> = arrayOf("en","ta","hi","mr","fr","es","bh")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        mypreference = Mypreference(this)

        spinner.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,languageList)
        val lang: String = mypreference.getLoginCount()
        val index : Int = languageList.indexOf(lang)
        if(index >= 0){
            spinner.setSelection(index)
        }

        button.setOnClickListener {
            mypreference.setLoginCount(languageList[spinner.selectedItemPosition])
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}