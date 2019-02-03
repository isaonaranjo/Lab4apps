/*
* Maria Isabel Ortiz Naranjo
* Clase: Adaptador del proyecto, para hacer funcionar cada uno de los links de los proyectos
* */


package com.example.miona.appslab4

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
// Constructor de la clase Adaptador
class AdaptadorProyecto (var context: Context, var list:ArrayList<Proyectos>): BaseAdapter() {

    private class ViewHolder(row: View?) {
       // Nombre y link de los proyectos de GitHub
        var name: TextView
        var link: TextView

        // Text Views
        init {
            this.name = row?.findViewById(R.id.name) as TextView
            this.link = row?.findViewById(R.id.link) as TextView
        }


    }
    // Metodo para obtener la vista. getView
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?
        val viewHolder: ViewHolder
        if (convertView==null){
            val layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.activity_lista,convertView,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }
        else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        val objeto:Proyectos = getItem(position) as Proyectos
        // Muestra en la lista
        viewHolder.name.text = objeto.name
        viewHolder.link.text = (objeto.link)

        return view as View
    }
    //Este metodo obtiene la posicion del elemento
    override fun getItem(position: Int): Any {
        return list.get(position)
    }


    //Con este metodo se puede ver el ID
    override fun getItemId(position: Int): Long {
        return position.toLong();
    }

    //Cantidad de objetos en la lista
    override fun getCount(): Int {
        return list.count()
    }
}