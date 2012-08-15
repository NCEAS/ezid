package edu.ucsb.nceas.ezid.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import edu.ucsb.nceas.ezid.EZIDClient;

public class EZIDClientTest {

    private static String USERNAME = "apitest";
    private static String PASSWORD = "yourpasswordhere";
    private static final String DOISHOULDER = "doi:10.5072/FK2";

    protected static Log log = LogFactory.getLog(EZIDClientTest.class);

    @Test
    public void testCreate() {
        log.info("Starting test...");
        EZIDClient client = new EZIDClient();
        assertNotNull(client);
        boolean success = client.login(USERNAME, PASSWORD);
        assertTrue(success);
        for (int i = 0; i < 100; i ++) {
            String timestamp = EZIDServiceTest.generateTimeString();
            String identifier = DOISHOULDER + "/" + "TEST" + "/" + timestamp;
            log.info("Identifier under test: " + identifier);
            try {
                client.create(identifier, null);
            } catch (InterruptedException e) {
                fail("Create operation interrupted. " + e.getMessage());
            }
        }
        client.shutdown();
        assertTrue(true);
        log.info("Done test!");
    }
}
