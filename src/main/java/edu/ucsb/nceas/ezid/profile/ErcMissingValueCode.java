package edu.ucsb.nceas.ezid.profile;

/**
 * EZID missing value codes specified by the ERC metadata profile.
 * These should be used when values are not supplied for a known reason.
 * @see http://ezid.cdlib.org/doc/apidoc.html#metadata-requirements-mapping
 * @author leinfelder
 * 
 * ERC missing value codes
 * Code		Definition
 * (:unac)	temporarily inaccessible
 * (:unal)	unallowed; intentionally suppressed
 * (:unap)	not applicable; makes no sense
 * (:unas)	unassigned (e.g., untitled)
 * (:unav)	unavailable; possibly unknown
 * (:unkn)	known to be unknown (e.g., anonymous)
 * (:none)	never had a value, never will
 * (:null)	explicitly and meaningfully empty
 * (:tba)	to be assigned or announced later
 * (:etal)	too numerous to list (et alia)
 * (:at)	the real value is at the given URL or identifier
 *
 */
public enum ErcMissingValueCode {
	INACCESSIBLE("(:unac)"),
	UNALLOWED("(:unal)"),
	NOT_APPLICABLE("(:unap)"),
	UNASSIGNED("(:unas)"),
	UNAVAILABLE("(:unav)"),
	UNKNOWN("(:unkn)"),
	NONE("(:none)"),
	NULL("(:null)"),
	TBA("(:tba)"),
	ETAL("(:etal)"),
	AT("(:at)");
	
    private final String value;

    private ErcMissingValueCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
