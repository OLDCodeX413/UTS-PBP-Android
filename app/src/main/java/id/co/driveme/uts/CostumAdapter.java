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

public class CostumAdapter extends ArrayAdapter<KontenData> {
    private int layout;
    private Context mContext;
    private List<KontenData> konten;
    public CostumAdapter(@NonNull Context context, int resource, List<KontenData> object) {
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
            holder.desc = view.findViewById(R.id.tv_desc);

            view.setTag(holder);
        }else {
            holder = (KontenHolder) view.getTag();
        }

        KontenData k1 = konten.get(position);
        holder.img.setImageResource(k1.getImg());
        holder.tgl.setText(k1.getTgl());
        holder.author.setText(k1.getAuthor());
        holder.desc.setText(k1.getDesc());

        return view;
    }

    static class KontenHolder{
        ImageView img;
        TextView tgl;
        TextView author;
        TextView desc;
    }
}
