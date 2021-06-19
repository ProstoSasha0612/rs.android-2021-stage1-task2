package subtask2

import java.lang.StringBuilder

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
   val aStr = StringBuilder(a.toUpperCase())

        var res = StringBuilder("")
        for(i in 0 until aStr.length){
            if(aStr[i] in b){
                res.append(aStr[i])
            }
        }

        var counter = 0                 //этот код для избужания ошибок, которые могут возникнуть, но в тесте их нету
        for (i in 0 until res.length) {           // ABACD -> ABAC -> ABC  удаляет символы которые не совпадают
            if (b[counter] == res[counter]) {     // ABC -> ABC -> ABC
                counter++
            } else {
                res.delete(counter, counter + 1)
            }
        }
        return if (res.toString() == b) "YES" else "NO"
    }
}
