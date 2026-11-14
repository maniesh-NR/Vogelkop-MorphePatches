package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yqg {
    public final ArrayList a;
    public final boolean b;

    public yqg(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqg)) {
            return false;
        }
        yqg yqgVar = (yqg) obj;
        return this.a.equals(yqgVar.a) && this.b == yqgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PredefinedUIServiceConsent(history=" + this.a + ", status=" + this.b + ")";
    }
}
