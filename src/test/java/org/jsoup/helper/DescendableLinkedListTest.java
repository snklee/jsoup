package org.jsoup.helper;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class DescendableLinkedListTest {

    @Test
    public void testPushPoll() {
        DescendableLinkedList dll = new DescendableLinkedList<String>();
        dll.push("fourth");
        dll.push("third");
        dll.push("second");
        dll.push("first");
        // first -> second -> third -> fourth
        assertEquals("fourth", dll.pollLast());
        assertEquals("third", dll.pollLast());
        assertEquals("second", dll.pollLast());
        assertEquals("first", dll.pollLast());
        assertEquals(null, dll.pollLast());
    }

    @Test
    public void testPeek() {
        DescendableLinkedList dll = new DescendableLinkedList<String>();
        dll.push("fourth");
        dll.push("third");
        dll.push("second");
        dll.push("first");
        // first -> second -> third -> fourth
        assertEquals("fourth", dll.peekLast());
        dll.pollLast();
        assertEquals("third", dll.peekLast());
        dll.pollLast();
        assertEquals("second", dll.peekLast());
        dll.pollLast();
        assertEquals("first", dll.peekLast());
        dll.pollLast();
        assertEquals(null, dll.peekLast());
    }

    @Test
    public void testIterator() {
        DescendableLinkedList dll = new DescendableLinkedList<String>();
        dll.push("fourth");
        dll.push("third");
        dll.push("second");
        dll.push("first");
        // first -> second -> third -> fourth
        Iterator<String> dllIterator = dll.descendingIterator();

        Stack stk = new Stack<String>();
        stk.push("first");
        stk.push("second");
        stk.push("third");
        stk.push("fourth");

        while (dllIterator.hasNext()){
            String s = dllIterator.next();
            assertEquals(stk.pop(), s);
            dllIterator.remove();
        }
        assertEquals(null, dll.peekLast());
    }
}
