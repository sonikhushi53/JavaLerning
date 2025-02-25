public class Demo {
    private int a = 9;
    public Demo(){
        System.out.println("Cunstoructor");
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.a);
    }
}
