package patterns.behavioralpatterns.iteratorpattern.container;

import patterns.behavioralpatterns.iteratorpattern.Container;
import patterns.behavioralpatterns.iteratorpattern.Iterator;

public class NameRepository implements Container {
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
