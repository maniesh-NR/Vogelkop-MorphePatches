package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class nua extends z7h {
    public static final s49 b = new s49((byte) 27);
    public final lua a;

    public nua(lua luaVar) {
        this.a = luaVar;
    }

    public static ys4 A(g1g g1gVar, int i, int i2, boolean z, int i3, lua luaVar) throws Throwable {
        int i4 = g1gVar.b;
        int iR = R(g1gVar.a, i4);
        String str = new String(g1gVar.a, i4, iR - i4, StandardCharsets.ISO_8859_1);
        g1gVar.N(iR + 1);
        int iM = g1gVar.m();
        int iM2 = g1gVar.m();
        long jC = g1gVar.C();
        if (jC == 4294967295L) {
            jC = -1;
        }
        long jC2 = g1gVar.C();
        long j = jC2 == 4294967295L ? -1L : jC2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (g1gVar.b < i5) {
            oua ouaVarD = D(i2, g1gVar, z, i3, luaVar);
            if (ouaVarD != null) {
                arrayList.add(ouaVarD);
            }
        }
        return new ys4(str, iM, iM2, jC, j, (oua[]) arrayList.toArray(new oua[0]));
    }

    public static zs4 B(g1g g1gVar, int i, int i2, boolean z, int i3, lua luaVar) throws Throwable {
        int i4 = g1gVar.b;
        int iR = R(g1gVar.a, i4);
        String str = new String(g1gVar.a, i4, iR - i4, StandardCharsets.ISO_8859_1);
        g1gVar.N(iR + 1);
        int iA = g1gVar.A();
        boolean z2 = (iA & 2) != 0;
        boolean z3 = (iA & 1) != 0;
        int iA2 = g1gVar.A();
        String[] strArr = new String[iA2];
        for (int i5 = 0; i5 < iA2; i5++) {
            int i6 = g1gVar.b;
            int iR2 = R(g1gVar.a, i6);
            strArr[i5] = new String(g1gVar.a, i6, iR2 - i6, StandardCharsets.ISO_8859_1);
            g1gVar.N(iR2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (g1gVar.b < i7) {
            oua ouaVarD = D(i2, g1gVar, z, i3, luaVar);
            if (ouaVarD != null) {
                arrayList.add(ouaVarD);
            }
        }
        return new zs4(str, z2, z3, strArr, (oua[]) arrayList.toArray(new oua[0]));
    }

    public static xb5 C(int i, g1g g1gVar) {
        if (i < 4) {
            return null;
        }
        int iA = g1gVar.A();
        Charset charsetO = O(iA);
        byte[] bArr = new byte[3];
        g1gVar.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        g1gVar.k(bArr2, 0, i2);
        int iQ = Q(0, iA, bArr2);
        String str2 = new String(bArr2, 0, iQ, charsetO);
        int iN = N(iA) + iQ;
        return new xb5(str, str2, H(bArr2, iN, Q(iN, iA, bArr2), charsetO));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0228  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [oua] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [g1g] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [g1g] */
    /* JADX WARN: Type inference failed for: r1v8, types: [g1g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.oua D(int r18, defpackage.g1g r19, boolean r20, int r21, defpackage.lua r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nua.D(int, g1g, boolean, int, lua):oua");
    }

    public static xv9 E(int i, g1g g1gVar) {
        int iA = g1gVar.A();
        Charset charsetO = O(iA);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g1gVar.k(bArr, 0, i2);
        int iR = R(bArr, 0);
        String strP = dzd.p(new String(bArr, 0, iR, StandardCharsets.ISO_8859_1));
        int i3 = iR + 1;
        int iQ = Q(i3, iA, bArr);
        String strH = H(bArr, i3, iQ, charsetO);
        int iN = N(iA) + iQ;
        int iQ2 = Q(iN, iA, bArr);
        String strH2 = H(bArr, iN, iQ2, charsetO);
        int iN2 = N(iA) + iQ2;
        return new xv9(strP, strH, strH2, i2 <= iN2 ? tym.b : Arrays.copyOfRange(bArr, iN2, i2));
    }

    public static n3e F(int i, g1g g1gVar) {
        int iH = g1gVar.H();
        int iD = g1gVar.D();
        int iD2 = g1gVar.D();
        int iA = g1gVar.A();
        int iA2 = g1gVar.A();
        bq4 bq4Var = new bq4();
        bq4Var.o(g1gVar);
        int i2 = ((i - 10) << 3) / (iA + iA2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bq4Var.i(iA);
            int i5 = bq4Var.i(iA2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new n3e(iH, iD, iD2, iArr, iArr2);
    }

    public static wyg G(int i, g1g g1gVar) {
        byte[] bArr = new byte[i];
        g1gVar.k(bArr, 0, i);
        int iR = R(bArr, 0);
        String str = new String(bArr, 0, iR, StandardCharsets.ISO_8859_1);
        int i2 = iR + 1;
        return new wyg(str, i <= i2 ? tym.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String H(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static xil I(int i, g1g g1gVar, String str) {
        if (i < 1) {
            return null;
        }
        int iA = g1gVar.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g1gVar.k(bArr, 0, i2);
        return new xil(str, null, J(iA, 0, bArr));
    }

    public static csh J(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return h1b.v("");
        }
        z0b z0bVarP = h1b.p();
        int iQ = Q(i2, i, bArr);
        while (i2 < iQ) {
            z0bVarP.c(new String(bArr, i2, iQ - i2, O(i)));
            i2 = N(i) + iQ;
            iQ = Q(i2, i, bArr);
        }
        csh cshVarG = z0bVarP.g();
        return cshVarG.isEmpty() ? h1b.v("") : cshVarG;
    }

    public static xil K(int i, g1g g1gVar) {
        if (i < 1) {
            return null;
        }
        int iA = g1gVar.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g1gVar.k(bArr, 0, i2);
        int iQ = Q(0, iA, bArr);
        return new xil("TXXX", new String(bArr, 0, iQ, O(iA)), J(iA, N(iA) + iQ, bArr));
    }

    public static zpm L(int i, g1g g1gVar, String str) {
        byte[] bArr = new byte[i];
        g1gVar.k(bArr, 0, i);
        return new zpm(str, null, new String(bArr, 0, R(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static zpm M(int i, g1g g1gVar) {
        if (i < 1) {
            return null;
        }
        int iA = g1gVar.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g1gVar.k(bArr, 0, i2);
        int iQ = Q(0, iA, bArr);
        String str = new String(bArr, 0, iQ, O(iA));
        int iN = N(iA) + iQ;
        return new zpm("WXXX", str, H(bArr, iN, R(bArr, iN), StandardCharsets.ISO_8859_1));
    }

    public static int N(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset O(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String P(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int Q(int i, int i2, byte[] bArr) {
        int iR = R(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iR;
        }
        while (iR < bArr.length - 1) {
            if ((iR - i) % 2 == 0 && bArr[iR + 1] == 0) {
                return iR;
            }
            iR = R(bArr, iR + 1);
        }
        return bArr.length;
    }

    public static int R(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int S(int i, g1g g1gVar) {
        byte[] bArr = g1gVar.a;
        int i2 = g1gVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0006, B:7:0x0013, B:17:0x0039, B:19:0x0041, B:21:0x0063, B:25:0x006a, B:38:0x0082, B:39:0x0084, B:41:0x0089, B:47:0x0097, B:29:0x0071, B:33:0x0078, B:8:0x0020), top: B:54:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v7 int) = (r3v5 int), (r3v19 int) binds: [B:34:0x007a, B:26:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0006, B:7:0x0013, B:17:0x0039, B:19:0x0041, B:21:0x0063, B:25:0x006a, B:38:0x0082, B:39:0x0084, B:41:0x0089, B:47:0x0097, B:29:0x0071, B:33:0x0078, B:8:0x0020), top: B:54:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean T(defpackage.g1g r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> La0
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L9c
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r1.m()     // Catch: java.lang.Throwable -> La0
            long r8 = r1.C()     // Catch: java.lang.Throwable -> La0
            int r10 = r1.H()     // Catch: java.lang.Throwable -> La0
            goto L2a
        L20:
            int r7 = r1.D()     // Catch: java.lang.Throwable -> La0
            int r8 = r1.D()     // Catch: java.lang.Throwable -> La0
            long r8 = (long) r8     // Catch: java.lang.Throwable -> La0
            r10 = r6
        L2a:
            r11 = 0
            if (r7 != 0) goto L34
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L34
            if (r10 == 0) goto L9c
        L34:
            r7 = 4
            if (r0 != r7) goto L61
            if (r21 != 0) goto L61
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L92
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L61:
            if (r0 != r7) goto L6f
            r3 = r10 & 64
            if (r3 == 0) goto L69
            r3 = r4
            goto L6a
        L69:
            r3 = r6
        L6a:
            r10 = r10 & 1
            if (r10 == 0) goto L7c
            goto L80
        L6f:
            if (r0 != r3) goto L7e
            r3 = r10 & 32
            if (r3 == 0) goto L77
            r3 = r4
            goto L78
        L77:
            r3 = r6
        L78:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 != 0) goto L80
        L7c:
            r4 = r6
            goto L80
        L7e:
            r3 = r6
            r4 = r3
        L80:
            if (r4 == 0) goto L84
            int r3 = r3 + 4
        L84:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La0
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L92
            int r3 = r1.a()     // Catch: java.lang.Throwable -> La0
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L96
        L92:
            r1.N(r2)
            return r6
        L96:
            int r3 = (int) r8
            r1.O(r3)     // Catch: java.lang.Throwable -> La0
            goto L6
        L9c:
            r1.N(r2)
            return r4
        La0:
            r0 = move-exception
            r1.N(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nua.T(g1g, int, int, boolean):boolean");
    }

    public static jo1 z(g1g g1gVar, int i, int i2) {
        int iR;
        String strConcat;
        int iA = g1gVar.A();
        Charset charsetO = O(iA);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        g1gVar.k(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + cqp.K0(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iR = 2;
        } else {
            iR = R(bArr, 0);
            String strK0 = cqp.K0(new String(bArr, 0, iR, StandardCharsets.ISO_8859_1));
            strConcat = strK0.indexOf(47) == -1 ? "image/".concat(strK0) : strK0;
        }
        int i4 = bArr[iR + 1] & 255;
        int i5 = iR + 2;
        int iQ = Q(i5, iA, bArr);
        String str = new String(bArr, i5, iQ - i5, charsetO);
        int iN = N(iA) + iQ;
        return new jo1(strConcat, str, i4, i3 <= iN ? tym.b : Arrays.copyOfRange(bArr, iN, i3));
    }

    @Override // defpackage.z7h
    public final lxd g(uxd uxdVar, ByteBuffer byteBuffer) {
        return y(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lxd y(int r12, byte[] r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            g1g r1 = new g1g
            r1.<init>(r13, r12)
            int r12 = r1.a()
            r13 = 2
            r2 = 0
            r3 = 1
            r4 = 4
            r5 = 0
            r6 = 10
            if (r12 >= r6) goto L1f
            java.lang.String r12 = "Data too short to be an ID3 tag"
            defpackage.w7d.K(r12)
        L1c:
            r9 = r5
            goto L97
        L1f:
            int r12 = r1.D()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r12 == r7) goto L40
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r7 = "%06X"
            java.lang.String r12 = java.lang.String.format(r7, r12)
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.String r12 = r7.concat(r12)
            defpackage.w7d.K(r12)
            goto L1c
        L40:
            int r12 = r1.A()
            r1.O(r3)
            int r7 = r1.A()
            int r8 = r1.z()
            if (r12 != r13) goto L5b
            r9 = r7 & 64
            if (r9 == 0) goto L82
            java.lang.String r12 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            defpackage.w7d.K(r12)
            goto L1c
        L5b:
            r9 = 3
            if (r12 != r9) goto L6c
            r9 = r7 & 64
            if (r9 == 0) goto L82
            int r9 = r1.m()
            r1.O(r9)
            int r9 = r9 + r4
            int r8 = r8 - r9
            goto L82
        L6c:
            if (r12 != r4) goto L91
            r9 = r7 & 64
            if (r9 == 0) goto L7c
            int r9 = r1.z()
            int r10 = r9 + (-4)
            r1.O(r10)
            int r8 = r8 - r9
        L7c:
            r9 = r7 & 16
            if (r9 == 0) goto L82
            int r8 = r8 + (-10)
        L82:
            if (r12 >= r4) goto L8a
            r7 = r7 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L8a
            r7 = r3
            goto L8b
        L8a:
            r7 = r2
        L8b:
            mua r9 = new mua
            r9.<init>(r12, r7, r8)
            goto L97
        L91:
            java.lang.String r7 = "Skipped ID3 tag with unsupported majorVersion="
            vep.y(r12, r7)
            goto L1c
        L97:
            if (r9 != 0) goto L9a
            return r5
        L9a:
            short r12 = r9.a
            int r7 = r1.b
            if (r12 != r13) goto La1
            r6 = 6
        La1:
            int r13 = r9.c
            boolean r8 = r9.b
            if (r8 == 0) goto Lab
            int r13 = S(r13, r1)
        Lab:
            int r7 = r7 + r13
            r1.M(r7)
            boolean r13 = T(r1, r12, r6, r2)
            if (r13 != 0) goto Lc5
            if (r12 != r4) goto Lbf
            boolean r13 = T(r1, r4, r6, r3)
            if (r13 == 0) goto Lbf
            r2 = r3
            goto Lc5
        Lbf:
            java.lang.String r11 = "Failed to validate ID3 tag with majorVersion="
            vep.y(r12, r11)
            return r5
        Lc5:
            int r13 = r1.a()
            if (r13 < r6) goto Ld7
            lua r13 = r11.a
            oua r13 = D(r12, r1, r2, r6, r13)
            if (r13 == 0) goto Lc5
            r0.add(r13)
            goto Lc5
        Ld7:
            lxd r11 = new lxd
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nua.y(int, byte[]):lxd");
    }
}
