package repository;

import org.hibernate.Session;
import org.junit.*;
import su.kww.realttranslator.core.api.inside.database.entities.Advert;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositoryAdverts;
import su.kww.realttranslator.core.api.inside.utils.HibernateUtil;

public class TestRepositoryAdvert {
    private String user = "";
    private String pass = "";
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
//        requestAllJson = new Calculator();
    }

    @After
    public void afterTest() {

    }


    @Test
    public void testGetResultFromAllJsonService(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Advert advert = RepositoryAdverts.getById(3,420000194L);
        System.out.println(advert);
//        em.find()
    }
}
