fun main() {
    var name:String? = "manuelernesto"
    name = null
    println(name?.length)

    var countries: List<String?> =  listOf("Angola🇦🇴",
        "Moçambique🇲🇿",
        null,
        "Cabo Verde🇨🇻",
        null,
        "Portugal🇵🇹",
        null,
        "Brasil🇧🇷")

    for (country in countries){
        country?.let { println(it) }
    }

    val x =  name?.length
    var y = name!!
}