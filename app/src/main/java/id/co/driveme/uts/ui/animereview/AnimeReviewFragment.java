package id.co.driveme.uts.ui.animereview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;
import java.util.List;

import id.co.driveme.uts.CostumAdapter;
import id.co.driveme.uts.KontenData;
import id.co.driveme.uts.R;
import id.co.driveme.uts.databinding.FragmentAnimereviewBinding;
import id.co.driveme.uts.databinding.FragmentLogoutBinding;

public class AnimeReviewFragment extends Fragment {
    ListView customListView;
    List listkonten = new ArrayList();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animereview,container,false);
        customListView = (ListView)view.findViewById(R.id.customListView);

        KontenData konten1 = new KontenData(R.drawable.img1,"05/04/2009","Fullmetal Alchemist",getResources().getString(R.string.fullmetaldesc));
        KontenData konten2 = new KontenData(R.drawable.img2,"07/04/2016","Bungou Stray Dogs",getResources().getString(R.string.bungoudesc));
        KontenData konten3 = new KontenData(R.drawable.img3,"07/04/2013","Shingeki no Kyojin",getResources().getString(R.string.shingekidesc));
        KontenData konten4 = new KontenData(R.drawable.img4,"06/04/2011","Steins;Gate",getResources().getString(R.string.steinsdesc));
        KontenData konten5 = new KontenData(R.drawable.img5,"05/07/2007","Clannad ",getResources().getString(R.string.clannaddesc));

        listkonten.add(konten1);
        listkonten.add(konten2);
        listkonten.add(konten3);
        listkonten.add(konten4);
        listkonten.add(konten5);

        CostumAdapter adapter = new CostumAdapter(getActivity(), R.layout.single_list_item,listkonten);
        customListView.setAdapter(adapter);

        return view;
    }
}