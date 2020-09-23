package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] i : matrise)
			for(int j : i)
				System.out.println(j);
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String output = "";

		for(int[] i : matrise) {
			for(int j : i)
				output += Integer.toString(j) + " ";
			output += "\n";
		}
		
		return output;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] output_table = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i < matrise.length; i++)
			for(int j = 0; j < matrise[0].length; j++)
				output_table[i][j] = matrise[i][j] * tall;
		
		return output_table;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[0].length; j++)
				if(a[i][j] != b[i][j])
					return false;
			return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		int[][] output_table = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i < matrise.length; i++)
			for(int j = 0; j < matrise.length; j++)
				output_table[i][j] = matrise[j][i];
		
		return output_table;	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] output_table = new int[a[0].length][b.length]; 
		
		if(a[0].length != b.length)
			throw new UnsupportedOperationException("The amount of rows in a does not equal the amount of columns in b");
		
		for(int i = 0; i < output_table.length; i++)
			for(int j = 0; j < output_table[0].length; j++)
				for(int k = 0; k < a[0].length; k++)
					output_table[i][j] += a[i][k] * b[k][j];
		
		return output_table;
	}
}
