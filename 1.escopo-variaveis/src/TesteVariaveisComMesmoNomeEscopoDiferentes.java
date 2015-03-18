class X {

  int a = 100;

  public void method(){
    int a = 200; // shadowing
    System.out.println(a);
  }

}

class TestX {

  static public void main(String... args){
    X x = new X();
    x.method(); // 200
  }

}

class Y {

  public int metodo(){
    int x = 10;

    if(x == 10){
      int x = 20; // não compila
    }

    return x;
    /*
    src\TesteVariaveisComMesmoNomeEscopoDiferentes.java:27: error: variable x is
    already defined in method metodo()
        int x = 20;
            ^
    1 error
    */
  }

}
