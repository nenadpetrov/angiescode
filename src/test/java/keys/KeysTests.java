package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTest {

    @Test
    public void testBackspace () {
        var keypage = homePage.clickKeyPresses();
        keypage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keypage.getResult(),"You entered: BACK_SPACE"); //  BACK_SPACE! - du kannst mit !  exlamation mark zeichnen der Test ausführen damit Screenshot gemacht ist.
    }

    @Test
    public void testPi() {

        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }
}
