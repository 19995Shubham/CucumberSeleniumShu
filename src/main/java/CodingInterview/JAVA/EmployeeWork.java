package CodingInterview.JAVA;

abstract public class EmployeeWork {

    abstract void work();

    abstract void salary();

    void checkNormalMethod(){
        System.out.println("im normal method");
    }

    public static void main(String[] args) {



        Employee e = new Employee();
        e.salary();
        e.work();
        e.checkNormalMethod();
        System.out.println("//////////////////");
        Manager m = new Manager();
        m.salary();
        m.work();
        m.checkNormalMethod();
    }

}

  class Manager extends EmployeeWork {

      void work() {

          System.out.println("Manage employee");
      }

      void salary() {
          System.out.println("As per company");

      }
  }
    class Employee extends EmployeeWork{


        void work(){

            System.out.println("Work as per manager instruction");
        }

        void salary() {
            System.out.println("As per manager and hr");
        }
    }





