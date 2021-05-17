package jp.techacademy.tsubasa.sano.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("佐野翼", 20,"スマホ")

        human.say()
        human.think()

        val human2 = Human("佐野つばさ",19,"ゲーム")

        human2.say()
        human2.think()

        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say()
        dog.move()

        //Stringクラス
        val str1= "Hello"
        val str2= "World"
        val str3= "Hello"

        //文字列の長さ(文字数)
        val length = str3.length
        Log.d("kotlintest", length.toString())

        //文字列の比較について
        if (str1.equals(str2)) {
            Log.d("kotlintest","str1とstr2は一緒です")
        }else {
            Log.d("kotlintest","str1とstr2は異なります")
        }

        if (str1.equals(str3)) {
            Log.d("kotlintest","str1とstr3は一緒です")
        }else {
            Log.d("kotlintest","str1とstr3は異なります")
        }

    }

}