class Box (val height : Int,
           val width : Int,
           val length : Int){

    init {
        print("Init Bloc Called\n");
    }

    val volume
        get() = height*width*length;

    var boxName:String = "Default Name"
        set(value) {
            if (value.length<3){
                print("Length Cannot Be Less Than 3 ");
            }
            else{
                field = value;
            }
        }

    fun open (){
        print("Box opened");
    }
}