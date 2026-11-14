package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import com.opera.android.favorites.SpeedDialDataFetcher;
import java.net.URI;
import java.net.URISyntaxException;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class et extends fr8 {
    public int A;
    public st s;
    public jl6 t;
    public gk6 u;
    public dt v;
    public int w;
    public String x;
    public vmj y;
    public int z;

    @Override // defpackage.fr8
    public final void n(Canvas canvas, Rect rect) {
        jl6 jl6Var = this.t;
        if (jl6Var == null && this.y == null && this.u == null) {
            this.a.b(rect.width(), this.b).b(canvas, rect.left, rect.top, this.z);
        } else {
            if (jl6Var != null) {
                jl6Var.c = this.f;
                jl6Var.g(canvas, rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
            gk6 gk6Var = this.u;
            if (gk6Var != null) {
                gk6Var.setBounds(rect);
                gk6Var.draw(canvas);
                return;
            }
            vmj vmjVar = this.y;
            if (vmjVar != null) {
                vmjVar.setBounds(rect);
                vmjVar.draw(canvas);
            }
        }
    }

    @Override // defpackage.fr8
    public final void o() {
        super.o();
        this.z = f03.t(2130969724, getContext(), 2131103876);
        this.A = f03.t(2130969300, getContext(), 2131101243);
        gk6 gk6Var = this.u;
        if (gk6Var != null) {
            gk6Var.a(this.A, getContext());
            gk6 gk6Var2 = this.u;
            this.t = null;
            this.v = null;
            this.u = gk6Var2;
            if (gk6Var2 != null) {
                l();
            } else {
                v();
                w();
                l();
            }
            invalidate();
        }
    }

    @Override // defpackage.fr8
    public final void q(boolean z) {
        gk6 gk6VarT;
        st stVar = this.s;
        if (stVar != null) {
            String str = stVar.b;
            int i = this.w;
            int i2 = this.c;
            boolean z2 = i != i2;
            String str2 = stVar.c;
            Bitmap bitmap = stVar.l;
            if (bitmap != null && !z2) {
                u(bitmap);
                return;
            }
            if (str2 != null && str2.length() != 0) {
                if (z2) {
                    this.w = i2;
                    v();
                    t(i2, str2, (c.q(str2, "/", false) || c.q(str2, "file://", false)) ? false : true);
                    return;
                }
                return;
            }
            hk6.e.getClass();
            if (!a36.p(str)) {
                String[] strArr = wqm.a;
                try {
                    new URI(str);
                    if (c.q(str, "https://", true) || c.q(str, "http://", true)) {
                        if (z2) {
                            this.w = i2;
                            v();
                            Context context = getContext();
                            new SpeedDialDataFetcher(null, str, 1, context, nr8.e(context), new ab(this, (byte) 1));
                            return;
                        }
                        return;
                    }
                } catch (URISyntaxException unused) {
                }
                v();
                w();
                l();
                return;
            }
            v();
            hk6 hk6VarS = a36.s(str);
            if (hk6VarS != null) {
                int i3 = gk6.j;
                gk6VarT = s16.t(getContext(), hk6VarS.b, hk6VarS.c, this.c, this.A, 16);
            } else {
                gk6VarT = null;
            }
            this.t = null;
            this.v = null;
            this.u = gk6VarT;
            if (gk6VarT != null) {
                l();
            } else {
                v();
                w();
                l();
            }
            invalidate();
        }
    }

    @Override // defpackage.fr8
    public final void s() {
        st stVar = this.s;
        if (stVar == null) {
            return;
        }
        setText(!this.l ? stVar.a.a(getResources()) : " ");
    }

    public final void t(int i, String str, boolean z) {
        dt dtVar = new dt(this, z, str, i);
        this.v = dtVar;
        dwh dwhVarG = qbe.G(getContext(), i, str);
        if (z) {
            dwhVarG.i(3, new int[0]);
        }
        dwhVarG.f(dtVar);
    }

    public final void u(Bitmap bitmap) {
        jl6 jl6Var;
        st stVar = this.s;
        if (stVar != null) {
            stVar.l = bitmap;
        }
        if (bitmap != null) {
            jl6Var = new jl6(bitmap, this.a, this.b, this.f);
        } else {
            jl6Var = null;
        }
        this.t = jl6Var;
        this.v = null;
        if (jl6Var == null) {
            v();
            w();
            l();
        } else {
            l();
        }
        invalidate();
    }

    public final void v() {
        dt dtVar = this.v;
        if (dtVar != null) {
            yne.b.a(dtVar);
        }
        this.v = null;
        this.t = null;
        this.u = null;
    }

    public final void w() {
        st stVar = this.s;
        if (stVar != null) {
            String str = stVar.b;
            if (TextUtils.equals(this.x, str)) {
                return;
            }
            this.x = str;
            int i = vmj.g;
            Context context = getContext();
            int i2 = this.c;
            this.y = tmj.j(context, str, i2, i2, 48);
            invalidate();
        }
    }
}
