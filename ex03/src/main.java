public class main {
    public static void main(String[] args){
        int sum = 0;
        int[] numbers1 = {755000 ,
                885507 ,
                697028 ,
                546590 ,
                274809 ,
                545695 ,
                285594 ,
                775811 ,
                316246 ,
                614159 ,
                674411 ,
                293509  };
        int[] number2 = {

                877407,
                911845,
                612851,
                423249,
                383725,
                605262,
                836660,
                609138,
                348142,
                367503,
                911515,
                773349,};

        for (int i = 0; i < number2.length; i++){
            sum = numbers1[i] + number2[i];
            System.out.print(sum +" ");
        }


    }
}



