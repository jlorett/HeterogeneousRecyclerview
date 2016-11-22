package com.joshualorett.heterogeneousrecyclerviewstudy.sample.contentselector;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.joshualorett.heterogeneousrecyclerviewstudy.R;
import com.joshualorett.heterogeneousrecyclerviewstudy.lib.ViewHolderCreator;

/**
 * Created by Joshua on 11/21/2016.
 */

public class ContentSelectorCreator implements ViewHolderCreator {
    @Override
    public int getViewType() {
        return R.layout.list_item_content_selector;
    }

    @Override
    public RecyclerView.ViewHolder createViewHolder(ViewGroup parent) {
        return new ContentSelectorViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(getViewType(), parent, false));
    }
}
