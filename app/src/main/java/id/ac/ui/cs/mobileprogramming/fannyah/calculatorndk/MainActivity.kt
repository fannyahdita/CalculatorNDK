package id.ac.ui.cs.mobileprogramming.fannyah.calculatorndk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    init {
        System.loadLibrary("calculatorndk")
    }

    /**
     * Adds two integers, returning their sum
     */
    external fun calculator(v1: Int, v2: Int): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val firstNum = Integer.parseInt(firstNum.text.toString())
            val secondNum = Integer.parseInt(secondNum.text.toString())
            val res = calculator(firstNum, secondNum)

            result.text = res.toString()
        }
    }
}
