class Classroom {

     public static void main(String[] args) {
        Wilder eric = new Wilder("Eric");
        eric.setAware(true);

         Wilder yvens= new Wilder("Yvens");
        yvens.setAware(true);

         Wilder nicolas = new Wilder("Nicolas");
        
         Wilder sandra = new Wilder("Sandra");
        sandra.setAware(true);

         Wilder alicia = new Wilder("Alicia");
     
         Wilder razzak = new Wilder("Razzak");
        razzak.setAware(true);

         Wilder rico = new Wilder("Rico");
        
        System.out.println(eric.whoAmI());
        System.out.println(yvens.whoAmI());
        System.out.println(nicolas.whoAmI());
        System.out.println(sandra.whoAmI());
        System.out.println(alicia.whoAmI());
        System.out.println(razzak.whoAmI());
        System.out.println(rico.whoAmI());


     }
}