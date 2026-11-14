package defpackage;

import android.os.IBinder;
import java.util.Map;

/* loaded from: classes.dex */
public final class trp {
    public final String a;
    public final String b;
    public final Map c;
    public final IBinder d;

    public trp(String str, String str2, Map map, IBinder iBinder) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = iBinder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof trp)) {
            return false;
        }
        trp trpVar = (trp) obj;
        if (!this.a.equals(trpVar.a) || !this.b.equals(trpVar.b) || !this.c.equals(trpVar.c)) {
            return false;
        }
        IBinder iBinder = trpVar.d;
        IBinder iBinder2 = this.d;
        return iBinder2 == null ? iBinder == null : iBinder2.equals(iBinder);
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        IBinder iBinder = this.d;
        return (iHashCode * 1000003) ^ (iBinder == null ? 0 : iBinder.hashCode());
    }

    public final String toString() {
        String string = this.c.toString();
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder("HsdpPrewarmRequest{targetAppPackageName=");
        sb.append(this.a);
        sb.append(", referrer=");
        z1m.t(sb, this.b, ", extraQueryParams=", string, ", windowToken=");
        return z1m.l(sb, strValueOf, "}");
    }
}
