# java-concepts

From [Stackoverflow](https://stackoverflow.com/questions/10546720/how-to-compile-packages-in-java) you can compile packages in Java as follows.

Make a new directory called classes.

When you are trying to compile the java class, use the '-d' option (destination) to specify where the .class files should be located.

javac -d "classes" ./foodirectory/*.java

and when you run your program, make sure that same folder is included in your class path:

java -classpath "classes" foopackage.FooMainClass


