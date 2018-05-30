package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    Integer numberOfCoffees = 0;
    String priceMessage="Free";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView priceTextView=(TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(numberOfCoffees*5));
    }

    public void submitOrder(View view) {
        priceMessage="Free";
        if(numberOfCoffees<=0)
        {
            priceMessage="Please enter correct quantity";
        }
        else
        {
            priceMessage="Total: "+NumberFormat.getCurrencyInstance().format(numberOfCoffees*5)+"\nThank You!";
        }
        displayMessage(priceMessage);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void increment(View view) {
        display(++numberOfCoffees);
    }

    public void decrement(View view) {
        display(--numberOfCoffees);
    }

    private void priceDisplay() {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(priceMessage);
    }

    private void displayMessage(String message)
    {
        TextView priceTextView=(TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
