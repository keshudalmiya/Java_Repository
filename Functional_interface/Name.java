interface Sample1{
    String display(String name);
}
public class Name{
    public static void main(String[] args) {
        String str = "Hello";
        Sample1 s = (String name) -> {
            return str+" "+name;
        };
        String res = s.display("Keshu");
        System.out.println(res);
}
}
