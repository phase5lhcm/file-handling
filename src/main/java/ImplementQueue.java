import com.github.javafaker.Faker;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementQueue {

    static Faker faker = new Faker();
    public void ImplementQueue() {
        this.faker = faker;
    }
    public static void  main(String[] args) {
        Queue q = new LinkedList<>();
        for(var i =0; i < 5; i++){
            q.add(String.valueOf(faker.animal().name()));
        }
        System.out.println("Animals: "+q);
        System.out.println("Your first animal in the list is "+ q.peek());

    }
}
