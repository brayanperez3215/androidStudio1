package darkdesigner.proyectofinal;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Project extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projecto);
    }

    Button button = (Button) findViewById(R.id.button) ;

    button.setOnClickLiatener(this)



    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        TextView lblMensaje = (TextView) findViewById(R.id.lblMensaje);

        lblMensaje.setText("Viva La Vida");

    }
}
