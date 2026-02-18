/**
<<<<<<< HEAD
*OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
*
*This use case extends UC4 by defining and populating the String array in a more
*concise way at the time of declaration using String.join() method to create each 
*line of the banner. This further enhances code readability and maintainability.
*
*@author Developer
*@version 5.0
*/

//Extend the user story 4 to further develop the OOPS Banner Application by 
//not only using String arrays to hold banner lines and printing them in a 
//loop. But also by defininf and populating the array in a more concise way 
//at the time of declaration using String.join() method to create each line
//of the banner
class OOPSBannerApp{
	public static void main(String[] args){
		String lines[]={String.join(" ","   ***    ","     ***    ","   ******    ","  *****  "),String.join(" "," **   **  ","   **   **  ","   **    **  "," **      "),String.join(" ","**     ** ","  **     ** ","   **     ** "," **      "),String.join(" ","**     ** ","  **     ** ","   **    **  "," **       "),String.join(" ","**     ** ","  **     ** ","   ******    ","   ***    "),String.join(" ","**     ** ","  **     ** ","   **        ","     **   "),String.join(" ","**     ** ","  **     ** ","   **        ","      **  "),String.join(" "," **   **  ","   **   **  ","   **        ","     **   "),String.join(" ","   ***    ","     ***    ","   **        "," *****    ")};
		for(String line:lines){
			System.out.println(line);
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
>>>>>>> 5ed492ea51a41d20635c37676111eb3370c8126e
	}
}	