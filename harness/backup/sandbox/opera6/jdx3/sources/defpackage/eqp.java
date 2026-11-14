package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class eqp {
    public final File a;
    public final String b;

    public eqp(File file, String str) {
        this.a = file;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eqp)) {
            return false;
        }
        eqp eqpVar = (eqp) obj;
        return this.a.equals(eqpVar.a) && this.b.equals(eqpVar.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return sko.l("SplitFileInfo{splitFile=", this.a.toString(), ", splitId=", this.b, "}");
    }
}
