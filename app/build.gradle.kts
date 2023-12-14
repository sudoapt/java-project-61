plugins {
    application
    checkstyle
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

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}


tasks.test {
    useJUnitPlatform()
}