package edu.ucsb.nceas.ezid.profile;

/**
 * Values for EZID DataCite profile resourcetype
 * @see http://n2t.net/ezid/doc/apidoc.html#profile-datacite
 * @author leinfelder
 *
 */
public enum DataCiteProfileResourceTypeValues {
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
		
    private final String value;

    private DataCiteProfileResourceTypeValues(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
