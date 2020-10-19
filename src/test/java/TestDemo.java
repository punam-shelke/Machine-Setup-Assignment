import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestDemo {
    @Test
    void sampleTest() {
        assertThat(1,is(equalTo(1)));

    }
}
