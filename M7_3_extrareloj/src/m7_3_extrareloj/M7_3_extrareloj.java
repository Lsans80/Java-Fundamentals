package m7_3_extrareloj;

public class M7_3_extrareloj {

	public static void main(String[] args) {
		
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					System.out.println(h + ":" + String.format("%02d", m) + ":" + String.format("%02d", s));
				}
				
			}
		}

	}

}
