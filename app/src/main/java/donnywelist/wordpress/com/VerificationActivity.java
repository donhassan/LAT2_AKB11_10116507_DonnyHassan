package donnywelist.wordpress.com;
/*
  Nama    : Donny Hassan Hasibuan
  Nim     : 10116507
  Kelas   : IF 11 / AKB 11
  Tanggal : 18 April 2019
*/

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VerificationActivity extends AppCompatActivity {

    Button menujuhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        menujuhome = (Button) findViewById(R.id.btn_send);
        menujuhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VerificationActivity.this, UserHomeActivity.class);
                startActivity(i);
            }
        });
    }
}
