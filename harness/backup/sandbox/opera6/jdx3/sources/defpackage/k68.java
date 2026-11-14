package defpackage;

import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class k68 implements tdn {
    public final WebContents a;
    public final dx3 b;
    public final ydn c;
    public final ufn d;
    public final gjm e;
    public final x5f f;
    public i68 g;
    public km5 h;
    public boolean i;

    public k68(WebContents webContents, dx3 dx3Var, ydn ydnVar, ufn ufnVar, gjm gjmVar, x5f x5fVar) {
        this.a = webContents;
        this.b = dx3Var;
        this.c = ydnVar;
        this.d = ufnVar;
        this.e = gjmVar;
        this.f = x5fVar;
        new f53(this, webContents, (byte) 1);
    }

    @Override // defpackage.tdn
    public final void C() {
        b();
    }

    @Override // defpackage.tdn
    public final void N() {
        b();
    }

    public final pcn a() {
        boolean zA;
        int iR;
        String string;
        pcn pcnVar = new pcn();
        if ((((tfn) this.d.i()).a & 64) == 0) {
            pcnVar.b = false;
            pcnVar.c = "";
            pcnVar.d = "";
            pcnVar.e = false;
            return pcnVar;
        }
        boolean zM = this.a.m();
        ydn ydnVar = this.c;
        if (zM) {
            zA = ydnVar.d.a;
            iR = ydnVar.q();
        } else {
            zA = ydnVar.d.a();
            iR = ydnVar.r();
        }
        pcnVar.b = ydnVar.p().a;
        boolean zIsEnabled = ydnVar.c.isEnabled();
        fp1 fp1Var = this.b;
        pcnVar.c = zIsEnabled ? fp1Var.getString(2132022254) : fp1Var.getString(2132022280);
        int iA = vep.A(iR);
        if (iA == 0) {
            string = fp1Var.getString(2132022270);
        } else if (iA == 1) {
            string = fp1Var.getString(2132022271);
        } else if (iA == 2) {
            string = fp1Var.getString(2132021630);
        } else {
            if (iA != 3) {
                h9o.p();
                return null;
            }
            string = fp1Var.getString(2132022275);
        }
        pcnVar.d = string;
        pcnVar.e = zA;
        return pcnVar;
    }

    public final void b() {
        i68 i68Var = this.g;
        if (i68Var != null) {
            i68Var.l(a());
            km5 km5Var = this.h;
            if (km5Var != null) {
                km5Var.b = true;
                if (((oml) km5Var.d) == null || !km5Var.a) {
                    return;
                }
                km5Var.d = null;
                ((bn7) km5Var.c).run();
            }
        }
    }

    @Override // defpackage.tdn
    public final void s() {
        b();
    }

    @Override // defpackage.tdn
    public final void t() {
        b();
    }
}
