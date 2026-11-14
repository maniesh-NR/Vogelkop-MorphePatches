package defpackage;

import java.math.BigInteger;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes.dex */
public final class b2 implements l2 {
    public final l2 b;
    public final Integer c;
    public final s15 d = uqh.a(List.class);
    public final boolean e;
    public final String f;

    public b2(l2 l2Var, Integer num) {
        this.b = l2Var;
        this.c = num;
        this.e = num == null;
        this.f = sko.u(l2Var.getName(), _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
    }

    public static z1 g(b2 b2Var, String str, int i) {
        z1 z1VarB = b2Var.f(i).b(str);
        return new z1((List) z1VarB.a, z1VarB.b);
    }

    @Override // defpackage.l2
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.l2
    public final z1 b(String str) {
        Integer num = this.c;
        if (num != null) {
            return g(this, str, num.intValue());
        }
        l2.a.getClass();
        z1 z1VarB = f2.b.b(str);
        int i = z1VarB.b;
        z1 z1VarG = g(this, str.substring(i), ((BigInteger) z1VarB.a).intValue());
        return new z1(z1VarG.a, z1VarG.b + i);
    }

    @Override // defpackage.l2
    public final String c(Object obj) {
        return e((List) obj);
    }

    @Override // defpackage.l2
    public final s15 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.a(this.b, b2Var.b) && Intrinsics.a(this.c, b2Var.c);
    }

    public final j2 f(int i) {
        ehc ehcVar = new ehc(i);
        for (int i2 = 0; i2 < i; i2++) {
            ehcVar.add(this.b);
        }
        return new j2(a.a(ehcVar));
    }

    @Override // defpackage.l2
    public final String getName() {
        return this.f;
    }

    @Override // defpackage.l2
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String e(List list) {
        Integer num = this.c;
        if (num == null) {
            l2.a.getClass();
            return f2.b.e(mkh.D(list.size())).concat(f(list.size()).e(list));
        }
        if (list.size() == num.intValue()) {
            return f(list.size()).e(list);
        }
        qp2.o("Failed requirement.");
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Array(itemType=" + this.b + ", size=" + this.c + ")";
    }
}
