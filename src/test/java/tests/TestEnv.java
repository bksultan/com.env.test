package tests;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static settings.Environment.getSystemProperties;

public class TestEnv {

    @Test
    public void test1() throws IOException {
        Assert.assertEquals("5", getSystemProperties("env"));
    }
}
