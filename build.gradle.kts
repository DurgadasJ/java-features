plugins {
	java
	id("org.springframework.boot") version "3.5.4"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.js"
version = "0.0.1-SNAPSHOT"
description = "Java-Spring Boot Project Implementing all features"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
