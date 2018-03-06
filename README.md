FooBar is a Java program that prints the numbers from 1 to 100. 
But for multiples of three it prints "Foo" instead of the number and for the multiples of five "Bar". For numbers which are multiples of both three and five it prints "FooBar".

## prerequisites
* [Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Gradle](https://gradle.org/install)

## Building the project
```
gradle build
```

## Running the tests
```
gradle test
```

## Running the program
```
java -cp build/classes/main/ FooBar
```

