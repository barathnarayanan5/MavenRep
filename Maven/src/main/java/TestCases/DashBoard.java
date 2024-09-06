package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMFiles.DashboardPOM;
import commonFunction.CommonFunction;

public class DashBoard extends CommonFunction{
	@Test
	public void getLeaveDetails() {
		PageFactory.initElements(driver, DashboardPOM.class);
		String anyLeave = DashboardPOM.checkLeave.getText();
		System.out.println(anyLeave);
		if(anyLeave.equals("No Pending Actions to Perform") && DashboardPOM.leaveDetails.equals(null))
		{
			System.out.println("NO One is leave");
		}else {
			String actualText=DashboardPOM.leaveDetails.getText();
			if (!actualText.equals(null)){
				System.out.println("Today leave :"+ actualText);
				
			}
		}
	}

}
