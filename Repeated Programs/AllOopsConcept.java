package RemainingPrograms;

public class AllOopsConcept {
    //Abstraction

    interface Car {

        void printName();

    }

//Inheritance

    class Ford {

        private String name; //Encapsulation

        public String getName() {

            return name;

        }

        public void setName(String newName) {

            name = newName;

        }

    }

    class OneMore extends Ford implements Car{

        @Override //Overriding

        public void printName() {

            System.out.println("Override Method Print " + super.getName());



        }

        //Overloading

        public void printName(String string) {

            System.out.println("Overloaded Method Print " + string);

        }

    }

    class Main {

        public void main(String[] args) {

            OneMore object = new OneMore();

            object.setName("Eco Sport");

            object.printName();

            object.printName("Aspire");

        }

    }
}
