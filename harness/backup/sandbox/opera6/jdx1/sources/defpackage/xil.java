package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xil extends oua {
    public final String b;
    public final h1b c;

    public xil(String str, String str2, csh cshVar) {
        super(str);
        z4o.w(!cshVar.isEmpty());
        this.b = str2;
        h1b h1bVarS = h1b.s(cshVar);
        this.c = h1bVarS;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0112  */
    @Override // defpackage.jxd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.ujd r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xil.b(ujd):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xil.class != obj.getClass()) {
            return false;
        }
        xil xilVar = (xil) obj;
        return this.a.equals(xilVar.a) && Objects.equals(this.b, xilVar.b) && this.c.equals(xilVar.c);
    }

    public final int hashCode() {
        int iF = z1m.f(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iF + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.oua
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
