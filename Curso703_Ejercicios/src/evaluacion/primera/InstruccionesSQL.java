package evaluacion.primera;

public class InstruccionesSQL {

	public static final String CUANTAS_REGIONES = "SELECT COUNT(*) FROM REGIONS";
	public static final String INSERTAR_REGION = "INSERT INTO REGIONS (region_id, region_name) VALUES (";
	public static final String INSERTAR_REGION_PS = "INSERT INTO REGIONS (region_id, region_name) VALUES (?,?)";
	public static final String CONSULTAR_REGION_ID = "SELECT * FROM REGIONS WHERE region_id=";
	public static final String CONSULTAR_TODAS_REGIONES = "SELECT * FROM REGIONS";
	
}
