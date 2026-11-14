package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class nii {
    public static final DecelerateInterpolator e = lf1.e;
    public final View a;
    public final View b;
    public final vzk c;
    public boolean d;

    public nii(View view, View view2, vzk vzkVar) {
        this.a = view;
        this.b = view2;
        this.c = vzkVar;
        this.d = view2.getVisibility() == 0;
    }

    public final void a() {
        if (this.d) {
            vzk vzkVar = this.c;
            vzkVar.r();
            vzkVar.x(true, true);
            this.a.animate().translationY(this.b.getHeight()).setDuration(300L).setInterpolator(e).withEndAction(new pjg(this, (byte) 29));
            this.d = false;
        }
    }
}
