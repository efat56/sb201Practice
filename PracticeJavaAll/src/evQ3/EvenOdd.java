package evQ3;

public class EvenOdd {
    int num;

    void numbers(){
        if(num%2 !=0 && num>0){
            System.out.println(num);
        } else if (num%2 ==0 && num>0) {
            System.out.println((num/10+1)*10);

        }
        else if(num<0) {
            System.out.println("Error!");
        }

    }

    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        eo.num= 36;
        eo.numbers();

    }
}
