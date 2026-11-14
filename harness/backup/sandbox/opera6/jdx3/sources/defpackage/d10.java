package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d10 extends g10 {
    public final ArrayList H;
    public final SparseArray I;
    public final eme J;
    public int K;

    public d10(View view, kze kzeVar) {
        super(view, kzeVar);
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.J = new eme((byte) 6);
        g10.n0(this.i);
        g10.n0(this.m);
        g10.p0(this.m.getId(), this.n);
        g10.p0(this.o.getId(), this.j);
        g10.p0(this.j.getId(), this.q);
    }

    public final void A0() throws JSONException {
        eme emeVar = this.J;
        JSONArray jSONArray = (JSONArray) emeVar.a;
        JSONArray jSONArray2 = (JSONArray) emeVar.a;
        if (jSONArray.length() != 0) {
            int i = 0;
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                if (jSONArray2.optJSONObject(i2) == null) {
                    return;
                }
            }
            cs5.q0(f0().u, 5);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("respInfo", jSONArray2);
            cie cieVar = f0().u;
            String string = jSONObject.toString();
            ArrayList arrayList = cieVar.N;
            if (arrayList != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = cieVar.N;
                z0c z0cVar = new z0c(cieVar, string, (byte) 25);
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    String str = (String) obj;
                    if (URLUtil.isNetworkUrl(str)) {
                        hyg.c(new jro(str, string, 0, 1, z0cVar));
                    } else {
                        hyg.b(z0cVar);
                    }
                }
            }
            Z().o();
            for (int length = jSONArray2.length() - 1; length >= 0; length--) {
                jSONArray2.remove(length);
            }
        }
    }

    @Override // defpackage.g10, defpackage.xv8, defpackage.o43, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        cie cieVar = f0().u;
        List listU0 = u0(cieVar);
        ArrayList arrayList = this.H;
        arrayList.clear();
        if (!listU0.isEmpty()) {
            arrayList.addAll(listU0);
            return;
        }
        int i = cieVar.d == w06.p ? 2 : 1;
        String str = cieVar.r;
        Collection collection = cieVar.A;
        Collection collection2 = Collections.EMPTY_LIST;
        if (collection == null) {
            collection = collection2;
        }
        arrayList.add(new lgh(i, str, (List) collection));
    }

    @Override // defpackage.xv8, defpackage.bu8, android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        aoo aooVar;
        if (((c10) this.I.get(view.getId())) == null) {
            if (view != this.x) {
                super.onClick(view);
                return;
            }
            cie cieVar = f0().u;
            int i = this.K;
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                cs5.q0(cieVar, 4);
                jsd jsdVar = cieVar.P;
                if (jsdVar == null || (aooVar = cieVar.w0) == null) {
                    return;
                }
                aooVar.j(jsdVar);
                return;
            }
            lgh lghVar = (lgh) arrayList.get(this.K);
            ArrayList arrayListT0 = t0();
            int i2 = this.K;
            x0(lghVar, i2, arrayListT0, i2 == arrayList.size() - 1);
            int i3 = this.K + 1;
            if (i3 >= arrayList.size()) {
                z0();
            } else {
                cs5.q0(cieVar, 6);
                y0(i3);
            }
        }
    }

    @Override // defpackage.g10
    public final void q0(Bundle bundle) throws JSONException {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("answers");
        int i = bundle.getInt("question", 0);
        String string = bundle.getString("responses", "");
        eme emeVar = this.J;
        JSONArray jSONArray = (JSONArray) emeVar.a;
        for (int length = jSONArray.length() - 1; length >= 0; length--) {
            jSONArray.remove(length);
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray2 = new JSONArray(string);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    ((JSONArray) emeVar.a).put(i2, jSONArray2.opt(i2));
                }
            } catch (JSONException unused) {
            }
        }
        if (i >= this.H.size()) {
            z0();
            return;
        }
        y0(i);
        boolean zV0 = v0();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.I;
            if (i3 >= sparseArray.size()) {
                this.x.setEnabled(!t0().isEmpty());
                return;
            }
            c10 c10Var = (c10) sparseArray.valueAt(i3);
            if (stringArrayList != null) {
                c10Var.a(false, stringArrayList.contains(c10Var.a), !zV0);
            }
            i3++;
        }
    }

    @Override // defpackage.g10
    public final void r0(Bundle bundle) {
        AbstractList abstractListW = nb6.W(new b10((byte) 0), t0());
        if (!abstractListW.isEmpty()) {
            bundle.putStringArrayList("answers", nb6.J(abstractListW));
        }
        bundle.putInt("question", this.K);
        bundle.putString("responses", ((JSONArray) this.J.a).toString());
    }

    public final ArrayList t0() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.I;
            if (i >= sparseArray.size()) {
                return arrayList;
            }
            c10 c10Var = (c10) sparseArray.valueAt(i);
            if (((Checkable) c10Var.c).isChecked()) {
                arrayList.add(c10Var);
            }
            i++;
        }
    }

    public List u0(cie cieVar) {
        String str = cieVar.r;
        Collection collection = cieVar.A;
        Collection collection2 = Collections.EMPTY_LIST;
        if (collection == null) {
            collection = collection2;
        }
        return Collections.singletonList(new lgh(1, str, (List) collection));
    }

    public boolean v0() {
        return false;
    }

    public c10 w0(lgh lghVar, String str) {
        return new c10(ha2.M(this.E, lghVar.a == 1 ? 2131558744 : 2131558743, 0), str);
    }

    public final void x0(lgh lghVar, int i, List list, boolean z) throws JSONException {
        if (list.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("qType", v0g.d(lghVar.a));
            jSONObject.put("qIndex", i);
            jSONObject.put("qDesc", lghVar.b);
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c10 c10Var = (c10) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cIndex", lghVar.c.indexOf(c10Var.a));
                jSONObject2.put("cDesc", c10Var.a);
                jSONArray.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("question", jSONObject);
            jSONObject3.put("choices", jSONArray);
            ((JSONArray) this.J.a).put(i, jSONObject3);
            if (z) {
                A0();
            }
        } catch (JSONException unused) {
        }
    }

    public lgh y0(int i) {
        this.K = i;
        ArrayList arrayList = this.H;
        lgh lghVar = (lgh) arrayList.get(i);
        int size = arrayList.size();
        Resources resources = ((i) this).itemView.getResources();
        LinearLayout linearLayout = this.E;
        linearLayout.removeAllViews();
        SparseArray sparseArray = this.I;
        sparseArray.clear();
        int i2 = size > 1 ? 0 : 8;
        TextView textView = this.l;
        textView.setVisibility(i2);
        textView.setText(resources.getString(2132019070, Integer.valueOf(this.K + 1), Integer.valueOf(size)));
        String str = lghVar.b;
        List list = lghVar.c;
        String strB = aik.b(str, f0().u.r);
        TextView textView2 = this.n;
        textView2.setText(strB);
        textView2.setVisibility(0);
        TextView textView3 = this.p;
        textView3.setVisibility(TextUtils.isEmpty(textView3.getText()) ? 8 : 0);
        i0();
        for (int i3 = 0; i3 < list.size(); i3++) {
            String str2 = (String) list.get(i3);
            if (!TextUtils.isEmpty(str2)) {
                c10 c10VarW0 = w0(lghVar, str2);
                TextView textView4 = c10VarW0.c;
                l5b l5bVar = q9n.c;
                textView4.setId(View.generateViewId());
                textView4.setText(str2);
                textView4.setOnClickListener(new gf((Object) this, (byte) 11));
                linearLayout.addView(c10VarW0.b);
                sparseArray.append(textView4.getId(), c10VarW0);
            }
        }
        TextView textView5 = this.x;
        textView5.setVisibility(8);
        textView5.setEnabled(false);
        if (v0()) {
            return lghVar;
        }
        if (this.K == size - 1) {
            textView5.setText(2132019049);
        } else {
            textView5.setText(2132020022);
        }
        textView5.setVisibility(0);
        return lghVar;
    }

    public final void z0() {
        this.K = this.H.size();
        this.E.removeAllViews();
        this.I.clear();
        this.l.setVisibility(8);
        w10 w10VarL0 = f0();
        CharSequence charSequenceE = this.B.e(w10VarL0);
        TextView textView = this.x;
        textView.setText(charSequenceE);
        textView.setVisibility(!TextUtils.isEmpty(charSequenceE) ? 0 : 8);
        textView.setEnabled(true);
        this.n.setVisibility(8);
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        s0(w10VarL0.u);
    }
}
