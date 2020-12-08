package commonmethods;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extendreport {
	
	static ExtentReports extent ;
	static ExtentSparkReporter spark ;
	static ExtentTest newrep;
	public static void setup() {
		
		 extent = new ExtentReports();
		 spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		 newrep=extent.createTest("project1");
		
		
	}
	public static void pass() {
		newrep.pass("test is pass");

		extent.flush();
	}
	
	public static void fail() throws IOException {
		newrep.fail("test is fail");

		Schshot.screenshot();
		newrep.addScreenCaptureFromPath("D:\\error123.png");
		extent.flush();

	}
	

}
