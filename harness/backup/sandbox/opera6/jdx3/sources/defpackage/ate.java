package defpackage;

import android.util.Pair;
import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ate {
    public final String a;
    public final String b;
    public final String c;
    public Range d;
    public Range e;
    public final l0c f;

    public ate(l0c l0cVar, String str, String str2) {
        String str3 = l0cVar.a;
        String strA = aik.a(str2);
        this.a = str3;
        this.b = str;
        this.c = strA;
        this.f = l0cVar;
    }

    public static Range b(String str, String str2) {
        Integer num;
        if (str2 == null) {
            return null;
        }
        Pair pairD = aik.d(str, str2);
        Integer num2 = (Integer) pairD.first;
        if (num2 == null || num2.intValue() != -1 || (num = (Integer) pairD.second) == null || num.intValue() != -1) {
            return new Range((Comparable) pairD.first, (Comparable) pairD.second);
        }
        return null;
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ate ateVar = (ate) obj;
        return Intrinsics.a(this.a, ateVar.a) && Intrinsics.a(this.b, ateVar.b) && Intrinsics.a(this.c, ateVar.c);
    }

    public final int c() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (ate.class.equals(obj != null ? obj.getClass() : null) && Intrinsics.a(this.f, ((ate) obj).f)) {
            return a(obj);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + (c() * 31);
    }
}
