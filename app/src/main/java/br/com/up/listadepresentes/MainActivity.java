package br.com.up.listadepresentes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import br.com.up.listadepresentes.adapters.GiftAdapter;
import br.com.up.listadepresentes.models.Gift;
import br.com.up.listadepresentes.repositories.GiftRepository;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fabAddGift;
    private RecyclerView recyclerViewGifts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewGifts = findViewById(R.id.recycler_gifts);
        fabAddGift = findViewById(R.id.fab_add_gift);

        recyclerViewGifts.setAdapter(new GiftAdapter());

        fabAddGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(
                        getApplicationContext(), AddGiftActivity.class
                );
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onResume() {

        super.onResume();

        ArrayList<Gift> gifts = GiftRepository.getInstance().getAll();


    }
}