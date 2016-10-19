import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	private static final int IS_SAME = 10;
	private static final int IS_DIFFERENT = 11;
	private static final int IS_EMPTY = 12;
	private static final int IS_ALREADY_VISITED = 13;
	private static Set<Marker> set = new HashSet<>();
	
	public static void main(String arg[]){
		int[][] a = {{1,1,1},{0,0,1},{1,1,1}};
		printGame(a);
		System.out.println(willdissolved(1, 1, a));
	}
	
	public static boolean willdissolved(int row, int column, int[][] arr){
		boolean L = false, R = false, U = false, D = false;
		set.add(new Marker(row, column));
		int l = leftDissolve(row, column, arr);
		if(l == IS_DIFFERENT || l == IS_ALREADY_VISITED){
			L = true;
		} else if(l == IS_SAME){
			L = willdissolved(row, column - 1, arr);
		}
		int r = rightDissolve(row, column, arr);
		if(r == IS_DIFFERENT || r == IS_ALREADY_VISITED){
			R = true;
		}else if(r == IS_SAME){
			R = willdissolved(row, column + 1, arr);
		}
		int d = upDissolve(row, column, arr);
		if(d == IS_DIFFERENT || d == IS_ALREADY_VISITED){
			D = true;
		}else if(d == IS_SAME){
			D = willdissolved(row + 1, column, arr);
		}
		int u = downDissolve(row, column, arr);
		if(u == IS_DIFFERENT || u == IS_ALREADY_VISITED){
			U  = true;
		}else if(r == IS_SAME){
			U = willdissolved(row - 1, column, arr);
		}
			
		return L && R && U && D;
	}
	
	public static boolean isAlreadyVisited(int row, int column){
		Marker marker = new Marker(row, column);
		if(set.contains(marker)){
			return true;
		} else{
			return false;
		}
	}
	
	
	
	public static int leftDissolve(int row, int column, int[][] arr){
		if(column-1<0){
			return IS_DIFFERENT;
		}
		if(isAlreadyVisited(row, column -1)){
			return IS_ALREADY_VISITED;
		}
		if(arr[row][column - 1]==-1){
			return IS_EMPTY;
		}
		if(arr[row][column] != arr[row][column-1]){
			return IS_DIFFERENT;
		}
		return IS_SAME;
	}
	
	public static int rightDissolve(int row, int column, int[][] arr){
		if(column+1>=arr[0].length){
			return IS_DIFFERENT;
		}
		if(isAlreadyVisited(row, column+1)){
			return IS_ALREADY_VISITED;
		}
		if(arr[row][column+1]==-1){
			return IS_EMPTY;
		}
		if(arr[row][column] != arr[row][column+1]){
			return IS_DIFFERENT;
		}
		return IS_SAME;
	}
	
	public static int upDissolve(int row, int column, int[][] arr){
		if(row-1<0){
			return IS_DIFFERENT;
		}
		if(isAlreadyVisited(row-1, column)){
			return IS_ALREADY_VISITED;
		}
		if(arr[row -1][column]==-1){
			return IS_EMPTY;
		}
		if(arr[row][column] != arr[row - 1][column]){
			return IS_DIFFERENT;
		}
		return IS_SAME;
	}
	
	public static int downDissolve(int row, int column, int[][] arr){
		if(row+1>=arr.length){
			return IS_DIFFERENT;
		}
		if(isAlreadyVisited(row + 1, column)){
			return IS_ALREADY_VISITED;
		}
		if(arr[row + 1][column]==-1){
			return IS_EMPTY;
		}
		if(arr[row][column] != arr[row + 1][column]){
			return IS_DIFFERENT;
		}
		return IS_SAME;
	}
	
	public static void printGame(int[][] a){
		for(int i = 0 ; i< a.length ; i++){
			for(int j = 0; j < a[0].length ; j++){
				System.out.print(a[i][j]+ " ");
			}
			System.out.println("");
		}
	}
	
	static class Marker{
		int row, column;
		public static int uniqueNo = 0;
		Marker(int row, int column){
			this.row = row;
			this.column = column;
		}
		
		@Override
		public boolean equals(Object arg0) {
			Marker marker = (Marker)arg0;
			return this.row == marker.row && this.column == marker.column;
		}
		
		@Override
		public int hashCode() {
 			int num = 0;
			for(int i =0 ; i <= row; i++){
				for(int j = 0; j<=column ; j++){
					num ++;
				}
			}
			System.out.println("row:" + this.row + " column:" + this.column + " hashcode: "+ num );
			return num;
		}
	}

}
