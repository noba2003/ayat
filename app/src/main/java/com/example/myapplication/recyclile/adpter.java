package com.example.myapplication.recyclile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Ayahs;
import com.example.myapplication.model.Root;
import com.example.myapplication.model.Surahs;

import java.util.List;

public class adpter extends RecyclerView.Adapter<adpter.holder> {
    List <Ayahs> roots;

    public adpter(List<Ayahs> roots) {
        this.roots = roots;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.ayat,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
holder.ayaa.setText(roots.get(position).getText());
   holder.sourah.setText(roots.get(position).getNumberInSurah()+"");

    }

    @Override
    public int getItemCount() {
        return roots.size();
    }

    public class holder extends RecyclerView.ViewHolder {
        TextView ayaa,sourah;

        public holder(@NonNull View itemView) {
            super(itemView);
            ayaa=itemView.findViewById(R.id.ayah);
            sourah=itemView.findViewById(R.id.sourah);
        }
    }
}
