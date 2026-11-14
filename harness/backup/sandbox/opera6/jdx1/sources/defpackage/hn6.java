package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hn6 implements ed6 {
    public final Context a;
    public final ArrayList b;
    public final ed6 c;
    public c19 d;
    public cb2 e;
    public fq5 f;
    public ed6 g;
    public fhm h;
    public zc6 i;
    public gkh j;
    public ed6 k;

    public hn6(Context context, ed6 ed6Var) {
        this.a = context.getApplicationContext();
        ed6Var.getClass();
        this.c = ed6Var;
        this.b = new ArrayList();
    }

    public static void d(ed6 ed6Var, pl6 pl6Var) {
        if (ed6Var != null) {
            ed6Var.c(pl6Var);
        }
    }

    public final void a(ed6 ed6Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ed6Var.c((pl6) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.ed6
    public final long b(nd6 nd6Var) {
        ed6 ed6Var;
        z4o.H(this.k == null);
        Uri uri = nd6Var.a;
        String scheme = uri.getScheme();
        String str = tym.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    c19 c19Var = new c19(false);
                    this.d = c19Var;
                    a(c19Var);
                }
                ed6Var = this.d;
                this.k = ed6Var;
            } else {
                if (this.e == null) {
                    cb2 cb2Var = new cb2(context);
                    this.e = cb2Var;
                    a(cb2Var);
                }
                ed6Var = this.e;
                this.k = ed6Var;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                cb2 cb2Var2 = new cb2(context);
                this.e = cb2Var2;
                a(cb2Var2);
            }
            ed6Var = this.e;
            this.k = ed6Var;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                fq5 fq5Var = new fq5(context);
                this.f = fq5Var;
                a(fq5Var);
            }
            ed6Var = this.f;
            this.k = ed6Var;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            ed6 ed6Var2 = this.c;
            if (zEquals) {
                ed6Var = this.g;
                if (ed6Var == null) {
                    try {
                        ed6 ed6Var3 = (ed6) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = ed6Var3;
                        a(ed6Var3);
                    } catch (ClassNotFoundException unused) {
                        w7d.K("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        h9o.s("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    ed6 ed6Var4 = this.g;
                    if (ed6Var4 == null) {
                        this.g = ed6Var2;
                    } else {
                        ed6Var2 = ed6Var4;
                    }
                    ed6Var = ed6Var2;
                }
                this.k = ed6Var;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    fhm fhmVar = new fhm();
                    this.h = fhmVar;
                    a(fhmVar);
                }
                ed6Var = this.h;
                this.k = ed6Var;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    zc6 zc6Var = new zc6(false);
                    this.i = zc6Var;
                    a(zc6Var);
                }
                ed6Var = this.i;
                this.k = ed6Var;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    gkh gkhVar = new gkh(context);
                    this.j = gkhVar;
                    a(gkhVar);
                }
                ed6Var = this.j;
                this.k = ed6Var;
            } else {
                this.k = ed6Var2;
                ed6Var = ed6Var2;
            }
        }
        return ed6Var.b(nd6Var);
    }

    @Override // defpackage.ed6
    public final void c(pl6 pl6Var) {
        pl6Var.getClass();
        this.c.c(pl6Var);
        this.b.add(pl6Var);
        d(this.d, pl6Var);
        d(this.e, pl6Var);
        d(this.f, pl6Var);
        d(this.g, pl6Var);
        d(this.h, pl6Var);
        d(this.i, pl6Var);
        d(this.j, pl6Var);
    }

    @Override // defpackage.ed6
    public final void close() {
        ed6 ed6Var = this.k;
        if (ed6Var != null) {
            try {
                ed6Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.ed6
    public final Map getResponseHeaders() {
        ed6 ed6Var = this.k;
        return ed6Var == null ? Collections.EMPTY_MAP : ed6Var.getResponseHeaders();
    }

    @Override // defpackage.ed6
    public final Uri getUri() {
        ed6 ed6Var = this.k;
        if (ed6Var == null) {
            return null;
        }
        return ed6Var.getUri();
    }

    @Override // defpackage.oc6
    public final int read(byte[] bArr, int i, int i2) {
        ed6 ed6Var = this.k;
        ed6Var.getClass();
        return ed6Var.read(bArr, i, i2);
    }
}
