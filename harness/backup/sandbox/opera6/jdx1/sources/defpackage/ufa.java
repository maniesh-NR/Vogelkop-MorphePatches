package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ufa implements jxd {
    public final String a;
    public final String b;
    public final List c;

    public ufa(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ufa.class == obj.getClass()) {
            ufa ufaVar = (ufa) obj;
            if (TextUtils.equals(this.a, ufaVar.a) && TextUtils.equals(this.b, ufaVar.b) && this.c.equals(ufaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return "HlsTrackMetadataEntry".concat(str != null ? z1m.l(p3p.s(" [", str, ", "), this.b, "]") : "");
    }
}
