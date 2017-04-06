package chapter7.collections;

class DvdInfo implements Comparable<DvdInfo>{
	private String title;
	private String genre;
	private String leadActor;

	DvdInfo(String t, String g, String a) {
		title = t;
		genre = g;
		leadActor = a;
	}

	public String toString(){
		return "t: " + title + "; g: " + genre + "; a: " + leadActor + "\n";
	}

	@Override
	public int compareTo(DvdInfo o) {
		return title.compareTo(o.title);
	}

	/*
	 * getters-setters
	 */
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
}
