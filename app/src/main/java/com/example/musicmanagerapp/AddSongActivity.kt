package com.example.musicmanagerapp  // ✅ adjust if your real package is different

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.musicplaylist.MainActivity
import com.example.musicplaylist.R
import com.example.musicplaylist.models.Song

class AddSongActivity : AppCompatActivity() {

    companion object {
        val songList = mutableListOf(
            Song("Blinding Lights", "The Weekend", 5, "Great beat!", "Pop"),
            Song("Bad Guy", "Billie Eilish", 4, "Unique style", "Alternative"),
            Song("Shape of You", "Ed Sheeran", 5, "Catchy", "Pop"),
            Song("Bohemian Rhapsody", "Queen", 5, "Classic masterpiece", "Rock")
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_song)

        val titleInput = findViewById<EditText>(R.id.etTitle)
        val artistInput = findViewById<EditText>(R.id.etArtist)
        val ratingInput = findViewById<EditText>(R.id.etRating)
        val commentsInput = findViewById<EditText>(R.id.etComments)
        val categoryInput = findViewById<EditText>(R.id.etCategory)

        findViewById<Button>(R.id.btnSubmit).setOnClickListener {
            val title = titleInput.text.toString()
            val artist = artistInput.text.toString()
            val comments = commentsInput.text.toString()
            val category = categoryInput.text.toString()
            val rating = ratingInput.text.toString().toIntOrNull()

            if (title.isBlank() || artist.isBlank() || comments.isBlank() || category.isBlank() || rating == null || rating !in 1..5) {
                Toast.makeText(this, "Please enter valid details. Rating must be 1 to 5.", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            songList.add(Song(title, artist, rating, comments, category))
            Toast.makeText(this, "Song added!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
