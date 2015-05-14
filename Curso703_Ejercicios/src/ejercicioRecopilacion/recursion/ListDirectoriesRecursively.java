package ejercicioRecopilacion.recursion;



import java.io.File;


/**
 * 
 * @author Val
 * @version 1.0
 * 
 * Example class that shows how to list a directory tree recursively
 *
 */
public class ListDirectoriesRecursively {
	
	/**
	 * 
	 * The algorithm is:
	 * 
	 * print the name
	 * if is a directory
	 * 	got its file list content
	 * 	and, for each file, invoke again
	 * 
	 * @param fname is a parameter that represents the current path
	 * @param cadspace only used to format the output, showing the directories hierarchy 
	 */
	private void showPath (String fname, String cadspace)
	{
		File current_file = null;
		String [] list = null;
		
		current_file = new File (fname); //guess fname exists 
		System.out.println(cadspace+current_file.getName());//either a directory or a file, print it:  base case
	
		if (current_file.isDirectory()) //if is a directory, (recursive case)
		{
			list = current_file.list(); //got the list
			for (String cad : list) //and for each one, call
			{
				showPath(fname+'\\'+cad, cadspace+" "); //concat the new file escaping backslash and add a blank prefix to increase deapth level
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		ListDirectoriesRecursively listDirectoriesRecursively = new ListDirectoriesRecursively();
		
		listDirectoriesRecursively.showPath(".", "");
		
	}

}
