import java.util.*;
class OOPSBannerApp{
<<<<<<< HEAD
	public static HashMap<Character,String[]> createCharacterMap(){
		HashMap<Character,String[]> map=new HashMap<>();
		map.put('o',new String[]{ "  ***  ",
=======
	static class CharacterPatternMap{
		String[] pattern;
		Character character;
		CharacterPatternMap(Character character,String[] pattern){
			this.character=character;
			this.pattern=pattern;
		
		}
		
	}
    public static CharacterPatternMap[] createCharacterPatternMaps(){
		
        String getpatternO[]={
            "  ***  ",
>>>>>>> ca39b887782bcd2ccd99c8940bc461ee524b9938
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "	
        });
		map.put('p',new String[]{" ****** ",
            " **   **",
            " **   **",
            " **   **",
            " ****** ",
            " **     ",
            " **     ",
            " **     ",
            " **     "
		});
        map.put('s',new String[]{ " ***** ",
            " **    ",
            " **    ",
            " **    ",
            "  ***  ",
            "    ** ",
            "    ** ",
            "    ** ",
            " ***** "	
        });
		return map;
	}
    public static void createBannerApp(HashMap<Character,String[]> map,String message){
		for(int i=0;i<9;i++){
		    StringBuilder l=new StringBuilder();
            char arr[]=message.toCharArray();
            for(char ch:arr){
			    String[] pattern=map.get(ch);
			    l.append(pattern[i]).append(" ");
		    }
		    System.out.println(l.toString());
        }	
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String val=sc.nextLine();
		HashMap<Character,String[]> map=createCharacterMap();
		createBannerApp(map,val);
	}
}	
	
<<<<<<< HEAD
		
        		
			
			
            			
		
	
	
    	
=======
>>>>>>> ca39b887782bcd2ccd99c8940bc461ee524b9938
