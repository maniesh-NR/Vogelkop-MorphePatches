package defpackage;

import com.opera.android.OperaApplication;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class lv1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv1 b;

    public /* synthetic */ lv1(xv1 xv1Var, byte b) {
        this.a = b;
        this.b = xv1Var;
    }

    public final void a(Callback callback) {
        byte b = this.a;
        uvg uvgVar = uvg.NONE;
        xv1 xv1Var = this.b;
        switch (b) {
            case 1:
                OperaApplication operaApplication = xv1Var.a;
                if (!operaApplication.D().b()) {
                    callback.run(uvgVar);
                    break;
                } else {
                    new hze(operaApplication.E()).a(callback);
                    break;
                }
            default:
                OperaApplication operaApplication2 = xv1Var.a;
                if (!operaApplication2.D().b()) {
                    callback.run(uvgVar);
                    break;
                } else {
                    new hze(operaApplication2.E()).a(callback);
                    break;
                }
        }
    }
}
