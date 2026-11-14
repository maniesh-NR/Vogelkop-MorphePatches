package com.opera.android.favorites;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.CardView;

/* loaded from: classes.dex */
public class NonCollapsingCardView extends CardView {
    public NonCollapsingCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return 1;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return 1;
    }
}
