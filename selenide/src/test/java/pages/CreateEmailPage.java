package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CreateEmailPage {
	private static long currentKey = System.currentTimeMillis();
	
	public static String mailSubject = "TestSubject" + currentKey;

	public CreateEmailPage fillMailAddress() {
		String mailAddress = "vra_atmmodule6@mail.ru";
		$(By.cssSelector("textarea[data-original-name = 'To']")).setValue(mailAddress);		
		return new CreateEmailPage();		
	}

	public CreateEmailPage fillMailSubject() {
		$(By.name("Subject")).setValue(mailSubject);
		return new CreateEmailPage();
	}

	public CreateEmailPage fillMailBody() {
		String body = "TestTextBody" + currentKey;
		switchTo().frame($(By.xpath("//iframe[starts-with(@id,'toolkit')]")));
		$(By.id("tinymce")).clear();
		$(By.id("tinymce")).setValue(body);
		switchTo().defaultContent();
		return new CreateEmailPage();	
	}

	public AccountPage clickSendMailBtn() {
		$(By.xpath("//*[@id='b-toolbar__right']//*[@data-name='send']")).click();
		return new AccountPage();
	}

}
