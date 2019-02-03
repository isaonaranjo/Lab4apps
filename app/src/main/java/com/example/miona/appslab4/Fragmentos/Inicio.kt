/*
* Maria Isabel Ortiz Naranjo
* Clase: Inicio, donde sale mi foto y mi nombre
* */

package com.example.miona.appslab4.Fragmentos


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.miona.appslab4.R

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_NUM1 = "num1"
private const val ARG_NUM2 = "num2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [Inicio.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [Inicio.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class Inicio : Fragment() {

    // Inicio, donde sale la foto de perfil y el nombre
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }
}
