
public class Spreadsheet {
	
	static String a[][] ;
	
	Spreadsheet(int rows, int cols){
		 a = new String[rows][cols];
		 
		 for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					updatecontents("",i,j);
				}
				
			}
		updatecontents("bob",0,0);
		updatecontents("10",0,1);
		updatecontents("foo",0,2);
		updatecontents("alice",1,0);
		updatecontents("5",1,1);
		printsheet();
		prettyPrinting(rows,cols);
	}

	private void printsheet() {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
				if(j<a[i].length-1)
					System.out.print("|");
			}
			System.out.println();
		}
		
	}

	private void updatecontents(String str, int i, int j) {		
		a[i][j]=str;
	}

	private void prettyPrinting(int rows, int cols) {
		//max length string in column
		
		for (int j=0; j<cols;j++) {
				maxlen(rows,j);
			
		}
		
		//add spaces to other strings at the end
	}

	private void maxlen(int rows, int j) {
		String arr[] = new String[rows];
		for(int i=0; i<rows;i++) {
			
		}
		
	}
	
}
