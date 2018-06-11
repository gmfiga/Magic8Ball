package com.example.gabriel.magic8ball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import java.util.*

class MainActivity : AppCompatActivity() {

    var randomNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ListenerForButton()
    }

    fun setAsnwer(){

        when (randomNum) {
            1 -> lblResponse.setText ("It is certain")
            2 -> lblResponse.setText ("It is decidedly so")
            3 -> lblResponse.setText ("Without a doubt")
            4 -> lblResponse.setText ("Yes definitely")
            5 -> lblResponse.setText ("You may rely on it")
            6 -> lblResponse.setText ("As I see it, yes")
            7 -> lblResponse.setText ("Most likely")
            8 -> lblResponse.setText ("Outlook good")
            9 -> lblResponse.setText ("Yes")
            10 -> lblResponse.setText ("Signs point to yes")
            11 -> lblResponse.setText ("Reply hazy try again")
            12 -> lblResponse.setText ("Ask again later")
            13 -> lblResponse.setText ("Better not tell you now")
            14 -> lblResponse.setText ("Cannot predict now")
            15 -> lblResponse.setText ("Concentrate and ask again")
            16 -> lblResponse.setText ("Don't count on it")
            17 -> lblResponse.setText ("My reply is no")
            18 -> lblResponse.setText ("My sources say no")
            19 -> lblResponse.setText ("Outlook not so good")
            20 -> lblResponse.setText ("Very doubtful")
        }
    }

    fun RandomNumberGenerator(){
        var random = Random()
        var min = 1
        var max = 10
        randomNum = random.nextInt(max + 1 - min) + min

    }

    fun ListenerForButton(){
        btnAsk.setOnClickListener{
            if(lblQuestion.getText().toString().equals("")){
                toast("Please enter a question")
            }else{
                RandomNumberGenerator()
                setAsnwer()
            }
        }

    }


}
