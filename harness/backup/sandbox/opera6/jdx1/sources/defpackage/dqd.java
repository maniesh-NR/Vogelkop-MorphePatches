package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dqd {
    public final String a;
    public final int b;
    public final int c;

    public dqd(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqd)) {
            return false;
        }
        dqd dqdVar = (dqd) obj;
        int i = dqdVar.c;
        String str = dqdVar.a;
        int i2 = dqdVar.b;
        int i3 = this.c;
        String str2 = this.a;
        int i4 = this.b;
        return (i4 < 0 || i2 < 0) ? TextUtils.equals(str2, str) && i3 == i : TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
