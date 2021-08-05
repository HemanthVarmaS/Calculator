package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txtInputExpression: TextView
    lateinit var txtResult:TextView
    lateinit var btnC:Button
    lateinit var btnDivide:Button
    lateinit var btnMultiply:Button
    lateinit var btnPlus:Button
    lateinit var btnMinus:Button
    lateinit var btnEquals:Button
    lateinit var btnNum0:Button
    lateinit var btnNum1:Button
    lateinit var btnNum2:Button
    lateinit var btnNum3:Button
    lateinit var btnNum4:Button
    lateinit var btnNum5:Button
    lateinit var btnNum6:Button
    lateinit var btnNum7:Button
    lateinit var btnNum8:Button
    lateinit var btnNum9:Button
    lateinit var btnDot:Button
    var digitOnScreen = StringBuilder()
    var operation : Char = ' '
    var leftOperand:Double = 0.0
    var rightOperand:Double = 0.0
    var operand:String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtInputExpression = findViewById(R.id.txt_input_expression)
        txtResult = findViewById(R.id.txt_result)
        btnC = findViewById(R.id.btn_c)
        btnDivide = findViewById(R.id.btn_divide)
        btnMultiply = findViewById(R.id.btn_multiply)
        btnPlus = findViewById(R.id.btn_plus)
        btnMinus = findViewById(R.id.btn_minus)
        btnEquals = findViewById(R.id.btn_equals)
        btnDot = findViewById(R.id.btn_dot)
        btnNum0 = findViewById(R.id.btn_num0)
        btnNum1 = findViewById(R.id.btn_num1)
        btnNum2 = findViewById(R.id.btn_num2)
        btnNum3 = findViewById(R.id.btn_num3)
        btnNum4 = findViewById(R.id.btn_num4)
        btnNum5 = findViewById(R.id.btn_num5)
        btnNum6 = findViewById(R.id.btn_num6)
        btnNum7 = findViewById(R.id.btn_num7)
        btnNum8 = findViewById(R.id.btn_num8)
        btnNum9 = findViewById(R.id.btn_num9)
        txtResult.setText(0)
        txtInputExpression.setText(0)
        initialiseButtons()
    }
    private fun initialiseButtons() {
        functionalButtons()
        operationalButtons()
        numericalButtons()
    }
    private fun numericalButtons() {
        btnDot.setOnClickListener() {
            appendToDigitOnScreen(".")
        }
        btnNum0.setOnClickListener() {
            appendToDigitOnScreen("0")
        }
        btnNum1.setOnClickListener() {
            appendToDigitOnScreen("1")
        }
        btnNum2.setOnClickListener() {
            appendToDigitOnScreen("2")
        }
        btnNum3.setOnClickListener() {
            appendToDigitOnScreen("3")
        }
        btnNum4.setOnClickListener() {
            appendToDigitOnScreen("4")
        }
        btnNum5.setOnClickListener() {
            appendToDigitOnScreen("5")
        }
        btnNum6.setOnClickListener() {
            appendToDigitOnScreen("6")
        }
        btnNum7.setOnClickListener() {
            appendToDigitOnScreen("7")
        }
        btnNum8.setOnClickListener() {
            appendToDigitOnScreen("8")
        }
        btnNum9.setOnClickListener() {
            appendToDigitOnScreen("9")
        }

    }
    private fun appendToDigitOnScreen(digit:String) {
        digitOnScreen.append(digit)
        operand = digitOnScreen.toString()
        txtInputExpression.text = digitOnScreen.toString()
    }
    private fun operationalButtons() {
        btnPlus.setOnClickListener() {
            selectOperation('+')
        }
        btnMinus.setOnClickListener() {
            selectOperation('-')
        }
        btnMultiply.setOnClickListener() {
            selectOperation('x')
        }
        btnDivide.setOnClickListener() {
            selectOperation('/')
        }
    }
    private fun selectOperation(operation:Char) {
        this.operation = operation
        leftOperand = digitOnScreen.toString().toDouble()
        digitOnScreen.append(operation)
        txtInputExpression.text = digitOnScreen.toString()
        digitOnScreen.clear()
    }
    private fun functionalButtons() {
        btnC.setOnClickListener() {
            digitOnScreen.clear()
            txtInputExpression.text = "0"
            txtResult.text = "0"
        }
        btnEquals.setOnClickListener() {
            performMathOperation()
        }
    }
    private fun performMathOperation() {

    }
}