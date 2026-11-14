package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class ukn extends lj {
    public MaterialButton A;
    public StylingImageButton B;
    public AppBarLayout C;
    public qkn D;
    public final ysj E;
    public final orm F;
    public final eej G;
    public final g9l H;
    public boolean I;
    public boolean J;
    public final gjm r;
    public final qln s;
    public final onn t;
    public final SettingsManager u;
    public final ua7 v;
    public final k3i w;
    public final x4i x;
    public SwipeRefreshLayout y;
    public RecyclerView z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ukn(gjm gjmVar, qln qlnVar, onn onnVar, SettingsManager settingsManager, ysj ysjVar, orm ormVar, eej eejVar, k3i k3iVar, x4i x4iVar) {
        u7k u7kVarJ = u7k.j(2131559542);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.e = true;
        u7kVarJ.s(2132022364);
        itlVar.b = 2131755070;
        super(itlVar);
        this.r = gjmVar;
        this.s = qlnVar;
        this.t = onnVar;
        this.u = settingsManager;
        this.E = ysjVar;
        this.F = ormVar;
        this.G = eejVar;
        this.v = new ua7((Fragment) this, gjmVar);
        this.w = k3iVar;
        this.x = x4iVar;
        this.H = new g9l(this, (byte) 13);
    }

    public final void G0() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.y.setEnabled(true);
        qkn qknVar = new qkn(this.r, this.s, this.t, this.u, this.z, new xjn(context, rih.q(context) != null), this.E, this.k, this.F, this.G, wln.a, this.w, this.x);
        this.D = qknVar;
        qknVar.c(this.I);
        ((kze) this.s.f.g).k(this.H);
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException, wed {
        super.onConfigurationChanged(configuration);
        qkn qknVar = this.D;
        if (qknVar != null) {
            RecyclerView recyclerView = qknVar.f;
            int integer = recyclerView.getResources().getInteger(2131493011);
            GridLayoutManager gridLayoutManager = recyclerView.n;
            if (gridLayoutManager == null || gridLayoutManager.b == integer) {
                return;
            }
            int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
            qknVar.b(integer);
            if (iFindFirstVisibleItemPosition != -1) {
                recyclerView.x0(iFindFirstVisibleItemPosition);
            }
        }
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vln vlnVar = ((rkn) this.v.p()).a;
        onn onnVar = this.t;
        onnVar.getClass();
        onnVar.g = new mnn(vlnVar);
        x4i x4iVar = this.x;
        na2.B(x4iVar.d, (CoroutineContext) null, (rx5) null, new r07(x4iVar, false, (mt5) null), 3);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        this.z.y0((d) null);
        ((kze) this.s.f.g).p(this.H);
        qkn qknVar = this.D;
        if (qknVar != null) {
            qknVar.a();
        }
        super.onDestroyView();
    }

    @Override // defpackage.k24
    public final void onDetach() {
        ku0 ku0Var;
        super.onDetach();
        onn onnVar = this.t;
        mnn mnnVar = onnVar.g;
        if (mnnVar != null) {
            int iOrdinal = mnnVar.a.ordinal();
            if (iOrdinal == 0) {
                ku0Var = ku0.b;
            } else if (iOrdinal == 1) {
                ku0Var = ku0.c;
            } else if (iOrdinal == 2) {
                ku0Var = ku0.d;
            } else if (iOrdinal == 3) {
                ku0Var = ku0.e;
            } else if (iOrdinal == 4) {
                ku0Var = ku0.f;
            } else {
                if (iOrdinal != 5) {
                    h9o.p();
                    return;
                }
                ku0Var = ku0.g;
            }
            nnn nnnVar = onnVar.h;
            vb0 vb0Var = (nnnVar != null ? nnnVar.c : null) != null ? vb0.b : vb0.c;
            x5f x5fVar = onnVar.d;
            long j = mnnVar.b;
            ArrayList arrayList = mnnVar.c;
            ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String id = ((aln) obj).getId();
                if (id.startsWith("FILE_storefront_wallpaper_")) {
                    id = "store-wallpaper";
                } else if (id.startsWith("FILE_user_wallpaper_")) {
                    id = "user-wallpaper";
                }
                arrayList2.add(id);
            }
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                ju0 ju0Var = new ju0(2443, -1, 4);
                ju0Var.q(1, 1, ku0Var);
                ju0Var.q(0, 1, vb0Var);
                ju0Var.q(3, 1, arrayList2);
                ju0Var.p(2, 1, j);
                x56 x56VarF = zpa.F();
                xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
                List list = (List) xb0VarX.n(41);
                ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 41, am2.q(xb0VarX, 41, 1)) : new hf0(xb0VarX, 41, list)).add(ju0Var);
                x5fVar.U0(x56VarF);
            }
        }
        onnVar.g = null;
        onnVar.h = null;
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        menuItem.getItemId();
        return true;
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        itdVar.findItem(2131361875).setVisible(false);
    }

    /* JADX WARN: Type inference failed for: r7v18, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        WeakHashMap weakHashMap = r5n.a;
        SwipeRefreshLayout swipeRefreshLayout = (View) m5n.f(statusBarDrawingFrameLayout, 2131364619);
        this.y = swipeRefreshLayout;
        swipeRefreshLayout.setEnabled(false);
        this.y.b = new r2n((Object) this, (byte) 9);
        this.z = (View) m5n.f(statusBarDrawingFrameLayout, 2131362409);
        this.C = (View) m5n.f(statusBarDrawingFrameLayout, 2131362059);
        p0(statusBarDrawingFrameLayout, this.z);
        r3i r3iVar = new r3i(new qfl(this, (byte) 21));
        Map map = (Map) this.x.h.g();
        if (!this.w.c() || map == null || map.isEmpty()) {
            MaterialButton materialButton = (View) m5n.f(statusBarDrawingFrameLayout, 2131365062);
            this.A = materialButton;
            materialButton.setVisibility(rih.q(requireContext()) != null ? 0 : 8);
            this.A.setOnClickListener(new pkm(this, (byte) 13));
        } else {
            MaterialButton materialButton2 = (View) m5n.f(statusBarDrawingFrameLayout, 2131365062);
            this.A = materialButton2;
            materialButton2.setVisibility(8);
            ?? r7 = (StylingImageButton) ((View) m5n.f(statusBarDrawingFrameLayout, 2131364087));
            this.B = r7;
            r7.setVisibility(0);
            this.B.setEnabled(false);
            this.B.setOnClickListener(new obn(this, r3iVar, (byte) 6));
        }
        this.z.setClipToPadding(false);
        RecyclerView recyclerView = this.z;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), fan.a(8.0f, getResources()), this.z.getPaddingRight(), fan.a(8.0f, getResources()));
        q9n.e(this.z, new svk(this, (byte) 26));
        RecyclerView recyclerView2 = this.z;
        recyclerView2.setOnScrollChangeListener(new tkn(this, recyclerView2));
        qln qlnVar = this.s;
        ami amiVar = qlnVar.f;
        ami amiVar2 = qlnVar.f;
        vq8 vq8Var = (vq8) amiVar.e;
        if ((vq8Var.i() || vq8Var.a) && ((s14) amiVar2.d).b) {
            G0();
        } else {
            w8h.w(this.z);
            amiVar2.r(new skn(this, (byte) 0));
        }
    }
}
