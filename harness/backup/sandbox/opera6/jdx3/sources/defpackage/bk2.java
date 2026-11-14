package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public final /* synthetic */ class bk2 implements OnFailureListener, OnSuccessListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ek2 b;

    public /* synthetic */ bk2(ek2 ek2Var, byte b) {
        this.a = b;
        this.b = ek2Var;
    }

    public final void onFailure(Exception exc) {
        byte b = this.a;
        ek2 ek2Var = this.b;
        switch (b) {
            case 1:
                ek2Var.s(32);
                break;
            case 2:
            default:
                ek2Var.s(32);
                break;
            case 3:
                yj2 yj2Var = (yj2) ek2Var.c.poll();
                if (yj2Var != null) {
                    yj2Var.a(false);
                    break;
                }
                break;
            case 4:
                ek2Var.s(32);
                break;
        }
    }

    public final void onSuccess(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        yj2 yj2Var = (yj2) this.b.c.poll();
        if (yj2Var != null) {
            yj2Var.a(zBooleanValue);
        }
    }
}
