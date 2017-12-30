package Class03;

public class Universe {

	protected Cell[][] Uni = new Cell [10][10];
	
	Universe() {
		int i,j;
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				Uni[i][j]=new Cell();
				if(((i+j) %2)==0)
				{
					Uni[i][j].setAlive(true);
				}
				else
					Uni[i][j].setAlive(false);				
			}	
		}		
	}
	
	@Override
	public String toString() {
		int i,j;
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				System.out.print(Uni[i][j].toString());	
			}
			System.out.println();
		}
		return "";
	}
	
	public void nextStep() {
	Cell[][] Uni2=new Cell[10][10];	
	
		int fam=0,i,j;
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				Uni2[i][j]=new Cell();
				fam=0;
				//left
				if(j>0){
					if(Uni[i][j-1].getAlive())
						fam++;
				}
				//right
				if(j<9) {
				if(Uni[i][j+1].getAlive())
					fam++;
				}
				//up
				if(i>0) {
					if(Uni[i-1][j].getAlive())
						fam++;
				}
				//down
				if(i<9) {
					if(Uni[i+1][j].getAlive())
						fam++;
				}
				
				if(fam<2) {
					Uni2[i][j].setAlive(false);
				}
				else if (fam>3 && Uni[i][j].getAlive()) {
					Uni2[i][j].setAlive(false);
				}
				else if(fam==3) {
					Uni2[i][j].setAlive(true);
				}
				else if(fam==2 && Uni[i][j].getAlive()) {
					Uni2[i][j].setAlive(true);
				}
				else
					Uni2[i][j].setAlive(false);		
			}
		}
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				Uni[i][j]=Uni2[i][j];
			}
		}	
	}	
}