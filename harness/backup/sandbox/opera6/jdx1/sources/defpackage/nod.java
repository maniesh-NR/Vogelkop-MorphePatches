package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nod {
    public final bqd a;
    public final int b;
    public final int c;
    public final mod d;
    public final Bundle e;

    public nod(bqd bqdVar, int i, int i2, boolean z, mod modVar, Bundle bundle) {
        this.a = bqdVar;
        this.b = i;
        this.c = i2;
        this.d = modVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nod)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        nod nodVar = (nod) obj;
        mod modVar = nodVar.d;
        mod modVar2 = this.d;
        return (modVar2 == null && modVar == null) ? this.a.equals(nodVar.a) : Objects.equals(modVar2, modVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        dqd dqdVar = this.a.a;
        sb.append(dqdVar.a);
        sb.append(", uid=");
        return p3p.k(dqdVar.c, "}", sb);
    }
}
