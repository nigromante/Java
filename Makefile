all: build run

build:
	 @mvn -q compile

run: build
	 @mvn -q exec:java -D"exec.mainClass"="com.nigromante.app.Main"

clean:
	 @rm -rf ./target

