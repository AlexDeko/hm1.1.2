fun main() {
    var heightUser: Double = 1.75
    var weightUser: Double = 75.10
    var index: Double = bodyMassIndex(itemHeight = heightUser, itemWeight = weightUser)
    var verdict: String = setVerdict(index)
    println(verdict)


    heightUser = 1.55
    weightUser = 105.10
    index = bodyMassIndex(itemHeight = heightUser, itemWeight = weightUser)
    verdict = setVerdict(index)
    println(verdict)


    heightUser = 1.95
    weightUser = 45.10
    index = bodyMassIndex(itemHeight = heightUser, itemWeight = weightUser)
    verdict = setVerdict(index)
    println(verdict)

}

fun setVerdict(index: Double): String{
    if (index in 16.00..18.49) return "Недостаточная (дефицит) масса тела"
    if (index in 18.50..25.99) return "Норма"
    if (index in 25.00..29.99) return "Избыточная масса тела (предожирение)"
    if (index in 30.00..34.99) return "Ожирение"
    if (index in 35.00..39.99) return "Ожирение резкое"
    if (index >= 40.00) return "Очень резкое ожирение"
    return "Выраженный дефицит массы тела"
}

fun bodyMassIndex(itemHeight: Double, itemWeight: Double): Double {
    return itemWeight / (itemHeight * itemHeight)
}