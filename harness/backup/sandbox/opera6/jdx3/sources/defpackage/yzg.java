package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class yzg extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ zzg c;

    public yzg(zzg zzgVar, View view, Integer num) {
        this.a = view;
        this.b = num;
        this.c = zzgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int iIntValue = this.b.intValue();
        this.c.getClass();
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = iIntValue;
        view.setLayoutParams(layoutParams);
    }
}
