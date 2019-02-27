package android.edu.jugarconelactionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jugar(View view) {
        int id=view.getId();
        switch (id)
        {   case R.id.boton1:
                getSupportActionBar().setDisplayShowTitleEnabled(false);
                break;
            case R.id.boton2:
                getSupportActionBar().hide();
                break;
      }
    }
}
