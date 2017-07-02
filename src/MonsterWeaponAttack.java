/**
 * Class used for weapon attacks of a monster
 */

/**
 * @author Dylan
 *
 */
public class MonsterWeaponAttack extends MonsterAction {
	private String attackType; //Type of attack
	private String attackText; //Text describing attack
	private String hitText; //Text for attack hit
	/**
	 * @param name the name of the attack
	 * @param text any ability text for the attack (likely empty string)
	 * @param attackType the type of the attack
	 * @param attackText the text of the attack
	 * @param hitText the text for when the attack hits
	 */
	public MonsterWeaponAttack(String name, String text, String attackType, String attackText, String hitText) {
		super(name, text);
		this.attackType = attackType;
		this.attackText = attackText;
		this.hitText = hitText;
	}
	/**
	 * @return the attackType
	 */
	public String getAttackType() {
		return attackType;
	}
	/**
	 * @param attackType the attackType to set
	 */
	public void setAttackType(String attackType) {
		this.attackType = attackType;
	}
	/**
	 * @return the attackText
	 */
	public String getAttackText() {
		return attackText;
	}
	/**
	 * @param attackText the attackText to set
	 */
	public void setAttackText(String attackText) {
		this.attackText = attackText;
	}
	/**
	 * @return the hitText
	 */
	public String getHitText() {
		return hitText;
	}
	/**
	 * @param hitText the hitText to set
	 */
	public void setHitText(String hitText) {
		this.hitText = hitText;
	}
	
	/* (non-Javadoc)
	 * @see MonsterAction#format()
	 */
	@Override
	public String format() {
		return "> ***" + this.name + ".*** " + this.text + "*" + this.attackType + ":* " + this.attackText + "\n" +
				"> *Hit:* " + this.hitText + "\n\n";
	}
	

}
