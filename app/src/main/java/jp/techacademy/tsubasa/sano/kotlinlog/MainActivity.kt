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

    }

}