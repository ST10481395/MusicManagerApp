package com.example.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.musicmanagerapp.AddSongActivity.Companion.songList

class PlaylistActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var avgRatingText: TextView
    private lateinit var btnCalcAvg: Button
    private lateinit var btnBackMain: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

        listView = findViewById(R.id.lvSongs)
        avgRatingText = findViewById(R.id.tvAverageRating)
        btnCalcAvg = findViewById(R.id.btnCalculateAverage)
        btnBackMain = findViewById(R.id.btnBack)

        val songAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
            songList.map {
                "🎵 ${it.title} by ${it.artist} (${it.category})\n⭐ ${it.rating} - ${it.comments}"
            }
        )
        listView.adapter = songAdapter

        btnCalcAvg.setOnClickListener {
            val avg = songList.map { it.rating }.average()
            avgRatingText.text = "Average Rating: %.2f".format(avg)
        }

        btnBackMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
