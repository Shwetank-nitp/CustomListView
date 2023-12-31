package shrai.ee.customlistview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(private val con:Activity, private val userData:ArrayList<Books>)
    : ArrayAdapter<Books>(con,R.layout.list_view,userData){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view : View = LayoutInflater.from(con).inflate(R.layout.list_view,null)
        val price = view.findViewById<TextView>(R.id.price)
        val name = view.findViewById<TextView>(R.id.bookName)
        val aName = view.findViewById<TextView>(R.id.authorName)
        val imgId = view.findViewById<ImageView>(R.id.image)

        price.text = userData[position].price.toString()
        name.text = userData[position].name
        aName.text = userData[position].aName
        imgId.setImageResource(userData[position].imageId)
        return view
    }
}