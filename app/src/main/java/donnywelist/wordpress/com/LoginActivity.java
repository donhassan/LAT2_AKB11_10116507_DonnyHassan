package donnywelist.wordpress.com;
/*
  Nama    : Donny Hassan Hasibuan
  Nim     : 10116507
  Kelas   : IF 11 / AKB 11
  Tanggal : 18 April 2019
*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void OnClick(View view) {
        Intent i = null;
        switch (view.getId()) {
            case R.id.btn_Register:
                i = new Intent(this, RegisterActivity.class);
                break;
        }
        if (null != i) startActivity(i);
    }
}
