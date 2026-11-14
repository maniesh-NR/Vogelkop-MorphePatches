package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.favorites.b;
import com.opera.android.favorites.e;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class syk extends y93 {
    public final skm D;
    public final SettingsManager E;
    public final qr8 F;
    public final ua7 G;
    public final nv2 H;
    public final zzj I;
    public tq8[] J;
    public izj K;
    public final pde L;

    public syk(gjm gjmVar, skm skmVar, SettingsManager settingsManager, qr8 qr8Var, nv2 nv2Var, zzj zzjVar, pde pdeVar) {
        super(2132021794, 2131755061);
        this.D = skmVar;
        this.E = settingsManager;
        this.F = qr8Var;
        this.G = new ua7((Fragment) this, gjmVar);
        this.H = nv2Var;
        this.I = zzjVar;
        this.L = pdeVar;
    }

    @Override // defpackage.y93
    public final d G0(Object obj, LinearLayoutManager linearLayoutManager) {
        ryk rykVar = new ryk((tq8) obj, this.E, false, null, (tta) this.K.d.g(), true, false, this.D, this.F, this.H, null, this.I, p6l.a);
        rykVar.X(new vr8(new dxh(R.attr.textColorSecondary), laj.e, new fxh(R.color.transparent), new dxh(2130969727), new dxh(2130969726), new dxh(R.attr.textColorPrimary), new dxh(2130970698), new dxh(2130970698), new dxh(2130971076), new fxh(2131099930), 2));
        return rykVar;
    }

    @Override // defpackage.y93
    public final u93 H0(ViewGroup viewGroup, Object obj) {
        tq8 tq8Var = (tq8) obj;
        final byte b = 0;
        ViewGroup viewGroup2 = (ViewGroup) this.B.inflate(2131559403, viewGroup, false);
        viewGroup2.setBackground(null);
        final RecyclerView recyclerViewFindViewById = viewGroup2.findViewById(2131363055);
        recyclerViewFindViewById.getContext();
        pde pdeVar = this.K.d;
        Objects.requireNonNull(pdeVar);
        gw7 gw7Var = new gw7(pdeVar, (byte) 2);
        pde pdeVar2 = this.L;
        Objects.requireNonNull(pdeVar2);
        qyk qykVar = new qyk(this, gw7Var, new gw7(pdeVar2, (byte) 4), recyclerViewFindViewById);
        this.K.d.j(getViewLifecycleOwner(), new f7f() { // from class: pyk
            public final void d0(Object obj2) {
                byte b2 = b;
                RecyclerView recyclerView = recyclerViewFindViewById;
                switch (b2) {
                    case 0:
                        recyclerView.requestLayout();
                        break;
                    default:
                        recyclerView.requestLayout();
                        break;
                }
            }
        });
        final byte b2 = 1;
        pdeVar2.j(getViewLifecycleOwner(), new f7f() { // from class: pyk
            public final void d0(Object obj2) {
                byte b22 = b2;
                RecyclerView recyclerView = recyclerViewFindViewById;
                switch (b22) {
                    case 0:
                        recyclerView.requestLayout();
                        break;
                    default:
                        recyclerView.requestLayout();
                        break;
                }
            }
        });
        recyclerViewFindViewById.t = true;
        recyclerViewFindViewById.C0(qykVar);
        return new u93(this, viewGroup2, recyclerViewFindViewById, tq8Var, qykVar);
    }

    @Override // defpackage.y93
    public final void M0() {
        this.J = null;
        super.M0();
    }

    @Override // defpackage.y93
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final tq8[] L0() {
        tq8[] tq8VarArr;
        if (this.J == null) {
            Context contextRequireContext = requireContext();
            String[] strArr = OperaApplication.K;
            b bVar = ((e) ((OperaApplication) contextRequireContext.getApplicationContext()).o()).g;
            ArrayList arrayList = bVar.e;
            ArrayList arrayList2 = bVar.e;
            if (arrayList.size() <= 1) {
                tq8VarArr = new tq8[0];
            } else {
                int size = arrayList2.size() - 1;
                tq8[] tq8VarArr2 = new tq8[size];
                int i = 0;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    tq8 tq8Var = (tq8) bVar.u(i2);
                    if (tq8Var != ((e) ((OperaApplication) requireContext().getApplicationContext()).o()).f) {
                        if (i >= size) {
                            break;
                        }
                        tq8VarArr2[i] = tq8Var;
                        i++;
                    }
                }
                tq8VarArr = tq8VarArr2;
            }
            this.J = tq8VarArr;
        }
        Q0();
        return this.J;
    }

    public final void Q0() {
        if (this.l.o().f.size() == 0) {
            return;
        }
        tq8[] tq8VarArr = this.J;
        boolean z = tq8VarArr != null && tq8VarArr.length > 0;
        r0(2131364636).setEnabled(z);
        r0(2131364639).setEnabled(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        this.K = ((BrowserActivity) activity).K0();
    }

    @Override // defpackage.y93, defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.J = null;
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = 0;
        if (menuItem.getItemId() != 2131364636) {
            int itemId = menuItem.getItemId();
            ua7 ua7Var = this.G;
            if (itemId == 2131364639) {
                tq8 tq8Var = L0()[this.v.getCurrentItem()];
                ua7Var.E(new duh(tq8Var.h()), new wj(this, tq8Var, (byte) 8));
                return true;
            }
            if (menuItem.getItemId() != 2131364635) {
                return false;
            }
            ua7Var.E(new euh(), new qzg(this, (byte) 27));
            return true;
        }
        tq8 tq8Var2 = L0()[this.v.getCurrentItem()];
        ArrayList arrayList = tq8Var2.e;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hq8 hq8Var = (hq8) obj;
            if (hq8Var instanceof tq8) {
                Context contextRequireContext = requireContext();
                String[] strArr = OperaApplication.K;
                ((e) ((OperaApplication) contextRequireContext.getApplicationContext()).o()).j((tq8) hq8Var, new crk(this, (byte) 5));
            } else {
                p6l p6lVar = p6l.a;
                if (hq8Var.i(p6lVar).startsWith("ofa://ui/")) {
                    String strI = hq8Var.i(p6lVar);
                    Context contextRequireContext2 = requireContext();
                    String[] strArr2 = OperaApplication.K;
                    if (((OperaApplication) contextRequireContext2.getApplicationContext()).o().c(strI, p6lVar) == null) {
                    }
                }
                Context contextRequireContext3 = requireContext();
                String[] strArr3 = OperaApplication.K;
                ((OperaApplication) contextRequireContext3.getApplicationContext()).o().b(hq8Var.h(), hq8Var.i(p6lVar));
            }
        }
        this.n.f(new glj(tq8Var2.e.size() > 1 ? 2132021621 : 2132021602, 2500));
        return true;
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        Q0();
    }
}
