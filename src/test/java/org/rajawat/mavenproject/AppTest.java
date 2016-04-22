package org.rajawat.mavenproject;

import org.junit.*;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test for simple App.
 */
public class AppTest{
    AppService appService = new AppService();
    @Before
    public void setup(){
        appService.setAppname("ooh la la");
    }
    @Test
    public void testToSeeIfThingsWork(){
        String appName = appService.getAppname();
        assertNotNull(appName);

    }
}
