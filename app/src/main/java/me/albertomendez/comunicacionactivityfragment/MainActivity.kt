package me.albertomendez.comunicacionactivityfragment

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import me.albertomendez.comunicacionactivityfragment.controller.activity.MainActivityController

class MainActivity : AppCompatActivity(), View.OnClickListener, MainFragment.OnNumeroAleatorio {

    val mainFrag: MainFragment = MainFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        MainActivityController.addFragment(supportFragmentManager, contenedorFragment, mainFrag)

        fab.setOnClickListener { view ->
            MainActivityController.actualizarNumeroAleatorio(mainFrag, etMin.text.toString().toInt(), etMax.text.toString().toInt())
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onClick(view: View) {
        MainActivityController.clickBoton(this, view)
    }

    override fun actualizado(numero: Int) {
        Snackbar.make(fab, "$numero", Snackbar.LENGTH_LONG).show()
    }
}
