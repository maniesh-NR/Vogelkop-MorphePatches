package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class tf2 {
    public static final tf2 d;
    public final int a;
    public final int b;
    public final u1b c;

    static {
        tf2 tf2Var;
        if (Build.VERSION.SDK_INT >= 33) {
            t1b t1bVar = new t1b(4);
            for (int i = 1; i <= 10; i++) {
                t1bVar.g(Integer.valueOf(tym.r(i)));
            }
            tf2Var = new tf2(2, (Set) t1bVar.j());
        } else {
            tf2Var = new tf2(2, 10);
        }
        d = tf2Var;
    }

    public tf2(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public tf2(int i, Set set) {
        this.a = i;
        u1b u1bVarQ = u1b.q(set);
        this.c = u1bVarQ;
        omm ommVarN = u1bVarQ.n();
        int iMax = 0;
        while (ommVarN.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) ommVarN.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf2)) {
            return false;
        }
        tf2 tf2Var = (tf2) obj;
        return this.a == tf2Var.a && this.b == tf2Var.b && Objects.equals(this.c, tf2Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        u1b u1bVar = this.c;
        return i + (u1bVar == null ? 0 : u1bVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }
}
