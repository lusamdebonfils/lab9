package edu.mum.cs.cs425.lab9.utilsTest;

import edu.mum.cs.cs425.lab9.arrayutils.ArrayFlattener;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArrayFlatterNullTest {
    ArrayFlattener arrayFlat;

    @Before
    public void setUp(){
        arrayFlat = new ArrayFlattener();
    }

    @Test
    public void testArrayFlattener(){
        int[][] a_in = new int[][]{
                {1,3},{0},{4,5,9}
        };
        int[] actual = arrayFlat.flattenArray(a_in);
        int[] expected = new int[]{1,3,0,4,5,9};
        Assert.assertArrayEquals(expected,actual);
    }

    @After
    public void tearDown(){
        arrayFlat = null;
    }
}
