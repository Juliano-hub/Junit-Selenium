package TesteDiv;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesteDiv {

    @Test
    public void Testar(){
        MainDiv instanciaDoMainDiv = new MainDiv();
        //assertEquals(4, instanciaDoMainDiv.FazerDivisao(4, 2) );
        // reprova no teste
        assertEquals(2, instanciaDoMainDiv.FazerDivisao(4, 2) );
        // aprova no teste
    }

    @BeforeAll
    public static void instanciarMainDiv(){
        MainDiv instanciaDoMainDiv = new MainDiv();
    }

}
