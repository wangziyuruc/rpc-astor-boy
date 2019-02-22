import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeTest {

    @Test
    public void serializeTest(){
        Queue<Person> q = new LinkedList<Person>();
        Person p =new Person(1,"11");
        q.add(p);
        byte[] bytes = SerializeUtil.serialize(q);
        Queue<Person> result = (Queue<Person>) SerializeUtil.unserialize(bytes);
        System.out.println(result.peek().getId());

    }
}
