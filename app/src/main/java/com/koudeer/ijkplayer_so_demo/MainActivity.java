package com.koudeer.ijkplayer_so_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.koudeer.ijkplayer_so_demo.view.media.IRenderView;
import com.koudeer.ijkplayer_so_demo.view.media.IjkVideoView;

public class MainActivity extends AppCompatActivity {

    private IjkVideoView mView;

    private String url =
            "https://vd2.bdstatic.com/mda-igwdmz0nv8ah95xv/mda-igwdmz0nv8ah95xv.mp4?playlist=%5B%22hd%22%2C%22sc%22%5D&auth_key=1567068990-0-0-003a15194906c2b947cf493eec963a7f&bcevod_channel=searchbox_feed&pd=bjh";
    private String rtmp = "rtmp://58.200.131.2:1935/livetv/hunantv";

    private String rtsp = "rtsp://wowzaec2demo.streamlock.net/vod/mp4:BigBuckBunny_115k.mov";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mView = findViewById(R.id.ijk_video);

        mView.setVideoURI(Uri.parse(rtsp));

        mView.start();
    }

    @Override
    protected void onPause() {
        if (mView.isPlaying()){
            mView.pause();
        }
        super.onPause();
    }

    @Override
    protected void onResume() {
        if (mView.canPause()){
            mView.resume();
        }
        super.onResume();
    }
}