```groovy
def myMethod(List<Integer> numbers) {
    // Solution 1: Iterate over a copy of the list
    List<Integer> numbersCopy = new ArrayList<>(numbers)
    numbersCopy.each { number ->
        if (number % 2 == 0) {
            println "Even: $number"
        } else {
            println "Odd: $number"
        }
    }

    // Solution 2: Use an iterator
    Iterator<Integer> iterator = numbers.iterator()
    while (iterator.hasNext()) {
        Integer number = iterator.next()
        if (number % 2 == 0) {
            println "Even: $number"
        } else {
            println "Odd: $number"
        }
    }
}

myMethod([1, 2, 3, 4, 5])
```