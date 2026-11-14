package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.ThemeProviderHelper;
import java.util.concurrent.TimeUnit;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class s58 implements neb {
    public WebContents a;
    public k68 b;

    public final void close() {
        k68 k68Var = this.b;
        if (k68Var != null) {
            km5 km5Var = k68Var.h;
            if (km5Var != null) {
                oml omlVar = (oml) km5Var.d;
                if (omlVar != null) {
                    omlVar.cancel(true);
                }
                km5Var.d = null;
                km5Var.a = false;
                km5Var.b = false;
            }
            k68Var.h = null;
            k68Var.g = null;
            k68Var.c.H(k68Var);
            this.b = null;
        }
        this.a = null;
    }

    public final void h(k8e k8eVar) {
        k68 k68Var = this.b;
        if (k68Var != null) {
            km5 km5Var = k68Var.h;
            if (km5Var != null) {
                oml omlVar = (oml) km5Var.d;
                if (omlVar != null) {
                    omlVar.cancel(true);
                }
                km5Var.d = null;
                km5Var.a = false;
                km5Var.b = false;
            }
            k68Var.h = null;
            k68Var.g = null;
            k68Var.c.H(k68Var);
            this.b = null;
        }
        this.a = null;
    }

    public final void k(String str, n61 n61Var) {
        fp1 fp1VarL;
        dx3 dx3VarL;
        WebContents webContents = this.a;
        b2l b2lVarV = (webContents == null || (dx3VarL = dx3.L(webContents)) == null) ? null : dx3VarL.V(this.a);
        WebContents webContents2 = this.a;
        if (webContents2 != null && b2lVarV != null && (fp1VarL = dx3.L(webContents2)) != null) {
            String[] strArr = OperaApplication.K;
            q6e q6eVarI = ((OperaApplication) fp1VarL.getApplication()).I();
            long jJ0 = ((d7l) b2lVarV).j0();
            eriVarC = jJ0 != -1 ? q6eVarI.c(jJ0) : null;
            if (eriVarC == null) {
                eriVarC = q6eVarI.b();
            }
        }
        if (eriVarC == null) {
            n61Var.f("", false);
        } else {
            String strA = eriVarC.a(9, b2lVarV.T(), str);
            n61Var.f(strA, dti.a(strA));
        }
    }

    public final void l(n61 n61Var) {
        fp1 fp1VarL;
        WebContents webContents = this.a;
        String strA = "";
        if (webContents != null && (fp1VarL = dx3.L(webContents)) != null) {
            String[] strArr = OperaApplication.K;
            strA = ThemeProviderHelper.a(((OperaApplication) fp1VarL.getApplication()).J());
        }
        y58 y58Var = new y58(16);
        y58Var.b = strA;
        try {
            n61Var.c.S0(y58Var.b(n61Var.b, new lvd(3, 6, n61Var.d)));
        } catch (e13 e) {
            h9o.o(e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, dx3] */
    public final k68 m() {
        ?? L;
        BrowserActivity browserActivityO;
        k68 k68Var = this.b;
        if (k68Var != null) {
            return k68Var;
        }
        WebContents webContents = this.a;
        if (webContents == null || (L = dx3.L(webContents)) == 0 || (browserActivityO = q9n.o(L)) == null) {
            return null;
        }
        String[] strArr = OperaApplication.K;
        k68 k68Var2 = new k68(this.a, L, ((OperaApplication) L.getApplicationContext()).R(), ufn.t(L), browserActivityO.P0(), ((OperaApplication) L.getApplicationContext()).L().c);
        this.b = k68Var2;
        return k68Var2;
    }

    public final void n(boolean z) {
        k68 k68VarM = m();
        if (k68VarM != null) {
            k68VarM.i = true;
            x5f x5fVar = k68VarM.f;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                ((l80) new ck0(zpaVar, x56VarF).d().e.getValue()).a.p(1, 1, 1L);
                x5fVar.U0(x56VarF);
            }
            km5 km5Var = k68VarM.h;
            if (km5Var == null) {
                bn7 bn7Var = new bn7(k68VarM, (byte) 12);
                km5Var = new km5();
                km5Var.c = bn7Var;
                k68VarM.h = km5Var;
            }
            oml omlVar = (oml) km5Var.d;
            if (omlVar != null) {
                omlVar.cancel(true);
            }
            km5Var.d = null;
            km5Var.a = false;
            km5Var.b = false;
            oml omlVar2 = new oml(vml.d.d(new bn7(km5Var, (byte) 13)));
            km5Var.d = omlVar2;
            omlVar2.b(null, 1000L, TimeUnit.MILLISECONDS, null);
            k68VarM.c.C(z);
        }
    }

    public final void o(i68 i68Var) {
        k68 k68VarM = m();
        if (k68VarM != null) {
            k68VarM.g = i68Var;
            k68VarM.c.F(k68VarM);
            pcn pcnVarA = k68VarM.a();
            i68Var.l(pcnVarA);
            if (pcnVarA.b) {
                x5f x5fVar = k68VarM.f;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    ((l80) new ck0(zpaVar, x56VarF).d().e.getValue()).a.p(0, 1, 1L);
                    x5fVar.U0(x56VarF);
                }
            }
        }
    }
}
