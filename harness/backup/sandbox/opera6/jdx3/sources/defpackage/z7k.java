package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z7k {
    public final knn a;
    public final yt8 b;
    public final yt8 c;
    public final yt8 d;
    public final rsi e;
    public final rsi f;
    public final yt8 g;
    public final yt8 h;
    public final yt8 i;
    public final yt8 j;
    public final yt8 k;
    public final yt8 l;

    public z7k(knn knnVar, yt8 yt8Var, yt8 yt8Var2, yt8 yt8Var3, rsi rsiVar, rsi rsiVar2, yt8 yt8Var4, yt8 yt8Var5, yt8 yt8Var6, yt8 yt8Var7, yt8 yt8Var8, yt8 yt8Var9) {
        this.a = knnVar;
        this.b = yt8Var;
        this.c = yt8Var2;
        this.d = yt8Var3;
        this.e = rsiVar;
        this.f = rsiVar2;
        this.g = yt8Var4;
        this.h = yt8Var5;
        this.i = yt8Var6;
        this.j = yt8Var7;
        this.k = yt8Var8;
        this.l = yt8Var9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7k)) {
            return false;
        }
        z7k z7kVar = (z7k) obj;
        return this.a.equals(z7kVar.a) && this.b.equals(z7kVar.b) && this.c.equals(z7kVar.c) && this.d.equals(z7kVar.d) && this.e.equals(z7kVar.e) && this.f.equals(z7kVar.f) && this.g.equals(z7kVar.g) && this.h.equals(z7kVar.h) && Intrinsics.a(this.i, z7kVar.i) && this.j.equals(z7kVar.j) && this.k.equals(z7kVar.k) && this.l.equals(z7kVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
