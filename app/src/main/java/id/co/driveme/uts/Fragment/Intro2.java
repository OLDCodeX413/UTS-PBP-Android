package id.co.driveme.uts.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import id.co.driveme.uts.FragmentActivity;
import id.co.driveme.uts.R;

public class Intro2 extends Fragment {
    Button btnKI3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro2,container,false);

        btnKI3 = view.findViewById(R.id.btnKeIntro3);

        btnKI3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentActivity)getActivity()).setPage(2);
            }
        });
        return view;
    }
}
