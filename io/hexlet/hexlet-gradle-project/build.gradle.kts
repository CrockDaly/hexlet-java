plugins {

    id("com.github.ben-manes.versions") version "0.48.0"

    application
}

repositories {

    mavenCentral()
}


application {

    mainClass.set("io.hexlet.example.App")
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.17.0")

}
