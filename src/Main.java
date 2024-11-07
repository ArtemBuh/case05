public class Main {
    public static void main(String[] args) {
        TaskList t=new TaskList();
        t.add(new OneTask(1,"Пропылесосить холодильник"));
        t.add(new OneTask(2,"Выгулять слона"));
        t.add(new OneTask(3,"Узнать где север по кактусу"));
        System.out.print("Список задач:\n");
        t.print();
        t.save("file.dat");
        System.out.print("Сохранено..\n");

        TaskList tl=new TaskList();
        System.out.print("Загрузка..\n");
        tl.load("file.dat");
        System.out.print("Список задач:\n");
        t.print();
        t.complete(2);
        System.out.print("Список завершенных задач:\n");
        t.printComplete();

        System.out.print("Список задач:\n");
        t.remove(t.find(1));
        t.print();
    }
}