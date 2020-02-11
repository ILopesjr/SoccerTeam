package br.com.soccerteam.controller;

import br.com.soccerteam.dao.SoccerTeamDao;
import br.com.soccerteam.model.SoccerTeam;

public class SoccerTeamController {
	private SoccerTeamDao soccerTeamDao;

	public SoccerTeamController() {
		soccerTeamDao = new SoccerTeamDao();
	}

	public void add(String nameSoccerTeam, String starPlay, Integer createYear, String mainTitle, Integer mainTitleYear,
			Integer points) throws Exception {
		if (soccerTeamDao.find(nameSoccerTeam) == null) {
			SoccerTeam soccerTeam = new SoccerTeam();
			soccerTeam.setId(soccerTeamDao.list().size() + 1);
			soccerTeam.setNameSoccerTeam(nameSoccerTeam.toUpperCase());
			soccerTeam.setStarPlay(starPlay.toUpperCase());
			soccerTeam.setCreateYear(createYear);
			soccerTeam.setMainTitle(mainTitle.toUpperCase());
			soccerTeam.setMainTitleYear(mainTitleYear);
			soccerTeam.setPoints(points);
			soccerTeamDao.add(soccerTeam);
		} else {
			System.out.println("Time já cadastrado!");
		}
	}

	public void remove() throws Exception {
		soccerTeamDao.get();
	}

	public void update(String nameSoccerTeam, String starPlay) throws Exception {
		if (soccerTeamDao.find(nameSoccerTeam) != null) {
			soccerTeamDao.find(nameSoccerTeam).getNameSoccerTeam();
			soccerTeamDao.update(nameSoccerTeam, starPlay);
		} else {
			System.out.println("Time nao localizado!");
		}
	}

	public SoccerTeam find(String nameSoccerTeam) throws Exception {
		return soccerTeamDao.find(nameSoccerTeam);

	}

	public String list() {
		return soccerTeamDao.list().toString();
	}

	public String listMainTitleYear() {
		soccerTeamDao.orderMainTitleYear();
		return soccerTeamDao.list().toString();
	}

	public String listCreateYear() {
		soccerTeamDao.orderCreateYear();
		return soccerTeamDao.list().toString();
	}

	public String listNameSoccerTeam() {
		soccerTeamDao.orderNameSoccerTeam();
		return soccerTeamDao.list().toString();
	}

	public String listPoints() {
		soccerTeamDao.orderPoints();
		;
		return soccerTeamDao.list().toString();
	}

}
