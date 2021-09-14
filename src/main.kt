class App : DownloadListener{
    override fun onDownloadStarted() {
        println("Download Started")
    }

    override fun onDownloadComplete(file: String) {
        println("Download Complete $file");
    }

    override fun onProgressUpdate(progress: Int) {
        println("Downloading ${progress}%");
    }

}

class MakeCoffee(
    private val name:String
):CoffeeMaker{
    override fun makeCoffee() {
        println("$name Made");
    }
}

class MixCoffee(
    private val name:String
):CoffeeMixer{
    override fun mixCoffee() {
        println("$name Mixed");
    }

}

class CoffeeServer(
    private val maker:CoffeeMaker,
    private val mixer:CoffeeMixer
): CoffeeMaker by maker,CoffeeMixer by mixer

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

   /* val audioDownload  = Audio("audio.mp3");
    val videoDownload  = Video("video.mp4");

    audioDownload.downloaderInfo();
    audioDownload.download();
    audioDownload.play();

    videoDownload.downloaderInfo();
    videoDownload.download();
    videoDownload.play();
*/

    //val downloadListener = App();

    val download = DownloaderClass();

   // download.downloadListener = downloadListener;
  /*  download.downloadListener = object :DownloadListener{
        override fun onDownloadStarted() {
            println("Download Started")
        }

        override fun onDownloadComplete(file: String) {
            println("Download Complete $file");
        }

        override fun onProgressUpdate(progress: Int) {
            println("Downloading ${progress}%");
        }
    };
    download.downloadFile("video.mkv");*/

   /* var coffee:String = "Joy's Coffee";

    val coffeeServer:CoffeeServer = CoffeeServer(MakeCoffee(coffee),MixCoffee(coffee));
    coffeeServer.makeCoffee();
    coffeeServer.mixCoffee();
*/
   /* val student = Student();
    student.firstName = "Al-Amin";
    student.secondName = "Islam";

    println(student.firstName+" "+student.secondName);*/

    val food = Food();
    //food.heavy;
    /*food.price = 20;
    food.price = 30;*/
    food.quantity = 5;
    food.quantity = 15;
    food.quantity = 20;

}