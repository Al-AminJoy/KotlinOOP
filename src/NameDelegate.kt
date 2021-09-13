import kotlin.reflect.KProperty

class NameDelegate {

    var formattedValue:String ? =null;

    operator fun setValue(student: Any?, property: KProperty<*>, value: String?) {
        if (value!=null && value.length>3){
            if (value != null) {
                formattedValue = value.trim().toUpperCase()
            };
        }

    }

    operator fun getValue(thisRef:Student?,
                          property:KProperty<*>,
                          ):String?{
        return formattedValue;
    }

}