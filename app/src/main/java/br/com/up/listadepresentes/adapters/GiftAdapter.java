package br.com.up.listadepresentes.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GiftAdapter extends RecyclerView.Adapter<GiftAdapter.GiftViewHolder>{

    @NonNull
    @Override
    public GiftViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull GiftViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class GiftViewHolder extends RecyclerView.ViewHolder{

        public GiftViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
