
public class Shape {

	public void startThiner(int row) {
		// TODO Auto-generated method stub
		String sp="*";
		int i=row;
		do{
			int u=1+(i-1)*2;
			for(int j=u;j>0;j--){
				System.out.print(sp);
			}
			System.out.println();

			for(int k=i;k<=row;k++){
			System.out.print(" ");
			}
			i--;
		}while(i>0);
		System.out.println();
	}
	public void startFatter(int r){
		String sp="*";
		for(int i=1;i<=r;i++){	
			System.out.println();
			for(int k=i;k<=r-1;k++){
				System.out.print(" ");
			}
			int u=1+(i-1)*2;
			for(int j=1;j<=u;j++){
				System.out.print(sp);
			}
		}
		System.out.println();
	}
	
	public void charShapeThiner(int row){
		
		for(int i=row;i>0;i--){
			int j=i-1;
			for(char c='A';c<='A'+j;c++){
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
	}
	public void charShapeFatter(int row){
		for(int i=1;i<=row;i++){
			int j=i-1;
			for(char c='A';c<='A'+j;c++){
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
	}
}
