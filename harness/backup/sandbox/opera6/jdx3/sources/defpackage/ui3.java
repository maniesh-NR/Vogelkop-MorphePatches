package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ui3 {
    public final Uri a;
    public final Set b;
    public final long c;
    public final Map d;

    public ui3(Uri uri, Set set, long j, Map map) {
        this.a = uri;
        this.b = set;
        this.c = j;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui3)) {
            return false;
        }
        ui3 ui3Var = (ui3) obj;
        return Intrinsics.a(this.a, ui3Var.a) && Intrinsics.a(this.b, ui3Var.b) && pn7.e(this.c, ui3Var.c) && Intrinsics.a(this.d, ui3Var.d);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (this.b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31)) * 31;
        on7 on7Var = pn7.b;
        return this.d.hashCode() + z1m.e(iHashCode, 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
