package ucankucuk.github.io;

public class FunctionalIntfExmpl {

    public static void main(String[] args) {
        Function<String, Integer> intFunc = x -> x.length();
        System.out.println("Input length = " + intFunc.apply("ucankucuk"));

        Function<String, String> strFunc = x -> x + " ADDED";
        System.out.println(strFunc.apply("XXX"));

    }

}
