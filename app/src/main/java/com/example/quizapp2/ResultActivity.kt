package com.example.quizapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username
        val totatQuestion = intent.getIntExtra(Constants.TOTAL_QUESTION,0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWER,0)

        tv_score.text = "Your score is $correctAnswer out of $totatQuestion"

        btn_finish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}