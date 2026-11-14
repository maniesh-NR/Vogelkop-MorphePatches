package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.opera.android.OperaApplication;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.TabInfo;
import com.opera.api.Callback;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class q6l extends y08 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ q6l(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        boolean z;
        NetworkInfo networkInfo;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (navigationHandle.h) {
                    ((Callback) obj).run(b2lVar);
                    break;
                }
                break;
            case 3:
                m8l m8lVar = (m8l) obj;
                x5f x5fVar = m8lVar.d;
                x5f x5fVar2 = m8lVar.e;
                if (!navigationHandle.h) {
                    if (!navigationHandle.j && navigationHandle.p && (navigationHandle.d & 16777216) == 0) {
                        d7l d7lVar = (d7l) b2lVar;
                        x5fVar2.h(navigationHandle.e.g(), wqm.B(navigationHandle.d), d7lVar.i0(), false);
                        String strG = navigationHandle.e.g();
                        String strI0 = d7lVar.i0();
                        if (x5fVar.h) {
                            x5fVar.g(strG, strI0, false);
                            break;
                        }
                    }
                } else if (BrowserUtils.d(navigationHandle.d) && !navigationHandle.w) {
                    String strG2 = navigationHandle.e.g();
                    if (!wqm.w(strG2)) {
                        if (navigationHandle.c) {
                            if (((d7l) b2lVar).i0().equals(strG2) ? false : strG2.contains("/amp/")) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        int i = navigationHandle.d;
                        if ((16777216 & i) == 0) {
                            x5fVar2.h(strG2, wqm.B(i), null, true);
                            if (x5fVar.h) {
                                x5fVar.g(strG2, null, true);
                            }
                        }
                        Context context = m8lVar.a;
                        String[] strArr = OperaApplication.K;
                        boolean zI = ((OperaApplication) context.getApplicationContext()).J().i("compression");
                        ConnectivityManager connectivityManager = (ConnectivityManager) m8lVar.a.getSystemService("connectivity");
                        boolean z2 = (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected()) ? false : true;
                        if (x5fVar.h) {
                            zpa zpaVar = x5fVar.d;
                            x56 x56VarF = zpa.F();
                            zl0 zl0Var = (zl0) new ck0(zpaVar, x56VarF).j.getValue();
                            if (zI) {
                                zl0Var.a.o(0, 1, 1);
                            }
                            if (z2) {
                                zl0Var.a.o(1, 1, 1);
                            }
                            if (z) {
                                zl0Var.a.o(2, 1, 1);
                            }
                            x5fVar.U0(x56VarF);
                        }
                        zpa zpaVar2 = x5fVar2.d;
                        x56 x56VarF2 = zpa.F();
                        ((zl0) new ck0(zpaVar2, x56VarF2).j.getValue()).a.o(3, 1, 1);
                        x5fVar2.U0(x56VarF2);
                        break;
                    }
                }
                break;
            case 5:
                cdn cdnVar = (cdn) obj;
                if (navigationHandle.h) {
                    ydn ydnVarR = cdnVar.R();
                    if ((((d7l) b2lVar).j.m() ? ydnVarR.d.a : ydnVarR.d.a()) && navigationHandle.k == -111) {
                        x5f x5fVar3 = ((OperaApplication) cdnVar.f.getApplicationContext()).L().c;
                        if (x5fVar3.h) {
                            zpa zpaVar3 = x5fVar3.d;
                            x56 x56VarF3 = zpa.F();
                            x56VarF3.z(zpaVar3).e(8);
                            x5fVar3.U0(x56VarF3);
                        }
                    }
                    cdnVar.j = navigationHandle.k;
                    cdnVar.S();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Callback) obj).run(b2lVar);
                break;
            case 5:
                cdn cdnVar = (cdn) obj;
                cdnVar.j = 0;
                ddn ddnVar = cdnVar.o;
                if (ddnVar != null) {
                    ddnVar.cancel();
                }
                vml.a(cdnVar.n);
                cdnVar.l = 1;
                cdnVar.S();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        switch (this.a) {
            case 5:
                cdn cdnVar = (cdn) this.b;
                cdnVar.j = 0;
                vml.a(cdnVar.n);
                cdnVar.l = 1;
                cdnVar.S();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void R(d7l d7lVar) {
        switch (this.a) {
            case 1:
                ((e8l) this.b).c();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void T(b2l b2lVar, TabInfo tabInfo) {
        switch (this.a) {
            case 3:
                if (((d7l) b2lVar).j.a().d != tabInfo.d) {
                    ((m8l) this.b).b();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void j(b2l b2lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Callback) obj).run(b2lVar);
                break;
            case 1:
                ((e8l) obj).c();
                break;
            case 2:
                d7l d7lVar = (d7l) b2lVar;
                if (!wqm.w(d7lVar.j.getUrl())) {
                    ((j8l) obj).a(d7lVar.j.getId(), 3);
                    break;
                }
                break;
            case 5:
                ((cdn) obj).S();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void q(d7l d7lVar) {
        switch (this.a) {
            case 4:
                t8l t8lVar = (t8l) this.b;
                xf8.F0(t8lVar.c, t8lVar.a());
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void u(b2l b2lVar) {
        switch (this.a) {
            case 1:
                ((e8l) this.b).c();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void v(b2l b2lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Callback) obj).run(b2lVar);
                break;
            case 2:
                c8l c8lVar = ((j8l) obj).a;
                int id = ((d7l) b2lVar).j.getId();
                mcj mcjVarC = c8lVar.c(b2lVar.T());
                ((o7l) mcjVarC.b).k(id, new d7k((Object) c8lVar, (Object) mcjVarC, (byte) 21));
                break;
            case 5:
                cdn cdnVar = (cdn) obj;
                vml.a(cdnVar.n);
                cdnVar.l = 1;
                cdnVar.S();
                break;
        }
    }
}
