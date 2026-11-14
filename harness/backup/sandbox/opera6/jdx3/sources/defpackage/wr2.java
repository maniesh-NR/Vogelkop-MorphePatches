package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillItem;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.PersonalDataMonitor;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wr2 extends e93 implements kkm, lkm {
    public final bv1 r;
    public final AutofillManager s;
    public PersonalDataMonitor t;
    public UndoBar u;
    public final orm v;
    public final d8j w;

    /* JADX WARN: Illegal instructions before constructor call */
    public wr2(AutofillManager autofillManager, orm ormVar, d8j d8jVar) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132017782);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = 2131755021;
        super(itlVar);
        this.s = autofillManager;
        this.r = new bv1(this, i0l.g());
        this.v = ormVar;
        this.w = d8jVar;
    }

    @Override // defpackage.e93
    public final int G0() {
        return 2131558516;
    }

    public final void I0(Address address) {
        Context context = getContext();
        tr2 tr2Var = new tr2(this);
        hs2 hs2Var = new hs2(address.o ? 2131755016 : 0);
        hs2Var.w = this.s;
        hs2Var.y = address;
        hs2Var.isVisible();
        hs2Var.isVisible();
        hs2Var.x = tr2Var;
        zhj.a(hs2Var, 4099).c(context);
    }

    @Override // defpackage.kkm
    public final e5d N(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList.add(new guh(str, this.r.G(str)));
        }
        return new e5d(arrayList, Collections.EMPTY_LIST, (byte) 2);
    }

    @Override // defpackage.kkm
    public final void O(l46 l46Var) {
    }

    public final void R(ArrayList arrayList) {
        bv1 bv1Var = this.r;
        bv1Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((wr2) bv1Var.e).s.f((String) obj);
        }
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.u.a(true);
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131364146) {
            ((g8j) this.w).h();
        }
        return true;
    }

    @Override // defpackage.ltl
    public final void onPause() {
        super.onPause();
        PersonalDataMonitor personalDataMonitor = this.t;
        if (personalDataMonitor != null) {
            personalDataMonitor.a();
        }
    }

    @Override // defpackage.ltl
    public final void onResume() {
        super.onResume();
        PersonalDataMonitor personalDataMonitor = this.t;
        AutofillManager autofillManager = this.s;
        if (personalDataMonitor == null) {
            q02 q02Var = new q02(this, (byte) 28);
            autofillManager.getClass();
            this.t = AutofillManager.b(q02Var);
        }
        bv1 bv1Var = this.r;
        Objects.requireNonNull(bv1Var);
        autofillManager.d(new ab(bv1Var, (byte) 27));
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UndoBar undoBar = new UndoBar(getActivity(), this.n, this, this, true);
        this.u = undoBar;
        undoBar.e(2131886092);
        RecyclerView recyclerViewFindViewById = view.findViewById(2131363328);
        getContext();
        recyclerViewFindViewById.C0(new LinearLayoutManager());
        recyclerViewFindViewById.y0(this.r);
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        bv1 bv1Var = this.r;
        bv1Var.getClass();
        List listUnmodifiableList = Collections.unmodifiableList((ArrayList) e5dVar.c);
        for (int size = listUnmodifiableList.size() - 1; size >= 0; size--) {
            guh guhVar = (guh) listUnmodifiableList.get(size);
            AutofillItem autofillItem = (AutofillItem) ((HashMap) bv1Var.c).remove(guhVar.a);
            boolean zIsEmpty = bv1Var.d.isEmpty();
            bv1Var.d.add(guhVar.b, autofillItem);
            int i = guhVar.b;
            if (zIsEmpty) {
                bv1Var.notifyItemRangeInserted(i, 2);
            } else {
                bv1Var.notifyItemInserted(i);
            }
        }
    }
}
