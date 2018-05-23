

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AlumnoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AlumnoTest
{
    private Alumno Fernando;
    private Alumno Roberto;
    private Alumno Fernando2;

    /**
     * Default constructor for test class AlumnoTest
     */
    public AlumnoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        Fernando = new Alumno("Fernando", "Garcia");
        Roberto = new Alumno("Roberto", "Perez");
        Fernando2 = new Alumno("Fernando", "Garcia");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
