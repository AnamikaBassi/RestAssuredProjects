package AssurityAPITests;

import org.junit.Test;
import org.junit.Assert;

public class TestAcceptanceCriteriaAssurity extends AssurityService {

	@Test
	public void testAcceptanceCriteriaOne(){

		Assert.assertEquals(getAPIResponse().path("Name"),NAME );

	}

	@Test
	public void testAcceptanceCriteriaTwo(){

		Assert.assertEquals(getAPIResponse().path("CanRelist"),true );

	}

	@Test
	public void testAcceptanceCriteriaThree(){

		Assert.assertTrue(getAPIResponse().path("Promotions.findAll { it.Name == \"Gallery\" }.Description").toString().contains(GALL_STRING));

	}

}
