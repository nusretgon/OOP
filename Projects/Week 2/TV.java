public class TV {
	int chanel;
	int volumeLevel;
	final boolean ON=true ;
	public TV() {
		chanel=1;
		volumeLevel=1;
	}
	public void setChanel(int chanel_id) {
		if (chanel>120){
			System.out.println("Chanel can't be 120+");
		}
		else {
			chanel=chanel_id;
		}
	}
	public void setVolume(int Volume) {
		if (Volume>7){
			System.out.println("Volume can't be 7+");
		}
		else {
			volumeLevel=Volume;
		}
		
	}
	public void chanelUp() {
		chanel--;
	}
	public void volumeUp() {
		volumeLevel++;
	}
	public void chanelDown() {
		chanel--;
	}
	public void volumeDown() {
		volumeLevel--;
	}
	public void whichChanel() {
		System.out.println("You are in"+chanel+" now.");
	}
	public void showVolume() {
		System.out.println("Volume is "+volumeLevel+" now.");
	}
}
