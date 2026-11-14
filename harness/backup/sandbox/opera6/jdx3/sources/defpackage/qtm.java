package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public class qtm extends d93 {
    public final String d;

    public qtm(yla ylaVar, long j, String str, String str2) {
        super(ylaVar, j, str);
        this.d = str2;
    }

    @Override // defpackage.d93
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return Objects.equals(this.d, ((qtm) obj).d);
        }
        return false;
    }

    @Override // defpackage.d93
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.d);
    }
}
