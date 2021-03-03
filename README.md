## Web Automation using Java, Selenium and Cucumber

To run this project:
##### Step 1: Go to root directory of the project
##### Step 2: Open terminal
##### Step 3: Run the following command to install dependencies: 
```
mvn clean install
```
### Running the tests
Run the following command to run all test: 
```
mvn test
```
Run the following command to run a test using tags: 
```
mvn test -Dcucumber.options="--tags @tags"
```
To hide the maven warning message, run: 
```
mvn test -Dcucumber.options="--tags @tags" -q
``` 
