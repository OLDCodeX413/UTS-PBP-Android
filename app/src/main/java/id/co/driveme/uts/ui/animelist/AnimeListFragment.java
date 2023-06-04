package id.co.driveme.uts.ui.animelist;

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
import id.co.driveme.uts.CostumAdapter2;
import id.co.driveme.uts.KontenData;
import id.co.driveme.uts.KontenData2;
import id.co.driveme.uts.R;
import id.co.driveme.uts.databinding.FragmentAnimelistBinding;

public class AnimeListFragment extends Fragment {

    ListView customListView2;
    List listkonten = new ArrayList();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animelist,container,false);
        customListView2 = (ListView)view.findViewById(R.id.customListView2);

        KontenData2 konten1 = new KontenData2(R.drawable.img1,"05/04/2009","Fullmetal Alchemist","Action, Drama, Phisicological");
        KontenData2 konten2 = new KontenData2(R.drawable.img2,"07/04/2016","Bungou Stray Dogs","Action, Drama, Supernatural");
        KontenData2 konten3 = new KontenData2(R.drawable.img3,"07/04/2013","Shingeki no Kyojin","Action, Drama, Thriller");
        KontenData2 konten4 = new KontenData2(R.drawable.img4,"06/04/2011","Steins;Gate","Drama, Phisicological, Time Travel");
        KontenData2 konten5 = new KontenData2(R.drawable.img5,"05/07/2007","Clannad, ","Drama, Romance");

        listkonten.add(konten1);
        listkonten.add(konten2);
        listkonten.add(konten3);
        listkonten.add(konten4);
        listkonten.add(konten5);

        CostumAdapter2 adapter = new CostumAdapter2(getActivity(), R.layout.single_list_item2,listkonten);
        customListView2.setAdapter(adapter);

        return view;
    }
}