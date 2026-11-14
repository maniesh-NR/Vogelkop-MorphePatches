package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class itn extends jtn {
    public final String a;
    public final Map b;

    public itn(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itn)) {
            return false;
        }
        itn itnVar = (itn) obj;
        return this.a.equals(itnVar.a) && Intrinsics.a(this.b, itnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Url(url=" + this.a + ", additionalHttpHeaders=" + this.b + ")";
    }
}
