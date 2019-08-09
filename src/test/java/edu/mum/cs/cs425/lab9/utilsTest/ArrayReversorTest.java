package edu.mum.cs.cs425.lab9.utilsTest;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ArrayReversorTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(edu.mum.cs.cs425.lab9.arrayutils.ArrayReversor.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Before
    public void setUp() throws Exception {
        logger.info("ArrayReversor Mockito has started mocking remote Service");
    }

    @After
    public void tearDown() throws Exception {
        logger.info("ArrayReversor Mockito has completed mocking remote Service");
    }

    @Test
    public void flattenArray() {

    }
}
