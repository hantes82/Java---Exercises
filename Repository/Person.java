package pkg1;

/**
 * Created by kondz on 29.03.2017.
 */
public class Person {

    private String name;
    private String surname;
    private int age;
    private Repository repository;


    public Person(String name, String surname, int age, Repository repository) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.repository = repository;
    }
    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
    public void save() {
        repository.save(this);
    }
}
