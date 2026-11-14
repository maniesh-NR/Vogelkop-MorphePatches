package defpackage;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class k93 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k93(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vq3 vq3Var = (vq3) obj;
                h7f h7fVar = vq3Var.b;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((y6f) g7fVarH.next()).a(vq3Var.c);
                }
                break;
            case 1:
                ((Function0) obj).invoke();
                break;
            default:
                qvl qvlVar = (qvl) obj;
                qvlVar.finish(hjm.b);
                qvlVar.b = null;
                break;
        }
    }
}
