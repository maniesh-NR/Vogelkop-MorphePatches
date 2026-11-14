package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class nck implements a5n {
    public final /* synthetic */ byte a = 1;
    public final ConstraintLayout b;
    public final StylingTextView c;
    public final StylingImageView d;

    public nck(ConstraintLayout constraintLayout, StylingTextView stylingTextView, StylingImageView stylingImageView) {
        this.b = constraintLayout;
        this.c = stylingTextView;
        this.d = stylingImageView;
    }

    public nck(ConstraintLayout constraintLayout, StylingTextView stylingTextView, StylingImageView stylingImageView, StylingTextView stylingTextView2) {
        this.b = constraintLayout;
        this.d = stylingImageView;
        this.c = stylingTextView2;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
