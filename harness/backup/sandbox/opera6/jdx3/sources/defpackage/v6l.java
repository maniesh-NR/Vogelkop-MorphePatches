package defpackage;

import com.opera.android.browser.TabInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v6l extends w6l {
    public final int a;
    public final int b;
    public final String c;
    public final TabInfo d;

    public v6l(int i, int i2, String str, TabInfo tabInfo) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = tabInfo;
    }

    @Override // defpackage.w6l
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6l)) {
            return false;
        }
        v6l v6lVar = (v6l) obj;
        return this.a == v6lVar.a && this.b == v6lVar.b && Intrinsics.a(this.c, v6lVar.c) && Intrinsics.a(this.d, v6lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z1m.f(rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
