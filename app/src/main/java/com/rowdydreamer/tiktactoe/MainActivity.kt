package com.rowdydreamer.tiktactoe

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var player = "p1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener{
            btnClick(b1)
        }
        b2.setOnClickListener{
            btnClick(b2)
        }
        b3.setOnClickListener{
            btnClick(b3)
        }
        b4.setOnClickListener{
            btnClick(b4)
        }
        b5.setOnClickListener{
            btnClick(b5)
        }
        b6.setOnClickListener{
            btnClick(b6)
        }
        b7.setOnClickListener{
            btnClick(b7)
        }
        b8.setOnClickListener{
            btnClick(b8)
        }
        b9.setOnClickListener{
            btnClick(b9)
        }
        reset.setOnClickListener{
            Reset()
        }

    }

    fun btnClick( btn: Button?) {
        if (btn!!.text == "")
            if (player == "p1"){
                player = "p2"
                btn.text = "X"
            }else{
                player = "p1"
                btn.text = "O"
            }
        win()
    }

    fun win(){
        if((b1.text == "X" && b2.text == "X" && b3.text == "X")
            ||(b4.text == "X" && b5.text == "X" && b6.text == "X")
            ||(b7.text == "X" && b8.text == "X" && b9.text == "X")
            ||(b1.text == "X" && b4.text == "X" && b7.text == "X")
            ||(b2.text == "X" && b5.text == "X" && b8.text == "X")
            ||(b3.text == "X" && b6.text == "X" && b9.text == "X")
            ||(b1.text == "X" && b5.text == "X" && b9.text == "X")
            ||(b3.text == "X" && b5.text == "X" && b7.text == "X")

        ){
            toast("X Win The Game...")
            disableButton()
            resultbtn.text = "X Win The Game..."
        }else if ((b1.text == "O" && b2.text == "O" && b3.text == "O")
            ||(b4.text == "O" && b5.text == "O" && b6.text == "O")
            ||(b7.text == "O" && b8.text == "O" && b9.text == "O")
            ||(b1.text == "O" && b4.text == "O" && b7.text == "O")
            ||(b2.text == "O" && b5.text == "O" && b8.text == "O")
            ||(b3.text == "O" && b6.text == "O" && b9.text == "O")
            ||(b1.text == "O" && b5.text == "O" && b9.text == "O")
            ||(b3.text == "O" && b5.text == "O" && b7.text == "O")
        ){
            toast("O Win The Game...")
            disableButton()
            resultbtn.text = "O Win The Game..."
        }else{
            if (b1.text != "" && b2.text != "" && b3.text != "" && b4.text != ""
                && b5.text != "" && b6.text != "" && b7.text != "" && b8.text != "" && b9.text != "")
                toast("Tie the game....")
//            disableButton()
            resultbtn.text = "Match Draw/Tie"


        }

    }
    fun toast(msg:String){
        Toast.makeText(this@MainActivity,msg,Toast.LENGTH_SHORT).show()
    }
    fun Reset(){
        b1.text = ""
        b2.text = ""
        b3.text = ""
        b4.text = ""
        b5.text = ""
        b6.text = ""
        b7.text = ""
        b8.text = ""
        b9.text = ""
        b1.isEnabled = true
        b2.isEnabled = true
        b3.isEnabled = true
        b4.isEnabled = true
        b5.isEnabled = true
        b6.isEnabled = true
        b7.isEnabled = true
        b8.isEnabled = true
        b9.isEnabled = true
    }
    fun disableButton(){
        b1.isEnabled = false
        b2.isEnabled = false
        b3.isEnabled = false
        b4.isEnabled = false
        b5.isEnabled = false
        b6.isEnabled = false
        b7.isEnabled = false
        b8.isEnabled = false
        b9.isEnabled = false
    }
}