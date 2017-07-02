/**
 * Enumerator for monster types.
 * Text value intentionally lower case for monster block formatting
 */

/**
 * @author Dylan
 *
 */
public enum Type {
	ABER ("aberration"),
	BEAST ("beast"),
	CELE ("celestial"),
	CONST ("construct"),
	DRAG ("dragon"),
	ELEM ("elemental"),
	FEY ("fey"),
	FIEND ("fiend"),
	GIANT ("giant"),
	HUMAN ("humanoid"),
	MONST ("monstrosity"),
	OOZE ("ooze"),
	PLANT ("plant"),
	UNDEAD ("undead");
	
	private String text;
	
	Type(String text) {
		this.text = text;
	}
	
	public String text (){
		return this.text;
	}
}
