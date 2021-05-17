package com.example.musicshop;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void increaseQuantity(View view) {
        quantity = quantity + 1;
        TextView increaseQty = findViewById(R.id.quantityTextView);
        increaseQty.setText("" + quantity);
    }

    public void decreaseQuantity(View view) {
        quantity = quantity - 1;
        TextView increaseQty = findViewById(R.id.quantityTextView);
        increaseQty.setText("" + quantity);
    }
}
