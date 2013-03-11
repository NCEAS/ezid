package edu.ucsb.nceas.ezid.profile;

/**
 * EZID profile for ERC metadata
 * @see http://n2t.net/ezid/doc/apidoc.html#profile-erc
 * @author leinfelder
 * 
 */
public enum ErcProfile {
	WHO("who"),
	WHAT("what"),
	WHEN("when");
	
	private static final String profileName = "erc";
	
    private final String value;

    private ErcProfile(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return profileName + "." + value;
    }

}
