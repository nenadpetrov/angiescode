package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTest {
    @Test

    public void testScrollToTable() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
