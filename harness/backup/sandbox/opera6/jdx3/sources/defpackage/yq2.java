package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class yq2 implements a5n {
    public final ConstraintLayout a;
    public final or2 b;
    public final or2 c;
    public final or2 d;
    public final StylingImageView e;
    public final or2 f;
    public final or2 g;
    public final StylingTextView h;

    public yq2(ConstraintLayout constraintLayout, or2 or2Var, or2 or2Var2, or2 or2Var3, StylingImageView stylingImageView, or2 or2Var4, or2 or2Var5, StylingTextView stylingTextView) {
        this.a = constraintLayout;
        this.b = or2Var;
        this.c = or2Var2;
        this.d = or2Var3;
        this.e = stylingImageView;
        this.f = or2Var4;
        this.g = or2Var5;
        this.h = stylingTextView;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
