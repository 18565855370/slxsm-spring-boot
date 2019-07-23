package com.slxsm.test.env;

import com.sun.corba.se.impl.corba.EnvironmentImpl;
import com.sun.org.apache.xalan.internal.xslt.EnvironmentCheck;
import coms.slxsm.test.TestApp;
import org.apache.logging.log4j.util.EnvironmentPropertySource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.expression.EnvironmentAccessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApp.class, properties = "app.name=1.0.0")
public class EnvTest {

    /*@Autowired
    private Environment env;*/

    @Autowired
    private ConfigurableEnvironment env;

    /*@Before
    public void init(){
        EnvironmentAccessor accessor = new EnvironmentAccessor();
        accessor.canRead(env,"admin","userName");
    }*/

    @Test
    public void testEnv(){
        Assert.assertEquals("1.0.0",env.getProperty("app.name"));
      //  Assert.assertNotNull();
    }
}
