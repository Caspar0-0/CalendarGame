//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:            New Years Eve Countdown!
// Files:            Date.java
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
 * This class is the Date object class. It has two private fields which are 
 * String name, which stores the month, and int numm which holds the date in 
 * that month.
 * Bugs: no Bugs 
 * 
 * @author Caspar Chen */
public class Date {

	private String name; //stores the month
	private int num;//store the date in that month

	/**
	 * construct a Date including month and date in that month
	 * @param name represents month in String 
	 * @param num represents date in String 
	 */
	public Date(String name, int num) {
		this.name = name;
		this.num = num;
	}
    /**
     *  get the month from Date 
     * @return String variable represents month
     */
	public String getName() {
		return this.name;
	}
	 /**
     *  get the date in month from Date 
     * @return Integer variable represents specific date
     */
	public int getNum() {
		return this.num;
	}
	/**
	 * set name to userName
	 * @param userName represents month from user 
	 */
	public void setName(String userName) {
		this.name =userName;
	}
	/**
	 * set num to userNum
	 * @param userNum represents date of the month from user
	 */
	public void setNum(int userNum) {
		this.num =userNum;
	}
	/**
	 * This method converts month to number ex:Jan to 1
	 * @return an integer value representing month
	 */
	public int getMonth() {
		if (this.name.equalsIgnoreCase("Jan")) {
			return 1;
		}
		if (this.name.equalsIgnoreCase("Feb")) {
			return 2;
		}
		if (this.name.equalsIgnoreCase("Mar")) {
			return 3;
		}
		if (this.name.equalsIgnoreCase("Apr")) {
			return 4;
		}
		if (this.name.equalsIgnoreCase("May")) {
			return 5;
		}
		if (this.name.equalsIgnoreCase("Jun")) {
			return 6;
		}
		if (this.name.equalsIgnoreCase("Jul")) {
			return 7;
		}
		if (this.name.equalsIgnoreCase("Aug")) {
			return 8;
		}
		if (this.name.equalsIgnoreCase("Sep")) {
			return 9;
		}
		if (this.name.equalsIgnoreCase("Oct")) {
			return 10;
		}
		if (this.name.equalsIgnoreCase("Nov")) {
			return 11;
		}
		if (this.name.equalsIgnoreCase("Dec")) {
			return 12;
		}

		return 0;

	}
	/**
	 * @return a string representation for month and date
	 */
	public String toString() {
		return "" + this.name +" "+this.num ;

	}
	
	
	
/**
 * This equalDate method, which has boolean type, tells when two dates are equal
 * @param index refers to a date in a year
 * @return true when the two dates are equal and false otherwise
 */
	public boolean equalDate(Date index) {
		
		if(index.getName().equals(name)&&index.getNum()==num){

		return true;
		}
		return false;
	}
	
/**
 * This after()takes userDate as a parameter and returns true if the 
 * calling Date is after the userDate.
 * @param userDate refers to the Date input.
 * @return returns true if the calling Date is after the userDate, else return
 * false.
 */
	public boolean after(Date userDate) {
		if (userDate.getMonth() == this.getMonth()) {
			if (this.num > userDate.getNum()) {
				return true;
			}
		} else if (userDate.getMonth() < this.getMonth()) {
			return true;
		}
		return false;

	}
	/**
	 * This method is to take a Date as an argument and return an int 
	 * representing how many days in the year there are prior to that Date. 
	 * @param myDate refers to a Date object class
	 * @return an int representing how many days in the year there are 
	 * prior to that Date.
	 */
	public static int dayNum(Date myDate){
		 int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		 int totalDays = 0;
		 for (int i = 0; i < myDate.getMonth()-1; i++){
			 totalDays += monthArray[i];
		 }
		 totalDays += myDate.getNum();
		
		return 	totalDays-1;
	}
	/**
	 * This method takes a Date and returns an int which gives out
	 * the number of legal moves there are after that Date. 
	 * @param myDate refers to a Date object class
	 * @return the number of legal moves there are after that Date. 
	 */
	public static int numLegal(Date myDate){
		 int legalDays = 0;
		 int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		 legalDays = monthArray[myDate.getMonth()-1] - myDate.getNum();
		 
		 for(int i = myDate.getMonth()+1; i<=12; i++){
			 if(myDate.getNum()<=monthArray[i-1]){
				 legalDays++;
			 }
		 }	
		 return 	legalDays;
	}
	/**
	 * This method returns an array of Dates which are all the Dates 
	 * which would be legal moves subsequent to the instance calling it.
	 * @return the legal moves subsequent to the instance from user.
	 */
	public Date[] legalMoves(){
		Date[] legalDate = new Date[numLegal(this)];
		 int legalDays = 0;
		 int j =0;
		 String month = null;
		 int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		 for(int i=num+1; i<= monthArray[this.getMonth()-1];i++){
			 legalDate[j]= new Date(name,i);
			 j++;
		 }
		 for(int i=this.getMonth()+1; i<= 12;i++){
			 if(this.getNum()<=monthArray[i-1]){
				
				 if (i == 1) {
						month ="Jan";
						}
				 if (i == 2) {
						month ="Feb";
						}
				 if (i == 3) {
						month ="Mar";
						}
				 if (i == 4) {
						month ="Apr";
						}
				 if (i == 5) {
						month ="May";
						}
				 if (i == 6) {
						month ="Jun";
						}
				 if (i == 7) {
						month ="Jul";
						}
				 if (i == 8) {
						month ="Aug";
						}
				 if (i == 9) {
						month ="Sep";
						}
				 if (i == 10) {
						month ="Oct";
						}
				 if (i == 11) {
						month ="Nov";
						}
				 if (i == 12) {
						month ="Dec";
						}

			 legalDate[j]= new Date(month,num);
			 j++;
		 }
		 }
		return  legalDate;
		
		
	}
	
	
	/**
	 * This method checks whether the input date will cause strikes.
	 * @param prevPlayerDate refers to last valid date from prevPlayer
	 * @param turn refers to the number of turn of the date
	 * @param PrevPlayer refers to the string name of the PrevPlayer
	 * @return true if it counts a strike, else false.
	 */
	public boolean isStrike(Date prevPlayerDate, int turn, Player PrevPlayer){
		Date first = new Date("Jan",1);
		//check if in the first term, first player enter Jan 1.
		if(turn==1){
			if(!equalDate(first)) {
			System.out.println("First player must start with Jan 1");
			
			return true; }
		}
		if(turn!=1){
			//if in the same month, player should choose later date
			if(this.name.equals(prevPlayerDate.getName())){
				if(!this.after(prevPlayerDate)){
					System.out.println("You must choose a date later than "
								+ prevPlayerDate);
					return true;	}
			}
			else{ 
				//if in the different month, should be a later month
				if(!this.after(prevPlayerDate)){
					System.out.println("You must choose a date later than "
				+ prevPlayerDate);
					return true; }
				//if in the different month, should be same date in month
				if(num!=prevPlayerDate.getNum()){
				System.out.println("If choosing a month other than "
						+prevPlayerDate.getName()+", then it must have a date"
								+ " of "
						+prevPlayerDate.getNum()+", the same date as "
						+PrevPlayer.getName()+" chose last turn");
						return true; }
		
			}
		}
		
		
		return false;
	}
	

}
