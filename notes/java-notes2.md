# OOP

## before OOP

```java
int size = 1000;

String[] ids = new String[size];
String[] names = new String[size];
int[] ages = new int[size];
double[] finalGrade = new double[size];

```

### como trocar duas variaveis

```java
int a = 2, b = 3;
int aux = a;
a = b;
b = aux;
```

- Exemplo de problema: trocar duas variaveis é extenso, pouco prático e ocorre um risco de haver algum processo durante a troca, quebrando o sistema.

## OOP

```java
public class Student {
  // tem - atributos
  public String id;
  public String name;
  public int age;
  public double finalGrade;

  // faz - metodos
  public void birthday() {
    age++;
  }

  public double sum(double a, double b) {
    return a + b;
  }
}
```

```java
Student john = new Student();
john.id = "ABC-123"
john.name = "John Grey";
john.age = 23;
john.finalGrade = 9.5;

john.birthday();
double result = john.sum(2.5, 9.5);

Student[] students = new Students[1000];
students[0] = new Student();

Student aux = students[1];
students[1] = students[2];
students[2] = aux;
```

## constructor

```java
// @Getter @Setter
// @AllArgsConstructor
// @NoArgsConstructor
// @ToString
public class Student {
  // tem - atributos
  private String id;
  private String name;
  private int age;
  private double finalGrade;

  public Student(String id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public Student(String id, String name, int age, String finalGrade) {
    // this(id, name, age);
    this.id = id;
    this.name = name;
    this.age = age;
    this.finalGrade = finalGrade;
  }

  // faz - metodos
  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setGinalGrade(String finalGrade) {
    this.finalGrade = finalGrade;
  }

  public String getFinalGrade() {
    return finalGrade;
  }

  public void birthday() {
    age++;
  }

  public double sum(double a, double b) {
    return a + b;
  }

  public double sum(double a, double b, double c) {
    return a + b + c;
  }
}
```

```java
Student john = new Student("123-A", "John Grey", 23);

john.age = -100;

System.out.println(john.age);
```
