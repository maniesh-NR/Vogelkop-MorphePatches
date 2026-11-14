package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b58 {
    public final int a;
    public final Integer b;
    public final String c;
    public final Uri d;
    public final Uri e;
    public final ArrayList f;
    public final ArrayList g;

    public b58(int i, Integer num, String str, Uri uri, Uri uri2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i;
        this.b = num;
        this.c = str;
        this.d = uri;
        this.e = uri2;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b58)) {
            return false;
        }
        b58 b58Var = (b58) obj;
        return this.a == b58Var.a && Intrinsics.a(this.b, b58Var.b) && Intrinsics.a(this.c, b58Var.c) && Intrinsics.a(this.d, b58Var.d) && Intrinsics.a(this.e, b58Var.e) && this.f.equals(b58Var.f) && this.g.equals(b58Var.g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return this.g.hashCode() + z1m.g(this.f, (this.e.hashCode() + ((this.d.hashCode() + z1m.f((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
