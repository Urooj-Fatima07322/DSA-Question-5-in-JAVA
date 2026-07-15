public class SwapMinAndMax {
    public static void main(String [] args){
        int array[]={4,2,7,8,1,2,5};
        int len=array.length;
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int indS=0;
        int indL=0;
        for(int i=0; i<len; i++){
            if(array[i]<small){
                small=array[i];
                indS=i;
            }
            if(array[i]>large){
                large=array[i];
                indL=i;
            }
        }
        int temp=array[indS];
        array[indS]=array[indL];
        array[indL]=temp;

        for(int i=0; i<len; i++){
            System.out.println(array[i]+" ");
        }
        
    }
}
