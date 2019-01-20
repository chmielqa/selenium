package Test;

import Test.Base.ChmielQaBaseTest;
import org.testng.annotations.Test;

public class FluentStyleTest extends ChmielQaBaseTest {

    @Test
    public void shouldLengthOfGeneratedStringBeCorrect() {
        int length = 20;
        homePage
                .goToStringGenerator()
                .fillFieldLength(String.valueOf(length))
                .fillPossibleChars("abcd")
                .submit()
                .assertThatGeneratedStringLengthIsEqualTo(length);
    }

    @Test
    public void shouldHomePageHaveCorrectText() {
        homePage
                .assertThatHeaderIsEqualTo("Strona główna");
    }
}
