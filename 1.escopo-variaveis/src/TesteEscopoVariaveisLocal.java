class Teste {

  static public void main(String... args){
    for(int i = 0, j = 0; i < 10; i++)
      j++;

    System.out.println(j);
    /*
    Teste1.java:7: error: cannot find symbol
        System.out.println(j); // não compila
                           ^
      symbol:   variable j
      location: class Teste1
      1 error
    */
  }
}
