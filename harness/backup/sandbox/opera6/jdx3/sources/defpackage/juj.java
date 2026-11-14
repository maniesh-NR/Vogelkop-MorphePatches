package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.opera.android.StatusBarDrawingFrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class juj extends ltl {
    public final ArrayList r;
    public final Uri s;
    public final Uri t;
    public final dx3 u;
    public final umi v;
    public final x5f w;
    public final int x;
    public int y;
    public int z;

    public juj(Uri uri, Uri uri2, dx3 dx3Var, umi umiVar, boolean z, boolean z2, x5f x5fVar) {
        super((itl) u7k.j(2131559460).a);
        this.r = new ArrayList();
        this.s = uri;
        this.t = uri2;
        this.u = dx3Var;
        this.v = umiVar;
        this.w = x5fVar;
        if (z2) {
            this.x = 2131559344;
        } else if (z) {
            this.x = 2131559342;
        } else {
            this.x = 2131559343;
        }
    }

    public final /* synthetic */ void G0(boolean z) {
        super.l0(z);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (this.y > 0) {
            super.l0(z);
            return;
        }
        z77 z77VarU = sfe.U(requireContext());
        vw vwVar = new vw((byte) 13, (Object) this, z);
        rxh rxhVar = new rxh(2132021578);
        gkj gkjVar = new gkj(false, false);
        gkjVar.a = null;
        gkjVar.b = null;
        gkjVar.c = null;
        gkjVar.d = null;
        gkjVar.e = null;
        gkjVar.f = null;
        gkjVar.g = null;
        gkjVar.h = vwVar;
        gkjVar.i = null;
        gkjVar.j = null;
        gkjVar.k = 2132018567;
        gkjVar.l = 2132018111;
        gkjVar.m = 2132021577;
        gkjVar.n = true;
        gkjVar.o = rxhVar;
        z77VarU.getClass();
        z77VarU.b(gkjVar, ijm.b);
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        int i = this.y;
        int i2 = this.z;
        x5f x5fVar = this.w;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            gq0 gq0Var = new gq0(2443, -1, 3);
            ArrayList arrayList = this.r;
            if (!arrayList.isEmpty()) {
                gq0Var.q(2, 1, arrayList);
            }
            gq0Var.p(1, 1, i);
            gq0Var.p(0, 1, i2);
            List list = (List) xb0VarX.n(20);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 20, am2.q(xb0VarX, 20, 1)) : new hf0(xb0VarX, 20, list)).add(gq0Var);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.ltl
    public final int s0() {
        return 2132018253;
    }

    @Override // defpackage.ltl
    public final int t0(Context context) {
        return 2131232034;
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        View viewInflate = layoutInflater.inflate(this.x, (ViewGroup) statusBarDrawingFrameLayout.findViewById(2131362409), true);
        WeakHashMap weakHashMap = r5n.a;
        ImageView imageView = (ImageView) ((View) m5n.f(viewInflate, 2131364499));
        deg degVar = yne.b;
        Uri uriX = this.t;
        degVar.f(uriX);
        degVar.g(uriX).g(imageView, (d94) null);
        Button button = (Button) ((View) m5n.f(viewInflate, 2131364503));
        if (s29.g(uriX)) {
            uriX = w7d.x(new File(uriX.getPath()));
        }
        button.setOnClickListener(new j5g(this, uriX, (byte) 17));
        ((Button) ((View) m5n.f(viewInflate, 2131364502))).setOnClickListener(new h4i((Object) this, (byte) 11));
    }
}
