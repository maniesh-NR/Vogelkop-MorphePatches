package defpackage;

import com.opera.android.browser.TabInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u6l extends w6l {
    public final int a;
    public final String b;
    public final TabInfo c;

    public u6l(int i, String str, TabInfo tabInfo) {
        this.a = i;
        this.b = str;
        this.c = tabInfo;
    }

    @Override // defpackage.w6l
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6l)) {
            return false;
        }
        u6l u6lVar = (u6l) obj;
        return this.a == u6lVar.a && Intrinsics.a(this.b, u6lVar.b) && Intrinsics.a(this.c, u6lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
