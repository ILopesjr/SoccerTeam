package br.com.soccerteam.model;

public class SoccerTeam {

	private int id;
	private String nameSoccerTeam;
	private String starPlay;
	private Integer createYear;
	private String mainTitle;
	private Integer mainTitleYear;
	private Integer points;

	public SoccerTeam() {

	}

	public SoccerTeam(int id, String nameSoccerTeam, String starPlay, Integer createYear, String mainTitle,
			Integer mainTitleYear, Integer points) {
		this.id = id;
		this.nameSoccerTeam = nameSoccerTeam;
		this.starPlay = starPlay;
		this.createYear = createYear;
		this.mainTitle = mainTitle;
		this.mainTitleYear = mainTitleYear;
		this.points = points;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSoccerTeam() {
		return nameSoccerTeam;
	}

	public void setNameSoccerTeam(String nameSoccerTeam) {
		this.nameSoccerTeam = nameSoccerTeam;
	}

	public String getStarPlay() {
		return starPlay;
	}

	public void setStarPlay(String starPlay) {
		this.starPlay = starPlay;
	}

	public Integer getCreateYear() {
		return createYear;
	}

	public void setCreateYear(Integer createYear) {
		this.createYear = createYear;
	}

	public String getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public Integer getMainTitleYear() {
		return mainTitleYear;
	}

	public void setMainTitleYear(Integer mainTitleYear) {
		this.mainTitleYear = mainTitleYear;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return Messages.getString("SoccerTeam.0") + id + "\n" + Messages.getString("SoccerTeam.1") + nameSoccerTeam //$NON-NLS-1$ //$NON-NLS-2$
				+ "\n" + Messages.getString("SoccerTeam.2") + starPlay + "\n" //$NON-NLS-2$
				+ Messages.getString("SoccerTeam.3") + createYear + "\n" + Messages.getString("SoccerTeam.4") //$NON-NLS-1$ //$NON-NLS-2$
				+ mainTitle + "\n" + Messages.getString("SoccerTeam.5") + mainTitleYear + "\n" //$NON-NLS-2$
				+ Messages.getString("SoccerTeam.7");//$NON-NLS-1$
	}
}
