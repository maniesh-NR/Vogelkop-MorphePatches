package defpackage;

import com.opera.android.custom_views.StylingImageButton;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z {
    public static final x[] d = new x[0];
    public static final long[] e = {128, 64, 32, 16, 8, 4, 2, 1};
    public boolean a;
    public int b;
    public Object c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(byte b) {
        this((byte) 0, 10);
        switch (b) {
            case 1:
                this.c = new byte[8];
                break;
            default:
                break;
        }
    }

    public z(byte b, int i) {
        switch (b) {
            case 3:
                this.a = false;
                this.c = j64.b;
                this.b = i;
                return;
            default:
                if (i < 0) {
                    qp2.o("'initialCapacity' must not be negative");
                    throw null;
                }
                this.c = i == 0 ? d : new x[i];
                this.b = 0;
                this.a = false;
                return;
        }
    }

    public static long c(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~e[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static x[] d(x[] xVarArr) {
        return xVarArr.length < 1 ? d : (x[]) xVarArr.clone();
    }

    public static int g(ArrayList arrayList, int i, hfi hfiVar) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        ffi ffiVar = hfiVar.b;
        if (obj != ffiVar) {
            return -1;
        }
        Iterator it = ffiVar.h().iterator();
        while (it.hasNext()) {
            if (((jfi) it.next()) == hfiVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList i(i64 i64Var) {
        ArrayList arrayList = new ArrayList();
        while (!i64Var.r()) {
            String str = (String) ((i1) i64Var).d;
            String strSubstring = null;
            if (!i64Var.r()) {
                int i = ((i1) i64Var).b;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    ((i1) i64Var).b = i;
                } else {
                    int iH = i64Var.h();
                    while (true) {
                        if ((iH < 65 || iH > 90) && (iH < 97 || iH > 122)) {
                            break;
                        }
                        iH = i64Var.h();
                    }
                    strSubstring = str.substring(i, ((i1) i64Var).b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(j64.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!i64Var.V()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean n(t64 t64Var, int i, ArrayList arrayList, int i2, hfi hfiVar) {
        u64 u64Var = (u64) t64Var.a.get(i);
        if (!q(u64Var, hfiVar)) {
            return false;
        }
        int i3 = u64Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!p(t64Var, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return p(t64Var, i - 1, arrayList, i2);
        }
        int iG = g(arrayList, i2, hfiVar);
        if (iG <= 0) {
            return false;
        }
        return n(t64Var, i - 1, arrayList, i2, (hfi) hfiVar.b.h().get(iG - 1));
    }

    public static boolean o(t64 t64Var, hfi hfiVar) {
        ArrayList arrayList = new ArrayList();
        Object obj = hfiVar.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((jfi) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = t64Var.a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = t64Var.a;
        if (size2 == 1) {
            return q((u64) arrayList3.get(0), hfiVar);
        }
        return n(t64Var, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, hfiVar);
    }

    public static boolean p(t64 t64Var, int i, ArrayList arrayList, int i2) {
        u64 u64Var = (u64) t64Var.a.get(i);
        hfi hfiVar = (hfi) arrayList.get(i2);
        if (!q(u64Var, hfiVar)) {
            return false;
        }
        int i3 = u64Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (p(t64Var, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return p(t64Var, i - 1, arrayList, i2 - 1);
        }
        int iG = g(arrayList, i2, hfiVar);
        if (iG <= 0) {
            return false;
        }
        return n(t64Var, i - 1, arrayList, i2, (hfi) hfiVar.b.h().get(iG - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean q(defpackage.u64 r7, defpackage.hfi r8) {
        /*
            java.lang.String r0 = r7.b
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.String r2 = r8.n()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L69
        L15:
            java.util.ArrayList r0 = r7.c
            if (r0 == 0) goto L50
            int r2 = r0.size()
            r3 = r1
        L1e:
            if (r3 >= r2) goto L50
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            h64 r4 = (defpackage.h64) r4
            java.lang.String r5 = r4.a
            java.lang.String r4 = r4.c
            java.lang.String r6 = "id"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L47
            java.lang.String r6 = "class"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L69
            java.util.ArrayList r5 = r8.g
            if (r5 == 0) goto L69
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L1e
            goto L69
        L47:
            java.lang.String r5 = r8.c
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1e
            goto L69
        L50:
            java.util.ArrayList r7 = r7.d
            if (r7 == 0) goto L6a
            int r0 = r7.size()
            r2 = r1
        L59:
            if (r2 >= r0) goto L6a
            java.lang.Object r3 = r7.get(r2)
            int r2 = r2 + 1
            k64 r3 = (k64) r3
            boolean r3 = r3.a(r8)
            if (r3 != 0) goto L59
        L69:
            return r1
        L6a:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z.q(u64, hfi):boolean");
    }

    public final void a(x xVar) {
        if (xVar == null) {
            t3p.q("'element' cannot be null");
            return;
        }
        x[] xVarArr = (x[]) this.c;
        int length = xVarArr.length;
        int i = this.b + 1;
        if ((i > length) | this.a) {
            xVarArr = new x[Math.max(xVarArr.length, (i >> 1) + i)];
            System.arraycopy((x[]) this.c, 0, xVarArr, 0, this.b);
            this.c = xVarArr;
            this.a = false;
        }
        xVarArr[this.b] = xVar;
        this.b = i;
    }

    public final yqd b() {
        this.b++;
        return new yqd(this, (byte) 7);
    }

    public final void e() {
        Runnable runnable;
        this.a = true;
        if (this.b != 0 || (runnable = (Runnable) this.c) == null) {
            return;
        }
        runnable.run();
    }

    public final x f(int i) {
        if (i < this.b) {
            return ((x[]) this.c)[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.b);
    }

    public final void h(s64 s64Var, i64 i64Var) throws g64 {
        int iIntValue;
        char cCharAt;
        int iX;
        String strZ = i64Var.Z();
        i64Var.W();
        if (strZ == null) {
            throw new g64("Invalid '@' rule");
        }
        int i = 0;
        if (!this.a && strZ.equals("media")) {
            ArrayList arrayListI = i(i64Var);
            if (!i64Var.n('{')) {
                throw new g64("Invalid @media rule: missing rule set");
            }
            i64Var.W();
            j64 j64Var = (j64) this.c;
            int size = arrayListI.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListI.get(i2);
                i2++;
                j64 j64Var2 = (j64) obj;
                if (j64Var2 == j64.a || j64Var2 == j64Var) {
                    this.a = true;
                    s64Var.j(k(i64Var));
                    this.a = false;
                    break;
                }
            }
            k(i64Var);
            if (!i64Var.r() && !i64Var.n('}')) {
                throw new g64("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.a || !strZ.equals("import")) {
            while (!i64Var.r() && ((iIntValue = i64Var.E().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && i - 1 == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strY = null;
            if (!i64Var.r()) {
                int i3 = ((i1) i64Var).b;
                if (i64Var.o("url(")) {
                    i64Var.W();
                    String strY2 = i64Var.Y();
                    if (strY2 == null) {
                        String str = (String) ((i1) i64Var).d;
                        StringBuilder sb = new StringBuilder();
                        while (!i64Var.r() && (cCharAt = str.charAt(((i1) i64Var).b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !i1.B(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            ((i1) i64Var).b++;
                            if (cCharAt == '\\') {
                                if (!i64Var.r()) {
                                    int i4 = ((i1) i64Var).b;
                                    ((i1) i64Var).b = i4 + 1;
                                    cCharAt = str.charAt(i4);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iX2 = i64.X(cCharAt);
                                        if (iX2 != -1) {
                                            for (int i5 = 1; i5 <= 5 && !i64Var.r() && (iX = i64.X(str.charAt(((i1) i64Var).b))) != -1; i5++) {
                                                ((i1) i64Var).b++;
                                                iX2 = (iX2 << 4) + iX;
                                            }
                                            sb.append((char) iX2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strY2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strY2 == null) {
                        ((i1) i64Var).b = i3;
                    } else {
                        i64Var.W();
                        if (i64Var.r() || i64Var.o(")")) {
                            strY = strY2;
                        } else {
                            ((i1) i64Var).b = i3;
                        }
                    }
                }
            }
            if (strY == null) {
                strY = i64Var.Y();
            }
            if (strY == null) {
                throw new g64("Invalid @import rule: expected string or url()");
            }
            i64Var.W();
            i(i64Var);
            if (!i64Var.r() && !i64Var.n(';')) {
                throw new g64("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        i64Var.W();
    }

    public final boolean j(s64 s64Var, i64 i64Var) throws g64 {
        ArrayList arrayListA0 = i64Var.a0();
        int i = 0;
        if (arrayListA0 == null || arrayListA0.isEmpty()) {
            return false;
        }
        if (!i64Var.n('{')) {
            throw new g64("Malformed rule block: expected '{'");
        }
        i64Var.W();
        bfi bfiVar = new bfi();
        do {
            String strZ = i64Var.Z();
            i64Var.W();
            if (!i64Var.n(':')) {
                throw new g64("Expected ':'");
            }
            i64Var.W();
            String str = (String) ((i1) i64Var).d;
            String strSubstring = null;
            if (!i64Var.r()) {
                int i2 = ((i1) i64Var).b;
                int iCharAt = str.charAt(i2);
                int i3 = i2;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!i1.B(iCharAt)) {
                        i3 = ((i1) i64Var).b + 1;
                    }
                    iCharAt = i64Var.h();
                }
                if (((i1) i64Var).b > i2) {
                    strSubstring = str.substring(i2, i3);
                } else {
                    ((i1) i64Var).b = i2;
                }
            }
            if (strSubstring == null) {
                throw new g64("Expected property value");
            }
            i64Var.W();
            if (i64Var.n('!')) {
                i64Var.W();
                if (!i64Var.o("important")) {
                    throw new g64("Malformed rule set: found unexpected '!'");
                }
                i64Var.W();
            }
            i64Var.n(';');
            sgi.D(bfiVar, strZ, strSubstring);
            i64Var.W();
            if (i64Var.r()) {
                break;
            }
        } while (!i64Var.n('}'));
        i64Var.W();
        int size = arrayListA0.size();
        while (i < size) {
            Object obj = arrayListA0.get(i);
            i++;
            int i4 = this.b;
            r64 r64Var = new r64();
            r64Var.a = (t64) obj;
            r64Var.b = bfiVar;
            r64Var.c = i4;
            s64Var.i(r64Var);
        }
        return true;
    }

    public final s64 k(i64 i64Var) {
        s64 s64Var = new s64((byte) 0);
        while (!i64Var.r()) {
            try {
                if (!i64Var.o("<!--") && !i64Var.o("-->")) {
                    if (i64Var.n('@')) {
                        h(s64Var, i64Var);
                    } else if (!j(s64Var, i64Var)) {
                        break;
                    }
                }
            } catch (g64 e2) {
                e2.getMessage();
                return s64Var;
            }
        }
        return s64Var;
    }

    public final long l(lp6 lp6Var, boolean z, boolean z2, int i) throws InterruptedIOException {
        int i2;
        byte[] bArr = (byte[]) this.c;
        if (!this.a) {
            if (!lp6Var.readFully(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((e[i4] & i3) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.b = i2;
            if (i2 == -1) {
                qp2.n("No valid varint length mask found");
                return 0L;
            }
            this.a = true;
        }
        int i5 = this.b;
        if (i5 > i) {
            this.a = false;
            return -2L;
        }
        if (i5 != 1) {
            lp6Var.readFully(bArr, 1, i5 - 1, false);
        }
        this.a = false;
        return c(bArr, this.b, z2);
    }

    public final void m(int i) {
        if (i == 1 || this.b != 0) {
            if (16 == i) {
                i |= 8;
            }
            this.b |= i;
        }
    }

    public final x[] r() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        x[] xVarArr = (x[]) this.c;
        if (xVarArr.length == i) {
            this.a = true;
            return xVarArr;
        }
        x[] xVarArr2 = new x[i];
        System.arraycopy(xVarArr, 0, xVarArr2, 0, i);
        return xVarArr2;
    }

    public final void s() {
        int i;
        int iA;
        StylingImageButton stylingImageButton = ((qg7) this.c).k;
        if (this.a && (i = this.b) != 0 && ((iA = vep.A(i)) == 0 || iA == 1)) {
            stylingImageButton.setVisibility(0);
        } else {
            stylingImageButton.setVisibility(8);
        }
    }

    public final void t(tcc tccVar) {
        this.b++;
        tccVar.a(new ob(this, (byte) 7));
    }
}
