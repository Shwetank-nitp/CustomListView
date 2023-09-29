package shrai.ee.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PageDirect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_redirect)
        var image:ImageView = findViewById(R.id.imageBook)
        var aName:TextView = findViewById(R.id.aName)
        var bName:TextView = findViewById(R.id.bName)
        var price:TextView = findViewById(R.id.bprice)
        aName.text = intent.getStringExtra("aName")
        bName.text = intent.getStringExtra("bName")
        image.setImageResource(intent.getIntExtra("image",R.drawable.a))
        price.text = intent.getStringExtra("price")
    }
}