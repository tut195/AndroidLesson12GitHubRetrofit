package com.babenkovladimir.view;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;


import com.babenkovladimir.R;
import com.babenkovladimir.model.Repository;

import java.util.List;

import static com.babenkovladimir.GithubActivity.TAG;


public class RepositoryAdapter extends RecyclerView.Adapter<RepositoryHolder> {
    private List<Repository> mRepositoryList;

    public RepositoryAdapter(List<Repository> repositories) {
        mRepositoryList = repositories;
        Log.i(TAG, "RepositoryAdapter " + mRepositoryList.size());
    }

    @Override
    public RepositoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i(TAG, "onCreateViewHolder");
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_item, parent, false);
        return new RepositoryHolder(v);
    }

    @Override
    public void onBindViewHolder(RepositoryHolder holder, int position) {
        Log.i(TAG, "onBindViewHolder");
        holder.bindRepository(mRepositoryList.get(position));
    }

    @Override
    public int getItemCount() {
        return mRepositoryList.size();
    }
}
