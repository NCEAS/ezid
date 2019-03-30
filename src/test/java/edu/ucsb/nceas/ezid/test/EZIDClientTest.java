package edu.ucsb.nceas.ezid.test;

import java.util.HashMap;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import edu.ucsb.nceas.ezid.EZIDClient;

public class EZIDClientTest {

    private static String USERNAME = "apitest";
    private static String PASSWORD = "apitest";
    private static final String DOISHOULDER = "doi:10.5072/FK2";

    protected static Log log = LogFactory.getLog(EZIDClientTest.class);

    @Test
    public void testCreate() {
		int numTests = 100;
        log.info("Testing asynchronous id creation with " + numTests + " tests. Please be patient...");
        EZIDClient client = new EZIDClient();
        assertNotNull(client);
        boolean success = client.login(USERNAME, PASSWORD);
        assertTrue(success);
        for (int i = 0; i < numTests; i ++) {
            String timestamp = EZIDServiceTest.generateTimeString();
            String identifier = DOISHOULDER + "/" + "TEST" + "/" + timestamp;
            HashMap<String, String> metadata = EZIDServiceTest.generateMetadata(identifier);
            log.debug("Identifier under test: " + identifier);
            try {
                client.create(identifier, metadata);
            } catch (InterruptedException e) {
                fail("Create operation interrupted. " + e.getMessage());
            }
        }
        client.shutdown();
        assertTrue(true);
        log.debug("Done test!");
    }
}
