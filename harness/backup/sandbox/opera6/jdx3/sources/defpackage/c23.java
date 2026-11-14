package defpackage;

import com.opera.android.BrowserActivity;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class c23 extends y08 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public /* synthetic */ c23(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public c23(meg megVar, BrowserActivity browserActivity) {
        this.a = (byte) 2;
        this.c = megVar;
        this.b = browserActivity;
    }

    public c23(pt3 pt3Var) {
        this.a = (byte) 1;
        this.b = pt3Var;
    }

    public c23(ucn ucnVar) {
        this.a = (byte) 4;
        this.c = ucnVar;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        switch (this.a) {
            case 1:
                GURL gurl = (GURL) this.c;
                if (gurl != null) {
                    if (!navigationHandle.j) {
                        if (navigationHandle.m / 100 != 3) {
                            GURL gurl2 = navigationHandle.e;
                            if (!gurl2.equals(gurl)) {
                                pt3 pt3Var = (pt3) this.b;
                                String strG = ((GURL) this.c).g();
                                String strG2 = gurl2.g();
                                byte b = pt3Var.a;
                                BrowserActivity browserActivity = pt3Var.b;
                                switch (b) {
                                    case 16:
                                        rr8 rr8Var = (rr8) browserActivity.L0().h.a;
                                        rr8Var.l.put(strG2, strG);
                                        rr8Var.g(new gqh(strG, strG2));
                                        break;
                                    default:
                                        rr8 rr8Var2 = (rr8) browserActivity.L0().h.a;
                                        rr8Var2.l.put(strG2, strG);
                                        rr8Var2.g(new gqh(strG, strG2));
                                        break;
                                }
                            }
                            ((d7l) b2lVar).H(this);
                            break;
                        }
                    } else {
                        ((d7l) b2lVar).H(this);
                        break;
                    }
                }
                break;
            case 4:
                if (!((ucn) this.c).d(b2lVar)) {
                    d7l d7lVar = (d7l) b2lVar;
                    if (!d7lVar.n0()) {
                        npl nplVar = (npl) this.b;
                        if (nplVar != null) {
                            vml.a(nplVar);
                        }
                        npl nplVar2 = new npl(this, d7lVar, (byte) 23);
                        this.b = nplVar2;
                        vml.d(nplVar2, 3500L);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        switch (this.a) {
            case 1:
                if (((GURL) this.c) == null) {
                    this.c = navigationHandle.e;
                    break;
                }
                break;
            case 4:
                npl nplVar = (npl) this.b;
                if (nplVar != null) {
                    vml.a(nplVar);
                    this.b = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void R(d7l d7lVar) {
        switch (this.a) {
            case 3:
                hh4 hh4Var = (hh4) this.b;
                if (hh4Var != null) {
                    hh4Var.cancel();
                }
                h7f h7fVar = ((qji) this.c).c;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((nji) g7fVarH.next()).d();
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void S(d7l d7lVar) {
        switch (this.a) {
            case 4:
                npl nplVar = (npl) this.b;
                if (nplVar != null) {
                    vml.a(nplVar);
                    this.b = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void f(b2l b2lVar) {
        switch (this.a) {
            case 2:
                meg megVar = (meg) this.c;
                ((BrowserActivity) this.b).moveTaskToBack(true);
                megVar.a();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void j(b2l b2lVar) {
        switch (this.a) {
            case 0:
                ((d7l) b2lVar).H(this);
                e23 e23Var = (e23) this.b;
                String str = (String) this.c;
                if (!e23Var.b) {
                    e23Var.c = str;
                    vml.d(e23Var, 5000L);
                    break;
                }
                break;
        }
    }
}
