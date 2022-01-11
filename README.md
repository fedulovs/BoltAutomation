<code><img height="100" src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Bolt_logo.png/200px-Bolt_logo.png"></code>

# Bolt web automation project
### UI tests for https://bolt.eu/
## Technology Stack:

| Java | Selenide | Gradle | Junit5 | Selenoid | Jenkins | IntelliJ IDEA | Allure Report | Allure Testops | Telegram |
|:------:|:----:|:------:|:------:|:--------:|:--------:|:-------------:|:---------:|:---------:|:--------:|
| <img src="images/JAVA.svg" width="40" height="40"> | <img src="images/Selenide.svg" width="40" height="40"> | <img src="images/Gradle.svg" width="40" height="40"> | <img src="images/Junit5.svg" width="40" height="40"> | <img src="images/Selenoid.svg" width="40" height="40"> | <img src="images/Jenkins.svg" width="40" height="40"> | <img src="images/IDEA.svg" width="40" height="40"> | <img src="images/Allure Report.svg" width="40" height="40"> | <img src="images/AllureTestops.svg" width="40" height="40"> | <img src="images/Telegram.svg" width="40" height="40"> |

## Description

You can run tests by configuring the following parameters:

* BROWSER (default chrome)
* BROWSER_VERSION (default 89.0)
* BROWSER_SIZE (default 1920x1080)
* REMOTE_DRIVER_URL (url address of selenoid or grid)
* THREADS (number of threads to run)
* ALLURE_NOTIFICATIONS_VERSION

  ![Parametrised build](./images/JobSettings.png)

### To run tests locally with files app.properties and local.properties:

```
gradle clean test 
```

## Allure reports

### Overview

![overview allure](./images/JenkinsLaunches.png)

### Test with steps, attached image, video, page source and console logs

![selenoid_screen](./images/AllureReport.png)

### Video

<img src="./images/video.gif" width="100%" height="100%"/>

## Allure [TestOps](https://allure.autotests.cloud/project/794/test-cases?treeId=1524/ "TestOps") 

_Each launch displays it's details in Allure TMS in live regime_

![allure testops runs](./images/AllureTestopsRuns.png)

## Launches

![launches](./images/Launches.png)

## Test Cases

![allure testops](./images/AllureTestops.png)

## Jira integration

_Tests and runs could be integrated with Jira and attached to specific task_

![jira](./images/Jira.png)

## Telegram report

![telegram](./images/Telegram.png)

