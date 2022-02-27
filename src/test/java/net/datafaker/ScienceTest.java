package net.datafaker;

import org.junit.jupiter.api.Test;

import static net.datafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

public class ScienceTest extends AbstractFakerTest {

    @Test
    public void element() {
        assertThat(faker.science().element(), matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void elementSymbol() {
        assertThat(faker.science().elementSymbol(), matchesRegularExpression("[A-Za-z]{1,2}"));
    }

    @Test
    public void scientist() {
        assertThat(faker.science().scientist(), matchesRegularExpression("[A-Za-z. -]+"));
    }

    @Test
    public void tool() {
        assertThat(faker.science().tool(), matchesRegularExpression("[A-Za-z. -]+"));
    }

    @Test
    public void quark() {
        assertThat(faker.science().quark(), matchesRegularExpression("[A-Za-z]+"));
    }

    @Test
    public void leptons() {
        assertThat(faker.science().leptons(), matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void bosons() {
        assertThat(faker.science().bosons(), matchesRegularExpression("[A-Za-z ]+"));
    }
}
