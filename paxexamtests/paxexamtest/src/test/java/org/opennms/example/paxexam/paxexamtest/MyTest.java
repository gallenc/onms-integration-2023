package org.opennms.example.paxexam.paxexamtest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.ops4j.pax.exam.CoreOptions.junitBundles;
import static org.ops4j.pax.exam.CoreOptions.mavenBundle;
import static org.ops4j.pax.exam.CoreOptions.options;
import static org.ops4j.pax.exam.CoreOptions.systemProperty;
import static org.ops4j.pax.exam.CoreOptions.bootClasspathLibrary;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerClass;
import org.ops4j.pax.exam.util.PathUtils;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(PaxExam.class)
@ExamReactorStrategy(PerClass.class)
public class MyTest {
	 private static Logger LOG = LoggerFactory.getLogger(MyTest.class);
	

    @Inject
    private BundleContext bc;

    @Configuration
    public Option[] config() {
        return options(
            systemProperty("logback.configurationFile").value(
                "file:src/test/resources/logback.xml"),

            mavenBundle("org.slf4j", "slf4j-api", "1.7.4"),
            mavenBundle("ch.qos.logback", "logback-core", "1.0.4"),
            mavenBundle("ch.qos.logback", "logback-classic", "1.0.4"),
            junitBundles(),
            
            // to run forked needs to be on classpath
            // not needed if native as already on classpath
           bootClasspathLibrary("mvn:org.slf4j/slf4j-api/1.7.4"),
           bootClasspathLibrary("mvn:ch.qos.logback/logback-core/1.0.4"),
           bootClasspathLibrary("mvn:ch.qos.logback/logback-classic/1.0.4")
        		
        		
        		);
    }

    @Test
    public void shouldHaveBundleContext() {
    	LOG.error("**** make sure we can log error");
    	LOG.info("**** make sure we can log info ");
    	LOG.debug("**** make sure we can log debug");
        assertThat(bc, is(notNullValue()));
    }

}
