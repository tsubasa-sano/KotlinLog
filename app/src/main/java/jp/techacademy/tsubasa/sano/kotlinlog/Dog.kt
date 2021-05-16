package jp.techacademy.tsubasa.sano.kotlinlog

import android.util.Log

open class Dog:Animal, Movable {
    // 引数付きコンストラクタ（初期化されるプロパティ（変数））
    constructor(name: String, age:Int): super(name, age) {
    }

    //animalクラスのメソッド（処理）をoverride
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    //Movableインターフェイスのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest",this.name + "(" +this.age + "歳)" + "は全力で走った。")
    }

}