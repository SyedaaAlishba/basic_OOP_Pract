public class Teacher  extends  person{
    @Override
    public void talk() {
        System.out.println("Teacher Talk");
    }

    @Override
    public void walk() {
        System.out.println("Teacher can Walk");
    }
    public void Teach(){
        walk();
        talk();
        System.out.println("Teacher teach students");
    }

}
