package com.example.quotationapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder> {

    private List<Quote> quotes;

    public QuoteAdapter(List<Quote> quotes) {
        this.quotes = quotes;
    }

    @NonNull
    @Override
    public QuoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_quote, parent, false);
        return new QuoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteViewHolder holder, int position) {
        Quote quote = quotes.get(position);
        holder.quoteText.setText(quote.getText()); // Cytat
        holder.quoteAuthor.setText(quote.getAuthor()); // Autor
    }

    @Override
    public int getItemCount() {
        return quotes.size();
    }

    static class QuoteViewHolder extends RecyclerView.ViewHolder {
        TextView quoteText, quoteAuthor;

        public QuoteViewHolder(@NonNull View itemView) {
            super(itemView);
            quoteText = itemView.findViewById(R.id.quote_text);
            quoteAuthor = itemView.findViewById(R.id.quote_author);
        }
    }
}
