package defpackage;

import com.opera.android.browser.TabInfo;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ay3 {
    public final lqm a;
    public final int b;
    public final int c;
    public final int d;
    public final n3l e;
    public final boolean f;
    public final TabInfo g;
    public final v4l h;
    public final int i;
    public final int j;
    public final wx3 k;
    public final sqh l;
    public final boolean m;
    public final boolean n;
    public final byte o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final ArrayList s;

    public ay3(vx3 vx3Var) {
        this.a = vx3Var.a;
        this.b = vx3Var.b;
        this.c = vx3Var.c;
        this.d = vx3Var.d;
        this.e = vx3Var.e;
        this.f = vx3Var.f;
        this.g = vx3Var.h;
        this.h = vx3Var.i;
        this.i = vx3Var.g;
        this.j = vx3Var.j;
        this.k = vx3Var.k;
        this.l = vx3Var.l;
        this.m = vx3Var.m;
        this.n = vx3Var.n;
        this.o = vx3Var.o;
        this.p = vx3Var.q;
        this.q = vx3Var.r;
        this.r = vx3Var.s;
        ArrayList arrayList = vx3Var.p;
        this.s = arrayList;
        if (arrayList.isEmpty()) {
            hai.d();
            throw null;
        }
    }

    public static vx3 a(String str, lqm lqmVar, boolean z) {
        vx3 vx3Var = new vx3(lqmVar);
        vx3Var.p.add(new yx3(str, z));
        return vx3Var;
    }
}
