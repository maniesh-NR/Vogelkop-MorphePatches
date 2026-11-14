package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import defpackage.c26;
import defpackage.hkm;
import defpackage.vtp;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ke1 {
    public final cy0 a;
    public final kh3 b;
    public final ve2 c;
    public final v31 d;
    public final ux2 e;
    public final k8 f;
    public final qr0 g;

    public ke1(cy0 cy0Var, kh3 kh3Var, ve2 ve2Var, v31 v31Var, ux2 ux2Var, k8 k8Var, qr0 qr0Var) {
        this.a = cy0Var;
        this.b = kh3Var;
        this.c = ve2Var;
        this.d = v31Var;
        this.e = ux2Var;
        this.f = k8Var;
        this.g = qr0Var;
    }

    @JavascriptInterface
    @NotNull
    public final String getClickSignals(@NotNull String str) {
        if (str.length() == 0) {
            return "";
        }
        ux2 ux2Var = this.e;
        fw0 fw0Var = fw0.CUI_NAME_CLICK_SIGNALS;
        kh3 kh3Var = this.b;
        l08 l08Var = l08.a;
        if (hh3.b().a != null) {
            rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
            try {
                String strA = this.f.a(this.a, str);
                rg3VarA.close();
                return strA;
            } catch (Throwable th) {
                try {
                    rg3VarA.b(th);
                    if (th instanceof iyo) {
                        throw th;
                    }
                    rg3VarA.a(th);
                    if (th instanceof kql) {
                        throw new uw0((kql) th);
                    }
                    if (th instanceof CancellationException) {
                        throw new ou0(th);
                    }
                    if (th instanceof mv0) {
                        throw th;
                    }
                    throw new tu0(th);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        vtp.v(rg3VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
        try {
            String strA2 = this.f.a(this.a, str);
            wk2VarA.close();
            return strA2;
        } catch (Throwable th4) {
            try {
                wk2VarA.b(th4);
                if (th4 instanceof iyo) {
                    throw th4;
                }
                wk2VarA.a(th4);
                if (th4 instanceof kql) {
                    throw new uw0((kql) th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new ou0(th4);
                }
                if (th4 instanceof mv0) {
                    throw th4;
                }
                throw new tu0(th4);
            } finally {
            }
        }
    }

    @JavascriptInterface
    @NotNull
    public final String getViewSignals() {
        ux2 ux2Var = this.e;
        fw0 fw0Var = fw0.CUI_NAME_VIEW_SIGNALS;
        kh3 kh3Var = this.b;
        l08 l08Var = l08.a;
        if (hh3.b().a != null) {
            rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
            try {
                String strA = this.f.a(this.a);
                rg3VarA.close();
                return strA;
            } catch (Throwable th) {
                try {
                    rg3VarA.b(th);
                    if (th instanceof iyo) {
                        throw th;
                    }
                    rg3VarA.a(th);
                    if (th instanceof kql) {
                        throw new uw0((kql) th);
                    }
                    if (th instanceof CancellationException) {
                        throw new ou0(th);
                    }
                    if (th instanceof mv0) {
                        throw th;
                    }
                    throw new tu0(th);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        vtp.v(rg3VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
        try {
            String strA2 = this.f.a(this.a);
            wk2VarA.close();
            return strA2;
        } catch (Throwable th4) {
            try {
                wk2VarA.b(th4);
                if (th4 instanceof iyo) {
                    throw th4;
                }
                wk2VarA.a(th4);
                if (th4 instanceof kql) {
                    throw new uw0((kql) th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new ou0(th4);
                }
                if (th4 instanceof mv0) {
                    throw th4;
                }
                throw new tu0(th4);
            } finally {
            }
        }
    }

    @JavascriptInterface
    @NotNull
    public final String getViewSignalsJson() {
        fo foVar = fo.a;
        ux2 ux2Var = this.e;
        fw0 fw0Var = fw0.CUI_NAME_VIEW_SIGNALS;
        kh3 kh3Var = this.b;
        l08 l08Var = l08.a;
        if (hh3.b().a != null) {
            rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
            try {
                qr0 qr0Var = this.g;
                qr0Var.getClass();
                boolean zBooleanValue = ((Boolean) qr0Var.a("gads:add_placement_id_in_view_signals:enabled", Boolean.TRUE, foVar)).booleanValue();
                k8 k8Var = this.f;
                cy0 cy0Var = this.a;
                if (zBooleanValue) {
                    String strA = k8Var.a(cy0Var, this.c, this.d);
                    rg3VarA.close();
                    return strA;
                }
                String strA2 = k8Var.a(cy0Var);
                rg3VarA.close();
                return strA2;
            } catch (Throwable th) {
                try {
                    rg3VarA.b(th);
                    if (th instanceof iyo) {
                        throw th;
                    }
                    rg3VarA.a(th);
                    if (th instanceof kql) {
                        throw new uw0((kql) th);
                    }
                    if (th instanceof CancellationException) {
                        throw new ou0(th);
                    }
                    if (th instanceof mv0) {
                        throw th;
                    }
                    throw new tu0(th);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        vtp.v(rg3VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
        try {
            qr0 qr0Var2 = this.g;
            qr0Var2.getClass();
            boolean zBooleanValue2 = ((Boolean) qr0Var2.a("gads:add_placement_id_in_view_signals:enabled", Boolean.TRUE, foVar)).booleanValue();
            k8 k8Var2 = this.f;
            cy0 cy0Var2 = this.a;
            if (zBooleanValue2) {
                String strA3 = k8Var2.a(cy0Var2, this.c, this.d);
                wk2VarA.close();
                return strA3;
            }
            String strA4 = k8Var2.a(cy0Var2);
            wk2VarA.close();
            return strA4;
        } catch (Throwable th4) {
            try {
                wk2VarA.b(th4);
                if (th4 instanceof iyo) {
                    throw th4;
                }
                wk2VarA.a(th4);
                if (th4 instanceof kql) {
                    throw new uw0((kql) th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new ou0(th4);
                }
                if (th4 instanceof mv0) {
                    throw th4;
                }
                throw new tu0(th4);
            } finally {
            }
        }
    }

    @JavascriptInterface
    public final void notify(@NotNull String str) {
        if (str.length() == 0) {
            return;
        }
        ry0 ry0Var = this.a.z;
        if (ry0Var == null) {
            ry0Var = null;
        }
        Uri uri = Uri.parse(str);
        ry0Var.getClass();
        c26.K(new ey0(ry0Var, uri, null, (byte) 1));
    }

    @JavascriptInterface
    public final void notifyResult(@NotNull String str) {
        ry0 ry0Var = this.a.z;
        if (ry0Var == null) {
            ry0Var = null;
        }
        ry0Var.getClass();
        c26.K(new hkm(ry0Var, str, null, (byte) 19));
    }
}
