package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.widget.SelectableRelativeLayout;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class yzi extends i implements vzi, qzi {
    public final tzi b;
    public final vzk c;
    public final ImageView d;
    public boolean e;

    public yzi(View view, tzi tziVar) {
        super(view);
        this.b = tziVar;
        ImageView imageView = (ImageView) view.findViewById(2131363256);
        this.d = imageView;
        kkf kkfVar = new kkf(this, (byte) 17);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(view.getContext());
        if (dllVarV != null) {
            u8n.b(dllVarV, view, kkfVar);
        }
        if (imageView == null) {
            this.c = null;
        } else {
            imageView.setOnClickListener(t0h.i(new h4i((Object) this, (byte) 5)));
            this.c = new vzk(imageView, X(imageView.getContext()));
        }
    }

    public static d06 X(Context context) {
        int iT = f03.t(2130969278, context, 2131101243);
        Drawable drawableF = sgb.F(2131232018, context);
        drawableF.setTint(iT);
        g8i g8iVar = new g8i(context);
        g8iVar.c = f03.t(2130969314, context, 2131101243);
        g8iVar.d = drawableF;
        return new d06(sfe.P0(context, g8iVar.a()));
    }

    public void G(long j, boolean z) {
        if (getItemId() == j) {
            i0(z, true);
        }
    }

    public void U() {
        if (!this.e) {
            tzi tziVar = this.b;
            ((h7f) tziVar.a.b).b(this);
            tziVar.c.b(this);
        }
        this.e = true;
        i0(Z(), false);
        View view = ((i) this).itemView;
        if (view instanceof SelectableRelativeLayout) {
            ((SelectableRelativeLayout) view).d(V());
        }
        f0();
    }

    public boolean V() {
        return Y();
    }

    public void W(boolean z) {
        f0();
    }

    public boolean Y() {
        return !(this instanceof ry0);
    }

    public boolean Z() {
        return ((LinkedHashSet) this.b.a.c).contains(Long.valueOf(getItemId()));
    }

    public void a0() {
        vzk vzkVar;
        ImageView imageView = this.d;
        if (imageView == null || (vzkVar = this.c) == null) {
            return;
        }
        d06 d06VarX = X(imageView.getContext());
        boolean Z = Z();
        vzkVar.b = d06VarX;
        if (Z) {
            vzkVar.x(true, false);
        }
    }

    public final void b0(Drawable drawable) {
        d06 d06Var = new d06(sfe.P0(((i) this).itemView.getContext(), drawable));
        vzk vzkVar = this.c;
        if (vzkVar != null) {
            boolean Z = Z();
            vzkVar.c = d06Var;
            if (Z) {
                return;
            }
            vzkVar.x(false, false);
        }
    }

    public boolean c0() {
        return !this.b.g;
    }

    public void e0() {
        this.e = false;
        tzi tziVar = this.b;
        tziVar.c.c(this);
        ((h7f) tziVar.a.b).c(this);
    }

    public final void f0() {
        g0(c0());
    }

    public void g0(boolean z) {
    }

    public abstract void h0();

    public void i0(boolean z, boolean z2) {
        vzk vzkVar = this.c;
        if (vzkVar != null) {
            vzkVar.r();
            vzkVar.x(z, z2);
        }
        ((i) this).itemView.setSelected(z);
    }
}
