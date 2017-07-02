/**
 * Class used for actions of a monster
 */

/**
 * @author Dylan
 *
 */
public class MonsterAction {
	protected String name; //Name of the action
	protected String text; //Text of the action
	
	/**
	 * @param name the name of the action
	 * @param text the text of the action
	 */
	public MonsterAction(String name, String text) {
		this.name = name;
		this.text = text;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/**
	 * Return this action as a string formatted for a monster block
	 * @return a formatted string of this action
	 */
	public String format() {
		return "> ***" + this.name + ".*** " + this.text + "\n\n";
	}
}
