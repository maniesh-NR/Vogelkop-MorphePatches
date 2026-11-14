package defpackage;

import android.content.LocusId;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class tyc {
    public final String a;
    public final LocusId b;

    public tyc(String str) {
        if (TextUtils.isEmpty(str)) {
            qp2.o("id cannot be empty");
            throw null;
        }
        this.a = str;
        this.b = new LocusId(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tyc.class != obj.getClass()) {
            return false;
        }
        String str = ((tyc) obj).a;
        String str2 = this.a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
