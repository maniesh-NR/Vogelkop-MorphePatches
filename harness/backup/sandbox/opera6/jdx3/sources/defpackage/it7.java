package defpackage;

import com.opera.hype.image.editor.EditImage;

/* loaded from: classes.dex */
public final class it7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ it7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(fya fyaVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                EditImage editImage = (EditImage) obj;
                if (fyaVar instanceof ba3) {
                    ba3 ba3Var = (ba3) fyaVar;
                    xtb[] xtbVarArr = EditImage.s;
                    if (editImage.e(ba3Var) == null) {
                        editImage.b(ba3Var);
                    }
                }
                editImage.invalidate();
                break;
            default:
                lxa lxaVar = (lxa) obj;
                lxaVar.s.a(new xba(wba.a, fyaVar));
                lxaVar.h();
                break;
        }
    }

    public final void b(cya cyaVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                EditImage editImage = (EditImage) obj;
                fya fyaVar = cyaVar.a;
                if (fyaVar instanceof ba3) {
                    ba3 ba3Var = (ba3) fyaVar;
                    xtb[] xtbVarArr = EditImage.s;
                    bfl bflVarE = editImage.e(ba3Var);
                    if (bflVarE != null) {
                        ba3Var.h(bflVarE.f);
                        bpd bpdVar = editImage.g;
                        i97 i97Var = (i97) bpdVar.c;
                        if (i97Var.c((EditImage) bpdVar.b)) {
                            xtb[] xtbVarArr2 = EditImage.s;
                            bflVarE.d(i97Var);
                        }
                    }
                }
                editImage.invalidate();
                break;
            default:
                lxa lxaVar = (lxa) obj;
                lxaVar.s.a(new xba(wba.c, cyaVar));
                lxaVar.h();
                break;
        }
    }

    public final void c(fya fyaVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                EditImage editImage = (EditImage) obj;
                if (fyaVar instanceof ba3) {
                    xtb[] xtbVarArr = EditImage.s;
                    editImage.h((ba3) fyaVar);
                }
                editImage.invalidate();
                break;
            default:
                lxa lxaVar = (lxa) obj;
                lxaVar.s.a(new xba(wba.b, fyaVar));
                lxaVar.h();
                break;
        }
    }
}
