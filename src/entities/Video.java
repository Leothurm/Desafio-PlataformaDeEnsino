package entities;

public class Video extends Lesson{

	private int seconds;
	private String url;
	
	public Video() {
		
	}
	
	public Video(String title, int seconds, String url) {
		super(title);
		this.seconds = seconds;
		this.url = url;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	@Override
	public int duration() {
		return seconds;
	}
	
	
	
	
}
