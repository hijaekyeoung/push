package quizMap;

public class Video {
	protected int v_num; // 비디오 번호
	protected String title, category, lendName, lendDate;
	protected String lend; // 대여 여부
	
	
	public Video() {
		
	}

	public Video(int v_num, String title, String category, String lendName, String lendDate, String lend) {
		this.v_num = v_num;
		this.title = title;
		this.category = category;
		this.lendName = lendName;
		this.lendDate = lendDate;
		this.lend = lend;
	}
//	@Override
//	public String toString() {
//		return "Video [v_num=" + v_num + ", title=" + title + ", category=" + category + ", lendName=" + lendName
//				+ ", lendDate=" + lendDate + ", lend=" + lend + "]";
//	}

	public int getV_num() {
		return v_num;
	}

	public void setV_num(int v_num) {
		this.v_num = v_num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLendName() {
		return lendName;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	public String isLend() {
		return lend;
	}

	public void setLend(String lend) {
		this.lend = lend;
	}
	
}
