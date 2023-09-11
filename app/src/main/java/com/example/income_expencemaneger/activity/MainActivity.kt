package com.example.income_expencemaneger

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.expensemanager.activity.AddCategoryActivity
import com.example.expensemanager.activity.AddDataActivity
import com.example.expensemanager.activity.AllTransactionActivity
import com.example.expensemanager.activity.ReportActvity


class MainActivity : AppCompatActivity() {
    lateinit var rlvIncome: RelativeLayout
    lateinit var rlvTransaction: RelativeLayout
    lateinit var rlvExpenses: RelativeLayout
    lateinit var rlvReport: RelativeLayout
    lateinit var rlvCategory: RelativeLayout
    lateinit var premium: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        premium()

    }

    private fun premium() {
        premium = findViewById(R.id.premium)
        premium.setOnClickListener {
        }
    }

    private fun initView() {
        rlvIncome = findViewById(R.id.rlvIncome)
        rlvExpenses = findViewById(R.id.rlvExpenses)
        rlvTransaction = findViewById(R.id.rlvTransaction)
        rlvReport = findViewById(R.id.rlvReport)
        rlvCategory = findViewById(R.id.rlvCategory)

        rlvIncome.setOnClickListener {
            val intent = Intent(this, AddDataActivity::class.java)
            intent.putExtra("income", "ADD INCOME")
            intent.putExtra("type", 0)
            startActivity(intent)
        }
        rlvExpenses.setOnClickListener {
            var intent = Intent(this, AddDataActivity::class.java)
            intent.putExtra("expenses", "ADD EXPENSES")
            intent.putExtra("type", 1)
            startActivity(intent)
        }
        rlvTransaction.setOnClickListener {
            var intent = Intent(this, AllTransactionActivity::class.java)
            startActivity(intent)
        }
        rlvReport.setOnClickListener {
            var intent = Intent(this, ReportActvity::class.java)
            startActivity(intent)
        }
        rlvCategory.setOnClickListener {
            var i = Intent(this, AddCategoryActivity::class.java)
            startActivity(i)
        }
    }


}