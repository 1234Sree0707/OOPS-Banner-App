/**
<<<<<<< HEAD
*OOPSBannerApp UC1 - OOPS Banner Display Applicatin (Use Case 3)
*
*This class extends the functionality of Use Case 2 by improving the way the "OOPS" banner
*is constructed and displayed. It focuses on enhancing code readability and efficieny
*by utilizing the String.join() method to create each line of the banner. This approach 
*overcomes the drawbacks of using the + operator for string concatenation, which can lead
*to code inefficiency due to the creation of multiple intermediate String objects in memory
*@author Developer
*@version 3.0
*/
class OOPSBannerApp{
public static void main(String[] args){
	System.out.println(String.join(" ","   ***    ","     ***    ","   ******    ","  *****  "));
    System.out.println(String.join(" "," **   **  ","   **   **  ","   **    **  "," **      "));
    System.out.println(String.join(" ","**     ** ","  **     ** ","   **     ** "," **      "));
    System.out.println(String.join(" ","**     ** ","  **     ** ","   **    **  "," **       "));
    System.out.println(String.join(" ","**     ** ","  **     ** ","   ******    ","   ***    "));
    System.out.println(String.join(" ","**     ** ","  **     ** ","   **        ","     **   "));
    System.out.println(String.join(" ","**     ** ","  **     ** ","   **        ","      **  "));
    System.out.println(String.join(" "," **   **  ","   **   **  ","   **        ","     **   "));
    System.out.println(String.join(" ","   ***    ","     ***    ","   **        "," *****    "));
}
}

=======
*OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
*
*This use case improves upon UC3 by using a String array to store banner lines
*and iterating through them with a for-each loop, eliminating hardcoded print 
*statements and improving modularity and reusability.
*
*@author Developer
*@version 4
*/
//Extend the user story 3 to further develop the OOPS Banner Application 
//by using String arrays to hold banner lines and printing them in a loop.
//This use case improves upon UC3 by using a String array to store banner lines 
//and iterating through them with a for-each loop, eliminating hardcoded print 
//statements and improving modularity and reusability.
class OOPSBannerAppUC4{
public static void main(String[] args){
	String lines[]=new String[9];
	lines[0]=String.join(" ","   ***    ","     ***    ","   ******    ","  *****  ");
    lines[1]=String.join(" "," **   **  ","   **   **  ","   **    **  "," **      ");
    lines[2]=String.join(" ","**     ** ","  **     ** ","   **     ** "," **      ");
    lines[3]=String.join(" ","**     ** ","  **     ** ","   **    **  "," **       ");
    lines[4]=String.join(" ","**     ** ","  **     ** ","   ******    ","   ***    ");
    lines[5]=String.join(" ","**     ** ","  **     ** ","   **        ","     **   ");
    lines[6]=String.join(" ","**     ** ","  **     ** ","   **        ","      **  ");
    lines[7]=String.join(" "," **   **  ","   **   **  ","   **        ","     **   ");
    lines[8]=String.join(" ","   ***    ","     ***    ","   **        "," *****    ");
	for(String x:lines){
		System.out.println(x);
	}
	
}
}
>>>>>>> feature/UC4-PrintOOPS
