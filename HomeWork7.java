/**
 * Create a two dimensional array of type char, a game board that is 4 squares x 4 squares.  
 * Populate each element of the array with a value of 
 * either 'r' (for red piece), 'w' (for white piece) , or 'b' (for blank square).
 * Then write a nested loop (either a for loop or enhanced for loop) to output the value of each square in order.
 **/

public class HomeWork7 {
	public static void main(String[] args) {
		char [][] matrix = {
				{'r','r','w','w'},
				{'b','b','w','w'},
				{'r','r','r','r'},
				{'w','r','b','b'}};

		for(char [] array:matrix) {
			for(char c:array) {
				System.out.println(c);
			}
		}
	}
}
