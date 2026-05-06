import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
	java
}

repositories {
	mavenCentral()
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter:5.12.0")
}

java {
	toolchain.languageVersion.set(JavaLanguageVersion.of(25))
}

tasks.test {
	useJUnitPlatform()
	testLogging {
		events(TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED)
	}
}
