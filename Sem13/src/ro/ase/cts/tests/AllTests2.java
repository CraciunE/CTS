package ro.ase.cts.tests;
import ro.ase.cts.categorie.teste.*;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ TesteGrupa.class, TestGrupa.class })
@Categories.IncludeCategory(TesteGetPromovabilitate.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class AllTests2 {

}
