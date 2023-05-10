import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MyThread implements Runnable {
    private Hashtable<String, String> hash = null;
    
    public MyThread(Hashtable<String, String> hash) {
        this.hash = hash;
    }

    @Override
    public void run() {
      for (int i=0; i<100000; ++i) {
        Set<String> keyset = hash.keySet();
        Iterator<String> iter = keyset.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            String a = hash.get(next);
            //System.out.println(Thread.currentThread().getName() + ": " + next + "=" + a);
        }
      }
    }
}
