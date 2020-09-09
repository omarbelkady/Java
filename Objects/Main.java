public class Main{
	public static void main(String [] args){
		//Classes And Objects
		//A Class is A blueprint
		
		//messi is an Object
		SoccerPlayer messi = new SoccerPlayer("Lionel Messi", "Argentina", "FCBarcelona", false);

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

	static class IsACLover{
		String fuName;
		String major;
		

		IsACLover(String fuName, String major){
			this.fuName = fuName;
			this.major = major;
		}
		
	}


}
