package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class iaa {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final r9i o;

    public iaa(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, r9i r9iVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = r9iVar;
    }

    public static iaa a(g1g g1gVar, boolean z, r9i r9iVar) {
        boolean z2;
        sa2 sa2VarY;
        int i;
        int i2 = 4;
        try {
            if (z) {
                g1gVar.O(4);
            } else {
                g1gVar.O(21);
            }
            int iA = g1gVar.A() & 3;
            int iA2 = g1gVar.A();
            int i3 = g1gVar.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= iA2) {
                    break;
                }
                g1gVar.O(1);
                int iH = g1gVar.H();
                for (int i7 = 0; i7 < iH; i7++) {
                    int iH2 = g1gVar.H();
                    i6 += iH2 + 4;
                    g1gVar.O(iH2);
                }
                i5++;
            }
            g1gVar.N(i3);
            byte[] bArr = new byte[i6];
            r9i r9iVar2 = r9iVar;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String strA = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < iA2) {
                int iA3 = g1gVar.A() & 63;
                int iH3 = g1gVar.H();
                int i20 = i4;
                r9i r9iVarA0 = r9iVar2;
                while (i20 < iH3) {
                    boolean z3 = z2;
                    int iH4 = g1gVar.H();
                    int i21 = iA;
                    System.arraycopy(qyn.d, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(g1gVar.a, g1gVar.b, bArr, i22, iH4);
                    if (iA3 == 32 && i20 == 0) {
                        r9iVarA0 = qyn.a0(i22, i22 + iH4, bArr);
                    } else {
                        if (iA3 == 33 && i20 == 0) {
                            ehe eheVarZ = qyn.Z(bArr, i22, i22 + iH4, r9iVarA0);
                            i8 = eheVarZ.a + 1;
                            i9 = eheVarZ.g;
                            int i23 = eheVarZ.h;
                            i11 = eheVarZ.c + 8;
                            i12 = eheVarZ.d + 8;
                            int i24 = eheVarZ.k;
                            i10 = i23;
                            int i25 = eheVarZ.l;
                            int i26 = eheVarZ.m;
                            float f2 = eheVarZ.i;
                            int i27 = eheVarZ.j;
                            che cheVar = eheVarZ.b;
                            if (cheVar != null) {
                                i = i27;
                                strA = j75.a(cheVar.a, cheVar.b, cheVar.c, cheVar.d, cheVar.e, cheVar.f);
                            } else {
                                i = i27;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i26;
                            i14 = i25;
                            i13 = i24;
                        } else if (iA3 == 39 && i20 == 0 && (sa2VarY = qyn.Y(i22, i22 + iH4, bArr)) != null && r9iVarA0 != null) {
                            i4 = 0;
                            i16 = sa2VarY.b == ((bhe) ((h1b) r9iVarA0.b).get(0)).b ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i19 = i22 + iH4;
                    g1gVar.O(iH4);
                    i20++;
                    z2 = z3;
                    iA = i21;
                    i2 = 4;
                }
                i18++;
                r9iVar2 = r9iVarA0;
                i2 = 4;
            }
            return new iaa(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iA + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, strA, r9iVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw s1g.d("Error parsing".concat(z ? "L-HEVC config" : "HEVC config"), e);
        }
    }
}
