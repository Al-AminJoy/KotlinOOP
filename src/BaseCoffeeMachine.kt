abstract class BaseCoffeeMachine (
    private val price:Int,
    private val color:String
        ){
    abstract fun makeCoffee(quantity:Int):String

}