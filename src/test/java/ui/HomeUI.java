package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {

    public static final Target TEXT_SIGN_IN = Target.the("Texto de Sign In")
            .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
}
