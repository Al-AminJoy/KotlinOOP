fun main(args: Array<String>) {
   /* val box = Box(10,20,15);

    println("Height ${box.height}");
    println("Width ${box.width}");
    println("Length ${box.length}");
    println("Volume ${box.volume}");

    box.boxName = "Magic Box";

    print("Box Name Is ${box.boxName}");*/

   /* val makeCoffee = PremiumCoffeeMachine(20,"Red");

    val status = makeCoffee.makeCoffee(10);

    print(status);*/

    val audioDownload  = Audio("audio.mp3");
    val videoDownload  = Video("video.mp4");

    audioDownload.downloaderInfo();
    audioDownload.download();
    audioDownload.play();

    videoDownload.downloaderInfo();
    videoDownload.download();
    videoDownload.play();


}