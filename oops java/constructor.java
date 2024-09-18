public class constructor {

    public static class construct{
        String name;
        int rno;

        public construct(String name, int rno)
    {
        this.name = name;
        this.rno = rno;
    }
    }
    
    public static void main(String[] args) {
        
       construct c1 = new construct("harsh",21);
       System.out.println(c1.name);
       System.out.println(c1.rno);

    }
}
