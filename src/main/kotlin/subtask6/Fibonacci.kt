package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
       //throw NotImplementedError("Not implemented")
        var mas = IntArray(15)
        var final = IntArray(3)

        var i = 2

        mas[0] = 0
        mas[1] = 1
        while (i < 15) {
            mas[i]=mas[i-1]+mas[i-2]
            i++
        }

        var j = 0

            while (j < mas.size) {
                if (n == (mas[j] * mas[j + 1])) {
                    final[0] = mas[j]
                    final[1] = mas[j + 1]
                    final[2] = 1
                    return final
                }
               if ((mas[j] * mas[j + 1]) > n) {
                    final[0] = mas[j]
                    final[1] = mas[j+1]
                    final[2] = 0
                   return final
                }
                else j++
            }
        return final
    }
}