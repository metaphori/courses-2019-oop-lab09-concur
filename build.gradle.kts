plugins {
    java
}
repositories {
    mavenCentral() // Where to look for jars
}
dependencies {
    /*
     * Uncomment the following line, then run "Refresh Gradle Project"
     * in Eclipse, and you will be magically able to use Google Guava
     * into the Project
     */
    // implementation("com.google.guava:guava:28.1-jre")
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2") // We need Junit
}
// Enables a newer, better engine for JUnit, required by Junit 5
tasks.named<Test>("test") {
    useJUnitPlatform() 
}
