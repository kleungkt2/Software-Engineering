package comp3111.labs.lab7;

/*
 * note the bad coding style (deliberately written for debugging exercise)
 */
public class main {
    public static void main(String[] args) {
        Animal animals[] = new Animal[10];
        for(int i = 0;i < animals.length; i++) {
            animals[i] = new Animal();
        }
        
        /*
         * In the original program, it uses for(Animal a:animals) as the loop body
         * However, "a" here is referring to a local copy of Animal object instead of array elements
         * thus it cannot initialize the animals array with 10 Animal objects.
         * After changing it to a for loop using integer counter and access the array element one by one,
         * the problem solved.
         */
        
        for (int iii = 0; iii < 10; iii++) {
            int ii = 0;
            for (; ii < 100 && animals[iii].isAlive() ; ii++) {
                System.out.print(animals[iii].getWeight() + " ");
                animals[iii].eat();
                if (ii % 3 == 0)
                animals[iii].poo();
            }
        }
    }
}
