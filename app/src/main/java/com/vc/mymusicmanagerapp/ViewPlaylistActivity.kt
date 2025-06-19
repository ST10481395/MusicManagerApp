package com.vc.mypacapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.musicmanagerapp.R

class AddSongActivity : AppCompatActivity() {
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

            val song = Song(title, artist, rating, comments, category)
            MainActivity.songList.add(song)
            Toast.makeText(this, "Song added", Toast.LENGTH_SHORT).show()
            finish() // Go back to main screen
           }
        }
}