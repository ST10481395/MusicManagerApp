package com.example.musicplaylist

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.musicplaylist.models.Song

class AddSongActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_song)

        val titleInput = findViewById<EditText>(R.id.etTitle)
        val artistInput = findViewById<EditText>(R.id.etArtist)
        val categoryInput = findViewById<EditText>(R.id.etCategory)
        val commentsInput = findViewById<EditText>(R.id.etComments)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val title = titleInput.text.toString()
            val artist = artistInput.text.toString()
            val category = categoryInput.text.toString()
            val comments = commentsInput.text.toString()
            val rating = ratingBar.rating.toInt()

            if (title.isEmpty() || artist.isEmpty()) {
                Toast.makeText(this, "Please enter title and artist", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Song(title, artist, rating, comments, category)
            add()
            Toast.makeText(this, "Song added", Toast.LENGTH_SHORT).show()
            finish() // Go back to main screen
           }
        }
}

private fun add() {

}

