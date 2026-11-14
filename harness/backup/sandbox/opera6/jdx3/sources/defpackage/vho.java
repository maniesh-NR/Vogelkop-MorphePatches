package defpackage;

import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class vho {
    public final w06 a;
    public final List b;
    public final long c;
    public final long d;
    public final pqo e;
    public Integer f;
    public final fio g;
    public int h = z1m.b;
    public boolean i;

    public vho(w06 w06Var, List list, long j, long j2, pqo pqoVar, fio fioVar) {
        this.a = w06Var;
        this.b = list;
        this.c = j;
        this.d = j2;
        this.e = pqoVar;
        this.g = fioVar;
    }

    public final lho a() {
        return (lho) this.b.get(0);
    }

    public final Integer b() {
        Integer num = this.f;
        if (num != null) {
            return num;
        }
        Integer numValueOf = null;
        if (this.a == w06.g) {
            String str = a().a.d;
            if (!TextUtils.isEmpty(str)) {
                int iHashCode = str.hashCode();
                String str2 = a().a.e;
                numValueOf = Integer.valueOf((iHashCode * 31) + (TextUtils.isEmpty(str2) ? 0 : str2.hashCode()));
            }
        }
        this.f = numValueOf;
        return numValueOf;
    }

    public final boolean c() {
        return this.a == w06.u;
    }
}
