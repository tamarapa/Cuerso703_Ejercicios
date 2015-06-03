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
			List<RegionDTO> l1 = RegionDAO.obtenerTodasLasRegiones();
			System.out.println(l1);
			List<RegionDTO> l2 = RegionDAO.obtenerRegionPorId("2");
			System.out.println(l2);
			//TODO 
			/*
			RegionDAO.insertarRegion("Tamiland");
			List<RegionDTO> l3 = RegionDAO.obtenerRegionPorId("2");
			System.out.println(l2);
			*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
