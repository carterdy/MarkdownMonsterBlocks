/**
 * Enumerator for monster size
 */

/**
 * @author Dylan
 *
 */
public enum Size {
	TINY ("Tiny"),
	SMALL ("Small"),
	MEDIUM ("Medium"),
	LARGE ("Large"),
	HUGE ("Huge"),
	GARGANTUAN ("Gargantuan");
	
	private String text;
	
	Size (String text) {
		this.text = text;
	}
	
	public String text() {
		return this.text;
	}
}
