package subtask1

import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {

            val day=day.toInt()
            val month = month.toInt()
            val year=year.toInt()


            val Cal: Calendar = Calendar.getInstance(Locale("RU"))
            Cal.set(year,month-1,day)

            val simpleDateFormat: SimpleDateFormat = SimpleDateFormat("dd MMMM, EEEE")
            val final = simpleDateFormat.format(Cal.time)

            if (final.toString().startsWith(day.toString())) {
                return final.toString()
            }
            else {
                return "Такого дня не существует"
            }
        }
    }

