import java.util.ArrayList;

public class League<T extends LeagueTeam> implements Comparable<League<T>> {
	private String name;
	
	private ArrayList<T> teams = new ArrayList<>();

	public League(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addTeam(T team) {
		if(teams.contains(team)) {
			System.out.println(team.getTeamName() + " is already on the list");
			return false;
		} else {
			teams.add(team);
			System.out.println(team.getTeamName() + " added to " + this.name + " League");
			return true;
		}
	}
	
	@Override
	public int compareTo(League<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
