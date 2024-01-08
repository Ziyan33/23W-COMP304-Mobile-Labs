package com.example.ziyanliu_comp304sec003_midtermtest1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.*

const val EXTRA_NAME="No Name"
class MainActivity : AppCompatActivity() {
    //declare views..
    private var projectID: EditText?=null
    private var projectName: EditText?=null

    //radio button - Project Type
    private var rdbPublic: RadioButton?=null
    private var rdbPrivate: RadioButton?=null


    //check box - Sponsor
    private var ckbSponsor01: CheckBox?=null
    private var ckbSponsor02: CheckBox?=null
    private var ckbSponsor03: CheckBox?=null

    private val result=StringBuilder()


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        projectID=findViewById(R.id.projectID)
        projectName=findViewById(R.id.projectName)
        var projectCost=findViewById<View>(R.id.projectCost) as EditText

        //create the spinner object
        val spin=findViewById<View>(R.id.spinDuration) as Spinner
        //

        //create a button object
        val next=findViewById<View>(R.id.btnNext) as Button

        //
        //radioButton
        rdbPublic=findViewById<View>(R.id.rdbPublic) as RadioButton
        rdbPrivate=findViewById<View>(R.id.rdbPrivate) as RadioButton

        //
        //checkBox object
        ckbSponsor01=findViewById<View>(R.id.ckbSponsor01) as CheckBox
        ckbSponsor02=findViewById<View>(R.id.ckbSponsor02) as CheckBox
        ckbSponsor03=findViewById<View>(R.id.ckbSponsor03) as CheckBox

        //
        next.setOnClickListener{
            result.append("Project Name: "+projectName!!.text.toString())

            val type_sel = spin.selectedView as TextView
            if(type_sel!!.text=="3 months"){

            }else if(type_sel!!.text=="6 months"){

            }else if(type_sel!!.text=="9 months"){

            }else if(type_sel!!.text=="10 months"){

            }
            //
            //radio button event
            if (rdbPublic!!.isChecked) {

            } else if (rdbPrivate!!.isChecked) {

            }
            //
            //check box event
            if (ckbSponsor01!!.isChecked) {
                result.append("\nSponsor Type: 1")
            }
            if (ckbSponsor02!!.isChecked) {
                result.append("\nSponsor Type: 2")
            }
            if (ckbSponsor03!!.isChecked) {
                result.append("\nSponsor Type: 3")
            }
            result.append("\nProject Cost: "+projectCost!!.text.toString())
            val intent= Intent(this,RosourcesDetails::class.java).apply {
                putExtra(EXTRA_NAME,result.toString())
            }
            startActivity(intent)
        }
    }


}