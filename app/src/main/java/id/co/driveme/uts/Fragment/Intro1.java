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

public class Intro1 extends Fragment {
    Button btnKI2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro1,container,false);

        btnKI2 = view.findViewById(R.id.btnKeIntro2);

        btnKI2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentActivity)getActivity()).setPage(1);
            }
        });
        return view;
    }
}
