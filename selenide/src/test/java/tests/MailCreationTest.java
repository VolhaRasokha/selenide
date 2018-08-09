package tests;

import org.testng.annotations.Test;

import pages.AccountPage;
import pages.CreateEmailPage;
import pages.HomePage;
import pages.SentPage;
import bo.User;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;

public class MailCreationTest {
	@Test
	public void mailRuLoginTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    Configuration.browser = "chrome";
	    Configuration.timeout = 6000;
		
	    open("https://mail.ru/");
		User user = new User();
		
		HomePage homePage = new HomePage();
		AccountPage accountPage = homePage.login(user);
		
		CreateEmailPage createEmailPage = accountPage.clickCreateMailBtn();
		createEmailPage.fillMailAddress();
		createEmailPage.fillMailSubject();
		createEmailPage.fillMailBody();
		createEmailPage.clickSendMailBtn();
		SentPage sentPage = accountPage.clickSendingMailMenuLink();
		
		refresh();
		
		sentPage.checkMailInSentFolder();
	}

}
