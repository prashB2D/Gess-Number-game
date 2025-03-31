class Main{
    //gess the number game 
    public static void main(String[] args) {
        //genrating rande numbes 
        RanGen call = new RanGen();
        int ran= call.randemm();

        System.err.println("Gess the number ");
        System.out.println("  1 to 100");
      // System.out.println(ran);//ran holdes the randem number 
        
        // game loic 
        Gamelogic gl = new Gamelogic();
        int count =0;
        boolean flag = true;// to st gessing 
         while(flag){
          flag= gl.check(ran);
          count++;
         }
        System.out.println("number gess "+ count);// number gess 
    }
}