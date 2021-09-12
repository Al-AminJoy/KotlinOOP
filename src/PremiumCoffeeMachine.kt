class PremiumCoffeeMachine (
    val price:Int,
    val color:String
        )
    : BaseCoffeeMachine(price,color) {

    override fun makeCoffee(quantity: Int): String {
        return "Coffee Served";
    }
}