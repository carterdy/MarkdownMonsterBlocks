/**
 * Class for monster traits
 */

/**
 * @author Dylan
 *
 */
public class MonsterTrait {
	private String name; //Name of the trait
	private String text; //Text of the trait
	
	/**
	 * @param name the name of the trait
	 * @param text the text of the trait
	 */
	public MonsterTrait(String name, String text) {
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
	
	
}
