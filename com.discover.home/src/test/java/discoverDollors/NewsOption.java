package discoverDollors;

import org.testng.annotations.Test;

import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.PageRepo;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;


@Test
public class NewsOption extends BaseTest {
	public void news() throws Throwable
	{
		PageRepo pr=new PageRepo(driver);
		pr.setnews();
		WebDriverCommonLib w = new WebDriverCommonLib();
		w.verifyElement(pr.getNews(), "News updates", "news page");
		
	}

}
