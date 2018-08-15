package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.attilamatyas.moviesbudget.R;

import java.util.Collections;
import java.util.List;

public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ViewHolder>{
    private final LayoutInflater layoutInflater;
    private final Context context;
    private List<String> images;

    public ImagesAdapter(Context context, List<String> images) {
        this.images = images;
        Collections.reverse(this.images);
        this.layoutInflater = LayoutInflater.from(context);
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.li_image, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(holder.imageView.getContext()).load(images.get(position)).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ViewHolder(View v) {
            super(v);
            imageView = (ImageView) v.findViewById(R.id.imageIV);
        }
    }
}
