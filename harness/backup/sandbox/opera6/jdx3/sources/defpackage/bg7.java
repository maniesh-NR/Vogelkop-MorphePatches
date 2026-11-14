package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.OperaEditText;

/* loaded from: classes.dex */
public final class bg7 extends nz0 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public bg7(q6e q6eVar, z4m z4mVar, ge5 ge5Var) {
        super(true, false);
        this.b = q6eVar;
        this.c = z4mVar;
        this.d = ge5Var;
    }

    public bg7(re7 re7Var, a32 a32Var) {
        super(true, false);
        this.b = re7Var;
        this.c = a32Var;
        this.d = re7Var.f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg7(y4g y4gVar, ydn ydnVar, qim qimVar, x5f x5fVar) {
        super(true, false);
        this.e = y4gVar;
        this.b = ydnVar;
        this.c = qimVar;
        this.d = x5fVar;
    }

    public static int b(ydn ydnVar) {
        if (!ydnVar.c.isEnabled() || ydnVar.r() != 4) {
            return 0;
        }
        if (ydnVar.m() == 0) {
            return 1;
        }
        return ydnVar.m() == 6 ? 2 : 0;
    }

    public final void d() {
        ysj ysjVar = ((qim) this.c).e;
        ken kenVar = new ken((ydn) this.b);
        ysjVar.getClass();
        ysjVar.b(kenVar, ijm.b);
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132018111);
            case 1:
            default:
                return super.getNegativeButtonText(context);
            case 2:
                return context.getString(2132018111);
        }
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132018586);
            case 1:
            default:
                return super.getPositiveButtonText(context);
            case 2:
                return context.getString(2132021985);
        }
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        switch (this.a) {
            case 0:
                return 2132083345;
            default:
                return super.getTheme();
        }
    }

    @Override // defpackage.nz0
    public final boolean isRequestValid(b2l b2lVar) {
        switch (this.a) {
            case 2:
                return b((ydn) this.b) != 0;
            default:
                return super.isRequestValid(b2lVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    @Override // defpackage.nz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateDialog(az0 r13) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg7.onCreateDialog(az0):void");
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        switch (this.a) {
            case 0:
                super.onDialogCreated(bz0Var);
                bz0Var.setCanceledOnTouchOutside(false);
                break;
            case 1:
            default:
                super.onDialogCreated(bz0Var);
                break;
            case 2:
                bz0Var.setCanceledOnTouchOutside(false);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        switch (this.a) {
            case 2:
                ((y4g) this.e).f = null;
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        switch (this.a) {
            case 2:
                ((ydn) this.b).C(false);
                ((x5f) this.d).L(7, wb0.h, null);
                d();
                break;
            default:
                super.onNegativeButtonClicked(bz0Var);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        switch (this.a) {
            case 0:
                a32 a32Var = (a32) this.c;
                kf kfVar = (kf) this.e;
                if (kfVar == null) {
                    kfVar = null;
                }
                Editable text = ((OperaEditText) kfVar.c).getText();
                String string = text != null ? text.toString() : null;
                jg7 jg7Var = (jg7) a32Var.b;
                Context context = (Context) a32Var.c;
                re7 re7Var = (re7) a32Var.d;
                Context context2 = jg7Var.a.getContext();
                int[][] iArr = lg7.a;
                String[] strArr = OperaApplication.K;
                Uri uriM = ((OperaApplication) context2.getApplicationContext()).J().m();
                if (!lg7.e(context2, uriM)) {
                    uriM = Uri.fromFile(s29.c());
                }
                re7 re7VarE = jg7Var.b.e(uriM.buildUpon().appendPath(string).build(), 0);
                re7 re7Var2 = (re7VarE != null && re7VarE.q() && re7VarE.a()) ? re7VarE : null;
                if (re7Var2 == null) {
                    jg7Var.e(re7Var, string);
                    break;
                } else {
                    String string2 = context.getString(2132018644);
                    qxh qxhVar = string2 != null ? new qxh(string2) : null;
                    ws1 ws1Var = new ws1(jg7Var, re7Var2, re7Var, string, (byte) 6);
                    gkj gkjVar = new gkj(false, false);
                    gkjVar.a = null;
                    gkjVar.b = null;
                    gkjVar.c = null;
                    gkjVar.d = null;
                    gkjVar.e = null;
                    gkjVar.f = null;
                    gkjVar.g = null;
                    gkjVar.h = ws1Var;
                    gkjVar.i = null;
                    gkjVar.j = null;
                    gkjVar.k = 2132020155;
                    gkjVar.l = 2132018111;
                    gkjVar.m = 2132018645;
                    gkjVar.n = true;
                    gkjVar.o = qxhVar;
                    z77 z77Var = (z77) context.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                    z77Var.getClass();
                    z77Var.b(gkjVar, ijm.b);
                    break;
                }
                break;
            case 2:
                ((x5f) this.d).L(7, wb0.g, null);
                ((ydn) this.b).B();
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        View decorView;
        switch (this.a) {
            case 0:
                super.onShowDialog(bz0Var);
                Button buttonF = bz0Var.f(-1);
                buttonF.setEnabled(false);
                kf kfVar = (kf) this.e;
                if (kfVar == null) {
                    kfVar = null;
                }
                ((OperaEditText) kfVar.c).addTextChangedListener(new pu(buttonF, this, (byte) 1));
                kf kfVar2 = (kf) this.e;
                bq1 bq1Var = (OperaEditText) (kfVar2 != null ? kfVar2 : null).c;
                l5b l5bVar = q9n.c;
                q9n.G(bq1Var.getContext(), bq1Var);
                Window window = bz0Var.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.setOnTouchListener(new ma3((byte) 2));
                    break;
                }
                break;
            case 1:
                super.onShowDialog(bz0Var);
                this.e = bz0Var;
                break;
            default:
                super.onShowDialog(bz0Var);
                break;
        }
    }
}
