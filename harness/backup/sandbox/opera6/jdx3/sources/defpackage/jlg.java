package defpackage;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class jlg extends sfe {
    public final hlg h;
    public final Integer i;
    public final boolean j;
    public final IntRange[] k;

    public jlg(hlg hlgVar, Integer num, boolean z, IntRange[] intRangeArr) {
        this.h = hlgVar;
        this.i = num;
        this.j = z;
        this.k = intRangeArr;
    }

    public final sfe E0() {
        int iOrdinal = this.h.ordinal();
        boolean z = this.j;
        a[] aVarArr = this.k;
        if (iOrdinal != 0) {
            boolean z2 = true;
            if (iOrdinal != 1) {
                int length = aVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z2 = false;
                        break;
                    }
                    a aVar = aVarArr[i];
                    int i2 = aVar.a;
                    if (aVar.b >= 0 && i2 <= 0) {
                        break;
                    }
                    i++;
                }
                return z2 != z ? glg.j : glg.i;
            }
        }
        return new jlg(hlg.a, this.i, z, aVarArr);
    }

    public final boolean P(sfe sfeVar) {
        if (this != sfeVar) {
            if (sfeVar instanceof jlg) {
                hlg hlgVar = hlg.a;
                hlg hlgVar2 = this.h;
                boolean z = hlgVar2 == hlgVar || hlgVar2 == hlg.b;
                jlg jlgVar = (jlg) sfeVar;
                hlg hlgVar3 = jlgVar.h;
                if (z != (hlgVar3 == hlgVar || hlgVar3 == hlg.b) || !Intrinsics.a(this.i, jlgVar.i) || this.j != jlgVar.j || !Arrays.equals(this.k, jlgVar.k)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean l0(int i) {
        boolean z;
        int iOrdinal = this.h.ordinal();
        int iAbs = (iOrdinal == 0 || iOrdinal == 1) ? Math.abs(i) : 0;
        Integer num = this.i;
        if (num != null) {
            iAbs %= num.intValue();
        }
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            a aVar = aVarArr[i2];
            int i3 = aVar.a;
            if (iAbs <= aVar.b && i3 <= iAbs) {
                z = true;
                break;
            }
            i2++;
        }
        return z != this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.name().toLowerCase(Locale.ROOT));
        Integer num = this.i;
        if (num != null) {
            sb.append(" % ");
            sb.append(num.intValue());
        }
        sb.append(' ');
        if (this.j) {
            sb.append('!');
        }
        sb.append("= ");
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            a aVar = aVarArr[i];
            if (!z) {
                sb.append(',');
            }
            int i2 = aVar.a;
            int i3 = aVar.b;
            sb.append(i2);
            if (aVar.a != i3) {
                sb.append("..");
                sb.append(i3);
            }
            i++;
            z = false;
        }
        return sb.toString();
    }
}
