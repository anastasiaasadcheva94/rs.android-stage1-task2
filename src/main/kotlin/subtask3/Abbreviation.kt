package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        //throw NotImplementedError("Not implemented")
        val a = a.toUpperCase()

        val stringA: CharArray = a.toCharArray()
        val stringB: CharArray= b.toCharArray()
        var i = 0
        var x = 0
        val ar = CharArray(stringB.size)

        while (i<a.length)
            if (x<ar.size&&stringA[i]==stringB[x]){
                ar[x]=stringB[x]
                x++
                i++}
            else
                i++
        i=0

        while (i<ar.size)
            if (stringB[i]==ar[i])
                i++
            else
                return "NO"

        return "YES"
    }
}


    /* if (a.toUpperCase().contains(b)) {
            val result = "YES"
            return result
        }
        else {
            val result = "NO"
            return result
        }
    }
}*/
