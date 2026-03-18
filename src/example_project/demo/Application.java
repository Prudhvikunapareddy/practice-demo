package example_project.demo;

public class Application {

 
    static class Developer {
        void show() {
            System.out.println("I am a developer (inner class)");
        }
    }

    public static void main(String[] args) {
        System.out.println("hii guys");
        System.out.println("dev1 is here");

  
        Developer dev = new Developer();
        dev.show();
    }
}