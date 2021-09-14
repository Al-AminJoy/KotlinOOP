import kotlin.properties.Delegates

class Food {
    val heavy by lazy { Burgar() }

    var price : Int by Delegates.observable(50){
            property, oldValue, newValue ->
        println("Old Value $oldValue")
        println("New Value $newValue")
    }

    var quantity: Int by Delegates.vetoable(10){
        property, oldValue, newValue ->
        println("Old Value $oldValue")
        println("New Value $newValue")
        newValue>=10;
    }
}