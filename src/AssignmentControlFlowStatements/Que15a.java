package AssignmentControlFlowStatements;
/*
 * 15. Write a program for Patterns
a.
1
1 2
1 2 3
1 2 3 4

 */
public class Que15a {

	public static void main(String[] args) {
		
		for(int i=0; i<4;i++) {
			for(int j=1; j<=i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
