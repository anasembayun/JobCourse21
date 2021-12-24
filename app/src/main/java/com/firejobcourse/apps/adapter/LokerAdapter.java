package com.firejobcourse.apps.adapter;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firejobcourse.apps.R;
import com.firejobcourse.apps.model.DataLoker;


public class LokerAdapter extends RecyclerView.ViewHolder {
    public TextView tvpekerjaan;
    public TextView tvperusahaan;
    public TextView tvalamat;
    public Button btnOpen;
    public LokerAdapter(@NonNull View itemView) {
        super(itemView);
        tvpekerjaan = itemView.findViewById(R.id.pekerjaan);
        tvperusahaan = itemView.findViewById(R.id.perusahaan);
        tvalamat = itemView.findViewById(R.id.alamat);
        btnOpen = itemView.findViewById(R.id.btn_web);
    }
    public void bindToPerusahaan(DataLoker loker, View.OnClickListener onClickListener){
        tvpekerjaan.setText(loker.pekerjaan);
        tvperusahaan.setText(loker.perusahaan);
        tvalamat.setText(loker.alamat);
        btnOpen.setOnClickListener(onClickListener);
    }
}
