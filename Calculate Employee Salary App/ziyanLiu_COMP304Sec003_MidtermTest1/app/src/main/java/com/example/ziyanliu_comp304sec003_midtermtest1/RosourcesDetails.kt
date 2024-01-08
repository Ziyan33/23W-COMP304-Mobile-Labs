package com.example.ziyanliu_comp304sec003_midtermtest1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RosourcesDetails : AppCompatActivity() {


    //declare views..
    private var employeeName: EditText?=null
    private var hourlyRate: EditText?=null
    private var numOfHours: EditText?=null

    private val output=StringBuilder()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rosources_details)

        //
        //Get the Intent that started this activity and extract the string
        val result=intent.getStringExtra(EXTRA_NAME)

        val textView=findViewById<TextView>(R.id.pDetailsBox).apply {
            text=result
        }
        //
        employeeName=findViewById(R.id.employeeName)

        hourlyRate=findViewById(R.id.hourlyRate)
        numOfHours=findViewById(R.id.numOfHours)
        //
        var btnBack=findViewById<Button>(R.id.btnBack)

        var btnSubmit=findViewById<Button>(R.id.btnSubmit)
        btnBack?.setOnClickListener(){
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnSubmit?.setOnClickListener(){

            val hRate=hourlyRate!!.text.toString().toInt()
            val nHours=numOfHours!!.text.toString().toInt()
            val earning=hRate*nHours
            output.append("Employee Name:"+employeeName!!.text.toString())
            output.append("\nEarning:"+earning!!.toString())
            Toast.makeText(applicationContext, output.toString(), Toast.LENGTH_LONG).show()

        }
    }
}