import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ThreadTest {
    private static Hashtable<String,String> myHashtable = new Hashtable<String,String>();
    private static List<Thread> threadList = new ArrayList<Thread>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        myHashtable.put("a","baby");
        myHashtable.put("able","back");
        myHashtable.put("about","bad");
        myHashtable.put("above","bakery");
        myHashtable.put("accident","ball");
        myHashtable.put("acid","bank");
        myHashtable.put("across","base");
        myHashtable.put("act","be");
        myHashtable.put("add","bear");
        myHashtable.put("admission","beat");
        myHashtable.put("after","beautiful");
        myHashtable.put("again","became");
        myHashtable.put("against","because");
        myHashtable.put("age","become");
        myHashtable.put("ago","bed");
        myHashtable.put("agree","been");
        myHashtable.put("aide","before");
        myHashtable.put("alarm","begin");
        myHashtable.put("all","behind");
        myHashtable.put("almost","believe");
        myHashtable.put("alone","below");
        myHashtable.put("already","beside");
        myHashtable.put("also","best");
        myHashtable.put("athough","better");
        myHashtable.put("always","between");
        

        for (int i=0;i<500;++i) {
            Thread t = new Thread(new MyThread(myHashtable));
            threadList.add(t);
            t.start();
        }

        try {
          for (int i=0;i<threadList.size();++i) {
            Thread t = threadList.get(i);
            t.join();
            System.out.println(t.getName() + " DONE");
          }
        }
        catch(Exception e) {}
        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;
        System.out.println("done in " + totalTime + " seconds");
    }
}
