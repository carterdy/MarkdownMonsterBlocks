import java.util.*;

/**
 * Class that represents a monster stat block.
 * Stats are strings for easy file writing
 */

/**
 * @author Dylan
 *
 */
public class MonsterBlock {
	private String name; //Name of monster
	private String size; //Size of monster
	private String type; //Type of monster
	private String alignment; //Alignment of monster
	
	private String ac; //AC of monster
	private String hp; //Hitpoints of monster
	private String speed; //Speed of monster
	
	private String str; //Strength of monster
	private String dex; //Dexterity of monster
	private String con; //Constitution of monster
	private String inte; //Intelligence of monster
	private String wis; //Wisdom of monster
	private String cha; //Charisma of monster
	
	private String saves; //Saving throws of monster
	private String skills; //Skills of monster
	private String damageVuln; //Damage vulnerabilities of monster
	private String damageRes; //Damage resistances of monster
	private String damageImm; //Damage immunities of monster
	private String conditionImm; //Condition immunities of monster
	private String senses; //Senses of monster
	private String languages; //Languages of monster
	private String challenge; //Challenge rating of monster
	
	private ArrayList<MonsterTrait> traits; //Traits of the monster
	
	private ArrayList<MonsterAction> actions; //Actions of the monster
	
	/*
	 * Constructor for MonsterBlock
	 */
	public MonsterBlock () {
		this.traits = new ArrayList<MonsterTrait>();
		this.actions = new ArrayList<MonsterAction>();
	}
	
	/**
	 * Set the name of the monster
	 * @param: name the name to set
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Set the size of the monster
	 * @param: size the size to set
	 */
	public void setSize(String size){
		this.size = size;
	}
	
	/**
	 * Set the type of the monster
	 * @param: type the type to set
	 */
	public void setType(String type){
		this.type = type;
	}
	
	/**
	 * Set the alignment of the monster
	 * @param: alignment the alignment to set
	 */
	public void setAlignment(String alignment){
		this.alignment = alignment;
	}

	/**
	 * @param ac the ac to set
	 */
	public void setAc(String ac) {
		this.ac = ac;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(String hp) {
		this.hp = hp;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}

	/**
	 * @param dex the dex to set
	 */
	public void setDex(String dex) {
		this.dex = dex;
	}

	/**
	 * @param con the con to set
	 */
	public void setCon(String con) {
		this.con = con;
	}

	/**
	 * @param inte the inte to set
	 */
	public void setInte(String inte) {
		this.inte = inte;
	}

	/**
	 * @param wis the wis to set
	 */
	public void setWis(String wis) {
		this.wis = wis;
	}

	/**
	 * @param cha the cha to set
	 */
	public void setCha(String cha) {
		this.cha = cha;
	}

	/**
	 * @param saves the saves to set
	 */
	public void setSaves(String saves) {
		this.saves = saves;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

	/**
	 * @param damageVuln the damageVuln to set
	 */
	public void setDamageVuln(String damageVuln) {
		this.damageVuln = damageVuln;
	}

	/**
	 * @param damageRes the damageRes to set
	 */
	public void setDamageRes(String damageRes) {
		this.damageRes = damageRes;
	}

	/**
	 * @param damageImm the damageImm to set
	 */
	public void setDamageImm(String damageImm) {
		this.damageImm = damageImm;
	}
	
	/**
	 * @param conditionImm the conditionImm to set
	 */
	public void setConditionImm(String conditionImm) {
		this.conditionImm = conditionImm;
	}

	/**
	 * @param senses the senses to set
	 */
	public void setSenses(String senses) {
		this.senses = senses;
	}

	/**
	 * @param languages the languages to set
	 */
	public void setLanguages(String languages) {
		this.languages = languages;
	}

	/**
	 * @param challenge the challenge to set
	 */
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}
	
	/**
	 * Add a trait to the monster block
	 * @param trait the trait to add
	 */
	public void addTrait(MonsterTrait trait) {
		this.traits.add(trait);
	}
	
	/**
	 * Add an action to the monster block
	 * @param action the action to add
	 */
	public void addAction(MonsterAction action) {
		this.actions.add(action);
	}
	
	/**
	 * Return the name formatted for a monster block
	 * @return the formatted name
	 */
	private String formatName() {
		return "> ## " + this.name + "\n";
	}

	/**
	 * Return the size, type, and alignment formatted for a block
	 * @return the formatted size, type, and alignment
	 */
	private String formatInfo() {
		return ">*" + this.size + " " + this.type + ", " + this.alignment + "*" + "\n";
	}
	
	/**
	 * Return the ac formatted for a block
	 * @return the formatted AC
	 */
	private String formatAc() {
		return "> - **Armor Class** " + this.ac + "\n";
	}
	
	/**
	 * Return the hp formatted for a block
	 * @return the formatted HP
	 */
	private String formatHp() {
		return "> - **Hit Points** " + this.hp + "\n";
	}
	
	/**
	 * Return the speed formatted for a block
	 * @return the formatted Speed
	 */
	private String formatSpeed() {
		return "> - **Speed** " + this.speed + "\n";
	}
	
	/**
	 * Return the attributes formatted for a block
	 * @return the formatted attributes
	 */
	private String formatAttributes() {
		return ">|STR|DEX|CON|INT|WIS|CHA|\n"
				+ ">|:---:|:---:|:---:|:---:|:---:|:---:|\n"
				+ ">|" + this.str + "|" + this.dex + "|" + this.con + "|" + this.inte + "|" + this.wis + "|" + this.cha + "|" + "\n";
	}
	
	/**
	 * Return the saves for this monster formatted for a block
	 * @return a string of the formatted saves
	 */
	private String formatSaves() {
		if (this.saves != null)
			return "> - **Saving Throws** " + this.saves + "\n";
		else
			return "";
	}
	
	/**
	 * Return the skills of this monster formatted for a block
	 * @return a string of the formatted skills
	 */
	private String formatSkills() {
		if (this.skills != null)
			return "> - **Skills** " + this.skills + "\n";
		else
			return "";
	}
	
	/**
	 * Return the damage vulnerabilities, etc. formatted for a block, if applicable
	 * @return the formatted damage statuses
	 */
	private String formatDamage() {
		String finalReturn = "";
		if (this.damageVuln != null) {
			finalReturn = finalReturn + "> - **Damage Vulnerabilities** " + this.damageVuln + "\n";
		}
		if (this.damageRes != null) {
			finalReturn = finalReturn + "> - **Damage Resistances** " + this.damageRes + "\n";
		}
		if (this.damageImm != null) {
			finalReturn = finalReturn + "> - **Damage Immunities** " + this.damageImm + "\n";
		}
		if (this.conditionImm != null) {
			finalReturn = finalReturn + "> - **Condition Immunities** " + this.conditionImm + "\n";
		}
		return finalReturn;
	}
	
	/**
	 * Return the senses formatted for a block
	 * @return the formatted senses
	 */
	private String formatSenses() {
		return "> - **Senses** " + this.senses + "\n";
	}
	
	/**
	 * Return the languages formatted for a block
	 * @return the formatted languages
	 */
	private String formatLanguages() {
		return "> - **Languages** " + this.languages + "\n";
	}
	
	/**
	 * Return the challenge formatted for a block
	 * @return the formatted challenge
	 */
	private String formatChallenge() {
		return "> - **Challenge** " + this.challenge + "\n";
	}
	
	/**
	 * Return the traits of this monster formatted for a block
	 * @return a string of the formatted traits
	 */
	private String formatTraits() {
		String finalReturn = "";
		for (MonsterTrait trait : this.traits) {
			finalReturn = finalReturn + "> ***" + trait.getName() + ".*** " + trait.getText() + "\n";
		}
		return finalReturn;
	}
	
	/**
	 * Return the actions of this monster formatted for a block
	 * @return a string of the formatted actions
	 */
	private String formatActions() {
		String finalReturn = "> ### Actions\n";
		for (MonsterAction action : this.actions) {
			finalReturn = finalReturn + action.format();
		}
		return finalReturn;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "___\n" +
				this.formatName() +
				this.formatInfo() +
				"> ___\n" +
				this.formatAc() +
				this.formatHp() +
				this.formatSpeed() +
				"> ___\n" +
				this.formatAttributes() +
				"> ___\n" +
				this.formatSaves() +
				this.formatSkills() +
				this.formatDamage() +
				this.formatSenses() +
				this.formatLanguages() +
				this.formatChallenge() +
				"> ___\n" +
				this.formatTraits() +
				this.formatActions();
	}
}
