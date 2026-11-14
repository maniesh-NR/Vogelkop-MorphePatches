package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wa3 {
    public final String a;
    public final String b;

    public wa3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa3)) {
            return false;
        }
        wa3 wa3Var = (wa3) obj;
        return Intrinsics.a(this.a, wa3Var.a) && Intrinsics.a(this.b, wa3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return sko.l("BasicConsentTemplate(templateId=", this.a, ", version=", this.b, ")");
    }
}
