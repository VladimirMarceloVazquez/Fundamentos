package org.ejemplo.sentencia;

public class Lasentenciaifthenelse {

	public static void main(String[] args) {
		int testscore = 70;
		char grade;
		
		if (testscore >= 90) {
			grade = 'A';
		}
		else if (testscore >= 80) {
			grade = 'B';
		}
		else if (testscore >= 70) {
			grade = 'C';
		}
		else if (testscore >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("Nota = " + grade);
	}
}
