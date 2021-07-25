package activity.project.veviuasqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import activity.project.veviuasqr.R;

public class getStarted extends AppCompatActivity {

    Button start, sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        start = findViewById(R.id.btnstart);
        sign = findViewById(R.id.btnsign);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getStarted.this, activity.project.veviuasqr.DaftarActivity.class);
                startActivity(intent);
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getStarted.this, activity.project.veviuasqr.LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
