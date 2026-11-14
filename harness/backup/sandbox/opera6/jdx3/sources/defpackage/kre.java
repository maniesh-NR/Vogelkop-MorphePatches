package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class kre extends sff {
    public final x5f j;
    public final ta7 k;
    public long l;
    public boolean m;

    public kre(z7 z7Var, t9f t9fVar, x5f x5fVar, ta7 ta7Var) {
        super(z7Var, t9fVar);
        this.j = x5fVar;
        this.k = ta7Var;
    }

    @Override // defpackage.g3k
    public final void a(pzh pzhVar, byte[] bArr) {
        this.m = true;
        d(pzhVar, bArr);
        if (this.m) {
            i(1);
        }
    }

    @Override // defpackage.g3k
    public final boolean b(int i) {
        if (super.b(i)) {
            this.l = SystemClock.uptimeMillis();
            return true;
        }
        int iA = vep.A(i);
        if (iA == 0) {
            i(4);
            return false;
        }
        if (iA == 1 || iA == 2 || iA == 3) {
            i(3);
            return false;
        }
        i(2);
        return false;
    }

    @Override // defpackage.sff, defpackage.g3k
    public final void e(fvh fvhVar) {
        this.l = SystemClock.uptimeMillis();
        super.e(fvhVar);
    }

    @Override // defpackage.sff
    public final void h(String str, boolean z) {
        this.m = false;
        super.h(str, z);
    }

    public final void i(int i) {
        String strSubstring;
        if0 if0Var;
        if0 if0Var2;
        x5f x5fVar = this.j;
        zpa zpaVar = x5fVar.d;
        if (i == 1 || !this.i.g) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.l;
            ta7 ta7Var = this.k;
            if (ta7Var != null) {
                Uri uri = Uri.parse(this.b);
                yla ylaVarR = ta7Var.r();
                if (ylaVarR != null) {
                    URL url = ylaVarR.a;
                    if (uri.getHost().equals(url.getHost())) {
                        String path = url.getPath();
                        String path2 = uri.getPath();
                        if (!TextUtils.isEmpty(path)) {
                            if (!path2.startsWith(path)) {
                                return;
                            } else {
                                path2 = path2.substring(path.length() + (path.endsWith("/") ? -1 : 0));
                            }
                        }
                        if (TextUtils.isEmpty(path2) || path2.charAt(0) != '/') {
                            return;
                        }
                        if (path2.startsWith("v1/news/main", 1)) {
                            strSubstring = null;
                        } else {
                            if (!path2.startsWith("v1/news/category", 1)) {
                                if (path2.startsWith("v1/related", 1) && x5fVar.h) {
                                    x56 x56VarF = zpa.F();
                                    uo0 uo0VarK = x56VarF.K(zpaVar);
                                    ro0 ro0Var = (ro0) uo0VarK.n(2);
                                    if (ro0Var == null) {
                                        uo0VarK.q(2, 1, zpa.I());
                                        ro0Var = (ro0) uo0VarK.n(2);
                                    }
                                    p37.V(ro0Var, i, jUptimeMillis);
                                    x5fVar.U0(x56VarF);
                                    return;
                                }
                                return;
                            }
                            strSubstring = path2.substring(17);
                        }
                        String queryParameter = uri.getQueryParameter("action");
                        if ("load_more".equals(queryParameter)) {
                            if (x5fVar.h) {
                                x56 x56VarF2 = zpa.F();
                                uo0 uo0VarK2 = x56VarF2.K(zpaVar);
                                Map map = (Map) uo0VarK2.n(0);
                                if (map == null || map.isEmpty()) {
                                    HashMap map2 = new HashMap();
                                    uo0VarK2.q(0, 1, map2);
                                    if0Var2 = new if0(uo0VarK2, 0, map2);
                                } else {
                                    if0Var2 = new if0(uo0VarK2, 0, map);
                                }
                                if (strSubstring == null) {
                                    strSubstring = "topnews";
                                }
                                ro0 ro0VarI = (ro0) if0Var2.get(strSubstring);
                                if (ro0VarI == null) {
                                    ro0VarI = zpa.I();
                                    if0Var2.put(strSubstring, ro0VarI);
                                }
                                p37.V(ro0VarI, i, jUptimeMillis);
                                x5fVar.U0(x56VarF2);
                                return;
                            }
                            return;
                        }
                        if ("refresh".equals(queryParameter) && x5fVar.h) {
                            x56 x56VarF3 = zpa.F();
                            uo0 uo0VarK3 = x56VarF3.K(zpaVar);
                            Map map3 = (Map) uo0VarK3.n(1);
                            if (map3 == null || map3.isEmpty()) {
                                HashMap map4 = new HashMap();
                                uo0VarK3.q(1, 1, map4);
                                if0Var = new if0(uo0VarK3, 1, map4);
                            } else {
                                if0Var = new if0(uo0VarK3, 1, map3);
                            }
                            if (strSubstring == null) {
                                strSubstring = "topnews";
                            }
                            ro0 ro0VarI2 = (ro0) if0Var.get(strSubstring);
                            if (ro0VarI2 == null) {
                                ro0VarI2 = zpa.I();
                                if0Var.put(strSubstring, ro0VarI2);
                            }
                            p37.V(ro0VarI2, i, jUptimeMillis);
                            x5fVar.U0(x56VarF3);
                        }
                    }
                }
            }
        }
    }
}
