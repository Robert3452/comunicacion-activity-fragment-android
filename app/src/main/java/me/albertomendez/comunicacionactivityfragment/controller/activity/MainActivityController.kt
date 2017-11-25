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

        fun clickBoton(contexto: Context, vista: View, contenedorVista: View? = null) {
        }

        fun actualizarNumeroAleatorio(fragment: MainFragment) {
            val etNumeroMin = etMin as EditText
            val etNumeroMax = etMax as EditText
            fragment.actualizarNumero(etNumeroMin.text.toString().toInt(), etNumeroMax.toString().toInt())
        }
    }
}