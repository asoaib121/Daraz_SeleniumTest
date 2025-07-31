# Daraz Selenium Automation Framework with Docker Grid

This project is a complete automation framework designed for testing the Daraz website using **Selenium WebDriver**, **TestNG**, **ExtentReports**, and **Docker Grid**. The framework follows a modular, maintainable, and scalable architecture using **Java + Maven**.

---

## 📁 Project Structure

DarazAutomationFramework/
│
├── pom.xml
├── testng.xml
├── docker-compose.yml
├── .gitignore
│
├── extent-test-output/             # Extent reports folder
│   ├── index.html
│   └── screenshots/
│
├── executable/                     # Browser drivers
│   ├── chromedriver-win64/
│   ├── geckodriver-v0.34.0-win64/
│   ├── chromedriver-win64.zip
│   └── geckodriver-v0.34.0-win64.zip
│
├── resources/
│   ├── config.properties
│   └── TestData.xlsx
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Daraz/
│   │           ├── annotations/
│   │           │   ├── AnnotationsTest.java
│   │           │   └── FrameworkAnnotation.java
│   │           │
│   │           ├── config/
│   │           │   └── config.properties
│   │           │
│   │           ├── constants/
│   │           │   └── FrameworkConstants.java
│   │           │
│   │           ├── dataprovider/
│   │           │   ├── DataProviderDependencyI.java
│   │           │   ├── DataProviderExcel.java
│   │           │   └── DataProviderTest.java
│   │           │
│   │           ├── driver/
│   │           │   ├── DriverManager.java
│   │           │   └── package-info.java
│   │           │
│   │           ├── encodedecode/
│   │           │   └── Runner.java
│   │           │
│   │           ├── enums/
│   │           │   ├── AuthorType.java
│   │           │   ├── CategoryType.java
│   │           │   ├── ConfigProperties.java
│   │           │   ├── EnumRunner.java
│   │           │   ├── Severity.java
│   │           │   └── WaitStrategy.java
│   │           │
│   │           ├── exceptions/
│   │           │   ├── BrowserInvocationFailedException.java
│   │           │   ├── FrameworkException.java
│   │           │   ├── InvalidPathForExcelException.java
│   │           │   ├── InvalidPathForFilesException.java
│   │           │   ├── InvalidPathForPropertyFileException.java
│   │           │   └── PropertyFileUsageException.java
│   │           │
│   │           ├── factory/
│   │           │   ├── DriverFactory.java
│   │           │   └── ExplicitWaitFactory.java
│   │           │
│   │           ├── listeners/
│   │           │   ├── AnnotationTransformers.java
│   │           │   ├── ListenerClass.java
│   │           │   └── MethodInterceptor.java
│   │           │
│   │           ├── pages/
│   │           │   ├── BasePage.java
│   │           │   ├── BrandFilterComponent.java
│   │           │   ├── DarazHomePage.java
│   │           │   ├── DarazPrinterAndInkPage.java
│   │           │   ├── ProductSelectionComponent.java
│   │           │   ├── SearchBoxComponent.java
│   │           │   └── SearchButtonComponent.java
│   │           │
│   │           ├── reports/
│   │           │   ├── ExtentLogger.java
│   │           │   ├── ExtentManager.java
│   │           │   └── ExtentReport.java
│   │           │
│   │           ├── utils/
│   │           │   ├── DataProviderUtils.java
│   │           │   ├── DynamicXpathUtils.java
│   │           │   ├── ExcelUtils.java
│   │           │   ├── PropertyUtils.java
│   │           │   └── ScreenshotUtils.java
│   │           │
│   │           ├── webdrivermanager/
│   │           │   ├── Runner.java
│   │           │   └── WebDriverManagerTest.java
│   │           │
│   │           └── Runner.java
│   │
│   └── test/
│       └── java/
│           └── Daraz/
│               ├── tests/
│               │   ├── BaseTest.java
│               │   └── DarazTest.java
│               └── com/
│                   └── trywithresources/
│                       └── AnnotationsTest.java
│
├── target/
├── test_output/
└── video/                          # For video recordings
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
