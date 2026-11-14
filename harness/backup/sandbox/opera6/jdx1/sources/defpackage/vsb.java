package defpackage;

import ads_mobile_sdk.pd;
import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class vsb extends esb {
    public static final g54 l;
    public static final g54 m;
    public static final g54 n;
    public final tlh f;
    public final d04 g;
    public byte h;
    public long i;
    public int j;
    public String k;

    static {
        Charset charset = Charsets.UTF_8;
        g54 g54Var = new g54("'\\".getBytes(charset));
        g54Var.c = "'\\";
        l = g54Var;
        g54 g54Var2 = new g54("\"\\".getBytes(charset));
        g54Var2.c = "\"\\";
        m = g54Var2;
        g54 g54Var3 = new g54("{}[]:, \n\t\r\f/\\;#=".getBytes(charset));
        g54Var3.c = "{}[]:, \n\t\r\f/\\;#=";
        n = g54Var3;
        "\n\r".getBytes(charset);
        "*/".getBytes(charset);
    }

    public vsb(tlh tlhVar) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.h = (byte) 0;
        this.f = tlhVar;
        this.g = tlhVar.b;
        D(6);
    }

    @Override // defpackage.esb
    public final int E(z8b z8bVar) {
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP < 12 || iP > 15) {
            return -1;
        }
        if (iP == 15) {
            return Q(this.k, z8bVar);
        }
        int iE0 = this.f.E0((urf) z8bVar.b);
        if (iE0 != -1) {
            this.h = (byte) 0;
            this.c[this.a - 1] = ((String[]) z8bVar.a)[iE0];
            return iE0;
        }
        String str = this.c[this.a - 1];
        String strV = V();
        int iQ = Q(strV, z8bVar);
        if (iQ == -1) {
            this.h = (byte) 15;
            this.k = strV;
            this.c[this.a - 1] = str;
        }
        return iQ;
    }

    @Override // defpackage.esb
    public final void G() {
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP == 14) {
            long jK = this.f.k(n);
            d04 d04Var = this.g;
            if (jK == -1) {
                jK = d04Var.b;
            }
            d04Var.skip(jK);
        } else if (iP == 13) {
            d0(m);
        } else if (iP == 12) {
            d0(l);
        } else if (iP != 15) {
            pza.h(o18.w(t()), n(), "Expected a name but was ");
            return;
        }
        this.h = (byte) 0;
        this.c[this.a - 1] = "null";
    }

    @Override // defpackage.esb
    public final void H() {
        int i = 0;
        do {
            int iP = this.h;
            if (iP == 0) {
                iP = P();
            }
            if (iP == 3) {
                D(1);
            } else if (iP == 1) {
                D(3);
            } else {
                if (iP == 4) {
                    i--;
                    if (i < 0) {
                        pza.h(o18.w(t()), n(), "Expected a value but was ");
                        return;
                    }
                    this.a--;
                } else if (iP == 2) {
                    i--;
                    if (i < 0) {
                        pza.h(o18.w(t()), n(), "Expected a value but was ");
                        return;
                    }
                    this.a--;
                } else {
                    d04 d04Var = this.g;
                    if (iP == 14 || iP == 10) {
                        long jK = this.f.k(n);
                        if (jK == -1) {
                            jK = d04Var.b;
                        }
                        d04Var.skip(jK);
                    } else if (iP == 9 || iP == 13) {
                        d0(m);
                    } else if (iP == 8 || iP == 12) {
                        d0(l);
                    } else if (iP == 17) {
                        d04Var.skip(this.j);
                    } else if (iP == 18) {
                        pza.h(o18.w(t()), n(), "Expected a value but was ");
                        return;
                    }
                }
                this.h = (byte) 0;
            }
            i++;
            this.h = (byte) 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = "null";
    }

    public final void K() throws g65 {
        I("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0187, code lost:
    
        if (T(r10) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0189, code lost:
    
        if (r1 != 2) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x018b, code lost:
    
        if (r4 == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0191, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0193, code lost:
    
        if (r13 == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0197, code lost:
    
        if (r8 != r18) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0199, code lost:
    
        if (r13 != 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x019b, code lost:
    
        if (r13 != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x019d, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x019e, code lost:
    
        r23.i = r8;
        r7.skip(r2);
        r9 = 16;
        r23.h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01a9, code lost:
    
        if (r1 == 2) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ac, code lost:
    
        if (r1 == 4) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01af, code lost:
    
        if (r1 != 7) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01b1, code lost:
    
        r23.j = r2;
        r9 = 17;
        r23.h = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int P() throws defpackage.g65, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vsb.P():int");
    }

    public final int Q(String str, z8b z8bVar) {
        int length = ((String[]) z8bVar.a).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) z8bVar.a)[i])) {
                this.h = (byte) 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean T(int i) throws g65 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case pd.O0 /* 93 */:
                            return false;
                        case pd.N0 /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        K();
        throw null;
    }

    public final String V() {
        String strX;
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP == 14) {
            strX = Z();
        } else if (iP == 13) {
            strX = X(m);
        } else if (iP == 12) {
            strX = X(l);
        } else {
            if (iP != 15) {
                pza.h(o18.w(t()), n(), "Expected a name but was ");
                return null;
            }
            strX = this.k;
        }
        this.h = (byte) 0;
        this.c[this.a - 1] = strX;
        return strX;
    }

    public final int W(boolean z) throws g65, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            tlh tlhVar = this.f;
            if (!tlhVar.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            d04 d04Var = this.g;
            byte bN = d04Var.n(j);
            if (bN != 10 && bN != 32 && bN != 13 && bN != 9) {
                d04Var.skip(j);
                if (bN == 47) {
                    if (tlhVar.request(2L)) {
                        K();
                        throw null;
                    }
                } else if (bN == 35) {
                    K();
                    throw null;
                }
                return bN;
            }
            i = i2;
        }
    }

    public final String X(g54 g54Var) throws g65 {
        StringBuilder sb = null;
        while (true) {
            long jK = this.f.k(g54Var);
            if (jK == -1) {
                I("Unterminated string");
                throw null;
            }
            d04 d04Var = this.g;
            if (d04Var.n(jK) != 92) {
                if (sb == null) {
                    String strT = d04Var.t(jK, Charsets.UTF_8);
                    d04Var.readByte();
                    return strT;
                }
                sb.append(d04Var.t(jK, Charsets.UTF_8));
                d04Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(d04Var.t(jK, Charsets.UTF_8));
            d04Var.readByte();
            sb.append(b0());
        }
    }

    public final String Z() {
        long jK = this.f.k(n);
        d04 d04Var = this.g;
        if (jK == -1) {
            return d04Var.D();
        }
        d04Var.getClass();
        return d04Var.t(jK, Charsets.UTF_8);
    }

    public final char b0() throws g65, EOFException {
        int i;
        tlh tlhVar = this.f;
        if (!tlhVar.request(1L)) {
            I("Unterminated escape sequence");
            throw null;
        }
        d04 d04Var = this.g;
        byte b = d04Var.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            I("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!tlhVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(n()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bN = d04Var.n(i2);
            char c2 = (char) (c << 4);
            if (bN >= 48 && bN <= 57) {
                i = bN - 48;
            } else if (bN >= 97 && bN <= 102) {
                i = bN - 87;
            } else {
                if (bN < 65 || bN > 70) {
                    I("\\u".concat(d04Var.t(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = bN - 55;
            }
            c = (char) (i + c2);
        }
        d04Var.skip(4L);
        return c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = (byte) 0;
        this.b[0] = 8;
        this.a = 1;
        this.g.k();
        this.f.close();
    }

    public final void d0(g54 g54Var) throws g65, EOFException {
        while (true) {
            long jK = this.f.k(g54Var);
            if (jK == -1) {
                I("Unterminated string");
                throw null;
            }
            d04 d04Var = this.g;
            byte bN = d04Var.n(jK);
            long j = jK + 1;
            if (bN != 92) {
                d04Var.skip(j);
                return;
            } else {
                d04Var.skip(j);
                b0();
            }
        }
    }

    @Override // defpackage.esb
    public final void h() {
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP != 3) {
            pza.h(o18.w(t()), n(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        D(1);
        this.d[this.a - 1] = 0;
        this.h = (byte) 0;
    }

    @Override // defpackage.esb
    public final void k() {
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP != 1) {
            pza.h(o18.w(t()), n(), "Expected BEGIN_OBJECT but was ");
        } else {
            D(3);
            this.h = (byte) 0;
        }
    }

    @Override // defpackage.esb
    public final void l() {
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP != 4) {
            pza.h(o18.w(t()), n(), "Expected END_ARRAY but was ");
            return;
        }
        int i = this.a;
        this.a = i - 1;
        int[] iArr = this.d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.h = (byte) 0;
    }

    @Override // defpackage.esb
    public final void m() {
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP != 2) {
            pza.h(o18.w(t()), n(), "Expected END_OBJECT but was ");
            return;
        }
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = (byte) 0;
    }

    @Override // defpackage.esb
    public final boolean o() throws g65, EOFException {
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        return (iP == 2 || iP == 4 || iP == 18) ? false : true;
    }

    @Override // defpackage.esb
    public final boolean p() {
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP == 5) {
            this.h = (byte) 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iP != 6) {
            pza.h(o18.w(t()), n(), "Expected a boolean but was ");
            return false;
        }
        this.h = (byte) 0;
        int[] iArr2 = this.d;
        int i2 = this.a - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // defpackage.esb
    public final double q() {
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP == 16) {
            this.h = (byte) 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iP == 17) {
            long j = this.j;
            d04 d04Var = this.g;
            d04Var.getClass();
            this.k = d04Var.t(j, Charsets.UTF_8);
        } else if (iP == 9) {
            this.k = X(m);
        } else if (iP == 8) {
            this.k = X(l);
        } else if (iP == 10) {
            this.k = Z();
        } else if (iP != 11) {
            pza.h(o18.w(t()), n(), "Expected a double but was ");
            return 0.0d;
        }
        this.h = (byte) 11;
        try {
            double d = Double.parseDouble(this.k);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new g65("JSON forbids NaN and infinities: " + d + " at path " + n());
            }
            this.k = null;
            this.h = (byte) 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            pza.h(this.k, n(), "Expected a double but was ");
            return 0.0d;
        }
    }

    @Override // defpackage.esb
    public final int r() {
        String strX;
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP == 16) {
            long j = this.i;
            int i = (int) j;
            if (j == i) {
                this.h = (byte) 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new e22("Expected an int but was " + this.i + " at path " + n());
        }
        if (iP == 17) {
            long j2 = this.j;
            d04 d04Var = this.g;
            d04Var.getClass();
            this.k = d04Var.t(j2, Charsets.UTF_8);
        } else {
            if (iP == 9) {
                strX = X(m);
            } else if (iP == 8) {
                strX = X(l);
            } else if (iP != 11) {
                pza.h(o18.w(t()), n(), "Expected an int but was ");
                return 0;
            }
            this.k = strX;
            try {
                int i3 = Integer.parseInt(strX);
                this.h = (byte) 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = (byte) 11;
        try {
            double d = Double.parseDouble(this.k);
            int i5 = (int) d;
            if (i5 != d) {
                pza.h(this.k, n(), "Expected an int but was ");
                return 0;
            }
            this.k = null;
            this.h = (byte) 0;
            int[] iArr3 = this.d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            pza.h(this.k, n(), "Expected an int but was ");
            return 0;
        }
    }

    @Override // defpackage.esb
    public final String s() {
        String strT;
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        if (iP == 10) {
            strT = Z();
        } else if (iP == 9) {
            strT = X(m);
        } else if (iP == 8) {
            strT = X(l);
        } else if (iP == 11) {
            strT = this.k;
            this.k = null;
        } else if (iP == 16) {
            strT = Long.toString(this.i);
        } else {
            if (iP != 17) {
                pza.h(o18.w(t()), n(), "Expected a string but was ");
                return null;
            }
            long j = this.j;
            d04 d04Var = this.g;
            d04Var.getClass();
            strT = d04Var.t(j, Charsets.UTF_8);
        }
        this.h = (byte) 0;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return strT;
    }

    @Override // defpackage.esb
    public final int t() throws g65, EOFException {
        int iP = this.h;
        if (iP == 0) {
            iP = P();
        }
        switch (iP) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                t40.h();
                return 0;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f + ")";
    }
}
