package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.dll;
import defpackage.fan;
import defpackage.hz0;
import defpackage.khh;
import defpackage.kjh;
import defpackage.pde;
import defpackage.q9n;
import defpackage.qp2;
import defpackage.u8n;
import defpackage.vjh;
import defpackage.wjh;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/custom_views/OperaRateBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "kjh", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaRateBar extends ConstraintLayout implements View.OnClickListener {
    public static final /* synthetic */ int u = 0;
    public final int p;
    public int q;
    public final int r;
    public final ArrayList s;
    public final ArrayList t;

    /* JADX WARN: Multi-variable type inference failed */
    public OperaRateBar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        int i = 5;
        this.p = 5;
        this.s = new ArrayList();
        this.t = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.w, 0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            i = typedArrayObtainStyledAttributes.getInt(0, 5);
            this.p = i;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.r = typedArrayObtainStyledAttributes.getInt(1, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            View view = new View(getContext());
            view.setId(View.generateViewId());
            view.setBackground(getContext().getDrawable(2131233143));
            arrayList.add(Integer.valueOf(view.getId()));
            this.s.add(view);
            jo5 jo5Var = new jo5(0, 0);
            ((ViewGroup.MarginLayoutParams) jo5Var).width = fan.a(40.0f, getContext().getResources());
            ((ViewGroup.MarginLayoutParams) jo5Var).height = fan.a(40.0f, getContext().getResources());
            view.setLayoutParams(jo5Var);
            view.setOnClickListener(this);
            addView(view);
            hz0 hz0Var = new hz0(this, (byte) 4);
            dll dllVarS = q9n.s(view);
            if (dllVarS != null) {
                u8n.b(dllVarS, view, hz0Var);
            }
            hz0Var.a(view);
        }
        so5 so5Var = new so5();
        so5Var.d(this);
        int[] iArrJ0 = CollectionsKt.j0(arrayList);
        if (iArrJ0.length < 2) {
            qp2.o("must have 2 or more widgets in a chain");
            throw null;
        }
        so5Var.i(iArrJ0[0]).d.V = 0;
        int i3 = 6;
        so5Var.f(iArrJ0[0], 6, 0, 6, -1);
        for (int i4 = 1; i4 < iArrJ0.length; i4++) {
            int i5 = i4 - 1;
            so5Var.f(iArrJ0[i4], i3, iArrJ0[i5], 7, -1);
            int i6 = i3;
            so5Var.f(iArrJ0[i5], 7, iArrJ0[i4], i6, -1);
            i3 = i6;
        }
        so5Var.f(iArrJ0[iArrJ0.length - 1], 7, 0, 7, -1);
        so5Var.a(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r(this.s.indexOf(view) + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        int i = this.r;
        if (i > 0) {
            r(i);
        }
    }

    public final void r(int i) {
        if (i == this.q) {
            return;
        }
        this.q = i;
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                ArrayList arrayList2 = this.t;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    kjh kjhVar = (kjh) obj;
                    switch (kjhVar.a) {
                        case 0:
                            wjh wjhVar = kjhVar.b;
                            wjhVar.f = new vjh(((vjh) wjhVar.f).a, Integer.valueOf(i));
                            xf8.F0((pde) wjhVar.c, Boolean.valueOf(i > 0));
                            break;
                        default:
                            wjh wjhVar2 = kjhVar.b;
                            wjhVar2.f = new vjh(((vjh) wjhVar2.f).a, Integer.valueOf(i));
                            xf8.F0((pde) wjhVar2.c, Boolean.valueOf(i > 0));
                            break;
                    }
                }
                return;
            }
            Object obj2 = arrayList.get(i3);
            i3++;
            int i5 = i2 + 1;
            if (i2 < 0) {
                j95.n();
                throw null;
            }
            View view = (View) obj2;
            if (i2 >= this.q) {
                z = false;
            }
            view.setSelected(z);
            i2 = i5;
        }
    }
}
