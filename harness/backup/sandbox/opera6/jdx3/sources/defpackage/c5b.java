package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class c5b implements a5n {
    public final /* synthetic */ byte a = 1;
    public final LinearLayout b;
    public final StylingImageView c;

    public c5b(LinearLayout linearLayout, StylingImageView stylingImageView, StylingTextView stylingTextView) {
        this.b = linearLayout;
        this.c = stylingImageView;
    }

    public c5b(LinearLayout linearLayout, pq3 pq3Var, StylingImageView stylingImageView, StylingTextView stylingTextView, DialogTitle dialogTitle) {
        this.b = linearLayout;
        this.c = stylingImageView;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
