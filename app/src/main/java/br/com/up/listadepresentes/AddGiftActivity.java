package br.com.up.listadepresentes;

import androidx.appcompat.app.AppCompatActivity;
import br.com.up.listadepresentes.models.Gift;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import br.com.up.listadepresentes.models.Gift;

public class AddGiftActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutName;
    private TextInputLayout inputLayoutGift;
    private TextInputLayout inputLayoutDescription;

    private TextInputEditText inputEditTextName;
    private TextInputEditText inputEditTextGift;
    private TextInputEditText inputEditTextDescription;

    private Button buttonAddGift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_gift);

        inputLayoutName = findViewById(R.id.input_layout_name);
        inputLayoutGift = findViewById(R.id.input_layout_gift);
        inputLayoutDescription = findViewById(R.id.input_layout_description);

        inputEditTextName = findViewById(R.id.input_text_name);
        inputEditTextGift = findViewById(R.id.input_text_grif);
        inputEditTextDescription = findViewById(R.id.input_text_description);

        buttonAddGift = findViewById(R.id.button_add_gift);

        buttonAddGift.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               saveGift();
           }
        });

    }

    public void saveGift() {

        String name = inputEditTextName.getText().toString();
        String giftName = inputEditTextGift.getText().toString();
        String description = inputEditTextDescription.getText().toString();

        if(name.isEmpty()) {
            inputLayoutName.setError("Favor inserir o nome");
        }

        if(giftName.isEmpty()) {
            inputLayoutGift.setError("Favor inserir a Presente");
        }

        Gift gift = new Gift(
                name, giftName, description
        );
    }

}