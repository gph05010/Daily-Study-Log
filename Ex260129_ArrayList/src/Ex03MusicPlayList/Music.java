package Ex03MusicPlayList;

public class Music {

	// MusicPlayList 안에서 사용할 우리만의 음악 자료형

	// 1. 필드 정의
	// 제목, 가수, 장르

	private String title;
	private String singer;
	private String genre;
	private int time;

	// 2. 메서드 정의
	// 모든 필드의 값을 초기화시킬 수 있는 생성자
	// 모든 필드의 getter 메서드

	public Music(String title, String singer, String genre, int time) {
		super();
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public String getGenre() {
		return genre;
	}

	public int getTime() {
		return time;
	}

}
