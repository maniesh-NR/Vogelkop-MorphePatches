package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g5o {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5o)) {
            return false;
        }
        g5o g5oVar = (g5o) obj;
        return Intrinsics.a(this.a, g5oVar.a) && this.b == g5oVar.b;
    }

    public final int hashCode() {
        return vep.A(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("IdAndState(id=");
        sb.append(this.a);
        sb.append(", state=");
        switch (this.b) {
            case 1:
                str = "ENQUEUED";
                break;
            case 2:
                str = "RUNNING";
                break;
            case 3:
                str = "SUCCEEDED";
                break;
            case 4:
                str = "FAILED";
                break;
            case 5:
                str = "BLOCKED";
                break;
            case 6:
                str = "CANCELLED";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
