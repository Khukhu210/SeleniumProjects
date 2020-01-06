package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) 
	{
	List<String> suites = new ArrayList<String>();
	suites.add("F:\\technogeeksnew\\Selenium_WorkSpace\\ReRunFailCase\\renameTest.xml");
		TestNG  runner = new TestNG();
		runner.setTestSuites(suites);
		runner.run();
		
		// to reexecute the failed test cases. at first we hv to verify the failed file is present
		File file = new File("F:\\technogeeksnew\\Selenium_WorkSpace\\ReRunFailCase\\test-output\\testng-failed.xml");
      if(file.exists())
      {
    	  List<String> failsuites = new ArrayList<String>();
     		failsuites.add("F:\\\\technogeeksnew\\\\Selenium_WorkSpace\\\\ReRunFailCase\\\\test-output\\\\testng-failed.xml");
    			TestNG  failrunner = new TestNG();
    			failrunner.setTestSuites(failsuites);
    			failrunner.run(); 
      }
	}

}
