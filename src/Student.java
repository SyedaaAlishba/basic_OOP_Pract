public class Student extends person {
    public void talk(){
        System.out.println("Student talk");
    }
    public void  walk(){
        System.out.println("Student walk");
    }

    public void Study(){
        walk();
        talk();
        System.out.println("Student Study");
    }
}
