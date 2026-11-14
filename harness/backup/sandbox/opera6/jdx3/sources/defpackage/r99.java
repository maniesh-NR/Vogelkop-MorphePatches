package defpackage;

import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class r99 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaApplication b;

    public /* synthetic */ r99(OperaApplication operaApplication, byte b) {
        this.a = b;
        this.b = operaApplication;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        OperaApplication operaApplication = this.b;
        switch (b) {
            case 0:
                fqe fqeVarY = operaApplication.y();
                dqe dqeVar = fqeVarY.i;
                dqeVar.b = false;
                dqeVar.a = null;
                uqe uqeVar = fqeVarY.c;
                if (uqeVar != null) {
                    uqeVar.i.c();
                    break;
                }
                break;
            case 1:
                fqe fqeVarY2 = operaApplication.y();
                dqe dqeVar2 = fqeVarY2.i;
                dqeVar2.b = false;
                dqeVar2.a = null;
                uqe uqeVar2 = fqeVarY2.c;
                if (uqeVar2 != null) {
                    uqeVar2.i.c();
                    break;
                }
                break;
            case 2:
                String[] strArr = OperaApplication.K;
                ru9.c(operaApplication);
                break;
            default:
                String[] strArr2 = OperaApplication.K;
                e3j e3jVarT = e3j.t(operaApplication);
                e3jVarT.F(new ty(e3jVarT, operaApplication, (byte) 4));
                break;
        }
    }
}
