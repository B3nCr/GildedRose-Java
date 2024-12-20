.PHONY: build clean test run

build:
	./gradlew build

clean:
	./gradlew clean

test:
	./gradlew test

run:
	./gradlew run

check:
	./gradlew check

deps:
	./gradlew dependencies

refresh:
	./gradlew --refresh-dependencies
