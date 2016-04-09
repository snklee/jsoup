package org.jsoup;
import java.io.IOException;


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class HttpStatusExceptionTest {

    @Test
    public void testCommonCase() {
        String msg = "Not Found";
        int code = 404;
        String url = "www.zju.edu";
        HttpStatusException statusExcept = new HttpStatusException(msg, code, url);
        assertEquals(code, statusExcept.getStatusCode());
        assertEquals(url, statusExcept.getUrl());
        String ts = "Status=" + code + ", URL=" + url;
        assertTrue(statusExcept.toString().contains(ts));
    }
}
