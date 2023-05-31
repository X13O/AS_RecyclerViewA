package com.fadlizainuddin.recyclerviewa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NegaraAdapter extends RecyclerView.Adapter<NegaraViewHolder> {
    private Context _context;
    private List<NegaraModel> _negaraModelList;

    public NegaraAdapter(Context namaVariabel_context, List<NegaraModel> namaVariabel_listNegaraModel) {
        this._context = namaVariabel_context;
        this._negaraModelList = namaVariabel_listNegaraModel;
    }

    @NonNull
    @Override
    public NegaraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater namaVariabel_inflater = LayoutInflater.from(parent.getContext());
        View namaVariabel_view = namaVariabel_inflater.inflate(R.layout.layout_negara, parent, false);
        return new NegaraViewHolder(namaVariabel_view);
    }

    @Override
    public void onBindViewHolder(@NonNull NegaraViewHolder holder, int position) {
        NegaraModel namaVariabel_negaraModel = _negaraModelList.get(position);
        Picasso.with(_context).load(namaVariabel_negaraModel.getUrl()).into(holder._imageView);
        holder._namatextView.setText(namaVariabel_negaraModel.getNama());
        holder._deskripsiTextView.setText(namaVariabel_negaraModel.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        int itemCount = 0;

        if (_negaraModelList != null) {
            itemCount = _negaraModelList.size();
        }
        return itemCount;
    }
}
