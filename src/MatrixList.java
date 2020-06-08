import java.util.*; 
public class MatrixList { 
	public static void main(String[] args) 
	{ 
		int n = 1; 
ArrayList<Integer>[] al = new ArrayList[n]; 

		for (int i = 0; i < n; i++) { 
			al[i] = new ArrayList<Integer>(); 
		} 

		al[0].add(1); 
		al[0].add(2); 
		 al[0].add(5); 
		
        for (int i = 0; i < n; i++) { 
			for (int j = 0; j < al[i].size(); j++) { 
				System.out.print(al[i].get(j) + " "); 
			} 
			System.out.println(""); 
		} 
	} 
} 
