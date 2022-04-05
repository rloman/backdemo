package YCNextPraktijk.Praktijk.dto;

import java.util.List;

public class GebruikerDTO {
	
	private String displayNaam;
	private String beschrijving;
	private String profilePicture;
	private Iterable<CheckinDTO> checkins;

	public String getDisplayNaam() {
		return displayNaam;
	}
	public void setDisplayNaam(String displayNaam) {
		this.displayNaam = displayNaam;
	}
	public String getBeschrijving() {
		return beschrijving;
	}
	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public Iterable<CheckinDTO> getCheckins() {
		return checkins;
	}
	public void setCheckins(Iterable<CheckinDTO> checkins) {
		this.checkins = checkins;
	}
	
}
