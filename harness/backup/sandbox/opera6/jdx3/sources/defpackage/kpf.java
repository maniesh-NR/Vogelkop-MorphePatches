package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class kpf extends f73 {
    public final /* synthetic */ byte h;
    public fdn i;
    public ac1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpf(owc owcVar, tah tahVar, byte b) {
        super(owcVar, tahVar);
        this.h = b;
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        ac1 ac1Var;
        switch (this.h) {
            case 0:
                fdn fdnVar = ((qmf) ja2Var).b;
                this.i = fdnVar;
                this.j = new ac1(fdnVar.c, (CharSequence) null, 0, 0, (View.OnClickListener) null);
                break;
            case 1:
                if (!z) {
                    fdn fdnVar2 = ((nxc) ja2Var).b;
                    this.i = fdnVar2;
                    this.j = new ac1(fdnVar2.c, (CharSequence) null, 0, 0, (View.OnClickListener) null);
                    break;
                }
                break;
            case 2:
                vxc vxcVar = (vxc) ja2Var;
                fdn fdnVar3 = vxcVar.d;
                rcd rcdVar = vxcVar.c;
                fdn fdnVar4 = fdnVar3.f;
                String str = fdnVar3.c;
                this.i = fdnVar3;
                if (fdnVar4 == null) {
                    ac1Var = new ac1(nzb.y(str, rcdVar));
                } else {
                    ac1 ac1Var2 = new ac1(nzb.y(fdnVar4.c, vxcVar.b));
                    ac1Var2.d = nzb.y(str, rcdVar);
                    ac1Var = ac1Var2;
                }
                this.j = new ac1((CharSequence) ac1Var.c, (CharSequence) ac1Var.d, ac1Var.a, ac1Var.b, (obn) ac1Var.e);
                break;
            default:
                wxc wxcVar = (wxc) ja2Var;
                fdn fdnVar5 = wxcVar.d;
                this.i = fdnVar5;
                this.j = new ac1(nzb.y(fdnVar5.c, wxcVar.b), (CharSequence) null, 0, 0, (View.OnClickListener) null);
                break;
        }
    }

    @Override // defpackage.f73
    public final ac1 b0() {
        switch (this.h) {
        }
        return this.j;
    }

    @Override // defpackage.f73
    public final fdn c0() {
        switch (this.h) {
        }
        return this.i;
    }
}
