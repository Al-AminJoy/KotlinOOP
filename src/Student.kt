import kotlin.reflect.KProperty
class Student {
    var firstName:String? by NameDelegate()
    var secondName:String? by NameDelegate()


}
