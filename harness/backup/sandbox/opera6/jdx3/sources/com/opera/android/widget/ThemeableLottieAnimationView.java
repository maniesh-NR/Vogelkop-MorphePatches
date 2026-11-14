package com.opera.android.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.widget.ThemeableLottieAnimationView;
import defpackage.i3d;
import defpackage.i7f;
import defpackage.lll;
import defpackage.nll;
import defpackage.oll;
import defpackage.pll;
import defpackage.qll;
import defpackage.ua7;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ThemeableLottieAnimationView extends LottieAnimationView {
    public static final /* synthetic */ int x = 0;
    public final ArrayList t;
    public final ArrayList u;
    public final ArrayList v;
    public final nll w;

    public ThemeableLottieAnimationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new nll(this);
    }

    public ThemeableLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new nll(this);
    }

    public final void a(dvb dvbVar, Object obj, ua7 ua7Var) {
        u(new lll(this, dvbVar, obj, ua7Var, (byte) 0));
    }

    public final void u(oll ollVar) {
        nll nllVar = this.w;
        i7f i7fVar = nllVar.a;
        ThemeableLottieAnimationView themeableLottieAnimationView = nllVar.b;
        if (((n2d) themeableLottieAnimationView).m != null && nllVar.c == 0) {
            nllVar.c = (byte) 2;
        }
        byte b = nllVar.c;
        if (b == 0) {
            i7fVar.b(ollVar);
            nllVar.c = (byte) 1;
            if (((n2d) themeableLottieAnimationView).m != null) {
                nllVar.a();
            }
            ((n2d) themeableLottieAnimationView).k.add(nllVar);
            return;
        }
        if (b == 1) {
            i7fVar.b(ollVar);
        } else {
            if (b != 2) {
                return;
            }
            ollVar.a();
        }
    }

    public final void v(dvb dvbVar, Object obj, ykj ykjVar) {
        u(new lll(this, dvbVar, obj, ykjVar, (byte) 1));
    }

    public final void w() {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i3d i3dVar = (i3d) obj;
            final dvb dvbVar = i3dVar.a;
            final Integer numValueOf = Integer.valueOf(i3dVar.c);
            u(new oll() { // from class: kll
                @Override // defpackage.oll
                public final void a() {
                    int i2 = ThemeableLottieAnimationView.x;
                    ((n2d) this.a).d.b(dvbVar, numValueOf, (ua7) null);
                }
            });
        }
        arrayList.clear();
        this.t.clear();
    }

    public final /* synthetic */ void x(dvb dvbVar, Object obj, ua7 ua7Var) {
        super.a(dvbVar, obj, ua7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            pll pllVar = (pll) obj;
            pllVar.b = f03.t(pllVar.a, getContext(), 2131101243);
        }
        ArrayList arrayList2 = this.u;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            qll qllVar = (qll) obj2;
            qllVar.b = qllVar.a.getValue();
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(i3d... i3dVarArr) {
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            w();
        }
        arrayList.addAll(Arrays.asList(i3dVarArr));
        int size = arrayList.size();
        final byte b = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i3d i3dVar = (i3d) obj;
            int i2 = i3dVar.b;
            dvb dvbVar = i3dVar.a;
            final pll pllVar = new pll(i2);
            pllVar.b = f03.t(i2, getContext(), 2131101243);
            this.t.add(pllVar);
            v(dvbVar, Integer.valueOf(i3dVar.c), new ykj() { // from class: mll
                public final Object k(g3d g3dVar) {
                    byte b2 = b;
                    pll pllVar2 = pllVar;
                    switch (b2) {
                        case 0:
                            int i3 = ThemeableLottieAnimationView.x;
                            return Integer.valueOf(pllVar2.b);
                        default:
                            int i4 = ThemeableLottieAnimationView.x;
                            return Integer.valueOf((int) ((Color.alpha(pllVar2.b) / 255.0f) * 100.0f));
                    }
                }
            });
            if (i3dVar.d) {
                PointF pointF = k3d.a;
                final byte b2 = 1;
                v(dvbVar, 4, new ykj() { // from class: mll
                    public final Object k(g3d g3dVar) {
                        byte b22 = b2;
                        pll pllVar2 = pllVar;
                        switch (b22) {
                            case 0:
                                int i3 = ThemeableLottieAnimationView.x;
                                return Integer.valueOf(pllVar2.b);
                            default:
                                int i4 = ThemeableLottieAnimationView.x;
                                return Integer.valueOf((int) ((Color.alpha(pllVar2.b) / 255.0f) * 100.0f));
                        }
                    }
                });
            }
        }
    }
}
