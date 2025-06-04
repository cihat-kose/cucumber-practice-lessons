# Cucumber Practice Lessons

![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF7300?style=for-the-badge&logo=testng&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

## Table of Contents
1. [About the Project](#about-the-project)
2. [Key Benefits](#key-benefits)
3. [Features](#features)
4. [Application Under Test](#application-under-test)
5. [Reporting](#reporting)
6. [Installation](#installation)
7. [Configuration](#configuration)
8. [Usage](#usage)
9. [Parallel Testing](#parallel-testing)
10. [Folder Structure](#folder-structure)
11. [Dependencies](#dependencies)
12. [Contributing](#contributing)
13. [License](#license)
14. [Contact](#contact)

## About the Project

This repository contains step-by-step lessons for automating the [ZeroBank demo site](http://zero.webappsecurity.com) using **Selenium WebDriver**, **Cucumber**, and **TestNG**. It demonstrates common UI automation tasks such as logging in, adding payees and buying foreign currency. The examples follow the Page Object Model (POM) pattern and integrate data-driven testing with Apache POI.

## Key Benefits

- **Hands-On Practice** – Small scenarios focusing on essential automation concepts.
- **Behavior-Driven Development** – Feature files written in Gherkin provide clear, readable requirements.
- **Data-Driven** – Test data can be pulled from Excel files, and test results are logged back for tracking.
- **Rich Reporting** – Generates HTML, JSON, and ExtentReports output for easy analysis.

## Features

- **Login** – Validates login both with inline data and with credentials pulled from `ZeroBankData.xlsx`.
- **Add New Payee** – Demonstrates a data table with multiple payee inputs.
- **Purchase Foreign Currency** – Exercises the currency conversion workflow for several currencies.
- **Hooks and Utilities** – Capture screenshots on failure and record scenario results in Excel.

## Application Under Test

The lessons use the [ZeroBank demo application](http://zero.webappsecurity.com/login.html) to practice common banking tasks such as account login, paying bills and purchasing foreign currency.

## Reporting

- **Pretty Output** – All TestNG runners include the `pretty` plugin for clean console logs.
- **HTML/JSON Reports** – `TestRunnerSmokeWithHtmlAndJson` outputs HTML and JSON files in `target/reports`.
- **Extent Reports** – `TestRunnerExtentReport` creates a rich interactive report under `testReports/`.
- **Excel Logging** – `Hooks` writes scenario names, status and browser to `ScenarioResults.xlsx`.

## Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   ```
2. **Install Java and Maven** – Java 21 and Maven must be available on your `PATH`.
3. **Download WebDriver binaries** for the browsers you wish to test (e.g. ChromeDriver or GeckoDriver) and ensure they are on the `PATH`.

## Configuration

- **extent.properties**
  ```properties
  extent.reporter.spark.start=true
  extent.reporter.spark.out=test-output/SparkReport/Spark.html
  ```
- Adjust browser selection in `DriverManager.java` if you want a different default.

## Usage

Run any of the runner classes with Maven:
```bash
mvn test -Dtest=TestRunnerAll
```
Other available runners: `TestRunnerSmoke`, `TestRunnerRegression`, `TestRunnerWithPlugin`, `TestRunnerSmokeWithHtmlAndJson`, and `TestRunnerExtentReport`.

## Parallel Testing

TestNG XML files (e.g. `ParallelTest.xml`) can be used for parallel execution. Right‑click the XML in your IDE and run it to start tests on multiple browsers.

## Folder Structure

```
src/test/java
├── apachePOI/       # Excel data files
├── features/        # Gherkin feature files
├── pages/           # Page Object classes
├── runners/         # TestNG runner classes
├── stepDefinitions/ # Glue code for features
└── utilities/       # Driver and Excel helpers
src/test/resources
└── extent.properties
```
Extent reports and HTML outputs are stored under `testReports/`, `target/`, or `test-output/`.

## Dependencies

Dependencies are declared in `pom.xml`, including Selenium, Cucumber, TestNG, Apache POI and ExtentReports.

## Contributing

1. Fork the project.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add feature'`).
4. Push and open a Pull Request.

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE).

## Contact

Please open an issue for any questions or feedback.
