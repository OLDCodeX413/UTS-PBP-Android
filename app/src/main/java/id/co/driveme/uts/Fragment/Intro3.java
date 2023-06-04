package id.co.driveme.uts.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import id.co.driveme.uts.R;
import id.co.driveme.uts.SplashActivity;

public class Intro3 extends Fragment {
    Button btnKS;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro3,container,false);

        btnKS = view.findViewById(R.id.btnKeSplash);

        btnKS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SplashActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return view;
    }
}
