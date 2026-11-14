package defpackage;

import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final /* synthetic */ class k6n implements hcb, xjj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjn b;

    public /* synthetic */ k6n(tjn tjnVar, byte b) {
        this.a = b;
        this.b = tjnVar;
    }

    @Override // defpackage.hcb
    public final int getAsInt() {
        byte b = this.a;
        tjn tjnVar = this.b;
        switch (b) {
        }
        return tjnVar.a();
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        u6n u6nVar = (u6n) iVar;
        String strE = this.b.e();
        aln alnVar = ((hkb) obj).a;
        boolean zEquals = strE.equals(alnVar.getId());
        u6nVar.getClass();
        u6nVar.f = alnVar;
        u6nVar.g = zEquals;
        u6nVar.U(alnVar);
    }
}
