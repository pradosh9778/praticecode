class Lefttringle{
	public static void main(String[] args) {
		int row =4;
		int star =1;
		 int space =3;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
			for(int k=1;k<=space;k++){
				System.out.print("  ");
			}
			System.out.println();
			star++;
			space--;
		}
	}
	
}