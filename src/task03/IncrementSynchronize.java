package task03;

import lombok.Synchronized;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 3.Given the following class:
 * public class IncrementSynchronize { private int value = 0; //getNextValue() }
 * Write three different method options for getNextValue() that will return 'value++', each
 * method needs to be synchronized in a different way.
 */
public class IncrementSynchronize {
    private int value = 0;
    private final Object lock = new Object();
    AtomicInteger count = new AtomicInteger();

    /**
     * Synchronized method
     */
    public synchronized void getNextValueBySynchronizedMethod() {
        value++;
    }

    /**
     * Synchronized statement
     */
    public void getNextValueBySynchronizedStatement() {
        synchronized (lock) {
            value++;
        }
    }

    /**
     * Lombok Annotation
     */
    @Synchronized
    public void getNextValueByLombokAnnotation() {
        value++;
    }

    /**
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Atomic access
     */
    public void increment() {
        count.incrementAndGet();
    }

    /**
     * @return count
     */
    public int getCount() {
        return count.get();
    }
}
