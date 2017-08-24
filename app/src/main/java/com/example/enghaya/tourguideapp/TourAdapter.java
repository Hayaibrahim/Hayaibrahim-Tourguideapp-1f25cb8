package com.example.enghaya.tourguideapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ENG.HAYA on 8/24/2017 AD.
 */

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.MusicViewHolder> {
        Context context ;
        List<information> students;
        TextView name;
public TourAdapter(Context context, List<information> students) {
        this.context = context;
        this.students = students;
        }
public Context getContext() {
        return context;
        }

public List<information> getStudents() {
        return students;
        }

public void setContext(Context context) {
        this.context = context;
        }

public void setStudents(List<information> students) {
        this.students = students;
        }

@Override
public TourAdapter.MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false);
        MusicViewHolder viewHolder= new MusicViewHolder(v);
        return viewHolder;
        }
@Override
public void onBindViewHolder(TourAdapter.MusicViewHolder holder, int position) {
        }
@Override
public int getItemCount() {
        return 0;
        }

public class MusicViewHolder extends RecyclerView.ViewHolder {
    public MusicViewHolder(View v) {
        super(v);
        name = (TextView) v.findViewById(R.id.text88);
    }}}