class Cornertringle{
	


    public static void main(String[] args) {

        int star=1;
        int space=1;
        int row=7;


        for(int i=1;i<=row;i++) {

            for(int j=1;j<=star;j++) {

                System.out.print("*");
            }
            System.out.println();
            star++;
            space++;
            if(space> 4)
            {

                star--;
                star--;
            }
           
            
        }
   
}
    }
