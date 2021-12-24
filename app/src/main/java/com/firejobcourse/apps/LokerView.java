package com.firejobcourse.apps;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Avin on 08/08/2018.
 */

public class LokerView extends RecyclerView.ViewHolder {

    public TextView tvpekerjaan;
    public TextView tvperusahaan;
    public TextView tvalamat;
    public Button btnOpen;

    public LokerView(View itemView) {
        super(itemView);
        tvpekerjaan = itemView.findViewById(R.id.pekerjaan);
        tvperusahaan = itemView.findViewById(R.id.perusahaan);
        tvalamat = itemView.findViewById(R.id.alamat);
        btnOpen = itemView.findViewById(R.id.btn_web);
    }

    public void bindToPerusahaan(Loker loker, View.OnClickListener onClickListener){
        tvpekerjaan.setText(loker.pekerjaan);
        tvperusahaan.setText(loker.perusahaan);
        tvalamat .setText(loker.alamat);
        btnOpen.setOnClickListener(onClickListener);
    }
}