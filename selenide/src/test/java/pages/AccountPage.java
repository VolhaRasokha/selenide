package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AccountPage {

	public CreateEmailPage clickCreateMailBtn() {
		$(By.xpath("//*[@id='b-toolbar__left']//a[(@data-name = 'compose')]")).click();		
		return new CreateEmailPage();	
	}

	public SentPage clickSendingMailMenuLink() {
		$(By.xpath("//*[contains(@class,'ico_folder_send')]")).click();
		return new SentPage();
	}
}
