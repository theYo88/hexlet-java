plugins {
    // Поддержка запуска из командной строки
    application
    id("com.github.ben-manes.versions") version "0.46.0"
    id("se.patrikerdes.use-latest-versions") version "0.2.18"
}

repositories {
    // Подключаем автоматическая работа с репозиторием Maven Central
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.13.0")
}

// Для плагина application указываем главный класс приложения
application {
    // Входная точка
    mainClass.set("io.hexlet.example.App")
}