package practice;

public class SwitchConnector {
	public static void main(String[] args) {
		SwitchConnector i = new SwitchConnector();
		i.userClickonPage("Dashboards", "data");
		i.userClickonPage("Data Explorer", "Tools");
	}
	
	public void userClickonPage(String button, String page) {
		switch(page) {
		case "Data":
			data("Dashboards");
			break;
		case "Maps":
			data("Map Gallery");
			break;
		case "Tools":
			data("Data Explorer");
			break;
		}
		
	}
	
	public static void data(String options) {
		switch(options) {
		case "Dashboards":
			System.out.println("found Dashboard");
			break;
		case "Reports":
			System.out.println("found reports");
			break;
		case "Map Gallery":
			System.out.println("found Map Gallery");
			break;
		case "Data Explorer":
			System.out.println("found Data Explorer");

		}	
	}
}
