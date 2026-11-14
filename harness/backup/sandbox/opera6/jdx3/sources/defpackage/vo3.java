package defpackage;

import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class vo3 {
    public final xj a;
    public final so3 b;
    public final FrameLayout c;
    public final /* synthetic */ wo3 d;

    public vo3(wo3 wo3Var) {
        this.d = wo3Var;
        this.a = wo3Var.B;
        this.b = new so3(wo3Var, (byte) 5);
        FrameLayout frameLayout = new FrameLayout(wo3Var.k.getContext());
        frameLayout.setClipChildren(false);
        wo3Var.k.addView(frameLayout);
        this.c = frameLayout;
    }
}
