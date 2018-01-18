import java.util.Scanner;

//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:            New Years Eve Countdown!
// Files:            Player.java
// Semester:         CS 302 Summer 2017
//
// Author:           Caspar Chen
// Email:            jcchen4@wisc.edu
// CS Login:         caspar
// Lecturer's Name:  Steve Earth
// Lab Section:      (none)
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:     (none)
// Partner Email:    (none)
// Partner CS Login: (none)
// Lecturer's Name:  (none)
// Lab Section:      (none)
// 
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//    _X_ Write-up states that Pair Programming is allowed for this assignment.
//    _X_ We have both read the CS302 Pair Programming policy.
//    _X_ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates 
// strangers, etc do.
//
// Persons:          (identify each person and describe their help in detail)
// Online Sources:   (identify each URL and describe its assistance in detail)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
/**
 * This class is the Player object class. It has three private fields which are 
 * String name, int currStrikes, int gamesWon. There are setter and getter 
 * methods for each field. 
 * Bugs: no Bugs 
 * 
 * @author Caspar Chen */
public class Player {
	private String name="";
	private int currStrikes=0;
	private int gamesWon=0;
	private boolean isHuman = true;
	private Date [] moves=new Date [22];
	private int numMoves;
	
	/**
	 *construct a Player with a name
	 * @param name refers to the name of the user
	 */
	public Player (String name) {
		this.name = name;
		numMoves=0;
		if(name.length()>=2){
		Scanner strScan = new Scanner(name);
		String lets = strScan.next();
		if(lets.substring(0,2).equals("AI")){
			isHuman =false;
		}
		}
	}
	/**
	 * @return a string representing name from a player
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * @return number of strikes that a player has
	 */
	public int getStrikes() {
		return this.currStrikes;
	}
	/**
	 * set name to userName
	 * @param userName represents the name from a player
	 */
	public void setName(String userName) {
		this.name =userName;
	}
	/**
	 * set currStrikes to userStrikes
	 * @param userStrikes represents the number of strikes from player
	 */
	public void setStrikes(int userStrikes) {
		this.currStrikes =userStrikes;
	}
	/**
	 * @return number of games that a player won
	 */
	public int getGamesWon() {
		return this.gamesWon;
	}
/**
 * set gamesWon to userGamesWon
 * @param userGamesWon represents the number of games that a player won
 */
	public void setGamesWon(int userGamesWon) {
		this.gamesWon =userGamesWon;
	}
	/**
	 * @return a string representation of a player's name and his/her strikes
	 */
	public String toString() {
		return name+"("+currStrikes+" strikes)";

	}
	/**
	 * This method is to take a Date as an argument and puts it into 
	 * that Player's move array as well as increments the numMoves
	 * @param myDate refers to a Date object
	 */
	public void record(Date myDate){
		moves[numMoves] = myDate;
		numMoves++;
		
	}
	/**
	 * This method is to reset strikes and number of moves to 0
	 */
	public void reset(){
		this.currStrikes = 0;
		this.numMoves=0;
	}
	/**
	 * @return the isHuman boolean
	 */
	public boolean getIsHuman() {
		
		return this.isHuman;
	}

	/**
	 * @return the moves from user
	 */
	public Date[] getMoves() {
		return this.moves;
	}

	/**
	 * @return the numMoves which are the number of moves from a user
	 */
	public int getNumMoves() {
		return this.numMoves;
	}

}
