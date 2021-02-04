package zzzzaphod.example.keingeschenk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import zzzzaphod.example.keingeschenk.data.Frage;
import zzzzaphod.example.keingeschenk.data.Fragenreihe;

public class MainActivity extends AppCompatActivity {
    AppCompatButton buttonLeft;
    AppCompatButton buttonRight;
    AppCompatButton buttonBottom;

    TextView textViewFrage;

    View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewFrage = findViewById(R.id.textViewFrage);
        buttonLeft = findViewById(R.id.buttonLeft);
        buttonRight = findViewById(R.id.buttonRight);
        buttonBottom = findViewById(R.id.buttonBottom);

        Fragenreihe fragenreihe = new Fragenreihe();


        Frage frage1 = new Frage("Cowboy oder Indianer?", "Cowboy", "Indianer", "Kann mich nicht entscheiden");
        Frage frage2 = new Frage("Zelten oder Luxushotel?", "Zelten", "Luxushotel", "Kann mich nicht entscheiden");
        frage1.setNextFrage(frage2);

        fragenreihe.addFrage(frage1);
        fragenreihe.addFrage(frage2);

        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFrage(fragenreihe.getNextFrage());
            }
        };

        fragenreihe.setAktuelleFrage(frage1);
        setFrage(fragenreihe.getAktuelleFrage());

        buttonLeft.setOnClickListener(onClickListener);
        buttonRight.setOnClickListener(onClickListener);
        buttonBottom.setOnClickListener(onClickListener);


    }

    void setFrage(Frage frage) {
        if (frage == null) {
            buttonLeft.setVisibility(View.INVISIBLE);
            buttonRight.setVisibility(View.INVISIBLE);
            buttonBottom.setText("Weiter");

            textViewFrage.setText("Wie wäre es mit einem Strauß Blumen...");
        } else {
            buttonLeft.setText(frage.getAntwortLeft());
            buttonRight.setText(frage.getAntwortRight());
            buttonBottom.setText(frage.getAntwortBottom());

            textViewFrage.setText(frage.getFrage());
        }
    }
}