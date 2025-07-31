# 🛒 Daraz Automation Framework

![Java](https://img.shields.io/badge/Java-17-blue)
![Selenium](https://img.shields.io/badge/Selenium-Framework-brightgreen)
![TestNG](https://img.shields.io/badge/TestNG-UnitTesting-orange)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36)
![ExtentReport](https://img.shields.io/badge/ExtentReport-Integrated-success)
![Docker](https://img.shields.io/badge/Docker-Ready-blue)
![Platform](https://img.shields.io/badge/Platform-Windows%20%7C%20Linux-lightgrey)
![Last Commit](https://img.shields.io/github/last-commit/asoaib121/Daraz_SeleniumTest)
![License](https://img.shields.io/github/license/asoaib121/Daraz_SeleniumTest)

---

An advanced Selenium automation framework for testing the **Daraz e-commerce platform**, built using Java, TestNG, Maven, and ExtentReports.  
Supports parallel test execution and Dockerized Selenium Grid for scalable automation.

---

## 📦 Tech Stack

- **Language:** Java 17
- **Test Framework:** TestNG
- **Build Tool:** Maven
- **Reporting:** ExtentReports
- **Excel Integration:** Apache POI
- **Grid Support:** Docker + Selenium Grid
- **Architecture:** Page Object Model (POM)

---

## 📁 Project Structure

DarazAutomationFramework/

├── pom.xml

├── testng.xml

├── docker-compose.yml

├── .gitignore

├── extent-test-output/

│ ├── index.html

│ └── screenshots/

├── executable/

│ ├── chromedriver-win64/

│ ├── geckodriver-v0.34.0-win64/

│ ├── chromedriver-win64.zip

│ └── geckodriver-v0.34.0-win64.zip

├── resources/

│ ├── config.properties

│ └── TestData.xlsx

├── src/

│ └── main/

│ └── java/

│ └── Daraz/

│ ├── annotations/

│ ├── config/

│ ├── constants/

│ ├── dataprovider/

│ ├── driver/

│ ├── encodedecode/

│ ├── enums/

│ ├── exceptions/

│ ├── factory/

│ ├── listeners/

│ ├── pages/

│ ├── reports/

│ ├── utils/

│ ├── webdrivermanager/

│ └── Runner.java

│ └── test/

│ └── java/

│ └── Daraz/

│ ├── tests/

│ └── com/

├── target/

├── test_output/

└── video/

└── videos/

---

## 🚀 Features

- ✅ Selenium WebDriver with Chrome/Firefox support  
- ✅ Page Object Model (POM) design pattern  
- ✅ TestNG for test orchestration  
- ✅ ExtentReports for advanced HTML reporting  
- ✅ Docker Grid support for parallel cross-browser execution  
- ✅ Data-driven testing using Excel  
- ✅ Custom retry mechanism and annotations  
- ✅ Configurable via `config.properties` file  

---

## 🧪 Test Workflow

1. **Read Search Term** from Excel ➝ `SearchBoxComponent`
2. **Select Brand** from Excel ➝ `BrandSelectionComponent`
3. **Click Product** ➝ `ProductClickComponent`
4. **Close Browser & Generate Report**

---

## 🛠️ Tools & Technologies

| Tool            | Purpose                      |
|-----------------|------------------------------|
| Java            | Programming language         |
| Selenium        | UI Automation                |
| TestNG          | Test management              |
| Maven           | Dependency & build tool      |
| ExtentReports   | Test reporting               |
| Docker          | Containerized grid execution |
| Git/GitHub      | Version control              |

---

## 🚀 Parallel Test Execution
This framework is designed to run multiple types of automated tests in parallel on the same website, ensuring faster feedback and optimized execution time.

---

## ✅ What It Supports
Multiple test categories (e.g., functional tests + filter tests) run simultaneously.

Built-in support for TestNG parallel execution using data providers or suite-level thread control.

Seamless integration with ExtentReports, where each test run logs its own execution independently — including screenshots and logs.

---

## ⚙️ How It Works
Test classes are grouped and executed in parallel using testng.xml suite configuration.

All tests use thread-safe DriverManager, ensuring independent browser sessions.

Screenshots and logs are maintained per thread/test for easy debugging and reporting.

---

## 🧪 Example
You can run tests like:

SearchTest (handles product search from Excel)

BrandFilterTest (applies dynamic brand filters)

...both at the same time in separate browser instances without conflict.

---

## ⚙️ How to Run Tests

1. **Clone the repository**
   ```bash
   gh repo clone asoaib121/Amazon_Project_Selenium_Testing

2. **Import into IntelliJ IDEA or Eclipse as a Maven Project**

3. **Configure the drivers**
  --> Add ChromeDriver and GeckoDriver path inside executable/ or set system properties if needed.
   
4. **Run with Maven**
  --> mvn clean test

5. **Select rigth path**
  --> go to your path (("user.dir"),"Daraz_Selenium_TestNG","src","Daraz")
   note: run docker-compose.yml file

🐳 **Run Tests on Docker Grid**

6. Navigate to test_output and start the docker grid
  -->  docker-compose up -d

 7. **Search  Web Browser**
  --> Go to your Web Browser and search (localhost:4445)

 8. **Run Your Project(TestNG suite)**
  --> Go to Your IDE
  -->Right-click on testing.xml → Run

9. **View Test Report**
  -->Go to: extent-test-output/index.html

10. **Stop the Containers**
  --> Go to Docker dektop terminal.
  --> docker-compose down


-----------------------------------------------------------

📌 Configurations
Edit the following file for environment settings:
src/main/java/Daraz/config/config.properties


-----------------------------------------------------------


📸 Screenshots & Reports
Screenshots on failure are auto-saved using ScreenshotUtils.


-------------------------------------------------------------


🙋 Author

Shoaib

BSc in CSE, Green University of Bangladesh

💼 Focus: QA Automation Engineer

## 🚀 Features

- ✅ Selenium WebDriver with Chrome/Firefox support  
- ✅ Page Object Model (POM) design pattern  
- ✅ TestNG for test orchestration  
- ✅ ExtentReports for advanced HTML reporting  
- ✅ Docker Grid support for parallel cross-browser execution  
- ✅ Data-driven testing using Excel  
- ✅ Custom retry mechanism and annotations  
- ✅ Configurable via `config.properties` file  

---

## 🛠️ Tools & Technologies

| Tool            | Purpose                      |
|-----------------|------------------------------|
| Java            | Programming language         |
| Selenium        | UI Automation                |
| TestNG          | Test management              |
| Maven           | Dependency & build tool      |
| ExtentReports   | Test reporting               |
| Docker          | Containerized grid execution |
| Git/GitHub      | Version control              |

---

🚀 Parallel Test Execution
This framework is designed to run multiple types of automated tests in parallel on the same website, ensuring faster feedback and optimized execution time.

---

✅ What It Supports
Multiple test categories (e.g., functional tests + filter tests) run simultaneously.

Built-in support for TestNG parallel execution using data providers or suite-level thread control.

Seamless integration with ExtentReports, where each test run logs its own execution independently — including screenshots and logs.

---

⚙️ How It Works
Test classes are grouped and executed in parallel using testng.xml suite configuration.

All tests use thread-safe DriverManager, ensuring independent browser sessions.

Screenshots and logs are maintained per thread/test for easy debugging and reporting.

---

🧪 Example
You can run tests like:

SearchTest (handles product search from Excel)

BrandFilterTest (applies dynamic brand filters)

...both at the same time in separate browser instances without conflict.

---

## ⚙️ How to Run Tests

1. **Clone the repository**
   ```bash
   gh repo clone asoaib121/Amazon_Project_Selenium_Testing

2. **Import into IntelliJ IDEA or Eclipse as a Maven Project**

3. **Configure the drivers**
  --> Add ChromeDriver and GeckoDriver path inside executable/ or set system properties if needed.
   
4. **Run with Maven**
  --> mvn clean test

5. **Select rigth path**
  --> go to your path (("user.dir"),"Daraz_Selenium_TestNG","src","Daraz")
   note: run docker-compose.yml file

🐳 **Run Tests on Docker Grid**

6. Navigate to test_output and start the docker grid
  -->  docker-compose up -d

 7. **Search  Web Browser**
  --> Go to your Web Browser and search (localhost:4445)

 8. **Run Your Project(TestNG suite)**
  --> Go to Your IDE
  -->Right-click on testing.xml → Run

9. **View Test Report**
  -->Go to: extent-test-output/index.html

10. **Stop the Containers**
  --> Go to Docker dektop terminal.
  --> docker-compose down


-----------------------------------------------------------

📌 Configurations
Edit the following file for environment settings:
src/main/java/Daraz/config/config.properties


-----------------------------------------------------------


📸 Screenshots & Reports
Screenshots on failure are auto-saved using ScreenshotUtils.


-------------------------------------------------------------


🙋 Author

Shoaib

BSc in CSE, Green University of Bangladesh

💼 Focus: QA Automation Engineer
