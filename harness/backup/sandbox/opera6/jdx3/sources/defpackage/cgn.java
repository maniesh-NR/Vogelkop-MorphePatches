package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.VpnProBanner;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.vpn.LocationButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class cgn extends e93 implements b0i, on9 {
    public final tvg A;
    public final hxk B;
    public final x5f C;
    public final ghf D;
    public final yug E;
    public final pfn F;
    public final sa2 G;
    public final sa2 H;
    public final ua7 I;
    public final rn9 J;
    public ImageView K;
    public BigSwitchButton L;
    public boolean M;
    public OperaListItem N;
    public OperaListItem O;
    public VpnProBanner P;
    public VpnProBanner Q;
    public Class R;
    public final adn r;
    public final ggn s;
    public final rn9 t;
    public final ArrayList u;
    public final ydn v;
    public final ktg w;
    public final z77 x;
    public final xt8 y;
    public final c0i z;

    /* JADX WARN: Illegal instructions before constructor call */
    public cgn(gjm gjmVar, ydn ydnVar, xb xbVar, slk slkVar, z77 z77Var, xt8 xt8Var, ktg ktgVar, tvg tvgVar, yug yugVar, ghf ghfVar, hxk hxkVar, pfn pfnVar, ggn ggnVar, x5f x5fVar) {
        u7k u7kVarF = u7k.f(2);
        u7kVarF.s(2132022280);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = 2131755069;
        super(itlVar);
        this.r = new adn(this, (byte) 1);
        this.t = new rn9(this, (byte) 27);
        this.u = new ArrayList();
        this.G = new sa2((byte) 6);
        this.H = new sa2((byte) 6);
        this.J = new rn9(this, this, (byte) 0);
        this.v = ydnVar;
        this.x = z77Var;
        this.A = tvgVar;
        this.B = hxkVar;
        this.C = x5fVar;
        this.z = new c0i(this, xbVar, slkVar, this);
        this.y = xt8Var;
        this.w = ktgVar;
        this.E = yugVar;
        this.D = ghfVar;
        this.F = pfnVar;
        this.s = ggnVar;
        this.I = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.on9
    public final qe6 H() {
        return this.j;
    }

    public final String I0(int i) {
        if (i == 0) {
            return getString(2132022160) + "\n\n" + getString(2132022129);
        }
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return getString(2132022161) + "\n\n" + getString(2132022163);
        }
        return getString(2132022161) + "\n\n" + getString(2132022162) + "\n\n" + getString(2132022166) + "\n\n" + getString(2132022129);
    }

    @Override // defpackage.b0i
    public final void J(int i) {
        int iA = vep.A(i);
        ijm ijmVar = ijm.b;
        z77 z77Var = this.x;
        if (iA == 0) {
            a0i a0iVar = new a0i(null, new y1n(this, (byte) 16));
            z77Var.getClass();
            z77Var.b(a0iVar, ijmVar);
        } else {
            if (iA != 1) {
                return;
            }
            boolean z = false;
            yz5 yz5Var = new yz5(z, z, (byte) 6);
            z77Var.getClass();
            z77Var.b(yz5Var, ijmVar);
        }
    }

    public final void J0(uvg uvgVar, int i) {
        int iOrdinal = uvgVar.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal == 4) {
                L0();
                return;
            } else if (iOrdinal != 5) {
                return;
            }
        }
        if (this.v.p().e) {
            this.E.a(i);
        }
    }

    public final void K0() {
        vx3 vx3VarA = ay3.a(this.v.c.isEnabled() ? "https://support-vpn-pro.opera.com/" : "https://help.opera.com/mobile/vpn/", lqm.u, false);
        vx3VarA.b = 3;
        o18.t(vx3VarA, true, vx3VarA);
    }

    public final void L0() {
        wzg wzgVar = new wzg(null, i8d.class, (byte) 4);
        new zhj(wzgVar, null, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(getContext());
    }

    public final void M0() {
        int i;
        int i2;
        boolean z = this.M;
        ydn ydnVar = this.v;
        if (z && ydnVar.c.isEnabled() && ydnVar.q() == 2) {
            this.M = false;
            qim qimVar = getActivity().o;
            Objects.requireNonNull(qimVar);
            ysj ysjVar = qimVar.e;
            w0a w0aVar = new w0a((byte) 5);
            ysjVar.getClass();
            ysjVar.b(w0aVar, ijm.b);
        }
        OperaListItem operaListItem = (OperaListItem) getView().findViewById(2131365046);
        vdn vdnVar = ydnVar.d;
        gfn gfnVar = ydnVar.c;
        operaListItem.setChecked(vdnVar.b());
        operaListItem.u = new xfn(this, (byte) 1);
        View viewFindViewById = getView().findViewById(2131365039);
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        viewFindViewById.setVisibility((!((OperaApplication) context.getApplicationContext()).J().i("compression") || ydnVar.d.a || gfnVar.isEnabled()) ? 8 : 0);
        OperaListItem operaListItem2 = (OperaListItem) getView().findViewById(2131365037);
        operaListItem2.t(ydnVar.B);
        operaListItem2.u = new xfn(this, (byte) 2);
        O0();
        if (gfnVar.isEnabled()) {
            i = 2130968789;
            i2 = 2130968790;
        } else {
            i = 2130968791;
            i2 = 2130968793;
        }
        BigSwitchButton bigSwitchButton = this.L;
        bigSwitchButton.d = i;
        bigSwitchButton.e();
        BigSwitchButton bigSwitchButton2 = this.L;
        bigSwitchButton2.e = i2;
        bigSwitchButton2.e();
        N0();
    }

    public final void N0() {
        ydn ydnVar = this.v;
        int i = ydnVar.q() == 2 ? ydnVar.c.isEnabled() ? 2130971258 : 2130971250 : 2130971251;
        ImageView imageView = this.K;
        imageView.setImageTintList(f03.u(i, imageView.getContext(), 2131099815));
    }

    public final void O0() {
        pxh pxhVarF;
        pxh rxhVar;
        ydn ydnVar = this.v;
        int iQ = ydnVar.q();
        BigSwitchButton bigSwitchButton = this.L;
        int iA = vep.A(iQ);
        int i = 3;
        if (iA == 0) {
            pxhVarF = ydnVar.f.g() ? ydnVar.f.f(getContext()) : new rxh(2132022270);
        } else if (iA == 1) {
            pxhVarF = new rxh(2132022271);
        } else if (iA == 2) {
            pxhVarF = new rxh(2132021630);
        } else {
            if (iA != 3) {
                hai.d();
                return;
            }
            pxhVarF = new rxh(2132022270);
        }
        bigSwitchButton.b(pxhVarF);
        BigSwitchButton bigSwitchButton2 = this.L;
        int iA2 = vep.A(iQ);
        if (iA2 == 0) {
            rxhVar = new rxh(2132018833);
        } else if (iA2 == 1) {
            rxhVar = new rxh(ydnVar.c.isEnabled() ? 2132022273 : 2132022272);
        } else if (iA2 == 2) {
            rxhVar = ydnVar.e.d ? new rxh(2132022276) : new qxh("");
        } else {
            if (iA2 != 3) {
                hai.d();
                return;
            }
            rxhVar = new rxh(2132022275);
        }
        bigSwitchButton2.c(rxhVar);
        BigSwitchButton bigSwitchButton3 = this.L;
        int iA3 = vep.A(iQ);
        if (iA3 == 0) {
            i = 0;
        } else if (iA3 != 1) {
            if (iA3 == 2) {
                i = 1;
            } else {
                if (iA3 != 3) {
                    hai.d();
                    return;
                }
                i = 2;
            }
        }
        bigSwitchButton3.d(i);
    }

    @Override // defpackage.on9
    public final oba a() {
        return ((vfn) this.I.p()).b;
    }

    @Override // defpackage.b0i
    public final void m() {
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.v.s();
        w parentFragmentManager = getParentFragmentManager();
        final byte b = 0;
        wfn wfnVar = new wfn(this, (byte) 0);
        rn9 rn9Var = this.t;
        rn9Var.d = parentFragmentManager;
        parentFragmentManager.i0("SyncAuthPortalFragment_request", (ltl) rn9Var.c, new mgf(rn9Var, wfnVar, (byte) 17));
        final pfn pfnVar = this.F;
        pfnVar.S();
        ru9 ru9Var = pfnVar.g;
        ru9Var.a(pfnVar.l);
        ru9Var.a(pfnVar.m);
        pfnVar.f.c.j(this, new t7d(new Function1() { // from class: kfn
            public final Object invoke(Object obj) {
                byte b2 = b;
                pfn pfnVar2 = pfnVar;
                switch (b2) {
                    case 0:
                        ((ylk) obj).s0(pfnVar2);
                        break;
                    case 1:
                        pfnVar2.r = (wvg) obj;
                        if (pfnVar2.p.b == null) {
                            lh4 lh4Var = new lh4(new jfn(pfnVar2, (byte) 1), (byte) 0);
                            pfnVar2.p = lh4Var;
                            pfnVar2.b.d(lh4Var);
                        }
                        pfnVar2.f.b();
                        break;
                    default:
                        nfn nfnVar = (nfn) obj;
                        mfn mfnVar = pfnVar2.n;
                        if (nfnVar == null || !nfnVar.equals(mfnVar.c)) {
                            mfnVar.a();
                            mfnVar.c = nfnVar;
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 27));
        final byte b2 = 1;
        pfnVar.e.i.j(this, new t7d(new Function1() { // from class: kfn
            public final Object invoke(Object obj) {
                byte b22 = b2;
                pfn pfnVar2 = pfnVar;
                switch (b22) {
                    case 0:
                        ((ylk) obj).s0(pfnVar2);
                        break;
                    case 1:
                        pfnVar2.r = (wvg) obj;
                        if (pfnVar2.p.b == null) {
                            lh4 lh4Var = new lh4(new jfn(pfnVar2, (byte) 1), (byte) 0);
                            pfnVar2.p = lh4Var;
                            pfnVar2.b.d(lh4Var);
                        }
                        pfnVar2.f.b();
                        break;
                    default:
                        nfn nfnVar = (nfn) obj;
                        mfn mfnVar = pfnVar2.n;
                        if (nfnVar == null || !nfnVar.equals(mfnVar.c)) {
                            mfnVar.a();
                            mfnVar.c = nfnVar;
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 27));
        final byte b3 = 2;
        pfnVar.k.j(this, new t7d(new Function1() { // from class: kfn
            public final Object invoke(Object obj) {
                byte b22 = b3;
                pfn pfnVar2 = pfnVar;
                switch (b22) {
                    case 0:
                        ((ylk) obj).s0(pfnVar2);
                        break;
                    case 1:
                        pfnVar2.r = (wvg) obj;
                        if (pfnVar2.p.b == null) {
                            lh4 lh4Var = new lh4(new jfn(pfnVar2, (byte) 1), (byte) 0);
                            pfnVar2.p = lh4Var;
                            pfnVar2.b.d(lh4Var);
                        }
                        pfnVar2.f.b();
                        break;
                    default:
                        nfn nfnVar = (nfn) obj;
                        mfn mfnVar = pfnVar2.n;
                        if (nfnVar == null || !nfnVar.equals(mfnVar.c)) {
                            mfnVar.a();
                            mfnVar.c = nfnVar;
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 27));
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((b87) obj).finish(hjm.b);
        }
        arrayList.clear();
        pfn pfnVar = this.F;
        ru9 ru9Var = pfnVar.g;
        ru9Var.d(pfnVar.l);
        ru9Var.d(pfnVar.m);
        pfnVar.o = null;
        pfnVar.p.b = null;
        pfnVar.q = null;
        pfnVar.r = null;
        pfnVar.R(null);
        pfnVar.n.a();
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.v.H(this.r);
        ConstraintLayout constraintLayout = this.P;
        if (constraintLayout != null) {
            wjj wjjVar = this.g;
            if (wjjVar != null) {
                ((can) wjjVar.d).a(constraintLayout);
            }
            this.P = null;
        }
        ConstraintLayout constraintLayout2 = this.Q;
        if (constraintLayout2 == null) {
            return;
        }
        wjj wjjVar2 = this.g;
        if (wjjVar2 != null) {
            ((can) wjjVar2.d).a(constraintLayout2);
        }
        this.Q = null;
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131363220) {
            return false;
        }
        K0();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgn.onStart():void");
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(2131363392);
        this.K = imageView;
        q9n.e(imageView, new svk(this, (byte) 24));
        LocationButton locationButton = (LocationButton) view.findViewById(2131363358);
        new bpd(locationButton);
        locationButton.setOnClickListener(new yfn(this, (byte) 7));
        BigSwitchButton bigSwitchButton = (BigSwitchButton) view.findViewById(2131362136);
        this.L = bigSwitchButton;
        bigSwitchButton.setOnClickListener(new yfn(this, (byte) 8));
        this.v.F(this.r);
        M0();
        this.L.jumpDrawablesToCurrentState();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(2131364104);
        viewGroup.setLayoutTransition(new LayoutTransition());
        xf8.i0((ekc) this.s.k.getValue(), getViewLifecycleOwner(), viewGroup, (List) null, new zfn(this, (byte) 1));
    }

    @Override // defpackage.b0i
    public final void q() {
        this.t.I();
    }
}
