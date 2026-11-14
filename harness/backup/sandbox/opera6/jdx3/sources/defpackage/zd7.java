package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.opera.android.custom_views.DialogTitle;

/* loaded from: classes.dex */
public final /* synthetic */ class zd7 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zd7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                x77 x77Var = (x77) obj;
                dkf dkfVar = (dkf) x77Var.b;
                bz0 bz0Var = (bz0) x77Var.d;
                yq1 yq1Var = (DialogTitle) bz0Var.findViewById(2131362006);
                byte b2 = 4;
                if (yq1Var != null) {
                    yq1Var.setTextAlignment(4);
                    yq1Var.setGravity(1);
                }
                e73 e73Var = new e73(x77Var, dkfVar, b2);
                View viewFindViewById = bz0Var.findViewById(2131362012);
                if (viewFindViewById != null) {
                    dll dllVarS = q9n.s(viewFindViewById);
                    if (dllVarS != null) {
                        u8n.b(dllVarS, viewFindViewById, e73Var);
                    }
                    e73Var.a(viewFindViewById);
                    break;
                }
                break;
            default:
                ((rhj) obj).d();
                break;
        }
    }
}
