package defpackage;

import J.N;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.PasswordDataMonitor;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.autofill.PersonalDataMonitor;

/* loaded from: classes.dex */
public final class rs2 {
    public final i7f a = new i7f();
    public final PasswordManager b = new PasswordManager();
    public final PasswordDataMonitor c;
    public final AutofillManager d;
    public final PersonalDataMonitor e;
    public int f;
    public int g;
    public int h;
    public int i;

    public rs2() {
        final byte b = 0;
        Runnable runnable = new Runnable(this) { // from class: os2
            public final /* synthetic */ rs2 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                rs2 rs2Var = this.b;
                switch (b2) {
                    case 0:
                        PasswordManager passwordManager = rs2Var.b;
                        ps2 ps2Var = new ps2(rs2Var, (byte) 0);
                        passwordManager.getClass();
                        PasswordManager.a(ps2Var);
                        break;
                    default:
                        AutofillManager autofillManager = rs2Var.d;
                        autofillManager.c(new ps2(rs2Var, (byte) 1));
                        autofillManager.e(new ps2(rs2Var, (byte) 2));
                        autofillManager.d(new ps2(rs2Var, (byte) 3));
                        break;
                }
            }
        };
        PasswordDataMonitor passwordDataMonitor = new PasswordDataMonitor();
        passwordDataMonitor.a = runnable;
        passwordDataMonitor.b = N.MtK05rRq(passwordDataMonitor);
        this.c = passwordDataMonitor;
        PasswordManager.a(new ps2(this, (byte) 0));
        AutofillManager autofillManager = new AutofillManager();
        this.d = autofillManager;
        final byte b2 = 1;
        this.e = AutofillManager.b(new Runnable(this) { // from class: os2
            public final /* synthetic */ rs2 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                rs2 rs2Var = this.b;
                switch (b22) {
                    case 0:
                        PasswordManager passwordManager = rs2Var.b;
                        ps2 ps2Var = new ps2(rs2Var, (byte) 0);
                        passwordManager.getClass();
                        PasswordManager.a(ps2Var);
                        break;
                    default:
                        AutofillManager autofillManager2 = rs2Var.d;
                        autofillManager2.c(new ps2(rs2Var, (byte) 1));
                        autofillManager2.e(new ps2(rs2Var, (byte) 2));
                        autofillManager2.d(new ps2(rs2Var, (byte) 3));
                        break;
                }
            }
        });
        autofillManager.c(new ps2(this, (byte) 1));
        autofillManager.e(new ps2(this, (byte) 2));
        autofillManager.d(new ps2(this, (byte) 3));
    }

    public final void a() {
        i7f i7fVar = this.a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            t53 t53Var = (t53) g7fVarC.next();
            byte b = t53Var.a;
            Object obj = t53Var.b;
            switch (b) {
                case 0:
                    ((r53) obj).run();
                    break;
                default:
                    kcg kcgVar = (kcg) obj;
                    kcgVar.a((ipf) kcgVar.c.d.g());
                    break;
            }
        }
    }
}
