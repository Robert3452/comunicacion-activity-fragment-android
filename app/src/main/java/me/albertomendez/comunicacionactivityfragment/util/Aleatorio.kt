package me.albertomendez.comunicacionactivityfragment.util

import java.util.*

/**
 * Created by alberto on 25/11/17.
 */
class Aleatorio {
    companion object {
        fun generar(min: Int, max: Int): Int =  Random().nextInt((max - min + 1)) + min
    }
}