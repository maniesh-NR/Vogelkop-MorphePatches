package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class xcg {

    @NotNull
    public static final tcg Companion = new tcg();
    public static final l4c[] e;
    public final List a;
    public final String b;
    public final List c;
    public final hff d;

    static {
        f7c f7cVar = f7c.b;
        e = new l4c[]{z4c.a(f7cVar, new kof((byte) 12)), null, z4c.a(f7cVar, new kof((byte) 13)), z4c.a(f7cVar, new kof((byte) 14))};
    }

    public xcg(int i, List list, String str, List list2, hff hffVar) {
        if (8 != (i & 8)) {
            x7d.I(i, 8, scg.a.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? l08.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = l08.a;
        } else {
            this.c = list2;
        }
        this.d = hffVar;
    }

    public xcg(List list, String str, ArrayList arrayList, hff hffVar) {
        this.a = list;
        this.b = str;
        this.c = arrayList;
        this.d = hffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcg)) {
            return false;
        }
        xcg xcgVar = (xcg) obj;
        return Intrinsics.a(this.a, xcgVar.a) && Intrinsics.a(this.b, xcgVar.b) && Intrinsics.a(this.c, xcgVar.c) && this.d == xcgVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + rfp.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
