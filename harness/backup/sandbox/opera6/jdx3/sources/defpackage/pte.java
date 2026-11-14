package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.LayoutDirectionGridLayoutManager;
import com.opera.android.custom_views.PullSpinner;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class pte extends i93 {
    public p85 A;
    public FadingRecyclerView B;
    public nte C;
    public zxf D;
    public boolean E;
    public sa2 F;
    public final yqa G;
    public final q65 H;
    public final umi I;
    public final orm J;
    public final gjm t;
    public final skm u;
    public final jte v;
    public List w;
    public List x;
    public x93 y;
    public final wte z;

    public pte(gjm gjmVar, skm skmVar, wte wteVar, yqa yqaVar, umi umiVar, orm ormVar) {
        super(2132021274);
        this.v = new jte(this);
        this.w = new ArrayList();
        this.x = Collections.EMPTY_LIST;
        this.E = true;
        this.H = new q65(new yqd(this, (byte) 13), (byte) 4);
        this.t = gjmVar;
        this.u = skmVar;
        this.z = wteVar;
        this.G = yqaVar;
        this.I = umiVar;
        this.J = ormVar;
    }

    public static void I0(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M0(OperaListItem operaListItem, String str) {
        I0(operaListItem, str != null);
        operaListItem.C(str != null ? new qxh(str) : null);
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.v;
    }

    public final void H0() {
        yqe yqeVar;
        zxf yxfVar;
        if (this.w.isEmpty()) {
            return;
        }
        Context contextRequireContext = requireContext();
        String[] strArr = OperaApplication.K;
        if (((OperaApplication) contextRequireContext.getApplicationContext()).J().i("enable_newsfeed")) {
            zxf zxfVar = this.D;
            if (zxfVar == null) {
                dyf dyfVarE0 = getActivity().E0();
                WeakReference weakReference = dyfVarE0.j;
                if (weakReference == null || (yxfVar = (zxf) weakReference.get()) == null) {
                    yxfVar = new yxf(dyfVarE0);
                    dyfVarE0.j = new WeakReference(yxfVar);
                }
                zxfVar = yxfVar;
                this.D = zxfVar;
            }
            List listE = zxfVar.e();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (cwf cwfVar : this.w) {
                if (cwfVar instanceof cwf) {
                    bwf bwfVar = cwfVar.f;
                    if (listE.contains(bwfVar)) {
                        arrayList.add(bwfVar);
                        if (cwfVar.b) {
                            arrayList2.add(bwfVar);
                        }
                    }
                }
            }
            dyf dyfVarE02 = getActivity().E0();
            if (dyfVarE02.f == cue.NewsFeed) {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                HashSet hashSet = new HashSet(arrayList2.size());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bwf bwfVar2 = (bwf) obj;
                    if (bwfVar2 instanceof zqe) {
                        yqeVar = ((zqe) bwfVar2).a;
                    } else if (bwfVar2 instanceof jvl) {
                        yqeVar = yqe.d;
                    }
                    arrayList3.add(yqeVar);
                    if (arrayList2.contains(bwfVar2)) {
                        hashSet.add(yqeVar);
                    }
                }
                Context context = dyfVarE02.a;
                String[] strArr2 = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).y().c().l.g(arrayList3, hashSet);
            }
        }
    }

    public final void J0() {
        Iterator it = this.w.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((cwf) it.next()).b) {
                i++;
            }
        }
        int size = this.w.size();
        Context context = this.A.c.getContext();
        this.A.c.setText(context.getString(2132019030, Integer.valueOf(i), Integer.valueOf(size)));
        this.A.c.setTextColor(f03.t(i == 0 ? 2130969119 : R.attr.textColorSecondary, context, 2131101243));
    }

    public final void K0(cs5 cs5Var) {
        I0((LinearLayout) this.A.g, !(heb.m == cs5Var));
        I0(this.B, cs5Var instanceof ieb);
        I0(this.A.d, jeb.m == cs5Var);
        I0((LinearLayout) this.A.f, keb.m == cs5Var);
    }

    public final void L0(ste steVar) {
        OperaListItem operaListItem = (OperaListItem) this.A.l;
        boolean z = steVar.a;
        adg adgVar = steVar.e;
        bre breVar = steVar.d;
        jrh jrhVar = steVar.c;
        cs5 cs5Var = steVar.f;
        operaListItem.t(z);
        SeparatorView separatorView = (SeparatorView) this.A.k;
        o7j o7jVar = steVar.b;
        I0(separatorView, (o7jVar == null && jrhVar == null && breVar == null && adgVar == null) ? false : true);
        M0((OperaListItem) this.A.j, o7jVar != null ? getResources().getString(o7jVar.a) : null);
        M0((OperaListItem) this.A.e, jrhVar != null ? jrhVar.a : null);
        M0((OperaListItem) this.A.h, (!this.E || breVar == null) ? null : breVar.b);
        M0((OperaListItem) this.A.i, adgVar != null ? getString(adgVar.a) : null);
        boolean z2 = cs5Var instanceof ieb;
        q65 q65Var = this.H;
        if (z2) {
            q65Var.S();
            List list = ((ieb) cs5Var).m;
            if (!this.x.equals(list)) {
                this.x = list;
                this.w = list;
                this.E = true;
                this.y.notifyDataSetChanged();
                J0();
            }
        }
        if (cs5Var instanceof jeb) {
            q65Var.B0(this.I, 15L, TimeUnit.SECONDS);
        }
        if (cs5Var instanceof heb) {
            q65Var.S();
        }
        K0(cs5Var);
    }

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.F = q9n.o(context).n0;
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nte nteVar = this.C;
        if (nteVar != null) {
            nteVar.h();
        }
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        this.H.S();
        this.B.y0((d) null);
        this.y = null;
        this.G.c = null;
        ((OperaListItem) this.A.h).setOnClickListener(null);
        this.C = null;
        this.B = null;
        this.A = null;
        super.onDestroyView();
    }

    @Override // defpackage.k24
    public final void onDetach() {
        super.onDetach();
        ac8.a(new j06((byte) 20));
    }

    public final void onStart() {
        super.onStart();
        this.F.b++;
    }

    public final void onStop() {
        super.onStop();
        sa2 sa2Var = this.F;
        int i = sa2Var.b;
        if (i != 0) {
            sa2Var.b = i - 1;
        }
        H0();
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.y = new x93((Object) this, (byte) 3);
        PullSpinner pullSpinner = (PullSpinner) this.A.m;
        hz0 hz0Var = new hz0((byte) 3);
        dll dllVarS = q9n.s(pullSpinner);
        if (dllVarS != null) {
            u8n.b(dllVarS, pullSpinner, hz0Var);
        }
        PullSpinner pullSpinner2 = (PullSpinner) this.A.m;
        pullSpinner2.e.c = f03.C(pullSpinner2.getContext());
        pullSpinner2.invalidate();
        ((PullSpinner) this.A.m).d();
        final byte b = 2;
        ((PullSpinner) this.A.m).b(2);
        this.C = new nte(this);
        LayoutDirectionGridLayoutManager layoutDirectionGridLayoutManager = new LayoutDirectionGridLayoutManager(this.B);
        ((GridLayoutManager) layoutDirectionGridLayoutManager).g = this.C;
        this.B.y0(this.y);
        this.B.C0(layoutDirectionGridLayoutManager);
        final byte b2 = 1;
        ((RecyclerView) this.B).M.f = (short) 1;
        new glb(new mte(this)).e(this.B);
        this.G.c = new jte(this);
        p85 p85Var = this.A;
        ((OperaListItem) p85Var.l).u = new jte(this);
        final byte b3 = 0;
        ((OperaListItem) this.A.j).setOnClickListener(new lte(this, ((OperaListItem) p85Var.j).getTag().toString(), b3));
        ((OperaListItem) this.A.e).setOnClickListener(new View.OnClickListener(this) { // from class: kte
            public final /* synthetic */ pte b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b3;
                pte pteVar = this.b;
                switch (b4) {
                    case 0:
                        pteVar.t.e(new xse(0), false);
                        break;
                    case 1:
                        if (!vtp.M(pteVar)) {
                            pteVar.t.e(new pb6(), false);
                            break;
                        }
                        break;
                    default:
                        pteVar.G.r(view2.getContext());
                        break;
                }
            }
        });
        ((OperaListItem) this.A.h).setOnClickListener(new View.OnClickListener(this) { // from class: kte
            public final /* synthetic */ pte b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b;
                pte pteVar = this.b;
                switch (b4) {
                    case 0:
                        pteVar.t.e(new xse(0), false);
                        break;
                    case 1:
                        if (!vtp.M(pteVar)) {
                            pteVar.t.e(new pb6(), false);
                            break;
                        }
                        break;
                    default:
                        pteVar.G.r(view2.getContext());
                        break;
                }
            }
        });
        ((OperaListItem) this.A.i).setOnClickListener(new View.OnClickListener(this) { // from class: kte
            public final /* synthetic */ pte b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b2;
                pte pteVar = this.b;
                switch (b4) {
                    case 0:
                        pteVar.t.e(new xse(0), false);
                        break;
                    case 1:
                        if (!vtp.M(pteVar)) {
                            pteVar.t.e(new pb6(), false);
                            break;
                        }
                        break;
                    default:
                        pteVar.G.r(view2.getContext());
                        break;
                }
            }
        });
        xf8.i0(this.z.e, getViewLifecycleOwner(), this.A.b, (List) null, new d8d(this, (byte) 11));
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, com.opera.android.custom_views.StylingTextView] */
    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.v0(layoutInflater, viewGroup);
        View viewInflate = layoutInflater.inflate(2131558669, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362540;
        OperaListItem operaListItem = (OperaListItem) w1h.j(2131362540, viewInflate);
        if (operaListItem != null) {
            i = 2131362677;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131362677, viewInflate);
            if (linearLayout != null) {
                i = 2131363225;
                LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131363225, viewInflate);
                if (linearLayout2 != null) {
                    i = 2131363226;
                    ?? r9 = (StylingTextView) w1h.j(2131363226, viewInflate);
                    if (r9 != 0) {
                        i = 2131363356;
                        OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131363356, viewInflate);
                        if (operaListItem2 != null) {
                            i = 2131363509;
                            if (((StylingTextView) w1h.j(2131363509, viewInflate)) != null) {
                                i = 2131363883;
                                OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131363883, viewInflate);
                                if (operaListItem3 != null) {
                                    i = 2131364002;
                                    OperaListItem operaListItem4 = (OperaListItem) w1h.j(2131364002, viewInflate);
                                    if (operaListItem4 != null) {
                                        i = 2131364032;
                                        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) w1h.j(2131364032, viewInflate);
                                        if (fadingRecyclerView != null) {
                                            i = 2131364221;
                                            SeparatorView separatorView = (SeparatorView) w1h.j(2131364221, viewInflate);
                                            if (separatorView != null) {
                                                LinearLayout linearLayout3 = (LinearLayout) viewInflate;
                                                i = 2131364316;
                                                OperaListItem operaListItem5 = (OperaListItem) w1h.j(2131364316, viewInflate);
                                                if (operaListItem5 != null) {
                                                    i = 2131364525;
                                                    PullSpinner pullSpinner = (PullSpinner) w1h.j(2131364525, viewInflate);
                                                    if (pullSpinner != null) {
                                                        i = 2131364527;
                                                        FrameLayout frameLayout = (FrameLayout) w1h.j(2131364527, viewInflate);
                                                        if (frameLayout != null) {
                                                            this.A = new p85(linearLayout3, operaListItem, linearLayout, linearLayout2, r9, operaListItem2, operaListItem3, operaListItem4, fadingRecyclerView, separatorView, operaListItem5, pullSpinner, frameLayout);
                                                            this.B = fadingRecyclerView;
                                                            lzb lzbVar = new lzb(this, (byte) 20);
                                                            dll dllVarS = q9n.s(r9);
                                                            if (dllVarS == null) {
                                                                return;
                                                            }
                                                            u8n.b(dllVarS, r9, lzbVar);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
