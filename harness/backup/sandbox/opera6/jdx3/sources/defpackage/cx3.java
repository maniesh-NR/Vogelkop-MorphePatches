package defpackage;

import android.text.TextUtils;
import com.google.android.material.button.MaterialButton;
import com.opera.android.OperaApplication;
import com.opera.android.import_data.ImportChromeDataActivity;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class cx3 implements as6 {
    public final re7 a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ dx3 c;

    public cx3(dx3 dx3Var, re7 re7Var, byte b) {
        this.b = b;
        this.c = dx3Var;
        this.a = re7Var;
        re7Var.x = this;
        dx3Var.getLifecycle().a(this);
    }

    private final void a(re7 re7Var) {
    }

    private final void b(re7 re7Var) {
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [android.app.Activity, com.opera.android.import_data.ImportChromeDataActivity, l2b] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.app.Activity, l2b] */
    public void c(re7 re7Var, boolean z) {
        j3b j3bVar;
        byte b = this.b;
        fp1 fp1Var = this.c;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) fp1Var.getApplication();
                boolean zI = operaApplication.J().i("ask_before_downloading");
                dx3 dx3Var = this.c;
                if (!zI) {
                    new igi(dx3Var, vml.d, operaApplication.m(), operaApplication.L().c, re7Var, e(re7Var));
                    break;
                } else {
                    qim qimVar = dx3Var.o;
                    Objects.requireNonNull(qimVar);
                    nej nejVar = qimVar.d;
                    bx3 bx3Var = new bx3(this, re7Var, z, operaApplication);
                    nejVar.getClass();
                    nejVar.b(bx3Var, ijm.b);
                    break;
                }
            case 1:
                ?? r6 = (ImportChromeDataActivity) fp1Var;
                j2b j2bVar = Intrinsics.a(re7Var.m, "text/csv") ? j2b.c : j2b.d;
                File fileH = re7Var.h();
                if (!fileH.exists() || !fileH.canWrite()) {
                    b3b[] b3bVarArr = b3b.a;
                    int i = ImportChromeDataActivity.d0;
                    r6.S0(j2bVar, -2);
                    break;
                } else {
                    String[] strArr2 = OperaApplication.K;
                    if (((OperaApplication) r6.getApplication()).m().a.f(re7Var, fileH.getPath()) >= re7Var.j) {
                        String str = re7Var.p;
                        if (!TextUtils.isEmpty(str)) {
                            re7Var.y(1);
                            re7Var.x(str);
                            re7Var.w();
                            if (j2bVar.a && (j3bVar = r6.N) != null) {
                                ((MaterialButton) j3bVar.b.e).setVisibility(0);
                                break;
                            }
                        } else {
                            b3b[] b3bVarArr2 = b3b.a;
                            int i2 = ImportChromeDataActivity.d0;
                            r6.S0(j2bVar, -5);
                            break;
                        }
                    } else {
                        b3b[] b3bVarArr3 = b3b.a;
                        int i3 = ImportChromeDataActivity.d0;
                        r6.S0(j2bVar, -4);
                        break;
                    }
                }
                break;
            default:
                ?? r62 = (l2b) fp1Var;
                File fileH2 = re7Var.h();
                if (!fileH2.exists() || !fileH2.canWrite()) {
                    b3b[] b3bVarArr4 = b3b.a;
                    r62.E0(-2);
                    break;
                } else {
                    String[] strArr3 = OperaApplication.K;
                    if (((OperaApplication) r62.getApplication()).m().a.f(re7Var, fileH2.getPath()) >= re7Var.j) {
                        String str2 = re7Var.p;
                        if (!TextUtils.isEmpty(str2)) {
                            re7Var.y(1);
                            re7Var.x(str2);
                            re7Var.w();
                            r62.W.append('d');
                            j3b j3bVar2 = r62.N;
                            if (j3bVar2 != null) {
                                ((MaterialButton) j3bVar2.b.e).setVisibility(0);
                                break;
                            }
                        } else {
                            b3b[] b3bVarArr5 = b3b.a;
                            r62.E0(-5);
                            break;
                        }
                    } else {
                        b3b[] b3bVarArr6 = b3b.a;
                        r62.E0(-4);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.app.Activity, dx3] */
    public ef7 d(re7 re7Var, boolean z, mej mejVar) {
        String[] strArr = OperaApplication.K;
        ?? r2 = this.c;
        return new ef7(mejVar, r2, re7Var, z, ((OperaApplication) r2.getApplication()).m().a, r2.F(), null);
    }

    public vwh e(re7 re7Var) {
        return new va2(this, (byte) 25);
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        this.a.x = null;
        ndcVar.getLifecycle().b(this);
    }
}
