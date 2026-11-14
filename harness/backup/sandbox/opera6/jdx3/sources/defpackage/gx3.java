package defpackage;

import com.opera.android.OperaApplication;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class gx3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hx3 b;

    public /* synthetic */ gx3(hx3 hx3Var, byte b) {
        this.a = b;
        this.b = hx3Var;
    }

    public final Object get() {
        byte b = this.a;
        hx3 hx3Var = this.b;
        switch (b) {
            case 0:
                qim qimVar = hx3Var.b.o;
                Objects.requireNonNull(qimVar);
                return qimVar;
            case 1:
                return hx3Var.b.W();
            case 2:
                ro7 ro7Var = so7.k;
                return (ro7) ((so7) no7.n(hx3Var.b.getApplicationContext(), io7.G, so7.l)).i();
            case 3:
                return hx3Var.b.getPackageManager();
            case 4:
                String[] strArr = OperaApplication.K;
                return ((OperaApplication) hx3Var.b.getApplication()).L().c;
            case 5:
                String[] strArr2 = OperaApplication.K;
                return ((OperaApplication) hx3Var.b.getApplication()).L().f;
            case 6:
                qim qimVar2 = hx3Var.b.o;
                Objects.requireNonNull(qimVar2);
                return qimVar2.c;
            case 7:
                return ru9.c(hx3Var.b);
            default:
                qim qimVar3 = hx3Var.b.o;
                Objects.requireNonNull(qimVar3);
                return qimVar3.c;
        }
    }
}
