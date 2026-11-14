package defpackage;

import com.leanplum.internal.Constants;
import kotlin.text.Charsets;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class h2 implements l2 {
    public static final h2 b = new h2();
    public static final s15 c = uqh.a(String.class);
    public static final String d = Constants.Kinds.STRING;
    public static final boolean e = true;

    @Override // defpackage.l2
    public final boolean a() {
        return e;
    }

    @Override // defpackage.l2
    public final z1 b(String str) {
        z1 z1VarB = new e2(null).b(str);
        return new z1(c.i((byte[]) z1VarB.a), z1VarB.b);
    }

    @Override // defpackage.l2
    public final String c(Object obj) {
        uqh.a(byte[].class);
        byte[] bytes = ((String) obj).getBytes(Charsets.UTF_8);
        l2.a.getClass();
        return sko.j(f2.b.e(mkh.D(bytes.length)), e2.g(bytes));
    }

    @Override // defpackage.l2
    public final s15 d() {
        return c;
    }

    @Override // defpackage.l2
    public final String e(Object obj) {
        uqh.a(byte[].class);
        byte[] bytes = ((String) obj).getBytes(Charsets.UTF_8);
        l2.a.getClass();
        return sko.j(f2.b.e(mkh.D(bytes.length)), e2.g(bytes));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h2);
    }

    @Override // defpackage.l2
    public final String getName() {
        return d;
    }

    public final int hashCode() {
        return -2041214097;
    }

    public final String toString() {
        return "Str";
    }
}
