package defpackage;

import android.view.View;
import android.view.animation.Animation;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zk9 implements Animation.AnimationListener {
    public int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ld9 c;

    public zk9(nrl nrlVar, View view, ld9 ld9Var) {
        this.b = view;
        this.c = ld9Var;
        Objects.requireNonNull(nrlVar);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            this.b.post(this.c);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a++;
    }
}
