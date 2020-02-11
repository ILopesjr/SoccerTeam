package br.com.soccerteam.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.soccerteam.model.SoccerTeam;

public class SoccerTeamDao {

	private List<SoccerTeam> soccerTeams;

	public SoccerTeamDao() {
		soccerTeams = new ArrayList<SoccerTeam>();
	}

	public void add(SoccerTeam soccerTeam) {
		this.soccerTeams.add(soccerTeam);
	}

	public SoccerTeam get() {

		if (this.soccerTeams.size() != 0) {
			SoccerTeam first = this.soccerTeams.get(0);
			this.soccerTeams.remove(0);
			return first;
		}
		return null;
	}

	public List<SoccerTeam> list() {
		return soccerTeams;
	}

	public void update(String nameSoccerTeam, String starPlay) {
		for (SoccerTeam soccerTeam : soccerTeams) {
			if (soccerTeam.getNameSoccerTeam().equals(nameSoccerTeam)) {
				soccerTeam.setStarPlay(starPlay);
			}
		}
	}

	public SoccerTeam find(String nameSoccerTeam) {
		for (SoccerTeam soccerTeam : soccerTeams) {
			if (soccerTeam.getNameSoccerTeam().contains(nameSoccerTeam)) {
				return soccerTeam;
			}
		}
		return null;
	}

	public void orderMainTitleYear() {
		soccerTeams.sort(Comparator.comparing(SoccerTeam::getMainTitleYear));
	}

	public void orderCreateYear() {
		soccerTeams.sort(Comparator.comparing(SoccerTeam::getCreateYear));
	}

	public void orderNameSoccerTeam() {
		soccerTeams.sort(Comparator.comparing(SoccerTeam::getNameSoccerTeam));
	}

	public void orderPoints() {
		soccerTeams.sort(Comparator.comparing(SoccerTeam::getPoints).reversed());
	}
}