package fr.afcepf.atod19.ecommerce.jungle.test;
//import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/springContext.xml"})
public class TestDao {
	
	@Test
	public void testLivreSelonISBN(){
		Assert.assertTrue(true);
	}

}
