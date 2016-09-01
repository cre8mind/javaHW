
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

