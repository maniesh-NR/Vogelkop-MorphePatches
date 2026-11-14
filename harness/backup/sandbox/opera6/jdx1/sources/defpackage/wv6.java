package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;
import androidx.fragment.app.c0;
import androidx.fragment.app.w;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wv6 implements Animation.AnimationListener {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ c d;

    public wv6(c0 c0Var, ViewGroup viewGroup, View view, c cVar) {
        this.a = c0Var;
        this.b = viewGroup;
        this.c = view;
        this.d = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.b;
        viewGroup.post(new gl6(viewGroup, this.c, this.d, (byte) 4));
        if (w.N(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (w.N(2)) {
            Objects.toString(this.a);
        }
    }
}
