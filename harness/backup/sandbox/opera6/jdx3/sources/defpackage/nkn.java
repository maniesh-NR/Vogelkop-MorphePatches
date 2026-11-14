package defpackage;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.d;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class nkn extends lj {
    public FadingRecyclerView A;
    public qkn B;
    public final g9l C;
    public final gjm r;
    public final qln s;
    public final onn t;
    public final SettingsManager u;
    public final ysj v;
    public final orm w;
    public final eej x;
    public final k3i y;
    public final x4i z;

    /* JADX WARN: Illegal instructions before constructor call */
    public nkn(gjm gjmVar, qln qlnVar, onn onnVar, SettingsManager settingsManager, ysj ysjVar, orm ormVar, eej eejVar, k3i k3iVar, x4i x4iVar) {
        u7k u7kVarE = u7k.e();
        u7kVarE.s(2132022342);
        super((itl) u7kVarE.a);
        this.r = gjmVar;
        this.s = qlnVar;
        this.t = onnVar;
        this.u = settingsManager;
        this.v = ysjVar;
        this.w = ormVar;
        this.x = eejVar;
        this.y = k3iVar;
        this.z = x4iVar;
        this.C = new g9l(this, (byte) 12);
        ((x5f) ormVar).S(9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltl
    public final void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
        this.A = fadingRecyclerView;
        fadingRecyclerView.setPadding(fadingRecyclerView.getPaddingLeft(), fan.a(8.0f, getResources()), fadingRecyclerView.getPaddingRight(), fan.a(8.0f, getResources()));
        fadingRecyclerView.setClipToPadding(false);
        svk svkVar = new svk(this, (byte) 25);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(fadingRecyclerView.getContext());
        if (dllVarV != null) {
            u8n.b(dllVarV, fadingRecyclerView, svkVar);
        }
        qln qlnVar = this.s;
        vq8 vq8Var = (vq8) qlnVar.f.e;
        if (vq8Var.i() || vq8Var.a) {
            G0(fadingRecyclerView);
        } else {
            w8h.w(fadingRecyclerView);
            qlnVar.f.r(new npl(this, fadingRecyclerView, (byte) 24));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G0(FadingRecyclerView fadingRecyclerView) {
        this.B = new qkn(this.r, this.s, this.t, this.u, fadingRecyclerView, new wjn(fadingRecyclerView.getContext(), (byte) 0), this.v, this.k, this.w, this.x, wln.e, this.y, this.z);
        ((kze) this.s.f.h).j(getViewLifecycleOwner(), this.C);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        FadingRecyclerView fadingRecyclerView = this.A;
        if (fadingRecyclerView != null) {
            fadingRecyclerView.y0((d) null);
        }
        qkn qknVar = this.B;
        if (qknVar != null) {
            qknVar.a();
        }
        super.onDestroyView();
    }
}
