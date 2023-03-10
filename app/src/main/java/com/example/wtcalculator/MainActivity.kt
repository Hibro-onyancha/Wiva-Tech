package com.example.wtcalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var oldNumber = ""
    var opp = "+"

    private lateinit var mainDisplay: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainDisplay = findViewById(R.id.edtMainDisplay)


        var results = findViewById<Button>(R.id.btnEquals)

        results.setOnClickListener {



        }



    }

    fun numberEvent(view: View) {
        //find view by id numbers
        var btn0 = findViewById<Button>(R.id.btn0)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var btn7 = findViewById<Button>(R.id.btn7)
        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)
        var btnDot = findViewById<Button>(R.id.btnDot)


// displaying values on the edit text
        var buClick = mainDisplay.text.toString()
        var btnSelect: Button = view as Button
        when (btnSelect.id) {
            btn0.id -> {
                buClick += 0
            }
            btn1.id -> {
                buClick += 1
            }
            btn2.id -> {
                buClick += 2
            }
            btn3.id -> {
                buClick += 3
            }
            btn4.id -> {
                buClick += 4
            }
            btn5.id -> {
                buClick += 5
            }
            btn6.id -> {
                buClick += 6
            }
            btn7.id -> {
                buClick += 7
            }
            btn8.id -> {
                buClick += 8
            }
            btn9.id -> {
                buClick += 9
            }
            btnDot.id -> {
                buClick += "."
            }


        }
        mainDisplay.setText(buClick)
    }

    fun oppEvent(view: View) {
        //find view of operators

        var btnDivide = findViewById<Button>(R.id.btnDivide)
        var btnAdd = findViewById<Button>(R.id.btnPlus)
        var btnMultiply = findViewById<Button>(R.id.btnMultiply)
        var btnModule = findViewById<Button>(R.id.btnModule)
        var btnMinus = findViewById<Button>(R.id.btnMinus)
        var oppDisp = findViewById<TextView>(R.id.answerDisplay)

        var oldNumber = mainDisplay.text.toString()


        var btnSelect = view as Button
        when (btnSelect.id) {
            btnMultiply.id -> {
                opp = "*"

                mainDisplay.setText("$oldNumber *")

            }
            btnDivide.id -> {
                opp = "/"
                mainDisplay.setText("$oldNumber /")

            }
            btnAdd.id -> {
                opp = "+"
                mainDisplay.setText("$oldNumber +")

            }
            btnMinus.id -> {
                opp = "-"
                mainDisplay.setText("$oldNumber -")

            }

        }
    }
    fun results (){
    }



}