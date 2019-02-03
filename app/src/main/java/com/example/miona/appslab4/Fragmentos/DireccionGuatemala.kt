/*
* Maria Isabel Ortiz Naranjo
* Clase: Direccion, donde sale la ubicacion actual
* En mi caso, lo puse hacia mi colonia
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
 * [DireccionGuatemala.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [DireccionGuatemala.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class DireccionGuatemala : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_direccion_guatemala, container, false)
        }
    }

