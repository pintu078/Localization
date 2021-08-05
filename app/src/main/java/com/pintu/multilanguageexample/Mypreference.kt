package com.pintu.multilanguageexample

import android.content.Context
import android.content.SharedPreferences
import java.security.Key
import java.util.prefs.PreferenceChangeEvent

val PREFERENCE_NAME = "SharedPreferenceExample"
val PREFERENCE_LANGUAGE = "Language"

class Mypreference(context: Context){

    val preference:SharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun getLoginCount() : String {
        return preference.getString(PREFERENCE_LANGUAGE,"en").toString()
    }



    fun setLoginCount(count: String){
        val editor = preference.edit()
        editor.putString(PREFERENCE_LANGUAGE,count)
        editor.apply()
    }
}