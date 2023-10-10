package com.example.project4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etBillAmount: EditText = findViewById(R.id.etBillAmount)
        val etTipPercentage: EditText = findViewById(R.id.etTipPercentage)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val tvResult: TextView = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener {
            val billAmountStr = etBillAmount.text.toString()
            val tipPercentageStr = etTipPercentage.text.toString()

            if (billAmountStr.isNotEmpty() && tipPercentageStr.isNotEmpty()) {
                val billAmount = billAmountStr.toDouble()
                val tipPercentage = tipPercentageStr.toDouble()
                val tip = billAmount * (tipPercentage / 100)
                val totalAmount = billAmount + tip
                tvResult.text = "Tip: $${String.format("%.2f", tip)}\n\nTotal: $${String.format("%.2f", totalAmount)}"
            } else {
                tvResult.text = "Please enter both bill amount and tip percentage."
            }
        }



    }

}