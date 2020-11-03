package com.example.safalcrm.utillity;

import android.graphics.drawable.Drawable;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tylersuehr.chips.Chip;

public class KeywordsChip extends Chip {

    private final String coolName;
    private  final Drawable drawableimg;

    public KeywordsChip(String coolName, Drawable drawableimg) {
        this.coolName = coolName;
        this.drawableimg = drawableimg;
    }

    @Nullable
    @Override
    public Object getId() {
        return null;
    }

    @NonNull
    @Override
    public String getTitle() {
        return coolName;
    }

    @Nullable
    @Override
    public String getSubtitle() {
        return null;
    }

    @Nullable
    @Override
    public Uri getAvatarUri() {
        return null;
    }

    @Nullable
    @Override
    public Drawable getAvatarDrawable() {
        return drawableimg;
    }
}
