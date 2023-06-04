package id.co.driveme.uts.ui.contactus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import id.co.driveme.uts.R;
import id.co.driveme.uts.databinding.FragmentContactBinding;
import id.co.driveme.uts.databinding.FragmentLogoutBinding;

public class ContactUsFragment extends Fragment {

    Button feedBack;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        feedBack = view.findViewById(R.id.btn_sendFeed);

        feedBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "report has been send", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}