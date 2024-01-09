// Java 프로그래밍 - 다형성

class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}


public class Main {

    public static void main(String[] args) {

//      1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student(); // 다형성 부모클래스 타입으로 자식클래스 객체를 만듬
//        Student s2 = new Person(); 자식클래스 타입으로 부모클래스 객체를 만들순 없다

        p1.print();
        s1.print();
        s1.print2();
        p2.print();
//        p2.print2(); person클래스 안에 있는 메서드만 사용가능 아무리 자식클래스에 잇다 해도
        // 오버라이딩된것만 사용가능하다

        Person p3 = new CollegeStudent();
//        CollegeStudent c1 = new Student(); // 자식끼리 다형성 불가
        p3.print();

//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 다형성, 업캐스팅(자식 객체를 부모 타입으로)

        pp1 = pp2;
        pp1 = ss2;

        ss1 = ss2;
//        ss1 = pp2;
        ss1 = (Student)pp3; // 다운캐스팅(부모객체를 자식객체 타입으로 변환)

        // 밑과 같이 자식끼리 형변환은 안된다
//        CollegeStudent cc1;
//        CollegeStudent cc2 = new CollegeStudent();
//        ss1 = (Student) cc2;
//        cc1 = (CollegeStudent) ss2;

//      3. instanceof
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person);
        System.out.println(pe1 instanceof Student);

        System.out.println(st1 instanceof Student);
        System.out.println(st1 instanceof Person);

        System.out.println(pe2 instanceof Person);
        System.out.println(pe2 instanceof Student);

        System.out.println(pe3 instanceof Person);
        System.out.println(pe3 instanceof CollegeStudent);

        if (pe1 instanceof Student) {
            Student stu1 = (Student) pe1;
        }

        if (st1 instanceof Person) {
            Person per1 = (Person) st1;
        }

    }
}
