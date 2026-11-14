package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ov2 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public ov2(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static ov2 a(g1g g1gVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            g1gVar.O(4);
            int iA = (g1gVar.A() & 3) + 1;
            if (iA == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA2 = g1gVar.A() & 31;
            for (int i9 = 0; i9 < iA2; i9++) {
                int iH = g1gVar.H();
                int i10 = g1gVar.b;
                g1gVar.O(iH);
                byte[] bArr = g1gVar.a;
                byte[] bArr2 = new byte[iH + 4];
                System.arraycopy(j75.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iH);
                arrayList.add(bArr2);
            }
            int iA3 = g1gVar.A();
            for (int i11 = 0; i11 < iA3; i11++) {
                int iH2 = g1gVar.H();
                int i12 = g1gVar.b;
                g1gVar.O(iH2);
                byte[] bArr3 = g1gVar.a;
                byte[] bArr4 = new byte[iH2 + 4];
                System.arraycopy(j75.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iH2);
                arrayList.add(bArr4);
            }
            if (iA2 > 0) {
                hhe hheVarB0 = qyn.b0(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = hheVarB0.e;
                int i14 = hheVarB0.f;
                int i15 = hheVarB0.h + 8;
                int i16 = hheVarB0.i + 8;
                int i17 = hheVarB0.p;
                int i18 = hheVarB0.q;
                int i19 = hheVarB0.r;
                int i20 = hheVarB0.s;
                float f2 = hheVarB0.g;
                int i21 = hheVarB0.a;
                int i22 = hheVarB0.b;
                int i23 = hheVarB0.c;
                byte[] bArr5 = j75.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new ov2(arrayList, iA, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw s1g.d("Error parsing AVC config", e);
        }
    }
}
