package hw5;

public class Task4 {

    public static void main(String[] args) {
        String str = "а роза упала на лапу Азора";
        String result = str.replaceAll(" ","");
        StringBuilder sb = new StringBuilder(result).reverse();
        System.out.println(result.toString().equalsIgnoreCase(sb.toString()));
    }
}
