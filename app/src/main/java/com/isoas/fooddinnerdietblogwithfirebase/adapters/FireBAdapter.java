package com.isoas.fooddinnerdietblogwithfirebase.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.isoas.fooddinnerdietblogwithfirebase.R;
import com.isoas.fooddinnerdietblogwithfirebase.models.RecipeModals;

public class FireBAdapter extends FirebaseRecyclerAdapter <RecipeModals,FireBAdapter.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public FireBAdapter(@NonNull FirebaseRecyclerOptions<RecipeModals> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull RecipeModals model) {
        holder.nText.setText(model.getName());
        Glide.with(holder.img.getContext()).load(model.getImageURL()).into(holder.img);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_des,parent,false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        TextView nText;
        ImageView img;

        public myViewHolder(@NonNull View itemView) {

            super(itemView);
            nText=itemView.findViewById(R.id.nText);
            img=(ImageView) itemView.findViewById(R.id.image_1);

        }
    }
}
