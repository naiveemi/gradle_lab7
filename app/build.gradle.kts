/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("lab7.java-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("lab7.app.App")
}
tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "lab7.app.App"
    }
    }