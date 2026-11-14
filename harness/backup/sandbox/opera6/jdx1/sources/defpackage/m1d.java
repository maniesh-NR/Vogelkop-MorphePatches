package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m1d implements n27 {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    public final /* synthetic */ o1d d;

    public m1d(o1d o1dVar) {
        this.d = o1dVar;
    }

    public final void a(pga pgaVar, float f) {
        o1d o1dVar = this.d;
        pr prVar = o1dVar.q;
        if (prVar == null) {
            prVar = new pr((byte) 6);
            o1dVar.q = prVar;
        }
        int iU = e82.u(pgaVar, (pga[]) prVar.b);
        if (iU >= 0) {
            float[] fArr = (float[]) prVar.c;
            if (fArr[iU] != f) {
                fArr[iU] = f;
                ((byte[]) prVar.d)[iU] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) prVar.d;
                if (bArr[iU] == 2) {
                    bArr[iU] = 0;
                    return;
                }
                return;
            }
        }
        int i = prVar.a;
        pga[] pgaVarArr = (pga[]) prVar.b;
        if (i == pgaVarArr.length) {
            int i2 = i << 1;
            prVar.b = (pga[]) Arrays.copyOf(pgaVarArr, i2);
            prVar.c = Arrays.copyOf((float[]) prVar.c, i2);
            prVar.d = Arrays.copyOf((byte[]) prVar.d, i2);
        }
        ((pga[]) prVar.b)[i] = pgaVar;
        ((byte[]) prVar.d)[i] = 3;
        ((float[]) prVar.c)[i] = f;
        prVar.a++;
    }

    @Override // defpackage.n27
    public final float b() {
        return this.d.b();
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.d.n0();
    }
}
