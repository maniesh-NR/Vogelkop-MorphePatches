package com.opera.android.tabui2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.dal;
import defpackage.gal;
import defpackage.mle;
import defpackage.p6l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/opera/android/tabui2/TabUiRootFrameLayout;", "Lcom/opera/android/tabui2/ConfigurationProvidingFrameLayout;", "Lmle;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dal", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabUiRootFrameLayout extends ConfigurationProvidingFrameLayout implements mle {
    public dal f;
    public final ArrayList g;
    public int h;

    public TabUiRootFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ArrayList();
    }

    @Override // defpackage.lle
    public final void b(int i, View view) {
        dal dalVar;
        int i2 = this.h;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.h = i3;
            if (i3 != 0 || (dalVar = this.f) == null) {
                return;
            }
            gal galVar = dalVar.c;
            if (dalVar.a) {
                dalVar.a = false;
                galVar.g(galVar.f > 0.5f ? p6l.b : p6l.a);
                galVar.b(200L);
            }
        }
    }

    @Override // defpackage.lle
    public final void d(View view, View view2, int i, int i2) {
    }

    @Override // com.opera.android.tabui2.ConfigurationProvidingFrameLayout, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((Boolean) ((Function1) obj).invoke(motionEvent)).booleanValue()) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.lle
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        dal dalVar;
        if (this.h <= 0 || (dalVar = this.f) == null || !dalVar.a()) {
            return;
        }
        dalVar.b(i, iArr);
    }

    @Override // defpackage.mle
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        dal dalVar;
        if (this.h <= 0 || (dalVar = this.f) == null || i3 == 0) {
            return;
        }
        dalVar.b(i3, iArr);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        if (this.f != null) {
            return 1;
        }
        return super.getNestedScrollAxes();
    }

    @Override // defpackage.lle
    public final void i(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // defpackage.lle
    public final boolean k(View view, View view2, int i, int i2) {
        int i3 = this.h;
        if (i3 > 0) {
            this.h = i3 + 1;
            return true;
        }
        if (this.f == null || i != 1 || i2 != 0) {
            return false;
        }
        this.h = i3 + 1;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        dal dalVar;
        if (this.h > 0 && (dalVar = this.f) != null) {
            gal galVar = dalVar.c;
            if (dalVar.a()) {
                float scaledMinimumFlingVelocity = ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity() * 4.0f;
                if (galVar.f()) {
                    f = -f;
                }
                if (f < (-scaledMinimumFlingVelocity)) {
                    dalVar.a = false;
                    galVar.g(p6l.a);
                    galVar.b(200L);
                    return true;
                }
                if (f > scaledMinimumFlingVelocity) {
                    dalVar.a = false;
                    galVar.g(p6l.b);
                    galVar.b(200L);
                }
                return true;
            }
        }
        return super.onNestedPreFling(view, f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return false;
    }
}
