package com.example.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.musicmanagerapp.AddSongActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnAddSong).setOnClickListener {
            startActivity(Intent(this, AddSongActivity::class.java))
        }

        findViewById<Button>(R.id.btnViewPlaylist).setOnClickListener {
            startActivity(Intent(this, PlaylistActivity::class.java))
        }

        findViewById<Button>(R.id.btnExit).setOnClickListener {
            finishAffinity() // Closes the app
        }
    }
}
