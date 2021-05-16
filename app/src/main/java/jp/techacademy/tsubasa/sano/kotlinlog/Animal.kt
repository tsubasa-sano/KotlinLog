package jp.techacademy.tsubasa.sano.kotlinlog

abstract class Animal {
    //プロパティ（属性）, メンバ変数
    var name: String
    var age: Int

    //引数付きコンストラクタ（インスタンスを作る際、自動的に実行されるメソッド）
    constructor(name:String,age:Int){
        this.name = name
        this.age = age
    }

    abstract fun say()
}