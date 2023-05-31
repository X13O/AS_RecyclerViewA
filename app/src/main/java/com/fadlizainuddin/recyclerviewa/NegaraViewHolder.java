package com.fadlizainuddin.recyclerviewa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NegaraViewHolder extends RecyclerView.ViewHolder {
    public ImageView _imageView;
    public TextView _namatextView;
    public TextView _deskripsiTextView;

    public NegaraViewHolder(@NonNull View itemView) {
        super(itemView);

        _imageView = itemView.findViewById(R.id.imageView1);
        _namatextView = itemView.findViewById(R.id.textView_nama);
        _deskripsiTextView = itemView.findViewById(R.id.textView_deskripsi);
    }
}
