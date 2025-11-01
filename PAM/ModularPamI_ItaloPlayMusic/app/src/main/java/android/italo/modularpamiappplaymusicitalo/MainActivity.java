package android.italo.modularpamiappplaymusicitalo;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView play,pause,stop;
    MediaPlayer player = MediaPlayer.create(this, R.raw.nothing);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initComponents();
        player = MediaPlayer.create(this, R.raw.nothing);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player != null){
                    player.start();
                }
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.isPlaying()){
                    player.pause();
                }
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.isPlaying()){
                    player.stop();
                    player = MediaPlayer.create(getApplicationContext(), R.raw.nothing);
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    @Override
    public void onStop(){
        super.onStop();
        if (player.isPlaying()){
            player.pause();
        }
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        player.stop();
        player.release();
    }

    private void initComponents() {
        play = findViewById(R.id.btn_play);
        pause = findViewById(R.id.btn_pause);
        stop = findViewById(R.id.btn_stop);

    }
}