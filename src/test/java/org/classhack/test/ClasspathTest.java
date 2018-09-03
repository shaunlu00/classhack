package org.classhack.test;

import org.classhack.util.ClasspathUtil;
import org.junit.Test;

import java.net.URL;
import java.util.List;

public class ClasspathTest {

    @Test
    public void testGetURLs() {
        printURLs(ClasspathUtil.getResourceURLs("org/classhack/util/ClasspathUtil.class", null));
        printURLs(ClasspathUtil.getPackageURLs("org.classhack.util", null));
        printURL(ClasspathUtil.getClassURL(ClasspathUtil.class, null));
    }


    private void printURLs(List<URL> urls) {
        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }
    }

    private void printURL(URL url) {
        System.out.println(url.toExternalForm());
    }
}
