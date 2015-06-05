package evaluacion.primera;

import java.sql.SQLException;
import java.util.List;


public class MainPracticaEvaluacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("1. OBTENER TODAS LAS REGIONES");
			List<RegionDTO> l1 = RegionDAO.obtenerTodasLasRegiones();
			System.out.println(l1);
			
			System.out.println("\n2. OBTENER REGION POR ID");
			List<RegionDTO> l2 = RegionDAO.obtenerRegionPorId("2");
			System.out.println(l2);	
			
			System.out.println("\n3. INSERTAR UNA REGION");
			RegionDAO.insertarRegion("Tamiland",l1.size());
			
			System.out.println("\n4. OBTENER TODAS LAS REGIONES");
			List<RegionDTO> l3 = RegionDAO.obtenerTodasLasRegiones();
			System.out.println(l3);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
