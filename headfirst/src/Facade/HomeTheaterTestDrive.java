package Facade;

public class HomeTheaterTestDrive {

	private static PopcornPopper popper = new PopcornPopper();
	private static DvdPlayer dvdPlayer = new DvdPlayer();
	private static TheaterLights theaterLights = new TheaterLights();
	private static CdPlayer cdPlayer = new CdPlayer();
	private static Tuner tuner = new Tuner();
	private static Projector projector = new Projector();
	private static Screen screen = new Screen();
	private static Amplifier amplifier = new Amplifier();

	public static void main(String[] args) {

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner,
				dvdPlayer, cdPlayer, projector, theaterLights, screen, popper);
		homeTheater.watchMovie("RAiders of the lost Ark");
		homeTheater.endMovie();
	}
}
