package defpackage;

/* loaded from: classes.dex */
public final class wm5 extends zm5 {
    public final e5i e;
    public final e5i f;
    public final float[] g;

    public wm5(e5i e5iVar, e5i e5iVar2) {
        float[] fArrN;
        super(e5iVar2, e5iVar, e5iVar2, null);
        this.e = e5iVar;
        this.f = e5iVar2;
        float[] fArr = (float[]) u59.e.b;
        r0o r0oVar = e5iVar.d;
        float[] fArr2 = e5iVar.i;
        r0o r0oVar2 = e5iVar2.d;
        float[] fArr3 = e5iVar2.j;
        if (ui6.m(r0oVar, r0oVar2)) {
            fArrN = ui6.N(fArr3, fArr2);
        } else {
            float[] fArrA = r0oVar.a();
            float[] fArrA2 = r0oVar2.a();
            r0o r0oVar3 = x1p.f;
            fArrN = ui6.N(ui6.m(r0oVar2, r0oVar3) ? fArr3 : ui6.K(ui6.N(ui6.l(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), e5iVar2.i)), ui6.m(r0oVar, r0oVar3) ? fArr2 : ui6.N(ui6.l(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrN;
    }

    @Override // defpackage.zm5
    public final long a(long j) {
        float fG = u95.g(j);
        float f = u95.f(j);
        float fD = u95.d(j);
        float fC = u95.c(j);
        a5i a5iVar = this.e.p;
        float fD2 = (float) a5iVar.d(fG);
        float fD3 = (float) a5iVar.d(f);
        float fD4 = (float) a5iVar.d(fD);
        float[] fArr = this.g;
        float f2 = (fArr[6] * fD4) + (fArr[3] * fD3) + (fArr[0] * fD2);
        float f3 = (fArr[7] * fD4) + (fArr[4] * fD3) + (fArr[1] * fD2);
        float f4 = (fArr[8] * fD4) + (fArr[5] * fD3) + (fArr[2] * fD2);
        e5i e5iVar = this.f;
        a5i a5iVar2 = e5iVar.m;
        return cs5.b((float) a5iVar2.d(f2), (float) a5iVar2.d(f3), (float) a5iVar2.d(f4), fC, e5iVar);
    }
}
