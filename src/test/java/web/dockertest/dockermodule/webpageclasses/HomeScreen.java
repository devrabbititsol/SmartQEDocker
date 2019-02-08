package web.dockertest.dockermodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HomeScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://www.devrabbit.com/\",\"report_upload_url\":\"https://192.168.1.142:8080/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"DockerTest\",\"project_description\":\"d\",\"project_id\":219,\"module_name\":\"DockerModule\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":359,\"testcase_name\":\"TC_Docker\",\"testcase_id\":431,\"testset_id\":0,\"executed_timestamp\":-880465446,\"browser_type\":\"chrome\"}";

	public static String projectName = "dockertest";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_297355A;
	public String clkAContact_297355() {
		waitForExpectedElement(driver, Contact_297355A);		
		String text = Contact_297355A.getText();
		Contact_297355A.click();
		return text;
	}

}