fun main(args: Array<String>) {
    val box = Box(10,20,15);

    println("Height ${box.height}");
    println("Width ${box.width}");
    println("Length ${box.length}");
    println("Volume ${box.volume}");

    box.boxName = "Magic Box";

    print("Box Name Is ${box.boxName}");
}