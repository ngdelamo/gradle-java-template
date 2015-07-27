package library;

import org.junit.Before;
import org.junit.Test;

import library.di.TestComponent;
import library.di.DaggerTestComponent;

import static org.junit.Assert.assertTrue;

public class LibraryTest {
    TestComponent testComponent = null;

    @Before
    public void setUp() {
        this.testComponent = DaggerTestComponent.create();
    }

    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = this.testComponent.library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
