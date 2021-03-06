<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Bolt_logo.png/200px-Bolt_logo.png">

# Bolt web automation project
### UI tests for https://bolt.eu/
## Technology Stack:

| Java | Selenide | Gradle | Junit5 | Selenoid | Jenkins | IntelliJ IDEA | Allure Report | Allure Testops | Telegram |
|:------:|:----:|:------:|:------:|:--------:|:--------:|:-------------:|:---------:|:---------:|:--------:|
| <img src="images/JAVA.svg" width="40" height="40"> | <img src="images/Selenide.svg" width="40" height="40"> | <img src="images/Gradle.svg" width="40" height="40"> | <img src="images/Junit5.svg" width="40" height="40"> | <img src="images/Selenoid.svg" width="40" height="40"> | <img src="images/Jenkins.svg" width="40" height="40"> | <img src="images/IDEA.svg" width="40" height="40"> | <img src="images/Allure Report.svg" width="40" height="40"> | <img src="images/AllureTestops.svg" width="40" height="40"> | <img src="images/Telegram.svg" width="40" height="40"> |

## Launch options

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

## Allure reports <img src="images/Allure Report.svg" width="25" height="25">

### Overview

![overview allure](./images/JenkinsLaunches.png)

### Launch results

![launches](./images/Launches.png)

### Test with steps, attached image, video, page source and console logs

![selenoid_screen](./images/AllureReport.png)

### Video

<img src="./images/video.gif" width="100%" height="100%"/>

## Allure [TestOps](https://allure.autotests.cloud/project/794/test-cases?treeId=1524/ "TestOps") <img src="images/AllureTestops.svg" width="25" height="25">

_Each launch displays it's details in Allure TMS in live regime_

![allure testops runs](./images/AllureTestopsRuns.png)

## Test Cases

![allure testops](./images/AllureTestops.png)

## [Jira](https://jira.autotests.cloud/browse/AUTO-575 "Jira") integration <img src="https://starchenkov.pro/qa-guru/img/skills/Jira.svg" width="25" height="25"> 

_Tests and runs could be integrated with Jira and attached to specific task_

![jira](./images/Jira.png)

## Telegram report <img src="https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width="25" height="25">

![telegram](./images/Telegram.png)

