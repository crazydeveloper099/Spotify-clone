package com.anubhav.audiostreamer.ui;

import android.support.v4.media.MediaMetadataCompat;

import com.anubhav.audiostreamer.MyApplication;
import com.anubhav.audiostreamer.models.Artist;
import com.anubhav.audiostreamer.util.MyPreferenceManager;

public interface IMainActivity {

    void hideProgressBar();

    void showPrgressBar();

    void onCategorySelected(String category);

    void onArtistSelected(String category, Artist artist);

    void setActionBarTitle(String title);

    void playPause();

    MyApplication getMyApplicationInstance();

    void onMediaSelected(String playlistId, MediaMetadataCompat mediaItem, int position);

    MyPreferenceManager getMyPreferenceManager();
}
