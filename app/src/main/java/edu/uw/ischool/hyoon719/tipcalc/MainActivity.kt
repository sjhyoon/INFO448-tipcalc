package edu.uw.ischool.hyoon719.tipcalc

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val viewRoot = layoutInflater.inflate(R.layout.activity_main, null)
        setContentView(viewRoot)
        
        val amountInput = findViewById<EditText>(R.id.textInput) //Input takes a unit of Penny.

        val inputView = findViewById<TextView>(R.id.textView)
        inputView.setTextSize(30f)
        val textBeforeInput = inputView.getText().toString()

        val tipBtn = findViewById<Button>(R.id.button)
        tipBtn.setTextSize(15f)
        tipBtn.setEnabled(false)

        amountInput.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                inputView.setText(textBeforeInput)
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(!amountInput.getText().toString().isEmpty()) {
                    val amountInDollar = Integer.parseInt(amountInput.getText().toString()).toDouble() / 100
                    inputView.setText("$${amountInDollar}")
                }
            }
            override fun afterTextChanged(s: Editable?) {
                tipBtn.setEnabled(!amountInput.getText().toString().isEmpty())
            }
        })

        tipBtn.setOnClickListener{
            val finalAmount = Integer.parseInt(amountInput.getText().toString())
            val tip = finalAmount * 15 / 100 //Unit: Penny
            Toast.makeText(applicationContext, "$${tip.toDouble()/100}" , Toast.LENGTH_SHORT).show() //Print tip in dollars
        }
    }
}