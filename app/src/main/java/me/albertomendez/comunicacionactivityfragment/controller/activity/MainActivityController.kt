package me.albertomendez.comunicacionactivityfragment.controller.activity

import android.content.Context
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.View
import android.widget.EditText
import me.albertomendez.comunicacionactivityfragment.MainFragment
import me.albertomendez.comunicacionactivityfragment.R
import me.albertomendez.comunicacionactivityfragment.R.id.*
import me.albertomendez.comunicacionactivityfragment.controller.fragment.MainFragmentController
import me.albertomendez.comunicacionactivityfragment.util.Aleatorio
import java.util.*

/**
 * Created by alberto on 25/11/17.
 */
class MainActivityController {
    companion object {
        fun addFragment(supportFragmentManager: FragmentManager, contenedor: View, fragment: Fragment) {
            supportFragmentManager.beginTransaction().add(contenedor.id, fragment).commit()
        }

        fun actualizarNumeroAleatorio(fragment: MainFragment, etMin: EditText, etMax: EditText) {
            val min = comprobarNumeroEntrada(etMin)
            val max = comprobarNumeroEntrada(etMax)
            if (min < max) {
                fragment.actualizarNumero(min, max)
            } else {
                throw Exception()
            }
        }

        fun comprobarNumeroEntrada(et: EditText): Int {
            return if (et.text.toString().isNullOrEmpty()) 0 else et.text.toString().toInt()
        }
    }
}