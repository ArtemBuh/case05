import java.io.Serializable;

public class OneTask implements Serializable {
    private static final long serialVersionUID = 1L; // Class version ID
    private int n;
    private String task;
    private boolean complete;

    public OneTask(int n,String task) {
        this.n=n;
        this.task=task;
        complete=false;
    }

    public void acomplish() { complete=true; }
    public boolean isComplete() { return complete; }
    public boolean isN(int n) { return this.n==n; }
    public void print() { System.out.print(n+".\t"+task+(complete?" [сделано]\n":" {в процессе}\n")); }
}
