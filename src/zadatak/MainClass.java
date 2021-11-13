package zadatak;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
/* U glavnom programu kreirati video player i izvrsiti neke akcije nad njim
 U glavnom programu kreirati listu akcija i izvrsiti ih nad istim playerom */
		
		VideoPlayer vp = new VideoPlayer(180, 64, 35, 720);
		TimeControl tc = new TimeControl(true);
		AudioControl ac = new AudioControl(false);

		vp.stampanje();
		System.out.println("");

		ac.izvrsiAkciju(vp);
		tc.izvrsiAkciju(vp);

		vp.stampanje();
		System.out.println("");

		ArrayList<Control> akcija = new ArrayList<Control>();

		vp.stampanje();

	}
}
