package com.kevinearls.Simple;


import org.junit.jupiter.api.Test;

import java.net.InetAddress;

/**
 * Created by kearls on 29/03/2017.
 */
public class InetTest {
    @Test
    public void getHostnameTest() throws Exception {
        String hostName = InetAddress.getLocalHost().getHostName();
        System.out.println("HOSTNAME [" + hostName + "]");
    }
}
