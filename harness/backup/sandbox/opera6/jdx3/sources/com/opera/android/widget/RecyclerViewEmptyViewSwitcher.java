package com.opera.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.s03;
import defpackage.zph;

/* loaded from: classes.dex */
public class RecyclerViewEmptyViewSwitcher extends ViewSwitcher {
    public static final /* synthetic */ int d = 0;
    public zph a;
    public Runnable b;
    public final s03 c;

    public RecyclerViewEmptyViewSwitcher(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new s03((Object) this, (byte) 5);
    }

    public final void a(zph zphVar) {
        this.a = zphVar;
        if (zphVar.isEmpty()) {
            Animation inAnimation = getInAnimation();
            Animation outAnimation = getOutAnimation();
            setInAnimation(null);
            setOutAnimation(null);
            showNext();
            setInAnimation(inAnimation);
            setOutAnimation(outAnimation);
        }
    }

    public final void b() {
        s03 s03Var = this.c;
        if (s03Var.b) {
            return;
        }
        s03Var.b = true;
        ((RecyclerViewEmptyViewSwitcher) s03Var.c).post(s03Var);
    }
}
