package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.SideMarginContainer;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class p35 extends lj {
    public final ArrayList r;
    public final s9 s;
    public ViewGroup t;
    public OperaListItem u;
    public SettingsManager v;
    public ac1 w;
    public OperaListItem x;

    public p35() {
        super(2132021155, 2131755025);
        this.r = new ArrayList();
        this.s = new s9(this, (byte) 10);
    }

    public final void G0() {
        boolean zI = this.v.i("exit_dialog_enabled");
        EnumSet enumSetNoneOf = EnumSet.noneOf(a35.class);
        EnumSet enumSetNoneOf2 = EnumSet.noneOf(a35.class);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o35 o35Var = (o35) obj;
            boolean zIsChecked = o35Var.b.isChecked();
            a35 a35Var = o35Var.a.e;
            if (zIsChecked) {
                enumSetNoneOf.add(a35Var);
            } else {
                enumSetNoneOf2.add(a35Var);
            }
        }
        Context contextRequireContext = requireContext();
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) contextRequireContext.getApplicationContext()).L().c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(zpaVar);
            m90 m90Var = (m90) b66VarF.n(62);
            if (m90Var == null) {
                b66VarF.q(62, 1, new m90(2443, 1, 10));
                m90Var = (m90) b66VarF.n(62);
            }
            m90Var.r(0, 1, zI);
            Iterator it = enumSetNoneOf.iterator();
            while (it.hasNext()) {
                m90Var.r(p37.v((a35) it.next()), 1, true);
            }
            Iterator it2 = enumSetNoneOf2.iterator();
            while (it2.hasNext()) {
                m90Var.r(p37.v((a35) it2.next()), 1, false);
            }
            x5fVar.U0(x56VarF);
        }
    }

    public final void H0() {
        ConstraintLayout constraintLayout = this.x;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o35) obj).b.setVisibility(0);
        }
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        this.v.H(this.s);
        super.onDestroyView();
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ac1 ac1Var = this.w;
        ac1Var.getClass();
        if (menuItem.getItemId() != ((MenuItem) ac1Var.e).getItemId()) {
            return true;
        }
        int i = ac1Var.b;
        i35 i35Var = (i35) ac1Var.d;
        if (i == 0) {
            i35Var.a0();
            return true;
        }
        i35Var.l();
        return true;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.v.F(this.s);
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        this.v = ((OperaApplication) context.getApplicationContext()).J();
        View viewInflate = layoutInflater.inflate(2131559298, viewGroup);
        FadingScrollView fadingScrollView = (FadingScrollView) viewInflate.findViewById(2131362839);
        SideMarginContainer sideMarginContainer = (SideMarginContainer) viewInflate.findViewById(2131364447);
        this.t = (ViewGroup) viewInflate.findViewById(2131362056);
        Objects.requireNonNull(fadingScrollView);
        sideMarginContainer.a = new uk6(fadingScrollView, (byte) 20);
        this.u = (OperaListItem) viewInflate.findViewById(2131364623);
        requireActivity().m1(new wx((Object) this, (Object) layoutInflater, (byte) 28));
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        this.w = new ac1(this.l, new wth((Object) this, (byte) 27));
    }
}
