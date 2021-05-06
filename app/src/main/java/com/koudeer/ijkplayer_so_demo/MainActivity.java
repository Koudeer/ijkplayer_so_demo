package com.koudeer.ijkplayer_so_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.koudeer.ijkplayer_so_demo.view.media.IRenderView;
import com.koudeer.ijkplayer_so_demo.view.media.IjkVideoView;

public class MainActivity extends AppCompatActivity {

    private IjkVideoView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mView = findViewById(R.id.ijk_video);

        mView.setVideoURI(Uri.parse("https://jzvd.nathen.cn/video/cfe6c30-1767b1bc21f-0007-1823-c86-de200.mp4"));

        mView.start();
    }
}