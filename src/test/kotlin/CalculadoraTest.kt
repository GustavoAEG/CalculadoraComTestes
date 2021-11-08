import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    val soma = Soma()
    val subtr = Subtr()
    val mult = Mult()
    val div = Div()

    @Test
    fun soma() {


        assertEquals(10, soma.soma(5,5))
    }

    fun subtr(){

        assertEquals(5,subtr.subtr(10,5))

    }
    fun mult(){

        assertEquals(25, mult.mult(5,5))
    }
    fun div(){

        assertEquals(10, div.div(20,2))
    }

}