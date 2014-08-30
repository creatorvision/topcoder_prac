// Achiver@creatorvision
//SRM682_DIV2

import java.util.*;
import java.lang.*;

class BishopMove{

	public int howManyMoves(int r1, int c1, int r2, int c2) {
 
         int rowDiff = Math.abs(r2 - r1);
         int colDiff = Math.abs(c2 - c1);
 
         if ((rowDiff == 0) && (colDiff == 0)) return 0;
 
         if (rowDiff == colDiff) return 1;
 
         if (((rowDiff - colDiff) % 2) != 0) return -1;
 
         return 2;
 
  }
}

class Bishop_main{

	public static void main(String[] args) {
		
		BishopMove b= new BishopMove();
		int i= b.howManyMoves(4,6,7,3);
		int j= b.howManyMoves(1,5,5,5);
		int k= b.howManyMoves(4,4,4,4);
		System.out.println(i+ " "+ j+" "+k);
	}
}