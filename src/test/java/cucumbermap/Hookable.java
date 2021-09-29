package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable 
{
	
	
	   @Before
	   public void before(Scenario scenario) throws UnknownHostException
	   {
		 
		   HTMLReportGenerator.TestSuiteStart("C:\\Users\\12365\\Desktop\\REPORT NEW\\flipkart.html", "primusbank");
		   HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		   
		   System.out.println("--------------------------------Scenario start----------------------------------------");
	   }
	

       @After
	   public void after(Scenario scenario)
	   {
		   System.out.println("--------------------------------Scenario end----------------------------------------");
		   HTMLReportGenerator.TestCaseEnd();
		   HTMLReportGenerator.TestSuiteEnd();
		  
	   }
	
	
	
	
	
	
	

}
