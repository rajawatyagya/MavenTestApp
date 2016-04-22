package org.rajawat.mavenproject.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AppServiceTest {
    AppService appService;
    @Before
    public void setup(){
        appService = new AppService();
        appService.setAppName("ooh la la");
    }
    @Test
    public void testToSeeIfThingsWork(){
        String appName = appService.getAppName();
        assertNotNull(appName);

    }
}
