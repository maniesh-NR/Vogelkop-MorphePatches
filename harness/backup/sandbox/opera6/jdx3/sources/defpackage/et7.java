package defpackage;

import com.opera.hype.image.editor.EditImage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class et7 extends a7f {
    public final /* synthetic */ byte c = 1;
    public final /* synthetic */ EditImage d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et7(bt7 bt7Var, EditImage editImage) {
        super(bt7Var);
        this.d = editImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et7(EditImage editImage) {
        super(null);
        this.d = editImage;
    }

    @Override // defpackage.a7f
    public final void a(Object obj, Object obj2) {
        bfl bflVar;
        byte b = this.c;
        EditImage editImage = this.d;
        switch (b) {
            case 0:
                rdb rdbVar = editImage.l;
                ht7 ht7Var = (ht7) obj2;
                ht7 ht7Var2 = (ht7) obj;
                if (ht7Var2 != ht7Var) {
                    if (ht7Var2 != null) {
                        bfl bflVar2 = ht7Var2.a;
                        bflVar2.f.setEnabled(bflVar2.b.a == eya.d);
                        rdbVar.a(false);
                    }
                    if (ht7Var != null) {
                        ht7Var.a.f.setEnabled(false);
                        rdbVar.a(true);
                        break;
                    }
                }
                break;
            default:
                bt7 bt7Var = (bt7) obj2;
                if (!Intrinsics.a((bt7) obj, bt7Var) && (bflVar = editImage.j) != null) {
                    ba3 ba3Var = bflVar.b;
                    ba3Var.e.g(ba3.j[0], String.valueOf(bflVar.f.getText()));
                    if (ba3Var instanceof oel) {
                        oel oelVar = (oel) ba3Var;
                        int i = bt7Var.a;
                        mel melVar = oelVar.m;
                        xtb[] xtbVarArr = oel.t;
                        melVar.g(xtbVarArr[0], Integer.valueOf(i));
                        oelVar.n.g(xtbVarArr[1], Boolean.valueOf(bt7Var.b));
                        oelVar.o.g(xtbVarArr[2], Integer.valueOf(bt7Var.c));
                        oelVar.p.g(xtbVarArr[3], bt7Var.d);
                        oelVar.q.g(xtbVarArr[4], Boolean.valueOf(bt7Var.e));
                        oelVar.r.g(xtbVarArr[5], Integer.valueOf(bt7Var.f));
                        break;
                    }
                }
                break;
        }
    }
}
