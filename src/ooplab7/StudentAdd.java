package ooplab7;

public class StudentAdd {
    public static void main(String[] args) {
        //create object as Student
        //default constructor
        Student s1 = new Student();
        s1.setId("001");
        s1.setName("Boy Saiyai");
        s1.setAddress("109 M.2 T.Thamyai A.Thungsong");
        s1.setGender("Male");

        System.out.println(s1.getName());
        System.out.println(s1.getGender());

       System.out.println(s1.toString ());

       Student s2 = new Student("002","Girl Saiyai","11/11 T.Tawang A.Muang","Female");
       System.out.println(s2.toString());

    }

}//class
