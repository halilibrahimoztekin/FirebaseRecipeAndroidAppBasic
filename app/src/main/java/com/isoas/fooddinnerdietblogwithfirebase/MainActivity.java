package com.isoas.fooddinnerdietblogwithfirebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.isoas.fooddinnerdietblogwithfirebase.adapters.FireBAdapter;
import com.isoas.fooddinnerdietblogwithfirebase.models.RecipeModals;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FireBAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FirebaseRecyclerOptions<RecipeModals> options=
                new FirebaseRecyclerOptions.Builder<RecipeModals>()
                        .setQuery(FirebaseDatabase.getInstance().getReference(),RecipeModals.class)
                        .build();
        adapter= new FireBAdapter(options);
        recyclerView.setAdapter(adapter);







    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}