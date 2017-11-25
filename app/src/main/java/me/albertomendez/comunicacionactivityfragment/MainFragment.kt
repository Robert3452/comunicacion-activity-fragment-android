package me.albertomendez.comunicacionactivityfragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*
import me.albertomendez.comunicacionactivityfragment.util.Aleatorio


/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    var onNumeroAleatorio: OnNumeroAleatorio? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_main, container, false)
    }

    interface OnNumeroAleatorio {
        fun actualizado(numero: Double)
    }

    fun actualizarNumero(min: Int, max: Int) {
        val numeroAleatorio: Double = Aleatorio.generar(min, max)
        tvNumeroAleatorio.text = "$numeroAleatorio"
        onNumeroAleatorio?.actualizado(numeroAleatorio)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnNumeroAleatorio) {
            onNumeroAleatorio = context
        } else {
            throw RuntimeException(context!!.toString() + " debe implementar OnNumeroAleatorio")
        }
    }

    override fun onDetach() {
        super.onDetach()
        onNumeroAleatorio = null
    }
}
