package Game;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

  public class LifeGanmeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreate() {
		LifeGame me = new LifeGame();
        String[][] expected = {{"○","○","○","●","○","○","○","○"},{"●","○","○","○","○","○","●","●"},
          		 {"○","○","●","○","●","●","○","○"},{"○","○","●","○","○","●","●","○"},
          		 {"○","●","●","○","○","○","○","●"},{"○","○","○","○","●","●","○","○"},
          		 {"●","●","○","●","○","●","○","○"},{"●","●","○","●","○","●","●","○"}};
        int[] test1= {
       		0,0,0,1,0,0,0,0,
       		1,0,0,0,0,0,1,1,
       		0,0,1,0,1,1,0,0,
       		0,0,1,0,1,1,0,0,
       		0,1,1,0,0,0,0,1,
       		0,0,0,0,1,1,0,0,
       		1,1,0,1,0,1,0,0,
        	1,1,0,1,0,1,1,0,};
       String[][] point1 =me.create(expected,test1);

                Assert.assertArrayEquals(expected, point1);
	}

       @Test
        public void testCheck() {
           LifeGame me = new LifeGame();
            String[][] test2 = {{"○","○","○","●","○","○","○","○"},{"●","○","○","○","○","○","●","●"},
           		 {"○","○","●","○","●","●","○","○"},{"○","○","●","○","○","●","●","○"},
           		 {"○","●","●","○","○","○","○","●"},{"○","○","○","○","●","●","○","○"},
           		 {"●","●","○","●","○","●","○","○"},{"●","●","○","●","○","●","●","○"}};
            int[] point2 =me.check(test2);
            int[] expected = {0,0,0,0,0,0,0,0,
        		0,0,0,3,3,3,2,1,
        		0,3,1,3,2,1,0,3,
        		0,0,2,0,3,2,2,0,
        		0,2,2,3,3,0,0,1,
        		3,0,0,3,2,2,3,0,
        		2,2,0,2,0,1,0,0,
        		2,2,0,1,0,2,2,0};

                 Assert.assertArrayEquals(expected, point2);
     }
 
    @Test
    public void testChange() {
    	LifeGame me = new LifeGame();
        String[][] test3 = {{"○","○","○","●","○","○","○","○"},{"●","○","○","○","○","○","●","●"},
       		 {"○","○","●","○","●","●","○","○"},{"○","○","●","○","○","●","●","○"},
       		 {"○","●","●","○","○","○","○","●"},{"○","○","○","○","●","●","○","○"},
       		 {"●","●","○","●","○","●","○","○"},{"●","●","○","●","○","●","●","○"}};
        int[] point3 = {0,0,0,0,0,0,0,0,
        		0,0,0,3,3,3,2,1,
        		0,3,1,3,2,1,0,3,
        		0,0,2,0,3,2,2,0,
        		0,2,2,3,3,0,0,1,
        		3,0,0,3,2,2,3,0,
        		2,2,0,2,0,1,0,0,
        		2,2,0,1,0,2,2,0};
        
         String[][] expected ={{"○","○","○","●","○","○","○","○"},{"●","○","○","●","●","●","●","○"},
        		 {"○","●","○","●","●","○","○","●"},{"○","○","●","○","●","●","●","○"},
        		 {"○","●","●","●","●","○","○","○"},{"●","○","○","●","●","●","●","○"},
        		 {"●","●","○","●","○","○","○","○"},{"●","●","○","○","○","●","●","○"}};
         String[][] point4=me.change(test3, point3);
         Assert.assertArrayEquals(expected, point4);
     }
  }
