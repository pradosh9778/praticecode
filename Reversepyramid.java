class Reversepyramid{

    public static void main(String[] args) {

        int star=5;
        int space=0;
        int row=3;


        for(int i=1;i<=row;i++) {
            for(int j=1;j<=space;j++) {

                System.out.print(" ");
            }

            for(int j=1;j<=star;j++) {

                System.out.print("*");
            }
            System.out.println();
            star--;
            star--;
            space++;
        }
   }
}