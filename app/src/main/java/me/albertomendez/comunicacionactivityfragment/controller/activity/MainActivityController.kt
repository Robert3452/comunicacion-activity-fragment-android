package me.albertomendez.comunicacionactivityfragment.controller.activity

import android.content.Context
import android.support.design.widget.Snackbar
import android.support.v4.app.FragmentManager
import android.view.View
import me.albertomendez.comunicacionactivityfragment.MainFragment
import me.albertomendez.comunicacionactivityfragment.R
import me.albertomendez.comunicacionactivityfragment.R.id.fab

/**
 * Created by alberto on 25/11/17.
 */
class MainActivityController {
    companion object {
        fun addFragment(supportFragmentManager: FragmentManager, contenedor: View) {
            supportFragmentManager.beginTransaction().add(contenedor.id, MainFragment()).commit()
        }

        fun clickBoton(contexto: Context, vista: View, contenedorVista: View? = null) {
            when (vista.id) {
                fab -> Snackbar.make(contenedorVista!!, contexto.getString(R.string.numero_aleatorio_actualizado), Snackbar.LENGTH_SHORT).show()
            }
        }

        fun clickSnackBar(contexto: Context, vista: View, contenedorVista: View) {
            clickBoton(contexto, vista, contenedorVista)
        }
    }
}