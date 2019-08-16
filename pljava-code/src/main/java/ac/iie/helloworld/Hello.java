package ac.iie.helloworld;

import org.postgresql.pljava.annotation.Function;

import static org.postgresql.pljava.annotation.Function.Effects.IMMUTABLE;
import static org.postgresql.pljava.annotation.Function.OnNullInput.RETURNS_NULL;

public class Hello {

    @Function(onNullInput=RETURNS_NULL, effects=IMMUTABLE)
    public static String hello(String toWhom) {
        return "Hello, " + toWhom + "!";
    }

}
