plugins {
    application
//    id("java")


}
group = "hexlet.code"

version = "1.0-SNAPSHOT"

application {
    mainClass.set("hexlet.code.App")
}

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}