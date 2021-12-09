
public class c1 {

    public static void main(String [] args){
        int k,t ;
        int l ;
        int temp;

        int[] x = {58,11,95,69,13,72,14,83,46,41,16,72,57,70,77,17};

        for(t = 0; t < x.length; t++){
            System.out.print(x[t] +" ");
        }

        for(k = 0 ; k < x.length-1 ; k++){

            for(l = 0 ; l < x.length-1 ; l++){

                if(x[l+1] > x[l]){

                    temp = x[l+1];
                    x[l+1] = x[l];
                    x[l] = temp;

                }
            }
        }

        System.out.println();

        for(t = 0; t < x.length; t++){
            System.out.print(x[t] +" ");
        }
    }

}
