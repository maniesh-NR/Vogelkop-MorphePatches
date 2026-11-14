package defpackage;

import J.N;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AddressEditorManager;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.theme.ThemeableRecyclerView;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class iq2 extends ltl {
    public kf A;
    public pq3 B;
    public final ArrayList C;
    public final ArrayList D;
    public boolean E;
    public es2 F;
    public String G;
    public String H;
    public String I;
    public String J;
    public HashSet K;
    public final AutofillManager r;
    public final Address s;
    public final AddressEditorManager t;
    public final dt1 u;
    public final HashMap v;
    public final kdg w;
    public final bq2 x;
    public final dq2 y;
    public ProgressDialog z;

    /* JADX WARN: Illegal instructions before constructor call */
    public iq2(int i, int i2, AutofillManager autofillManager, gw gwVar, Address address) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(i);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = i2;
        itlVar.k = 1;
        super(itlVar);
        dt1 dt1Var = new dt1(this);
        this.u = dt1Var;
        this.v = new HashMap();
        this.w = new kdg();
        this.x = new bq2(this);
        this.y = new dq2(dt1Var);
        this.D = new ArrayList();
        this.K = new HashSet();
        this.r = autofillManager;
        this.t = new AddressEditorManager(gwVar.a);
        this.s = address;
        HashMap map = new HashMap();
        N.MCCiGG4f(map);
        this.C = L0(map);
    }

    public static ArrayList L0(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new sp2((String) entry.getKey(), (String) entry.getValue()));
        }
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(0);
        Collections.sort(arrayList, new rp2(collator));
        return arrayList;
    }

    public final boolean G0() {
        if (!this.H.isEmpty() || !this.I.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : this.v.entrySet()) {
            if (entry.getKey() != ew.COUNTRY && !((String) entry.getValue()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final Address H0() {
        String str = this.s.a;
        ew ewVar = ew.RECIPIENT;
        HashMap map = this.v;
        return new Address(str, (String) map.get(ewVar), (String) map.get(ew.ORGANIZATION), (String) map.get(ew.STREET_ADDRESS), (String) map.get(ew.ADMIN_AREA), (String) map.get(ew.LOCALITY), (String) map.get(ew.DEPENDENT_LOCALITY), (String) map.get(ew.POSTAL_CODE), (String) map.get(ew.SORTING_CODE), (String) map.get(ew.COUNTRY), this.H, this.I, this.G, "", false);
    }

    public final String I0() {
        String str = (String) this.v.get(ew.COUNTRY);
        return !TextUtils.isEmpty(str) ? str : this.s.j;
    }

    public final String J0() {
        if (this.K.contains(yp2.d) && TextUtils.getTrimmedLength(this.H) == 0) {
            return getString(2132020533);
        }
        if (this.H.isEmpty() || N.MQ1o0vJQ(this.H, I0())) {
            return null;
        }
        return getString(2132017670);
    }

    public final void K0() {
        ew ewVar;
        ew ewVar2;
        String strI0 = I0();
        this.D.clear();
        this.E = false;
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.z = progressDialog;
        progressDialog.setMessage(getContext().getText(2132017667));
        this.z.show();
        this.t.a(strI0, this.x);
        Context context = getContext();
        String str = this.s.m;
        ArrayList arrayList = new ArrayList();
        String str2 = (String) N.MSSlnHgJ(strI0, str, arrayList);
        int i = 0;
        boolean z = false;
        int i2 = -1;
        while (true) {
            int size = arrayList.size();
            ewVar = ew.COUNTRY;
            if (i >= size) {
                break;
            }
            fw fwVar = (fw) arrayList.get(i);
            ew ewVar3 = fwVar.a;
            boolean z2 = fwVar.d;
            if (ewVar3 == ewVar) {
                if (i != 0) {
                    arrayList.add(0, (fw) arrayList.remove(i));
                    if (i2 >= 0) {
                        i2++;
                    }
                    z = true;
                    i++;
                } else {
                    z = true;
                }
            } else if (ewVar3 == ew.ADMIN_AREA && !z2) {
                i2 = i;
            }
            if (i2 >= 0 && z2) {
                arrayList.add(i - 1, (fw) arrayList.remove(i2));
                i2 = -1;
            }
            i++;
        }
        if (i2 >= 0 && i2 < arrayList.size() - 1) {
            arrayList.add(arrayList.size() - 1, (fw) arrayList.remove(i2));
        }
        if (!z) {
            arrayList.add(0, new fw(ewVar, context.getString(2132017663), true, true));
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.G = str2;
        dt1 dt1Var = this.u;
        dt1Var.c = listUnmodifiableList;
        int size2 = listUnmodifiableList.size();
        int[] iArr = new int[size2];
        Iterator it = listUnmodifiableList.iterator();
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (!it.hasNext()) {
                break;
            }
            fw fwVar2 = (fw) it.next();
            int i5 = i3 + 1;
            if (!(fwVar2.d || (ewVar2 = fwVar2.a) == ew.LOCALITY || ewVar2 == ew.DEPENDENT_LOCALITY)) {
                i4 = 1;
            }
            iArr[i3] = i4;
            i3 = i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            if (iArr[i7] == 1) {
                i6++;
            } else {
                if (i6 % 2 != 0) {
                    iArr[i7 - 1] = 2;
                }
                i6 = 0;
            }
        }
        dt1Var.b = iArr;
        dt1Var.notifyDataSetChanged();
        this.w.b = strI0;
    }

    public boolean M0() {
        this.r.a(H0(), new va2(this, (byte) 4));
        return true;
    }

    public final void N0() {
        this.B.d.setEnabled(!G0());
    }

    public final void O0(ew ewVar, String str) {
        HashMap map = this.v;
        if (str.equals(map.get(ewVar))) {
            return;
        }
        map.put(ewVar, str);
        if (ewVar == ew.COUNTRY) {
            K0();
        }
        N0();
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q9n.J((ThemeableRecyclerView) this.A.c, AutoCompleteTextView.class, new qp2((byte) 0));
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        AddressEditorManager addressEditorManager = this.t;
        addressEditorManager.b = true;
        long j = addressEditorManager.c;
        if (j != 0) {
            N.MGjUO7tV(j);
            addressEditorManager.c = 0L;
        }
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        HashMap map = this.v;
        map.clear();
        Address address = this.s;
        map.put(ew.COUNTRY, address.j);
        map.put(ew.ADMIN_AREA, address.e);
        map.put(ew.LOCALITY, address.f);
        map.put(ew.DEPENDENT_LOCALITY, address.g);
        map.put(ew.SORTING_CODE, address.i);
        map.put(ew.POSTAL_CODE, address.h);
        map.put(ew.STREET_ADDRESS, address.d);
        map.put(ew.ORGANIZATION, address.c);
        map.put(ew.RECIPIENT, address.b);
        this.H = address.k;
        this.I = address.l;
        N0();
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.g = this.y;
        ((ThemeableRecyclerView) this.A.c).C0(gridLayoutManager);
        ((ThemeableRecyclerView) this.A.c).y0(this.u);
        K0();
        N0();
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pq3 pq3VarB = pq3.b(layoutInflater, viewGroup);
        this.B = pq3VarB;
        pq3VarB.d.setText(getString(2132020969));
        final byte b = 0;
        this.B.d.setOnClickListener(new View.OnClickListener(this) { // from class: pp2
            public final /* synthetic */ iq2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                byte b2 = b;
                iq2 iq2Var = this.b;
                switch (b2) {
                    case 0:
                        boolean zM0 = false;
                        boolean z2 = true;
                        if (iq2Var.K.size() == 0) {
                            z = !iq2Var.G0();
                        } else {
                            dt1 dt1Var = iq2Var.u;
                            String strJ0 = iq2Var.J0();
                            if (strJ0 != null) {
                                iq2Var.J = strJ0;
                                z2 = false;
                            }
                            if (iq2Var.K.contains(yp2.b) && TextUtils.getTrimmedLength(iq2Var.I) == 0) {
                                z2 = false;
                            }
                            for (fw fwVar : (List) dt1Var.c) {
                                if ((iq2Var.K.contains(yp2.a) && fwVar.c) || (iq2Var.K.contains(yp2.c) && fwVar.a == ew.RECIPIENT)) {
                                    if (TextUtils.getTrimmedLength((String) iq2Var.v.get(fwVar.a)) == 0) {
                                        fwVar.e = iq2Var.getString(2132020533);
                                        z2 = false;
                                    } else {
                                        fwVar.e = null;
                                    }
                                }
                            }
                            if (!z2) {
                                dt1Var.notifyDataSetChanged();
                            }
                            z = z2;
                        }
                        if (z && (iq2Var.H.isEmpty() || N.MQ1o0vJQ(iq2Var.H, iq2Var.I0()))) {
                            zM0 = iq2Var.M0();
                        }
                        if (zM0) {
                            l5b l5bVar = q9n.c;
                            q9n.u(iq2Var.getView());
                            iq2Var.g0();
                            break;
                        }
                        break;
                    default:
                        l5b l5bVar2 = q9n.c;
                        q9n.u(iq2Var.getView());
                        iq2Var.g0();
                        break;
                }
            }
        });
        this.B.c.setText(getString(2132018111));
        final byte b2 = 1;
        this.B.c.setOnClickListener(new View.OnClickListener(this) { // from class: pp2
            public final /* synthetic */ iq2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                byte b22 = b2;
                iq2 iq2Var = this.b;
                switch (b22) {
                    case 0:
                        boolean zM0 = false;
                        boolean z2 = true;
                        if (iq2Var.K.size() == 0) {
                            z = !iq2Var.G0();
                        } else {
                            dt1 dt1Var = iq2Var.u;
                            String strJ0 = iq2Var.J0();
                            if (strJ0 != null) {
                                iq2Var.J = strJ0;
                                z2 = false;
                            }
                            if (iq2Var.K.contains(yp2.b) && TextUtils.getTrimmedLength(iq2Var.I) == 0) {
                                z2 = false;
                            }
                            for (fw fwVar : (List) dt1Var.c) {
                                if ((iq2Var.K.contains(yp2.a) && fwVar.c) || (iq2Var.K.contains(yp2.c) && fwVar.a == ew.RECIPIENT)) {
                                    if (TextUtils.getTrimmedLength((String) iq2Var.v.get(fwVar.a)) == 0) {
                                        fwVar.e = iq2Var.getString(2132020533);
                                        z2 = false;
                                    } else {
                                        fwVar.e = null;
                                    }
                                }
                            }
                            if (!z2) {
                                dt1Var.notifyDataSetChanged();
                            }
                            z = z2;
                        }
                        if (z && (iq2Var.H.isEmpty() || N.MQ1o0vJQ(iq2Var.H, iq2Var.I0()))) {
                            zM0 = iq2Var.M0();
                        }
                        if (zM0) {
                            l5b l5bVar = q9n.c;
                            q9n.u(iq2Var.getView());
                            iq2Var.g0();
                            break;
                        }
                        break;
                    default:
                        l5b l5bVar2 = q9n.c;
                        q9n.u(iq2Var.getView());
                        iq2Var.g0();
                        break;
                }
            }
        });
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerViewInflate = layoutInflater.inflate(2131558511, viewGroup, false);
        viewGroup.addView(recyclerViewInflate);
        if (recyclerViewInflate == null) {
            t3p.q("rootView");
        } else {
            RecyclerView recyclerView = (ThemeableRecyclerView) recyclerViewInflate;
            this.A = new kf((byte) 4, (View) recyclerView, (Object) recyclerView);
        }
    }
}
