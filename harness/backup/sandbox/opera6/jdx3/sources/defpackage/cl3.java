package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cl3 extends y5m implements mya {
    public int g;
    public nya h;
    public final eme i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl3(fl3 fl3Var, View view, eme emeVar) {
        super(fl3Var, view);
        Objects.requireNonNull(fl3Var);
        this.i = emeVar;
    }

    @Override // defpackage.y5m, defpackage.z5m
    public final void U(ll3 ll3Var) {
        super.U(ll3Var);
        if (ll3Var instanceof jl3) {
            return;
        }
        ifd ifdVarF = ((vnj) this.i.a).f(eme.q0((pl3) ((il3) ll3Var).a), new bl3(this, new WeakReference(this), this.g, (byte) 0));
        if (ifdVarF instanceof tnj) {
            Z(ifdVarF);
        } else {
            this.j = false;
        }
    }

    @Override // defpackage.z5m
    public final void V() {
        this.b = null;
        this.g++;
        nya nyaVar = this.h;
        if (nyaVar != null) {
            oya.a(nyaVar);
            this.h = null;
        }
    }

    @Override // defpackage.y5m
    public final void X() {
        if (this.j) {
            return;
        }
        super.X();
    }

    public final void Z(ifd ifdVar) {
        if (ifdVar instanceof tnj) {
            int iA = fan.a(40.0f, ((i) this).itemView.getResources());
            this.h = oya.b(((tnj) ifdVar).a.getAbsolutePath(), iA, iA, 0, 0, this);
        }
    }

    @Override // defpackage.mya
    public final void m(Bitmap bitmap, boolean z) {
        if (!z) {
            this.h = null;
        }
        StylingImageView stylingImageView = this.c;
        if (stylingImageView == null) {
            return;
        }
        int iA = fan.a(40.0f, ((i) this).itemView.getResources());
        int iA2 = fan.a(20.0f, ((i) this).itemView.getResources());
        Context context = ((i) this).itemView.getContext();
        PathInterpolator pathInterpolator = s8i.d;
        p8i p8iVar = new p8i(iA, iA2, context, bitmap);
        p8iVar.a(f03.s(((i) this).itemView.getContext()));
        stylingImageView.setImageDrawable(p8iVar);
        this.j = true;
    }

    @Override // defpackage.mya
    public final void u(int i) {
        this.h = null;
        this.j = false;
    }
}
