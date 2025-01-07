package com.example.quotationapp;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Quote> quotes = loadQuotes();
        QuoteAdapter adapter = new QuoteAdapter(quotes);
        recyclerView.setAdapter(adapter);
    }

    private List<Quote> loadQuotes() {
        List<Quote> quotes = new ArrayList<>();
        try (InputStream stream = getAssets().open("quotations.txt")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Usuń białe znaki na początku i końcu linii
                if (line.isEmpty()) {
                    continue; // Pomiń puste linie
                }

                String quote = line; // Pierwsza linia - cytat
                String author = reader.readLine(); // Druga linia - autor

                if (author != null) {
                    author = author.trim(); // Usuń białe znaki
                    quotes.add(new Quote(quote, author));
                }
            }
        } catch (IOException e) {
            Log.e("file", e.toString());
        }
        return quotes;
    }
}
