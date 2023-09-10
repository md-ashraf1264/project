import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Cricketer implements Serializable
{
    
        private String name;
        private int age;
        private int  runs;

        public Cricketer (String name, int age, int runs)
        {
            this.name=name;
            this.age=age;
            this.runs=runs;
        }
    }
    class Launch
    {
        public static void main(String args[]) throws Exception
        {
           Cricketer c = new Cricketer("Sachin",44,30000);
           FileOutputStream file = new FileOutputStream("the art of knowledge"); 
           ObjectOutputStream os = new ObjectOutputStream(file);
           os.writeObject(c);
           os.close();
           os.flush();
        }
    }