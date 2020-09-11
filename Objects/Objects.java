public class Objects
{
	public static void log(Object o){
	    System.out.print(o);
	}
	public static void logln(Object o){
	    System.out.println(o);
	}
	
	public static void main(String [] args){
		//Classes And Objects
		//A Class is A blueprint
		
		//messi is an Object
		SoccerPlayer messi = new SoccerPlayer("Lionel Messi", "Argentina", "FCBarcelona", false);
		IsACLover nelan = new IsACLover("Alan Ngo", "CS");
		nelan.Check();

	}

	//blueprint for creating a Soccer Player using static class because to use it main
	static class SoccerPlayer{
		//Define Some Properties
		String name;
		String nationalTeam;
		String clubTeam;
		boolean isSubOrNot;
		

		SoccerPlayer(String name ,String nationalTeam, String clubTeam, boolean isSubOrNot){
			//this = current Instance of the current Class
			this.name = name;
			this.nationalTeam = nationalTeam;
			this.clubTeam= clubTeam;
			this.isSubOrNot=isSubOrNot;
		}
	}

	static class IsACLover
	{
		String fuName;
		String major;
		
		IsACLover(String fuName, String major)
		{
			this.fuName = fuName;
			this.major = major;
		}
		
		public void Check()
		{
		    if(fuName.equals("Alan Ngo") && major.equals("CS"))
		    {
		        logln("DEFINITELY A:\n C-LOVER, \nPintos56837,\nAssembly56837, \nPHP, \nEnjoys LLP,\nSuperCS429FanBoy&&JM 56837!!!!!!!!!!!!!!!!!");
		    }
		}	
	}
}
