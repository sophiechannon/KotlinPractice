class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

fun main(args: Array<String>) {
    val songOne = Song("Evaporate with me 2 Infinity", "Legowelt")
    val songTwo = Song("Taking the Hobbits to Isengard", "YouTube")
    val songThree = Song("Jolene", "Dolly Parton")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}