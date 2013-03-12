package edu.ucsb.nceas.ezid.profile;

/**
 * EZID profile for DataCite metadata.
 * Specifies the supported metadata elements and possible values for them.
 * @see http://n2t.net/ezid/doc/apidoc.html#profile-datacite
 * @author leinfelder
 *
 */
public enum DataCiteProfile {
	CREATOR("creator"),
	TITLE("title"),
	PUBLISHER("publisher"), 
	PUBLICATION_YEAR("publicationyear"), 
	RESOURCE_TYPE("resourcetype"),
	//resourcetype values
	COLLECTION("Collection"),
	DATASET("Dataset"),
	EVENT("Event"),
	FILM("Film"),
	IMAGE("Image"),
	INTERACTIVE_RESOURCE("InteractiveResource"),
	MODEL("Model"),
	PHYSICAL_OBJECT("PhysicalObject"),
	SERVICE("Service"),
	SOFTWARE("Software"),
	SOUND("Sound"),
	TEXT("Text");
	
	private static final String profileName = "datacite";
	
    private final String value;

    private DataCiteProfile(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return profileName + "." + value;
    }
}
