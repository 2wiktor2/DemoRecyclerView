package com.wiktor.demorecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
// todo    разобрать  extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder
public class RecicleViewAdapter extends RecyclerView.Adapter<RecicleViewAdapter.ViewHolder>{

    private  static final String TAG = "RecycleViewAdapter";

    private ArrayList<String> mImageNames = new ArrayList <>();
    private ArrayList<String> mImages = new ArrayList <>();
    private Context mContext;

    // Alt+Insert - constructor
    public RecicleViewAdapter(Context mContext,ArrayList <String> mImageNames, ArrayList <String> mImages ) {
        this.mImageNames = mImageNames;
        this.mImages = mImages;
        this.mContext = mContext;
    }

    @NonNull
    @Override
     // todo почему у него другие имена аргументов?
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(i))
                .into(viewHolder.image);

        viewHolder.imageName.setText(mImageNames.get(i));

        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: "+mImageNames.get(i));

                Toast.makeText(mContext, mImageNames.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName= itemView.findViewById(R.id.image_name);
            parentLayout= itemView.findViewById(R.id.parent_layout);
        }
    }
}
