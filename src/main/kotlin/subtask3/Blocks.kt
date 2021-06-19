package subtask3

import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            String::class -> {
                val filteredList = blockA.filterIsInstance<String>()
                val res = StringBuilder("")
                for(i in filteredList){
                    res.append(i)
                }
                return res.toString()
            }
            Int::class -> {
                val filteredList = blockA.filterIsInstance<Int>()
                return filteredList.sum()
            }
            else ->{
                val filteredList = blockA.filterIsInstance<LocalDate>() //dd.MM.yyyy
                var res = filteredList[0]
                for(i in 1 until filteredList.size){
                    if(filteredList[i] > res){
                        res = filteredList[i]
                    }
                }
                val dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                return dateFormat.format(res)
            }
        }
    }

}
