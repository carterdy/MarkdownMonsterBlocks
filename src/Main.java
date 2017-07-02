import java.util.*;
/**
 * A program used to easily create D&D 5e monster stat blocks with formatting to copy into D&D home brewery.
 */

/**
 * @author Dylan
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MonsterBlock block = new MonsterBlock();
		//Going to step through, collecting the info on the monster by command line
		System.out.println("Monster name:");
		block.setName(input.nextLine());
		System.out.println("Size:");
		block.setSize(input.nextLine());
		System.out.println("Type:");
		block.setType(input.nextLine());
		System.out.println("Alignment:");
		block.setAlignment(input.nextLine());
		System.out.println("AC:");
		block.setAc(input.nextLine());
		System.out.println("HP:");
		block.setHp(input.nextLine());
		System.out.println("Speed:");
		block.setSpeed(input.nextLine());
		System.out.println("STR:");
		block.setStr(input.nextLine());
		System.out.println("DEX:");
		block.setDex(input.nextLine());
		System.out.println("CON:");
		block.setCon(input.nextLine());
		System.out.println("INT:");
		block.setInte(input.nextLine());
		System.out.println("WIS:");
		block.setWis(input.nextLine());
		System.out.println("CHA:");
		block.setCha(input.nextLine());
		System.out.println("Saves:");
		block.setSaves(input.nextLine());
		System.out.println("Skills:");
		block.setSkills(input.nextLine());
		System.out.println("Damage Vulnerabilities:");
		block.setDamageVuln(input.nextLine());
		System.out.println("Damage Resistances:");
		block.setDamageRes(input.nextLine());
		System.out.println("Damage Immunities:");
		block.setDamageImm(input.nextLine());
		System.out.println("Condition Immunities:");
		block.setConditionImm(input.nextLine());
		System.out.println("Senses:");
		block.setSenses(input.nextLine());
		System.out.println("Languages:");
		block.setLanguages(input.nextLine());
		System.out.println("Challenge:");
		block.setChallenge(input.nextLine());
		
		//Gather traits
		System.out.println("Traits. Enter \'exit\' to finish traits");
		System.out.println("Trait Name:");
		String name = input.nextLine();
		while (name.compareTo("exit") != 0){
			System.out.println("Text:");
			String text = input.nextLine();
			MonsterTrait trait = new MonsterTrait(name, text);
			block.addTrait(trait);
			System.out.println("Trait Name:");
			name = input.nextLine();
		}
		//Gather actions
		System.out.println("Actions.");
		System.out.println("Attack or other? \'exit\' to finish.");
		String type = input.nextLine();
		while (type.compareTo("exit") != 0){
			//other ability
			if (type.compareToIgnoreCase("other") == 0) {
				System.out.println("Action Name:");
				name = input.nextLine();
				System.out.println("Action text:");
				String text = input.nextLine();
				MonsterAction action = new MonsterAction(name, text);
				block.addAction(action);
			} else if (type.compareToIgnoreCase("attack") == 0) {
				System.out.println("Attack Name:");
				name = input.nextLine();
				System.out.println("Attack Type:");
				String attackType = input.nextLine();
				System.out.println("Attack Text:");
				String attackText = input.nextLine();
				System.out.println("Attack Hit:");
				String attackHit = input.nextLine();
				MonsterWeaponAttack attack = new MonsterWeaponAttack(name, "", attackType, attackText, attackHit);
				block.addAction(attack);
			} else {
				System.out.println("Try again");
			}
			System.out.println("Attack or other? \'exit\' to finish.");
			type = input.nextLine();
		}
		input.close();
		System.out.print("Result:\n\n");
		System.out.println(block.toString());
	}

}
