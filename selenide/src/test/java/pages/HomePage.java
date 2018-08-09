package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import bo.User;

public class HomePage {
	
	public AccountPage login(User user) {
		$(By.id("mailbox:login")).setValue(user.getLogin());
		$(By.id("mailbox:password")).setValue(user.getPassword());	
		$(By.id("mailbox:submit")).click();
		
		return new AccountPage();
	}
	
}
