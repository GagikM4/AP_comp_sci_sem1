package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	String role;
	int strength = 0;
	int dexterity = 0;
	int intelligence = 0;
	int constitution = 0;
	int charisma = 0;
	
	public myCharacter() {
		role = "no role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	public myCharacter(String a){
		role = a;
	}
	public myCharacter(int a, int b, int c, int d, int e){
		strength = a;
		dexterity = b;
		intelligence = c;
		constitution = d;
		charisma = e;
	}
	public myCharacter(String a, int b, int c, int d, int e, int f){
		role = a;
		strength = b;
		dexterity = c;
		intelligence = d;
		constitution = e;
		charisma = f;
	}
	public void choice1(){
		if(role.equals("wizard") || role.equals("Wizard") || role.equals("rouge") || role.equals("Rouge") || role.equals("Warrior") || role.equals("warrior")){
		System.out.println("You have chosen " + role + "!" + " Great choice!");
		}
		else{
		role = "no role";
		}
	}
	public void myToString(){
		System.out.println("Your character's strenght is " + strength);
		System.out.println("Your character's strenght is " + dexterity);
		System.out.println("Your character's strenght is " + intelligence);
		System.out.println("Your character's strenght is " + constitution);
		System.out.println("Your character's strenght is " + charisma);
	}
	public String setRole(String a){
		if(role.equals("wizard") || role.equals("Wizard") || role.equals("rouge") || role.equals("Rouge") || role.equals("Warrior") || role.equals("warrior")){
		System.out.println("You have chosen " + role + "!" + " Great choice!");
		}
		else{
		role = "no role";
		}
		return role;
	}
	public int setStrength(int a){
		strength = a;
		return strength;
	}
	public int setDexterity(int a){
		dexterity = a;
		return dexterity;
	}
	public int setIntelligence(int a){
		intelligence = a;
		return intelligence;
	}
	public int setConstitution(int a){
		constitution = a;
		return constitution;
	}
	public int setCharisma(int a){
		charisma = a;
		return charisma;
	}
	public boolean setAll(String a, int b, int c, int d, int e, int f){
			return true;
	}
}
