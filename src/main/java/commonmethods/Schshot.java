package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testbase.Browser;

public class Schshot extends Browser{
	
	public static void screenshot() throws IOException {
	
	File scrsht= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(scrsht, new File("D:\\error123.png"));

}
}