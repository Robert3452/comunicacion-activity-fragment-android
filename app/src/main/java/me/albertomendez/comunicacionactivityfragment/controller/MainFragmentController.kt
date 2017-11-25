package me.albertomendez.comunicacionactivityfragment.controller

import java.util.*

/**
 * Created by alberto on 25/11/17.
 */

class MainFragmentController {
    companion object {
        fun getNumeroAleatorio(min: Int, max: Int): Double = min + (max - min) * Random().nextDouble()
    }
}