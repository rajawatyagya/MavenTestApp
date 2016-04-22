package org.rajawat.mavenproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AppTest{
    App app;
    @Before
    public void setup(){
        app = new App();
        app.setAppName("My First Maven App");
    }

    @Test
    public void nameTest(){
        assertNotNull(app.getAppName());
    }


}
