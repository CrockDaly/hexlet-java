
plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}




application {
    // Входная точка
    mainClass.set("io.hexlet.example.App")
}

