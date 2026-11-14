package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gkn extends v0g {
    public final ikn a;
    public final ikn b;
    public final ikn c;
    public final ikn d;

    public gkn(ikn iknVar, ikn iknVar2, ikn iknVar3, ikn iknVar4) {
        this.a = iknVar;
        this.b = iknVar2;
        this.c = iknVar3;
        this.d = iknVar4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gkn)) {
            return false;
        }
        gkn gknVar = (gkn) obj;
        return Objects.equals(this.a, gknVar.a) && Objects.equals(this.b, gknVar.b) && Objects.equals(this.c, gknVar.c) && Objects.equals(this.d, gknVar.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.b) + (Objects.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a, this.b, this.c, this.d};
        String[] strArrSplit = "a;b;c;d".length() == 0 ? new String[0] : "a;b;c;d".split(";");
        StringBuilder sb = new StringBuilder(gkn.class.getSimpleName());
        sb.append("[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
