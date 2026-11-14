package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class wej {

    @NotNull
    public static final vej Companion = new vej();
    public static final l4c[] d = {z4c.a(f7c.b, new gzh(22)), null, null};
    public final dfj a;
    public final String b;
    public final String c;

    public /* synthetic */ wej(int i, dfj dfjVar, String str, String str2) {
        if (1 != (i & 1)) {
            x7d.I(i, 1, uej.a.getDescriptor());
            throw null;
        }
        this.a = dfjVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wej)) {
            return false;
        }
        wej wejVar = (wej) obj;
        return this.a == wejVar.a && Intrinsics.a(this.b, wejVar.b) && Intrinsics.a(this.c, wejVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
