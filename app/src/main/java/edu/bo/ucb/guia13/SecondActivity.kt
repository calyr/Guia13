package edu.bo.ucb.guia13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

class SecondActivity : AppCompatActivity() {
    private val myImageView: ImageView get() = findViewById(R.id.my_image_view)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(this, session.user.nombre, Toast.LENGTH_SHORT).show()

        val picasso = Picasso.get()
        picasso.load(
            "https://i.pinimg.com/564x/a8/6e/26/a86e26dffbcd0f8ffd0b7a6a4809ec68.jpg")
            .into(myImageView)

    }
}