package util

object Resource {
    /**
     * Reads a file from resources.
     */
    fun read(name: String): String {
        val stream = Resource::class.java.classLoader.getResourceAsStream(name)
        stream ?: throw IllegalArgumentException("Cannot find resource '${name}'")
        return String(stream.readAllBytes())
    }

    /**
     * Removes `'\r'` from line endings.
     */
    fun readAndSanitise(name: String): String {
        return read(name).replace("\r", "")
    }
}