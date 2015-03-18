class Person {
  static int id = 15;
}

class Test {

  static public void main(String... args) {
    Person p = new Person();

    //acesso via instancia: 15
    System.out.println(p.id);

    //acesso via classe: 15
    System.out.println(Person.id);
  }

}
