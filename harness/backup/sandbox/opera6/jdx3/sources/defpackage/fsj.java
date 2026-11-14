package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.snackbar.Snackbar;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fsj {
    public static final int[] l = new int[2];
    public final View a;
    public final Snackbar.SnackbarLayout b;
    public View c;
    public final int d;
    public final int e;
    public final int f;
    public atj g;
    public pde h;
    public final qzg i;
    public final j21 j;
    public final dsj k;

    public fsj(asj asjVar, View view) {
        this.a = view;
        Snackbar.SnackbarLayout snackbarLayout = ((na3) asjVar).i;
        this.b = snackbarLayout;
        this.c = asjVar.c();
        ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
        this.d = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = snackbarLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        this.e = marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = snackbarLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? layoutParams3 : null);
        this.f = marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0;
        this.i = new qzg(this, (byte) 11);
        this.j = new j21(this, (byte) 3);
        this.k = new dsj(this, (byte) 1);
        asjVar.f((View) null);
        txi txiVar = new txi(this, (byte) 7);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(snackbarLayout, txiVar);
        snackbarLayout.addOnAttachStateChangeListener(new dsj(this, (byte) 0));
    }

    public final void a(atj atjVar) {
        atj atjVarK;
        if (Intrinsics.a(atjVar, this.g)) {
            return;
        }
        atj atjVar2 = this.g;
        dsj dsjVar = this.k;
        qzg qzgVar = this.i;
        if (atjVar2 != null) {
            pde pdeVar = this.h;
            if (pdeVar != null) {
                pdeVar.p(qzgVar);
            }
            this.h = null;
            atjVar2.a.removeOnAttachStateChangeListener(dsjVar);
        }
        this.g = atjVar;
        if (atjVar != null) {
            View view = this.a;
            Object tag = view.getTag(2131364495);
            if (tag != null) {
                atjVarK = (atj) tag;
            } else {
                Object parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                atjVarK = view2 != null ? xug.k(view2) : null;
            }
            pde pdeVar2 = atjVarK != null ? atjVarK.b : null;
            this.h = pdeVar2;
            if (pdeVar2 != null) {
                pdeVar2.k(qzgVar);
            }
            atjVar.a.addOnAttachStateChangeListener(dsjVar);
        }
    }

    public final void b() {
        Set<View> set;
        WeakHashMap weakHashMap = r5n.a;
        View view = this.a;
        g3o g3oVarA = i5n.a(view);
        r9b r9bVarI = g3oVarA != null ? g3oVarA.a.i(138) : null;
        int i = r9bVarI != null ? r9bVarI.d : 0;
        View rootView = view.getRootView();
        int[] iArr = l;
        rootView.getLocationInWindow(iArr);
        int height = (rootView.getHeight() + iArr[1]) - i;
        View view2 = this.c;
        if (view2 != null && view2.isLaidOut() && xih.o(view2)) {
            view2.getLocationInWindow(iArr);
            height = Math.min(height, iArr[1]);
        }
        pde pdeVar = this.h;
        if (pdeVar != null && (set = (Set) pdeVar.g()) != null) {
            for (View view3 : set) {
                if (view3.isLaidOut() && xih.o(view3)) {
                    view3.getLocationInWindow(iArr);
                    height = Math.min(height, iArr[1]);
                }
            }
        }
        Snackbar.SnackbarLayout snackbarLayout = this.b;
        Object parent = snackbarLayout.getParent();
        View view4 = parent instanceof View ? (View) parent : null;
        if (view4 != null) {
            view4.getLocationInWindow(iArr);
            int height2 = ((view4.getHeight() + iArr[1]) - height) - view4.getPaddingBottom();
            if (height2 < 0) {
                height2 = 0;
            }
            int i2 = height2 + this.f;
            int i3 = r9bVarI != null ? r9bVarI.a : 0;
            int width = view.getRootView().getWidth() - (r9bVarI != null ? r9bVarI.c : 0);
            view4.getLocationInWindow(iArr);
            int iMax = Math.max(i3, iArr[0]);
            view4.getLocationInWindow(iArr);
            int i4 = (iMax - iArr[0]) + this.d;
            view4.getLocationInWindow(iArr);
            int width2 = view4.getWidth() + iArr[0];
            view4.getLocationInWindow(iArr);
            int iMin = (width2 - Math.min(width, view4.getWidth() + iArr[0])) + this.e;
            ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                if (i4 == marginLayoutParams.leftMargin && iMin == marginLayoutParams.rightMargin && i2 == marginLayoutParams.bottomMargin) {
                    return;
                }
                marginLayoutParams.leftMargin = i4;
                marginLayoutParams.rightMargin = iMin;
                marginLayoutParams.bottomMargin = i2;
                snackbarLayout.setLayoutParams(marginLayoutParams);
                new esj(snackbarLayout);
            }
        }
    }
}
