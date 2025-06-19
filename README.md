# 🎵 Music Manager App

An Android app built with Kotlin that lets users manage a playlist of songs by:

- ✅ Adding song details
- ✅ Giving a rating (1–5 stars)
- ✅ Leaving comments
- ✅ Viewing the full playlist
- ✅ Calculating the average song rating

---

## 📱 Screenshots

<!-- Add screenshots here if you'd like -->
![Main Screen](screenshots/main_screen.png)

---

## 🚀 Features

- Add up to 4 preloaded songs with real artist data
- Users can add their own songs, ratings, and comments
- View all added songs in a scrollable list
- Displays the average rating of all songs
- Simple and clean UI

---

## 🛠 Tech Stack

- *Kotlin*
- *Android SDK*
- *Jetpack*
- *Material Design*
- *GitHub Actions* (CI/CD build workflow)

---

## 📦 Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/MusicManagerApp.git
   cd MusicManagerApp



   📁 Project Structure

📂 MyMusicManagerApp
 ┣ 📁 java/com.vc.mypacapp
 ┃ ┣ 📄 MainActivity.kt
 ┃ ┣ 📄 AddSongActivity.kt
 ┃ ┣ 📄 ViewPlaylistActivity.kt
 ┃ ┗ 📄 Song.kt
 ┣ 📁 res/layout/
 ┃ ┣ 📄 activity_main.xml
 ┃ ┣ 📄 activity_add_song.xml
 ┃ ┗ 📄 activity_view_playlist.xml
 ┗ 📄 AndroidManifest.xml


---

⚙ GitHub Actions (CI)

This project uses GitHub Actions to automatically:

Build the app on every push

Run unit tests


📂 .github/workflows/android.yml
