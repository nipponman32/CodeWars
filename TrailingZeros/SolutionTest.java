import java.lang.Object.org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class SolutionTest {
  @Test
  public void testZeros() throws Exception {
    assertThat(Solution.zeros(0), 0); 
    assertThat(Solution.zeros(6), 1); 
    assertThat(Solution.zeros(14), 2);    
  }
}
