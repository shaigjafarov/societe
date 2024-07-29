package algoritm.hafiz;

public class Converttoseven {

    int qaliq ;
    String sumofqaliq = "";
    int num = 1234;
    int temp = num;


    public  String convert() {
        while (temp!=0) {
            qaliq = temp % 7;  // qaln qaliq
            temp = temp /7;    // eded oldu 14
            sumofqaliq = qaliq + sumofqaliq;   //
        }


        return sumofqaliq;
    }


}
