package evaluacion.primera;

public class RegionDTO {
	
	private int region_Id;
	private String region_name;
	
	public RegionDTO(int region_Id, String region_name) {
		this.region_Id = region_Id;
		this.region_name = region_name;
	}

	public int getRegion_Id() {
		return region_Id;
	}

	public void setRegion_Id(int region_Id) {
		this.region_Id = region_Id;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	
	@Override
	public String toString() {
		return region_Id + "\t \t " + region_name;
	}
	
}
