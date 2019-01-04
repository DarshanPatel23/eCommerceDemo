package com.app.ecommercedemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.app.ecommercedemo.backgroundtask.OnTaskCompleted
import com.app.ecommercedemo.backgroundtask.ServerGetRequest
import kotlinx.android.synthetic.main.progressbar_layout.*

class MainActivity : AppCompatActivity(), OnTaskCompleted {
    private var requestData: ServerGetRequest? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progress_bar.visibility = View.VISIBLE
        requestData = ServerGetRequest(this)
        requestData!!.execute()

        
    }

    override fun onTaskCompleted(result: String) {
        progress_bar.visibility = View.GONE
    }
}