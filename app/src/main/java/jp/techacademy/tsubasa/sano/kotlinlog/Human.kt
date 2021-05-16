package jp.techacademy.tsubasa.sano.kotlinlog

import android.util.Log

open class Human:Animal, Thinkable {

    var hobby: String

    //Humanクラスにおける、引数付きのコンストラクタ（引数）->Humanインスタンス作成時に実行される
    constructor(name:String,age:Int,hobby:String):super(name,age) {
        this.hobby = hobby
    }

    //sayメソッド
    override fun say(){
        Log.d("kotlintest","私の名前は"+this.name+"です。")
        Log.d("kotlintest","年は"+this.age+"歳です。")
    }

    //Thinkableのthinkメソッドをoverride
    override fun think(){
        Log.d("kotlintest","私は"+this.hobby+"について考える。")
    }

}