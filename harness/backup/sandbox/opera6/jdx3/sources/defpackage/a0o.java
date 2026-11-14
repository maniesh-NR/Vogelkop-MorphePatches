package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import com.opera.android.startup.WelcomeActivity;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final /* synthetic */ class a0o implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xbf b;

    public /* synthetic */ a0o(xbf xbfVar, byte b) {
        this.a = b;
        this.b = xbfVar;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [android.app.Activity, com.opera.android.startup.WelcomeActivity] */
    public final Object get() {
        byte b = this.a;
        xbf xbfVar = this.b;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                fp1 fp1Var = (WelcomeActivity) xbfVar.c;
                OperaApplication operaApplication = (OperaApplication) fp1Var.getApplication();
                return new mdf(fp1Var.getLifecycle(), operaApplication.L().c, operaApplication.L().d, operaApplication.L().g);
            case 1:
                String[] strArr2 = OperaApplication.K;
                ?? r15 = (WelcomeActivity) xbfVar.c;
                OperaApplication operaApplication2 = (OperaApplication) r15.getApplication();
                j4c j4cVarE = operaApplication2.e();
                a0o a0oVar = new a0o(xbfVar, (byte) 2);
                j4c j4cVar = operaApplication2.x;
                g92 g92Var = operaApplication2.z;
                tzn tznVar = (tzn) xbfVar.d;
                j4c j4cVar2 = (j4c) xbfVar.f;
                cq5 cq5Var = ((lpe) operaApplication2.A.get()).k;
                j4c j4cVar3 = operaApplication2.B;
                wv1 wv1Var = new wv1(new pw3(operaApplication2, OperaApplication.class, "pushedContentManager", "getPushedContentManager()Lcom/opera/android/startup/PushedContentManager;", 0, (byte) 18), (byte) 4);
                xbf xbfVar2 = (xbf) xbfVar.b;
                return new b0o(j4cVarE, a0oVar, j4cVar, g92Var, tznVar, j4cVar2, cq5Var, j4cVar3, wv1Var, ((mi) xbfVar2.b).a(), new a0o(xbfVar, (byte) 3), (j4c) xbfVar2.e, r15);
            case 2:
                return ru9.c((WelcomeActivity) xbfVar.c);
            default:
                String[] strArr3 = OperaApplication.K;
                fp1 fp1Var2 = (WelcomeActivity) xbfVar.c;
                OperaApplication operaApplication3 = (OperaApplication) fp1Var2.getApplication();
                Context applicationContext = fp1Var2.getApplicationContext();
                t1 t1Var = new t1(applicationContext, (byte) 17);
                t1 t1Var2 = new t1(applicationContext, (byte) 18);
                sz4 sz4Var = new sz4(new zg(new WeakReference(fp1Var2)));
                r65 r65VarH = operaApplication3.h();
                r65 r65VarH2 = operaApplication3.h();
                ox3 ox3Var = new ox3(operaApplication3, (byte) 9);
                yl6 yl6Var = new yl6(applicationContext, vml.d);
                ldf ldfVar = (ldf) operaApplication3.r.m0.get();
                jjg jjgVar = new jjg(sz4Var, (byte) 16);
                xbf xbfVar3 = (xbf) xbfVar.b;
                return new xbf((Object) r65VarH, (Object) new c0o(applicationContext, r65VarH2, ox3Var, yl6Var, t1Var, ldfVar, jjgVar, t1Var2, ((mi) xbfVar3.b).a()), (Object) t1Var, (Object) operaApplication3.C(), (Object) ((mi) xbfVar3.b).a(), xbfVar3.e, (byte) 22);
        }
    }
}
