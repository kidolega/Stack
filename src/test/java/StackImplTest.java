import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackImplTest {

    @Test
    void shouldReturnTwo() {
        //GIVEN
        StackImpl stack = new StackImpl();

        //WHEN
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(1);
        stack.push(5);

        stack.pop();
        stack.pop();
        stack.pop();

        //THEN
        assertEquals(2, stack.peekMin());
        assertEquals(5, stack.pop());
    }

    @Test
    void shouldReturnOne() {
        //GIVEN
        StackImpl stack = new StackImpl();

        //WHEN
        stack.push(1);

        //THEN
        assertEquals(1, stack.peekMin());
    }

    @Test
    void shouldThrowEmptyStackException() {
        //GIVEN
        StackImpl stack = new StackImpl();

        //THEN
        assertThrows(EmptyStackException.class, stack::peekMin);
    }

    @Test
    void peekShouldNotRemoveElement() {
        //GIVEN
        StackImpl stack = new StackImpl();

        //WHEN
        stack.push(1);

        //THEN
        assertEquals(1, stack.peekMin());
        assertEquals(1, stack.peekMin());
    }

}