public class staticss {
    

    

        int age;
        String name;
        boolean married;
        static int population;

        public staticss(int age,String name,boolean married)
        {
            this.age = age;
            this.name = name;
            this.married = married;
            staticss.population += 1;
           
           
        }
        public static void main(String[] args) {
            staticss Harsh = new staticss(21,"harsh",true);
            staticss kunal = new staticss(22,"kushwah",false);
   
   System.out.println(Harsh.age);         
   System.out.println(staticss.population);
   System.out.println(Harsh.name);
   System.out.println(Harsh.married);
   
   System.out.println(kunal.age);         
   System.out.println(staticss.population);
   System.out.println(kunal.name);
   System.out.println(kunal.married);
   
   
       }
   }
   
    
    