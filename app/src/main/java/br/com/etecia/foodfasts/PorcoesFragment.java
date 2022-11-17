package br.com.etecia.foodfasts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class PorcoesFragment extends Fragment {
    EditText edtPorcoes;
    Button btnEscolha;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_porcoes_layout, container, false);
        edtPorcoes = view.findViewById(R.id.edtPorcoes);
        btnEscolha = view.findViewById(R.id.btnEscolha);

        btnEscolha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return view;
    }
}