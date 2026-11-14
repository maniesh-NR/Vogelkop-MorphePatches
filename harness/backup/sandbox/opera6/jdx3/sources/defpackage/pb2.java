package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pb2 {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final List e;
    public final long f;

    public pb2(String str, List list, String str2, String str3, List list2, long j) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = list2;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb2)) {
            return false;
        }
        pb2 pb2Var = (pb2) obj;
        return Intrinsics.a(this.a, pb2Var.a) && Intrinsics.a(this.b, pb2Var.b) && Intrinsics.a(this.c, pb2Var.c) && Intrinsics.a(this.d, pb2Var.d) && Intrinsics.a(this.e, pb2Var.e) && this.f == pb2Var.f;
    }

    public final int hashCode() {
        int iF = rfp.f(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Long.hashCode(this.f) + rfp.f(z1m.f((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "";
    }
}
