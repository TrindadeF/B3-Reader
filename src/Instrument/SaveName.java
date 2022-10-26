package Instrument;

public class SaveName {

	private String name;
	private Integer volum;
	
	public SaveName(String name, Integer volum) {
		this.name = name;
		this.volum = volum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVolum() {
		return volum;
	}

	public void setVolum(Integer volum) {
		this.volum = volum;
	}
	
	public Integer total() {
		return volum += volum;
		
	}
	
	
	
	
}
