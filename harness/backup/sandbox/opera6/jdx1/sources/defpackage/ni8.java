package defpackage;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class ni8 implements y3n, he4, bkg {
    public y3n a;
    public he4 b;
    public mmi c;
    public mmi d;

    @Override // defpackage.he4
    public final void a(float[] fArr, long j) {
        mmi mmiVar = this.d;
        if (mmiVar != null) {
            mmiVar.a(fArr, j);
        }
        he4 he4Var = this.b;
        if (he4Var != null) {
            he4Var.a(fArr, j);
        }
    }

    @Override // defpackage.y3n
    public final void b(long j, long j2, oj9 oj9Var, MediaFormat mediaFormat) {
        mmi mmiVar = this.c;
        if (mmiVar != null) {
            mmiVar.b(j, j2, oj9Var, mediaFormat);
        }
        y3n y3nVar = this.a;
        if (y3nVar != null) {
            y3nVar.b(j, j2, oj9Var, mediaFormat);
        }
    }

    @Override // defpackage.he4
    public final void c() {
        mmi mmiVar = this.d;
        if (mmiVar != null) {
            mmiVar.c();
        }
        he4 he4Var = this.b;
        if (he4Var != null) {
            he4Var.c();
        }
    }

    @Override // defpackage.bkg
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.a = (y3n) obj;
            return;
        }
        if (i == 8) {
            this.b = (he4) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        g0k g0kVar = (g0k) obj;
        if (g0kVar == null) {
            this.c = null;
            this.d = null;
        } else {
            mmi mmiVar = g0kVar.f;
            this.c = mmiVar;
            this.d = mmiVar;
        }
    }
}
