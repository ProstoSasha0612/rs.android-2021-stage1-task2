package subtask1

import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val dateFormat = SimpleDateFormat("dd MMMM, EEEE", Locale.forLanguageTag("Ru"))
        val yearVal = year.toInt()
        val monthVal = month.toInt() - 1
        val dayVal = day.toInt()

        val calendar = GregorianCalendar(yearVal,monthVal,dayVal)
        println(dateFormat.format(calendar.time))
        if(monthVal !in 0..11 || (monthVal == 1 && dayVal>28 || monthVal == 1 && dayVal>29 && yearVal%4 == 0)) return "Такого дня не существует"
        when(dayVal){
            1,3,5,9,10 -> return "Такого дня не существует"
        }
        return dateFormat.format(calendar.time)
    }
}

//fun main() {
//    val data = DateFormatter()
//    data.toTextDay("40","02", "2020")
//}