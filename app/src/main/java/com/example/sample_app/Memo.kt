package com.example.sample_app

import android.util.Log
import java.util.*

public class Memo(var title: String, var id: Int, var body_text: String ,var date_time:String,var delete_check: Boolean) {
    init {
        Log.d("Memo Init", "$title")
    }

//    public fun set_title(t: String){
//        title = t
//    }
//    public fun get_title(): String {
//        return title
//    }
//
//    public fun set_id(i: Long){
//        id = i
//    }
//    public fun get_id(): Long {
//        return id
//    }
//
//    public fun set_body(b: String){
//        body_text = b
//    }
//    public fun get_body(): String {
//        return body_text
//    }
//
//    public fun set_date(d: Date){
//        date_time = d
//    }
//    public fun get_date(): Date {
//        return date_time
//    }
}