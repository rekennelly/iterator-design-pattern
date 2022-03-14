package com.mycompany.iterator;

/**
 *
 * @author kennelra
 */
public interface IteratorPattern {
    public boolean hasNext();
    public Object next();
    public Object first();
    public Object CurrentItem();
    public boolean isDone();
}
