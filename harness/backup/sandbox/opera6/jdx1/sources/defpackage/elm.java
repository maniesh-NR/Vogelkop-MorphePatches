package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class elm {
    public final String a;
    public final ArrayList b;
    public final LinkedHashMap c;

    public elm(String str, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = arrayList;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elm)) {
            return false;
        }
        elm elmVar = (elm) obj;
        return Intrinsics.a(this.a, elmVar.a) && Intrinsics.a(this.b, elmVar.b) && Intrinsics.a(this.c, elmVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + z1m.g(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
