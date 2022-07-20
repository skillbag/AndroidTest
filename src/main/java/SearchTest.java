
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;

public class SearchTest extends CoreTestCase {
 @Test
 public void testFind() {
  this.driver =driver;
  driver.findElement(By.id("org.wikipedia:id/fragment_feed_header")).click();
  driver.findElement(By.id("org.wikipedia:id/search_src_text")).sendKeys("wfewfewfwegweg", ENTER);


}}
//org.wikipedia:id/fragment_feed_header
//org.wikipedia:id/search_src_text