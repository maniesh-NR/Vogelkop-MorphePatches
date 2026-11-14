package defpackage;

/* loaded from: classes.dex */
public class cze {
    public final dfe a = new dfe(new pye[16]);
    public final dee b = new dee(10);

    public boolean a(j1d j1dVar, b2c b2cVar, rn9 rn9Var, boolean z) {
        dfe dfeVar = this.a;
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((pye) objArr[i2]).a(j1dVar, b2cVar, rn9Var, z) || z2;
        }
        return z2;
    }

    public void b(rn9 rn9Var) {
        dfe dfeVar = this.a;
        int i = dfeVar.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((pye) dfeVar.a[i]).d.b == 0) {
                dfeVar.l(i);
            }
        }
    }
}
