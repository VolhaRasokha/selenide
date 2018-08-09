package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

import org.openqa.selenium.By;

public class SentPage {
	public void checkMailInSentFolder(){
		$$(By.xpath("//a[contains(@href,'https://e.mail.ru/thread/')]")).get(0).shouldHave(text(CreateEmailPage.mailSubject));	
	}

}
