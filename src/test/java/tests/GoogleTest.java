package tests;

import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	
	@Test
	public void openGoogle() {
//		driver = setup();
		driver.get("https://www.google.com");
        assert driver.getTitle().contains("Google");
    }

}
