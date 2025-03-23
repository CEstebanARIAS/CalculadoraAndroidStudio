package jdc.esteban.calcula;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private TextView txtResultado;
    private ImageButton btnSumar, btnRestar, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        btnSumar=findViewById(R.id.btnSumar);
        btnRestar=findViewById(R.id.btnRestar);
        btnMultiplicar=findViewById(R.id.btnMultiplicar);
        btnDividir=findViewById(R.id.btnDividir);
        txtResultado=findViewById(R.id.txtResultado);


        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingrese ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }
                txtResultado.setText(String.valueOf(sumar(
                        Integer.parseInt(num1.getText().toString()),
                        Integer.parseInt(num2.getText().toString())
                )));
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingrese ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }
                txtResultado.setText(String.valueOf(restar(
                        Integer.parseInt(num1.getText().toString()),
                        Integer.parseInt(num2.getText().toString())
                )));
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingrese ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }
                txtResultado.setText(String.valueOf(multiplicar(
                        Integer.parseInt(num1.getText().toString()),
                        Integer.parseInt(num2.getText().toString())
                )));
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingrese ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }
                txtResultado.setText(String.valueOf(dividir(
                        Integer.parseInt(num1.getText().toString()),
                        Integer.parseInt(num2.getText().toString())
                )));
            }
        });





    }


    public int sumar(int num1, int num2){
        return num1+num2;
    }

    public int restar(int num1, int num2){
        return num1-num2;
    }

    public int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public int dividir(int num1, int num2){
        int resultado=0;
        try {
            if(num2!=0){
                resultado=num1/num2;
            }
            return resultado;
        }catch (Exception e){
            Toast.makeText(this, "Error en la división", Toast.LENGTH_LONG).show();
            return 0;
        }
    }
}