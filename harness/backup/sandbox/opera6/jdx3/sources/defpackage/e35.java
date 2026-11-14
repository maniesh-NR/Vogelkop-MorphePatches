package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.r;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e35 extends ltl {
    public final ArrayList r;
    public LayoutInflater s;
    public LinearLayout t;
    public pq3 u;
    public ac1 v;
    public OperaListItem w;
    public s25 x;
    public int y;
    public final se3 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public e35() {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132018231);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = 2131755025;
        itlVar.k = 1;
        itlVar.d = true;
        super(itlVar);
        this.r = new ArrayList();
        this.z = new se3(this);
    }

    public static e35 H0(int i) {
        e35 e35Var = new e35();
        Bundle bundle = new Bundle();
        bundle.putInt("scenario", vep.A(i));
        e35Var.setArguments(bundle);
        return e35Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void G0(r25[] r25VarArr, int i) {
        ?? r0 = (OperaListItem) this.s.inflate(2131559295, (ViewGroup) this.t, false);
        this.w = r0;
        this.t.addView(r0);
        u35.k(i, this.w);
        this.w.setOnClickListener(new b35(this, (byte) 2));
        for (r25 r25Var : r25VarArr) {
            c35 c35Var = new c35(this, r25Var);
            ArrayList arrayList = this.r;
            arrayList.add(c35Var);
            ((c35) arrayList.get(arrayList.size() - 1)).b.setVisibility(8);
        }
    }

    public final c35 I0(Class cls) {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c35 c35Var = (c35) obj;
            if (c35Var.a.getClass() == cls) {
                return c35Var;
            }
        }
        hai.d();
        return null;
    }

    public final void J0() {
        ConstraintLayout constraintLayout = this.w;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c35 c35Var = (c35) obj;
            if (c35Var.e) {
                c35Var.b.setVisibility(0);
            }
        }
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        r activity = getActivity();
        g0();
        if (this.y == 1) {
            activity.moveTaskToBack(true);
        }
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ac1 ac1Var = this.v;
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

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pq3 pq3VarB = pq3.b(layoutInflater, viewGroup);
        this.u = pq3VarB;
        pq3VarB.d.setText(2132021154);
        this.u.d.setOnClickListener(new b35(this, (byte) 0));
        this.u.c.setText(2132018111);
        this.u.c.setOnClickListener(new b35(this, (byte) 1));
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        this.s = layoutInflater;
        View viewInflate = layoutInflater.inflate(2131559297, viewGroup, false);
        viewGroup.addView(viewInflate);
        if (viewInflate == null) {
            t3p.q("rootView");
            return;
        }
        this.t = (LinearLayout) viewInflate;
        int i = vep.B(3)[getArguments().getInt("scenario")];
        this.y = i;
        int iA = vep.A(i);
        byte b = 14;
        ArrayList arrayList = this.r;
        if (iA == 0) {
            r25[] r25VarArr = {new v25(), new t25((byte) 0), new t25((byte) 1)};
            int i2 = 0;
            for (int i3 = 3; i2 < i3; i3 = 3) {
                arrayList.add(new c35(this, r25VarArr[i2]));
                i2++;
            }
            G0(new r25[]{new o25((byte) 0), new o25((byte) 2), new o25((byte) 1), new x25((byte) 1), new q25((byte) 0), new z25((byte) 0), new y25(), new q25((byte) 1), new x25((byte) 0), new n25(), new z25((byte) 1)}, 2132021079);
            I0(v25.class).a(true);
        } else if (iA == 1) {
            r25[] r25VarArr2 = {new q25((byte) 0), new z25((byte) 0), new y25(), new q25((byte) 1), new z25((byte) 1), new x25((byte) 0), new n25()};
            int i4 = 0;
            for (int i5 = 7; i4 < i5; i5 = 7) {
                arrayList.add(new c35(this, r25VarArr2[i4]));
                i4++;
            }
            G0(new r25[]{new o25((byte) 0), new t25((byte) 1), new q25("Wallpaper", new rxh(2132022336), null, 2131232147, a35.o), new t25((byte) 0), new o25((byte) 2), new o25((byte) 1), new x25((byte) 1), new y25("OnboardingProfile", new rxh(2132018232), null, 2131232315, a35.p), new v25()}, 2132021080);
            I0(q25.class).a(true);
            I0(z25.class).a(true);
            I0(y25.class).a(true);
        } else if (iA == 2) {
            r25[] r25VarArr3 = {new q25((byte) 0), new z25((byte) 0), new y25(), new o25((byte) 2), new o25((byte) 0), new t25((byte) 1), new t25((byte) 0), new x25((byte) 0), new n25(), new q25((byte) 1), new z25((byte) 1), new v25(), new o25((byte) 1), new x25((byte) 1)};
            for (int i6 = 0; i6 < 14; i6++) {
                arrayList.add(new c35(this, r25VarArr3[i6]));
            }
        }
        ac1 ac1Var = this.v;
        ac1Var.a = arrayList.size();
        ac1Var.k();
        getActivity().m1(new iu2(this, b));
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        this.v = new ac1(this.l, new eme(this));
    }
}
