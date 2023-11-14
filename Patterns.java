
public class Patterns {

	public static void main(String[] args) {
		int row=3,col=3;
		sqrPattern(row, col);
		System.out.println("-------------------");
		recursionSqrPattern(row, col);
		System.out.println("-------------------");
		rightUPattern(row,col);
		System.out.println("-------------------");
		rightDPattern(row, col);
		System.out.println("-------------------");
		leftUPattern(row, col);
		System.out.println("-------------------");
		leftDPattern(row,col);
		System.out.println("-------------------");
		dimondPattern(5, 5);
		System.out.println("-------------------");
		rightInvertatedTriangle(5, col);
		System.out.println("-------------------");
		trianglePattern(5, 5);
		System.out.println("-------------------");
		triangleDPattern(5, 5);
		System.out.println("-------------------");
		rightRUPattern0s1s(5,5);
		System.out.println("-------------------");
		downMountainPattern(4,4);
		System.out.println("-------------------");
		pattern1to15(5,5);
		System.out.println("-------------------");
		patternAtoEVertical(5,5);
		System.out.println("-------------------");
		patternAtoEHorizontal(5,5);
		System.out.println("-------------------");
		patternAtoEHHorizontal(5,5);
		System.out.println("-------------------");
		patternAtoDTriangle(5,5);
		System.out.println("-------------------");
		patternEtoALeftInvertedTriangle(5,5);
		System.out.println("-------------------");
		patternDimondInSquare(6,6);
		System.out.println("-------------------");
		patternLeftandRightTrianlge(9,9);
		System.out.println("-------------------");
		patternVerticalRectangle(4,4);
		System.out.println("-------------------");
		patternVerticalRectangleOutlineNumbers4to1(7,7);
	}
//	4 4 4 4 4 4 4
//	4 3 3 3 3 3 4
//	4 3 2 2 2 3 4
//	4 3 2 1 2 3 4
//	4 3 2 2 2 3 4
//	4 3 3 3 3 3 4
//	4 4 4 4 4 4 4
	static void patternVerticalRectangleOutlineNumbers4to1(int row, int col) {
		int lftRow=1,rgtRow=row;
		for(int i=1;i<=row;i++) {
			int print=4;
			for(int j=1;j<=col;j++) {
				
				if(!(i==1 || i==row) ) {
					if( (j>=lftRow && j<rgtRow) ) {
						System.out.print(print);
					}
					else if(j>row/2) { 
						System.out.print(print++);
					}
					else {
						System.out.print(print--);
					}
				}else {
					System.out.print(print);
				}
			}
			if(i<=row/2) {
				lftRow++;
				rgtRow--;
			}else {
				lftRow--;
				rgtRow++;
			}
			System.out.println();
		}
	}

	static void patternVerticalRectangle(int row, int col) {
		int lft=1,rgt=row;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if((i!=1 && i!=row ) && (j>lft && j<rgt)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("\n");
		}
	}
	//Revision
	static void patternLeftandRightTrianlge(int row, int col) {
		int lft=1,rgt=row;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i!=(row+1)/2 && (j>lft && j<rgt) ) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			if(i<(row+1)/2) {
				lft++;
				rgt--;
			}else if(i>row/2){
				lft--;
				rgt++;
			}
			System.out.println();
		}
	}

	static void patternDimondInSquare(int row, int col) {
		int mid=row/2,lftRow=mid,rgtRow=mid;
		for(int i=1;i<=row;i++) { 
			for(int j=1;j<=col;j++) {
				if(i<=mid) {
					if(i!=row-(row-1) && (j>lftRow && j<=rgtRow) ) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}else{
					if( i!=row && (j>lftRow && j<=rgtRow) ) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			if(i<mid) {
				lftRow--;
				rgtRow++;
			}else if(i>mid){
				lftRow++;
				rgtRow--;
			}
			System.out.println();
		}
	}

	static void patternEtoALeftInvertedTriangle(int row, int col) {
		
		for(int i=1;i<=row;i++) {
			int print=70-i;
			for(int j=1;j<=i;j++) {
				System.out.print((char)print++);
			}
			System.out.println();
		}
		
	}

	//Revision
	static void patternAtoDTriangle(int row, int col) {
		//row=5
		int mid=(2*row)/2,lftRow=mid,rgtRow=mid;
		for(int i=1;i<=row;i++) {
			int print=65;
			for(int j=1;j<=row+i-1;j++) {
				if(j>=lftRow && j<=rgtRow) {
					if(j>=mid) System.out.print((char)print--);
					else System.out.print((char)print++);
				}
				else {
					System.out.print(" ");
				}
			}
			lftRow--;
			rgtRow++;
			System.out.println();
		}
	}

	static void patternAtoEHHorizontal(int row, int col) {
		int start=65;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)start);
			}
			start++;
			System.out.println();
		}
	}

	static void patternAtoEHorizontal(int row, int col) {
		
		for(int i=1;i<=row;i++) {
			int start=65;
			for(int j=1;j<=row-(i-1);j++) {
				System.out.print((char)start);
				start++;
			}
			System.out.println();
		}
		
	}

	static void patternAtoEVertical(int row, int col) {
		
		for(int i=1;i<=row;i++) {
			int start=65;
			for(int j=1;j<=i;j++) {
				System.out.print((char)start);
				start++;
			}
			System.out.println();
		}
		
	}

	static void pattern1to15(int row, int col) {
		int print=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(print);
				print++;
			}
			System.out.println();
		}
		
	}
	//Revision
	static void downMountainPattern(int row, int col) {
		int print=0,start=1,end=8;
		for(int i=1;i<=row;i++) {
			print=row-(row-i);
			for(int j=1;j<=2*col;j++) {
				if(j>start && j<end) {
					System.out.print(" ");
				}else {
					System.out.print(print);
				}			
			}
			start++;
			end--;
			System.out.println();
		}
		
	}

	static void triangleDPattern(int row, int col) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j>i-1) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	//This methods will print Square Pattern.
	static void sqrPattern(int rows,int col) {
		//outer loop will give rows & inner loop will give columns.
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		Time Complexity : O(n*n)
//		Space Complexity : O(1)
	}
	
	static void recursionSqrPattern(int rows,int col) {
		//base condition
		if(col-- == 0) {
			return;
		}
		for(int i=0;i<rows;i++) {
			System.out.print("*");
		}
		System.out.println();
//		Time Complexity : O(n)
//		Space Complexity : O(1)
		recursionSqrPattern(rows, col);
	}
	
	static void rightUPattern(int row, int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void rightDPattern(int row, int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<(row-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void leftUPattern(int row, int col) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(j<=(row-i)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	static void leftDPattern(int row, int col) {
		for(int i=1;i<=row;i++) {
			for(int j=col;j>=1;j--) {
				if(j>(row-i)+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	static void dimondPattern(int row, int col) {
		//rowMid and colMid to traverse for manipulation of flow.
		//mid will give row mid so that we can flow the star by versa of rowMid and colMid..
		int rowMid=row+1/2,colMid=col+1/2,mid=row/2;
		for(int i=1;col>=0;i++) {
			if(i>rowMid && i<colMid) {
				System.out.print(" *");
			}else {
				System.out.print(" ");
			}
			if(i==row) {
				System.out.println();
				i=1;
				if(col>mid) {
					rowMid--;
					colMid++;
				}else {
					i=1;
					rowMid++;
					colMid--;
				}
				col--;
			}
		}
	}
	
	static void trianglePattern(int row,int col) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j>row-i) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//Revision
	static void rightInvertatedTriangle(int row,int col) {
		//row=5=>2*5-1=>9
		for(int i=1;i<=2*row-1;i++) {
			int starts=i;
			if(i>row) starts=2*row-i;
			for(int j=1;j<=starts;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	static void leftInvertatedTriangle(int row,int col) {
		
		for(int i=1;i<=2*row-1;i++) {
			int starts=i;
			if(i>row) starts=2*row-i;
			for(int j=1;j<=starts;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	//Revision
	static void rightRUPattern0s1s(int row,int col){
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) System.out.print((j-1)%2);
				else System.out.print(j%2);
			}
			System.out.println();
		}
		
	}
		
}
