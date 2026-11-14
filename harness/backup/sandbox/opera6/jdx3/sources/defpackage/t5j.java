package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t5j extends u5j {
    public final String b;
    public final ArrayList c;

    public t5j(String str, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5j)) {
            return false;
        }
        t5j t5jVar = (t5j) obj;
        return Intrinsics.a(this.b, t5jVar.b) && this.c.equals(t5jVar.c);
    }

    public final int hashCode() {
        String str = this.b;
        return this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "";
    }
}
