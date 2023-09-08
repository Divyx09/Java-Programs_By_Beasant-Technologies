public class StaticFlow {
    public static String Studentname ="";
    public static void besant(String name){
        Studentname=name;
    }
}
class StaticFlow2{
public static void main(String[] args) {
    StaticFlow.besant("Studentname");
    System.out.println(StaticFlow.Studentname);
}
}
