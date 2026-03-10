import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find(int [] array, int number) {
		for (int i=0; i<array.length;i++) {
			if (number==array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int findLast(String [] array, String string) {
		int x=-1;
		for (int i=0; i<array.length;i++) {
			if (string==array[i]) {
				x=i;
			}
		}
		return x;
	}

	public static int findSecond(char [] array, char character) {
		int x=-1;
		int y=0;
		for (int i=0; i<array.length;i++) {
			if (character==array[i]) {
				x=i;
				y++;
			}
			if (y==2) {
				return x;
			}
		}
		return x;
	}

	public static int[] findAll(double [] array, double number) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		for (int i=0; i<array.length;i++) {
			if (number==array[i]) {
				x.add(i);
			}
		}
		int [] y=new int[x.size()];
		for (int j=0; j<x.size();j++) {
			y[j]=x.get(j);
		}
		return y;
		
	}



	

}
