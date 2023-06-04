package id.co.driveme.uts;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CostumAdapter2 extends ArrayAdapter<KontenData2> {
    private int layout;
    private Context mContext;
    private List<KontenData2> konten;
    public CostumAdapter2(@NonNull Context context, int resource, List<KontenData2> object) {
        super(context, resource, object);
        this.mContext = context;
        this.layout = resource;
        this.konten = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        KontenHolder holder;

        if(view==null){
            LayoutInflater layoutInflater = ((Activity)getContext()).getLayoutInflater();
            view = layoutInflater.inflate(layout,parent,false);

            holder = new KontenHolder();
            holder.img = view.findViewById(R.id.imgList);
            holder.tgl = view.findViewById(R.id.tv_tgl);
            holder.author = view.findViewById(R.id.tv_author);
            holder.genre = view.findViewById(R.id.tv_genre);

            view.setTag(holder);
        }else {
            holder = (KontenHolder) view.getTag();
        }

        KontenData2 k1 = konten.get(position);
        holder.img.setImageResource(k1.getImg());
        holder.tgl.setText(k1.getTgl());
        holder.author.setText(k1.getAuthor());
        holder.genre.setText(k1.getGenre());

        return view;
    }

    static class KontenHolder{
        ImageView img;
        TextView tgl;
        TextView author;
        TextView genre;
    }
}
