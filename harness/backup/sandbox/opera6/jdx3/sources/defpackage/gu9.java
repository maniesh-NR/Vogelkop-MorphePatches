package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class gu9 extends yz implements nq {
    public final ez s;
    public final String t;
    public final List u;
    public final List v;
    public final String w;
    public final List x;
    public final long y;

    /* JADX WARN: Illegal instructions before constructor call */
    public gu9(ez ezVar, h06 h06Var, List list, List list2, ami amiVar, String str, List list3, String str2, long j) {
        String str3 = h06Var.a;
        String str4 = h06Var.b;
        String str5 = h06Var.e;
        String str6 = h06Var.d;
        String str7 = h06Var.c;
        String str8 = h06Var.f;
        String str9 = (String) amiVar.b;
        dl dlVar = (dl) amiVar.c;
        yo yoVar = (yo) amiVar.d;
        String str10 = (String) amiVar.f;
        rm rmVar = (rm) amiVar.e;
        i3j i3jVar = (i3j) amiVar.g;
        ap apVar = (ap) amiVar.h;
        String[] strArr = aik.a;
        super(str3, str4, str5, str6, str7 == null ? "" : str7, str2, str9, dlVar, str8, yoVar, rmVar, i3jVar, apVar);
        this.s = ezVar;
        this.u = list;
        this.v = list2;
        this.w = str;
        this.x = list3;
        this.y = j;
        this.t = str10;
    }

    @Override // defpackage.nq
    public final mq a(dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        return new vkf(this, dlVar, kmVar, k8Var, kqVar, list);
    }

    @Override // defpackage.yz
    public final String f() {
        return this.w;
    }

    @Override // defpackage.yz
    public final String g() {
        return this.t;
    }

    @Override // defpackage.yz
    public final List k() {
        return this.x;
    }

    @Override // defpackage.yz
    public final boolean q() {
        return System.currentTimeMillis() > this.y;
    }
}
