package com.opera.android.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.wpk;

/* loaded from: classes.dex */
public class SuggestionsListWrapper extends LinearLayout {
    public wpk a;

    public SuggestionsListWrapper(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wpk wpkVar = this.a;
        if (wpkVar != null) {
            wpkVar.run();
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
