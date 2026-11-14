package defpackage;

import android.view.LayoutInflater;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class lk extends i93 {
    public final mw3 t;
    public final zyk u;

    /* JADX WARN: Illegal instructions before constructor call */
    public lk(mw3 mw3Var) {
        u7k u7kVarE = u7k.e();
        u7kVarE.s(2132017304);
        itl itlVar = (itl) u7kVarE.a;
        itlVar.b = 2131755009;
        super(itlVar, true);
        this.t = mw3Var;
        this.u = z4c.b(new t2(this, (byte) 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltl
    public final void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
        final byte b = 0;
        ((xkj) ((RecyclerView) fadingRecyclerView).M).g = false;
        final byte b2 = 1;
        wf wfVar = new wf((byte) 1);
        wfVar.J(ck.class, new mc8((byte) 22), new xjj(this) { // from class: yj
            public final /* synthetic */ lk b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void i(Object obj, i iVar) {
                byte b3 = b;
                lk lkVar = this.b;
                switch (b3) {
                    case 0:
                        ck ckVar = (ck) obj;
                        OperaListItem operaListItem = ((gk) iVar).b;
                        operaListItem.E(ckVar.W);
                        operaListItem.C(ckVar.X);
                        operaListItem.t(ckVar.Y);
                        operaListItem.u = new xj(ckVar, lkVar);
                        break;
                    case 1:
                        zj zjVar = (zj) obj;
                        OperaListItem operaListItem2 = ((dk) iVar).b;
                        operaListItem2.E(zjVar.X);
                        operaListItem2.C(zjVar.Y);
                        operaListItem2.t(zjVar.Z);
                        operaListItem2.u = new xj(lkVar, zjVar, (byte) 2);
                        break;
                    default:
                        ak akVar = (ak) obj;
                        OperaListItem operaListItem3 = ((ek) iVar).b;
                        operaListItem3.E(akVar.X);
                        operaListItem3.C(akVar.Y);
                        operaListItem3.t(akVar.a0);
                        operaListItem3.u = new xj(lkVar, akVar, (byte) 0);
                        operaListItem3.w(new nf(lkVar, akVar, (byte) 1));
                        break;
                }
            }
        }, new a3j((byte) 4));
        wfVar.J(bk.class, new mc8((byte) 23), new mc8((byte) 24), new a3j((byte) 4));
        wfVar.J(zj.class, new mc8((byte) 25), new xjj(this) { // from class: yj
            public final /* synthetic */ lk b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void i(Object obj, i iVar) {
                byte b3 = b2;
                lk lkVar = this.b;
                switch (b3) {
                    case 0:
                        ck ckVar = (ck) obj;
                        OperaListItem operaListItem = ((gk) iVar).b;
                        operaListItem.E(ckVar.W);
                        operaListItem.C(ckVar.X);
                        operaListItem.t(ckVar.Y);
                        operaListItem.u = new xj(ckVar, lkVar);
                        break;
                    case 1:
                        zj zjVar = (zj) obj;
                        OperaListItem operaListItem2 = ((dk) iVar).b;
                        operaListItem2.E(zjVar.X);
                        operaListItem2.C(zjVar.Y);
                        operaListItem2.t(zjVar.Z);
                        operaListItem2.u = new xj(lkVar, zjVar, (byte) 2);
                        break;
                    default:
                        ak akVar = (ak) obj;
                        OperaListItem operaListItem3 = ((ek) iVar).b;
                        operaListItem3.E(akVar.X);
                        operaListItem3.C(akVar.Y);
                        operaListItem3.t(akVar.a0);
                        operaListItem3.u = new xj(lkVar, akVar, (byte) 0);
                        operaListItem3.w(new nf(lkVar, akVar, (byte) 1));
                        break;
                }
            }
        }, new a3j((byte) 4));
        final byte b3 = 2;
        wfVar.J(ak.class, new mc8((byte) 26), new xjj(this) { // from class: yj
            public final /* synthetic */ lk b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void i(Object obj, i iVar) {
                byte b32 = b3;
                lk lkVar = this.b;
                switch (b32) {
                    case 0:
                        ck ckVar = (ck) obj;
                        OperaListItem operaListItem = ((gk) iVar).b;
                        operaListItem.E(ckVar.W);
                        operaListItem.C(ckVar.X);
                        operaListItem.t(ckVar.Y);
                        operaListItem.u = new xj(ckVar, lkVar);
                        break;
                    case 1:
                        zj zjVar = (zj) obj;
                        OperaListItem operaListItem2 = ((dk) iVar).b;
                        operaListItem2.E(zjVar.X);
                        operaListItem2.C(zjVar.Y);
                        operaListItem2.t(zjVar.Z);
                        operaListItem2.u = new xj(lkVar, zjVar, (byte) 2);
                        break;
                    default:
                        ak akVar = (ak) obj;
                        OperaListItem operaListItem3 = ((ek) iVar).b;
                        operaListItem3.E(akVar.X);
                        operaListItem3.C(akVar.Y);
                        operaListItem3.t(akVar.a0);
                        operaListItem3.u = new xj(lkVar, akVar, (byte) 0);
                        operaListItem3.w(new nf(lkVar, akVar, (byte) 1));
                        break;
                }
            }
        }, new a3j((byte) 4));
        fadingRecyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.setOrientation(1);
        fadingRecyclerView.C0(linearLayoutManager);
        fadingRecyclerView.y0(wfVar);
        xf8.i0(H0().g, getViewLifecycleOwner(), fadingRecyclerView, (List) null, new wj(wfVar, this, b));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return H0();
    }

    public final pk H0() {
        return (pk) this.u.getValue();
    }

    @Override // defpackage.k24
    public final void onDetach() {
        super.onDetach();
        pk pkVarH0 = H0();
        ri3 ri3Var = pkVarH0.d;
        pde pdeVar = pkVarH0.f;
        a7j a7jVar = (a7j) pdeVar.g();
        SettingsManager settingsManager = ((us4) ri3Var.a.q.getValue()).b;
        settingsManager.getClass();
        settingsManager.V(a7jVar.ordinal(), "ad_blocking_mode");
        if (pdeVar.g() == a7j.c) {
            Collection<nvm> collectionValues = ((Map) pkVarH0.e.g()).values();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (nvm nvmVar : collectionValues) {
                String str = nvmVar.a;
                if (!nvmVar.f) {
                    str = null;
                }
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
            SettingsManager settingsManager2 = ((us4) ri3Var.a.q.getValue()).b;
            qpb qpbVar = rpb.d;
            List listK0 = CollectionsKt.k0(linkedHashSet);
            qpbVar.getClass();
            settingsManager2.Y("ad_blocking_mode.selected_custom_lists", qpbVar.b(listK0, new k72(xhk.a, (byte) 0)));
        }
    }

    @Override // defpackage.i93, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        final byte b = 1;
        if (super.onMenuItemClick(menuItem)) {
            return true;
        }
        if (menuItem.getItemId() == 2131364960) {
            final mj3 mj3Var = (mj3) H0().d.a.s.getValue();
            if (!mj3Var.c) {
                mj3Var.c = true;
                mj3Var.b.b(false, new lch() { // from class: c3
                    @Override // defpackage.lch
                    public final void m(boolean z) {
                        byte b2 = b;
                        Object obj = mj3Var;
                        switch (b2) {
                            case 0:
                                d3 d3Var = (d3) obj;
                                nak nakVar = d3Var.g;
                                b3 b3Var = (b3) nakVar.getValue();
                                SimpleDateFormat simpleDateFormat = d3.i;
                                nakVar.k((Object) null, new b3(b3Var.a, b3Var.b, x1p.R(d3Var.b), b3Var.d));
                                if (z) {
                                    mdh mdhVar = d3Var.c;
                                    mdhVar.getClass();
                                    mdh.b(mdhVar, true, iqi.DEBUG, null, 4);
                                    break;
                                }
                                break;
                            default:
                                mj3 mj3Var2 = (mj3) obj;
                                pi3 pi3Var = mj3Var2.a;
                                Set set = (Set) xf8.W(pi3Var.c);
                                if (set != null) {
                                    on7 on7Var = pn7.b;
                                    pi3Var.b.getClass();
                                    pi3Var.a(true, cs5.y0(System.currentTimeMillis(), un7.d), set);
                                }
                                mj3Var2.c = false;
                                break;
                        }
                    }
                });
            }
            ysj ysjVar = (ysj) this.t.get();
            ysjVar.b(am2.i(2132017306, 5000, ysjVar), ijm.b);
        }
        return false;
    }
}
