package Work;

public class Holiday {
	private String thanksgiving;
	private String christmas;
	private String independence;

	public Holiday(String thanksgiving, String christmas) {
		this.thanksgiving = thanksgiving;
		this.christmas = christmas;
	}

	public Holiday(String thanksgiving, String christmas, String independence) {
		this.thanksgiving = thanksgiving;
		this.christmas = christmas;
		this.independence = independence;
	}

	public String getThanksgiving() {
		return thanksgiving;
	}

	public String getChristmas() {
		return christmas;
	}

	public String getIndependence() {
		return independence;
	}

	public void setThanksgiving(String thanksgiving) {
		this.thanksgiving = thanksgiving;
	}

	public void setChristmas(String christmas) {
		this.christmas = christmas;
	}

	public void setIndependence(String independence) {
		this.independence = independence;
	}

	public boolean isGlobal() {
		return true;
	}

	public String general() {
		return "Workers are giving day off";
	}

	public static void main(String[] args) {

	}
}
