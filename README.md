# Bolt automation project
### UI tests for https://bolt.eu/
## Technology Stack:

| Java | Selenide | Gradle | Junit5 | Selenoid | Jenkins | IntelliJ IDEA | Allure Report | Telegram |
|:------:|:----:|:------:|:------:|:--------:|:--------:|:-------------:|:---------:|:--------:|
| <img src="images/JAVA.svg" width="40" height="40"> | <img src="images/Selenide.svg" width="40" height="40"> | <img src="images/Gradle.svg" width="40" height="40"> | <img src="images/Junit5.svg" width="40" height="40"> | <img src="images/Selenoid.svg" width="40" height="40"> | <img src="images/Jenkins.svg" width="40" height="40"> | <img src="images/IDEA.svg" width="40" height="40"> | <img src="images/Allure Report.svg" width="40" height="40"> | <img src="images/Telegram.svg" width="40" height="40"> |

## Description

You can run tests by configuring the following parameters:

- BROWSER
- BROWSER_VERSION
- BROWSER_SIZE
- BROWSER_MOBILE
- REMOTE_DRIVER_URL
- THREADS

  ![Parametrised build](./images/JenkinsJob.png)

### To run tests locally with files app.properties and local.properties:

```
gradle clean test 
```

## Allure reports

### Overview

![overview allure](./img/allure-demo.png)

### Test with steps, attached image, video, page source and console logs

![selenoid_screen](./images/AllureReport.png)

### Video

![video](./img/demo.gif)

## Allure TestOps

## Launches

![launches](./img/launches-demo.png)

## Test Cases

![test-case](./img/test-case-demo.png)

## Jira integration

![jira](./img/jira-demo.png)

## Telegram report

![telegram](./img/telegram-demo.png)
