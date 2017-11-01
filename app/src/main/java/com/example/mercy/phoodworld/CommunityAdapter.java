package com.example.mercy.phoodworld;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mercy on 10/6/2017.
 */

public class CommunityAdapter extends RecyclerView.Adapter<CommunityAdapter.MyViewHolder>{
    private List<Comunity> communityList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, message,timestamp;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            message = (TextView) view.findViewById(R.id.message);
            timestamp = (TextView) view.findViewById(R.id.timestamp);

        }
    }
    public  CommunityAdapter(List<Comunity>communityList){
        this.communityList = communityList;
    }
@Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_comunity,parent,false);
        return new MyViewHolder(itemView);
    }
@Override
    public void  onBindViewHolder(MyViewHolder holder, int position){
    Comunity fragment = communityList.get(position);
        //holder.title.setText(community.getTitle());
       // holder.message.setText(community.getMessage());
        //holder.timestamp.setText(community.getTimestamp());
    }

    @Override
    public int getItemCount(){
        return communityList.size();
    }
}
