package com.example.trendinggithubrepositories;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import com.bumptech.glide.Glide;

import java.text.MessageFormat;
import java.util.ArrayList;

public class CustomExpandableListAdapter extends BaseExpandableListAdapter {

    private final ArrayList<CollapsableViewModel> finalData;

    public CustomExpandableListAdapter(ArrayList<CollapsableViewModel> finalData) {
        this.finalData = finalData;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.finalData.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this.finalData.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        CollapsableViewModel listTitle = (CollapsableViewModel) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) parent.getContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_group, null);
        }
        TextView listTitleTextView = convertView
                .findViewById(R.id.tv_repository_name);
        TextView listDescTextView = convertView
                .findViewById(R.id.tv_repository_desc);
        ImageView listImage = convertView
                .findViewById(R.id.iv_group_item);
        listTitleTextView.setText(listTitle.getName());
        listDescTextView.setText(listTitle.getDesc());
        Glide.with(convertView.getContext()).load(listTitle.getUrl()).into(listImage);
        return convertView;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.finalData.get(groupPosition).getExpandableViewDetails().get(childPosition);
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.finalData.get(groupPosition).getExpandableViewDetails().size();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getChildView(int listPosition, final int expandedListPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        final ExpandableViewModel expandedListText = (ExpandableViewModel) getChild(listPosition, expandedListPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) parent.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_item, null);
        }
        TextView expandedListTextView = convertView
                .findViewById(R.id.tv_detail);
        TextView techView = convertView
                .findViewById(R.id.tv_tech);
        TextView starView = convertView
                .findViewById(R.id.tv_stars);
        TextView forkView = convertView
                .findViewById(R.id.tv_fork);
        Typeface typeface = ResourcesCompat.getFont(
                expandedListTextView.getContext(),
                R.font.ping_fang_sc_regular);
        expandedListTextView.setTypeface(typeface);
        expandedListTextView.setText(expandedListText.getUrl());
        techView.setText(expandedListText.getLanguage());
        starView.setText(MessageFormat.format("{0}", expandedListText.getStarCount()));
        forkView.setText(MessageFormat.format("{0}", expandedListText.getForkCount()));
        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int listPosition, int expandedListPosition) {
        return false;
    }
}