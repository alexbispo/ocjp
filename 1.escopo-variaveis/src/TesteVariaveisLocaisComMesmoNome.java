class Teste{

  static public void main(String...args){
    test();
    /*
    src\TesteVariaveisLocaisComMesmoNome.java:17: error: variable x is already defined in method test()
    int x = 2;
        ^
1 error
    */
  }

  private static void test(){
    int x = 1;

    if(x ==1){
      int x = 2;
      System.out.println(x);
    }
  }
}
