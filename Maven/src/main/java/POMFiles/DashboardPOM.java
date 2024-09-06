package POMFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPOM {
	
	@FindBy(xpath = "//img[@src='/web/images/dashboard_empty_widget_watermark.png']//following::p[1]")
	public static WebElement checkLeave;
	
	@FindBy(xpath = "//div[@class='orangehrm-leave-card-details']//child::p[1]")
	public static WebElement leaveDetails;
}
