package defpackage;

/* loaded from: classes.dex */
public final class hrf implements zy {
    public final /* synthetic */ int a;
    public final /* synthetic */ irf b;

    public hrf(irf irfVar, int i) {
        this.a = i;
        this.b = irfVar;
    }

    @Override // defpackage.zy
    public final boolean a(yz yzVar) {
        irf irfVar = this.b;
        if (irfVar.d) {
            return false;
        }
        irfVar.e++;
        irfVar.h = true;
        irfVar.a(null);
        oyg oygVar = irfVar.a;
        zy zyVar = oygVar.a;
        if (zyVar == null) {
            return false;
        }
        zyVar.b(yzVar);
        oygVar.b.put(this.a, yzVar);
        oygVar.a(irfVar);
        return true;
    }

    @Override // defpackage.zy
    public final void onFailed(String str) {
        this.b.b(this.a, str);
    }
}
