package org.rajawat.mavenproject.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AppServiceTest {
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
