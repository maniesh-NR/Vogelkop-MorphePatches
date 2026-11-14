package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.opera.android.bookmarks.h;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c7n extends d7n implements mya {
    public final eme p;
    public nya q;
    public int r;
    public p8i s;

    public c7n(View view, eme emeVar, tzi tziVar, i53 i53Var) {
        super(view, tziVar, i53Var);
        this.p = emeVar;
        q9n.e(view, new svk(this, (byte) 19));
    }

    @Override // defpackage.d7n, defpackage.e7n
    public final void k0(qhc qhcVar) {
        String strG;
        super.k0(qhcVar);
        gv gvVar = new gv((Object) new WeakReference(this), this.r, (byte) 7);
        boolean zA0 = z5i.a0(qhcVar.e());
        TextView textView = this.l;
        if (zA0) {
            vmj vmjVarM0 = m0();
            n0(scd.l0(vmjVarM0, vmjVarM0.a, vmjVarM0.b));
            textView.setText(2132017532);
            return;
        }
        ifd ifdVarF = ((vnj) this.p.a).f(eme.q0((pl3) qhcVar.a), gvVar);
        if (ifdVarF == null) {
            b0(m0());
        } else {
            o0(ifdVarF);
        }
        if (((SharedPreferences) ((h) this.o).j.get()).getBoolean("show_full_address", false)) {
            strG = qhcVar.e();
        } else {
            String strE = qhcVar.e();
            String[] strArr = wqm.a;
            strG = aik.g(strE);
        }
        textView.setText(strG);
    }

    @Override // defpackage.e7n
    public final void l0() {
        nya nyaVar = this.q;
        if (nyaVar != null) {
            oya.a(nyaVar);
            this.q = null;
        }
        this.r++;
        this.s = null;
    }

    @Override // defpackage.mya
    public final void m(Bitmap bitmap, boolean z) {
        if (!z) {
            this.q = null;
        }
        n0(bitmap);
    }

    public final vmj m0() {
        Context context = ((i) this).itemView.getContext();
        String strE = this.i.e();
        int i = vmj.g;
        int i2 = tmj.i(context);
        return tmj.m(context, strE, i2, i2, na5.b, 32);
    }

    public final void n0(Bitmap bitmap) {
        int iA = fan.a(40.0f, ((i) this).itemView.getResources());
        int iA2 = fan.a(20.0f, ((i) this).itemView.getResources());
        Context context = ((i) this).itemView.getContext();
        PathInterpolator pathInterpolator = s8i.d;
        p8i p8iVar = new p8i(iA, iA2, context, bitmap);
        this.s = p8iVar;
        p8iVar.a(f03.s(((i) this).itemView.getContext()));
        b0(this.s);
    }

    public final void o0(ifd ifdVar) {
        if (ifdVar instanceof nnj) {
            b0(m0());
        } else {
            int iA = fan.a(40.0f, ((i) this).itemView.getResources());
            this.q = oya.b(((tnj) ifdVar).a.getAbsolutePath(), iA, iA, 0, 0, this);
        }
    }

    @Override // defpackage.mya
    public final void u(int i) {
        this.q = null;
        b0(m0());
    }
}
