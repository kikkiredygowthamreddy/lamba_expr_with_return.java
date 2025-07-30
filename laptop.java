@FunctionalInterface
interface  a{
     int sub(int i,int j);

    }

public class laptop{
    public static void main(String[] args) {
        a obj = (i,j) -> i-j;
        int result = obj.sub(55, 6);
        System.out.println(result);
    }
}