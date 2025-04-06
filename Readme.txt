Project Structure
shopping-basket/
├── pom.xml
├── src/
│   ├── main/java/com/delta/capita/sb/
│   │   ├── Item.java
│   │   ├── PricingCalculator.java
│   │   ├── PricingRules.java
│   │   └── ShoppingBasketLauncher.java
│   └── test/java/com/delta/capita/sb/
│       └── PricingCalculatorTest.java

To start the application:
1. Open command prompt.
2. Go to the project directory
3. Execute the below command
   mvn compile exec:java
4. To execute the test class, execute the below command
   mvn test
NOTE: Please make sure the Java version 8 and mvn is installed in the machine.
