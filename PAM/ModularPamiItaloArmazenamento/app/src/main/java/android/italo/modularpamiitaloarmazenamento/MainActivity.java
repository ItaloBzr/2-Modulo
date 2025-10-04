package android.italo.modularpamiitaloarmazenamento;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String PREFS_NAME = "user_prefs";

    //chaves que serão utilizadas
    private static final String KEY_NOME = "nome";
    private static final String KEY_IDADE = "idade";
    private static final String KEY_CONTADOR = "contador";

    //Variaveis
    private SharedPreferences sharedPreferences;
    private EditText nomeEditText;
    private EditText idadeEditText;
    private TextView displayTextView;
    private Button btnSalvar;
    private Button btnCarregar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //iniciar a variavel do chave-valor
        sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        //linkar as variveis do java com a do form
        nomeEditText = findViewById(R.id.edt_nome);
        idadeEditText = findViewById(R.id.edt_nome);
        displayTextView = findViewById(R.id.display_textView);
        btnSalvar = findViewById(R.id.btn_salvar);
        btnCarregar = findViewById(R.id.btn_carregar);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}