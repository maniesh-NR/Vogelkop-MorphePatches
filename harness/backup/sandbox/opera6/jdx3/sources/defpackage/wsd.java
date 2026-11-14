package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wsd {
    public final String a;
    public final Map b;

    public wsd(String str, Map map) {
        this.a = str;
        this.b = zi4.d0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsd)) {
            return false;
        }
        wsd wsdVar = (wsd) obj;
        return Intrinsics.a(this.a, wsdVar.a) && Intrinsics.a(this.b, wsdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }
}
