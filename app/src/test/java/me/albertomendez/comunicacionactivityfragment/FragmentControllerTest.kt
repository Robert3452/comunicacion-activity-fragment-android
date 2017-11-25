package me.albertomendez.comunicacionactivityfragment

import junit.framework.Assert
import me.albertomendez.comunicacionactivityfragment.controller.fragment.MainFragmentController
import me.albertomendez.comunicacionactivityfragment.util.Aleatorio
import org.junit.Test

/**
 * Created by alberto on 25/11/17.
 */
class FragmentControllerTest {
    @Test
    fun testGetRandomNumber() {
        val numeroAleatorio = Aleatorio.generar(1, 100)
        Assert.assertTrue("El número aleatorio está entre 1 y 100", numeroAleatorio in 1..100)
    }
}