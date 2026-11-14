package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.button.MaterialButton;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class CapturableButton extends MaterialButton {
    /* JADX WARN: Multi-variable type inference failed */
    public CapturableButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        HashSet hashSet = new HashSet();
        P(getBackground(), hashSet);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((zdd) it.next()).mutate().w();
        }
    }

    public static void P(Drawable drawable, HashSet hashSet) {
        if (drawable != null) {
            if (drawable instanceof zdd) {
                hashSet.add((zdd) drawable);
                return;
            }
            if (!(drawable instanceof LayerDrawable)) {
                if (drawable instanceof InsetDrawable) {
                    P(((InsetDrawable) drawable).getDrawable(), hashSet);
                }
            } else {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
                    P(layerDrawable.getDrawable(i), hashSet);
                }
            }
        }
    }
}
