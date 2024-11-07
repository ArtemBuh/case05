import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TaskList {
    private ArrayList<OneTask> tasks;

    public TaskList() {
        tasks=new ArrayList<>();
    }

    public void add(OneTask task) {
        tasks.add(task);
    }

    public boolean remove(OneTask task) {
        return tasks.remove(task);
    }

    public OneTask find(int n) {
        for (OneTask t : tasks)
            if (t.isN(n)) return t;
        return null;
    }

    public void print() {
        for (OneTask t : tasks) t.print();
    }

    public void printComplete() {
        for (OneTask t : tasks)
            if (t.isComplete()) t.print();
    }

    public void complete(int n) {
        OneTask t=find(n);
        if (t!=null) t.acomplish();
    }
    public boolean load(String fileName) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName)))
        {
            tasks=(ArrayList<OneTask>) ois.readObject();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean save(String fileName) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            oos.writeObject(tasks);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
}
