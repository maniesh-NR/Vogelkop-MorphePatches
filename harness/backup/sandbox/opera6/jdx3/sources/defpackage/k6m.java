package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class k6m {
    public final String a;
    public final String b;

    public k6m(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == k6m.class) {
            k6m k6mVar = (k6m) obj;
            if (TextUtils.equals(this.a, k6mVar.a) && TextUtils.equals(this.b, k6mVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
