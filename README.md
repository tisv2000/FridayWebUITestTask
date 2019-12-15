# FRIDAY Web UI automation test task
Task description: https://gist.github.com/MMore/da79169c45608684d921bff092f3831a

###  Prerequisites
- JDK8 or higher
- Maven v3.5.0
- Git v2.14
- Browsers (Chrome v76, Firefox v70)
- Lombok plugin for IDE 
    
### How to run the tests and generate a report
    cd <your_projects_directory>
    git clone https://github.com/tisv2000/FridayWebUITestTask.git FridayWebUITestTask
    cd FridayWebUITestTask
    mvn clean test
    mvn allure:report
    
### Where to find the report, screenshots and logs
- Report can be found in `target/site/allure-maven` (the report file is `index.html`)
- Screenshots are taken only for failed tests and are attached to the report
- Logging system has 3 appenders:
    - file appender, which logs information in a file in`target/logs`
    - console appender, which prints information to a console
    - allure appender, which captures test log output and store it as attachment in allure report

### Configuration
- To run tests against a different browser:
    - change `driver.name` property  in `src/main/resources/default-config.properties`
    - or change `driver.name` property  in `src/test/resources/config.properties`
    - or use the following command:`mvn clean test -Ddriver.name=<browser name>`
- To run tests against a different environment:
    - change `base.url` property in `src/test/resources/config.properties`
    - or use the following command: `mvn clean test -Dbase.url=<url>`

### Dependencies
- Selenium to manage a browser
- TestNG to develop tests
- Allure to generate a report
- Lombok to avoid boilerplate code
- Logback for logging

### Personal notes
I used my own framework, which I wrote some time ago for another technical task: https://github.com/tisv2000/HelloFreshWebUITask

Main framework features:
1. This solution supports 2 platforms - macOS and Linux, as well as platform auto-detection.
2. Working with configuration (Reading custom config property-file and merge custom properties with system properties).
3. DriverFactory creates driver instances (it can be created for Chrome and Firefox drivers).
4. DriverHolder is a storage for web driver instances. It adds/removes them into/from ThreadLocal variable.
5. Class BasePage contains all base methods for working with page elements.
6. Allure report generation with logs and screenshot attachments.

The AUT analysis identified the following steps, some of which are skipped in some cases:
1. selectPrecondition
2. selectRegisteredOwner
3. selectVehicle
4. selectModel
5. selectBodyType (can be skipped)
6. selectFuelType (can be skipped)
7. selectEnginePower (only for Benzin and Diesel)
8. selectEngine
9. enterRegistrationDate
10. enterBirthDate

I decided to implement only tests, where all these steps are presented.

Eventually: 9 cases implemented: for 3 car brands and for 3 models for each brand.

Tests are run in three threads.

Additional comments on the AUT analysis:
- `data-test-id` attribute is the same for several elements on the same page for some pages.
- Fields on pages, which are not used in the tests, are ignored (not added into pages classes).
