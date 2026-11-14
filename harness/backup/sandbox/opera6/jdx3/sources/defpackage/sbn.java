package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sbn {
    public final String a;
    public final String b;

    public sbn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbn)) {
            return false;
        }
        sbn sbnVar = (sbn) obj;
        return this.a.equals(sbnVar.a) && Intrinsics.a(this.b, sbnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
