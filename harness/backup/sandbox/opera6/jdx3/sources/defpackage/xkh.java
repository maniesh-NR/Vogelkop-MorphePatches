package defpackage;

import java.text.Collator;

/* loaded from: classes.dex */
public final class xkh extends yvj {
    public int b;

    @Override // defpackage.qw4
    public final boolean a(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.qw4
    public final boolean b(Object obj, Object obj2) {
        return ((wkh) obj).a.a == ((wkh) obj2).a.a;
    }

    @Override // defpackage.qw4, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        wkh wkhVar = (wkh) obj;
        wkh wkhVar2 = (wkh) obj2;
        ilh ilhVar = wkhVar.a;
        long j = ilhVar.a;
        ilh ilhVar2 = wkhVar2.a;
        if (j == ilhVar2.a) {
            return 0;
        }
        int iA = vep.A(this.b);
        if (iA == 0) {
            return Collator.getInstance().compare(ilhVar.c, ilhVar2.c);
        }
        if (iA == 1) {
            return cs5.p(ilhVar2.d, ilhVar.d);
        }
        if (iA == 3) {
            Long l = ilhVar2.i;
            long jLongValue = l == null ? -1L : l.longValue();
            Long l2 = ilhVar.i;
            return cs5.p(jLongValue, l2 != null ? l2.longValue() : -1L);
        }
        int i = wkhVar.b;
        int i2 = wkhVar2.b;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
