/*
* Maria Isabel Ortiz Naranjo
* Clase: Proyectos, donde salen los links de los repositorios
* */


package com.example.miona.appslab4.Fragmentos

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.miona.appslab4.*

import kotlinx.android.synthetic.main.fragment_proyectos.*


// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_NUM1 = "num1"
private const val ARG_NUM2 = "num2"


/**
 * A simple [Fragment] subclass.
 *
 */
class proyectos : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_proyectos, container, false)
        return  view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Se crea cada uno de los proyectos
        val proyect1 = Proyectos(
            // Nombre del proyecto
            "Aplicacion del Restaurante",
            // Link del proyectos
            "https://github.com/isaonaranjo/Miaplicacion-Laboratorio2"
        )

        val proyect2 = Proyectos(
            // Nombre del proyecto
            "Aplicacion Contactos",
            // Link del proyectos
            "https://github.com/isaonaranjo/Contactos"
        )
        // Se agregan al proyecto
        val list: ArrayList<Proyectos> =  ArrayList()
        list.add(proyect1)
        list.add(proyect2)

        repository_list.adapter = AdaptadorProyecto(context!!,list)

        repository_list.setOnItemClickListener { parent, view, position, id ->
            // ViewWeb -- Se abre
            val prueba = Intent(context!!, web_view::class.java)
            // Link del repositorio
            prueba.putExtra("link",list[position].link)
            startActivity(prueba)
        }

    }

}
