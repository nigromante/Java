clean:
	@rm -rf ./target

build:
	@mvn compile

run:
	 @mvn -q exec:java -D"exec.mainClass"="com.nigromante.test.Main"

