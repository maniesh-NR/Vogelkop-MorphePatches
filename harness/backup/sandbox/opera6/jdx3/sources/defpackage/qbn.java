package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class qbn extends d {
    public final jbn a;
    public final lrk b;
    public final boolean c;
    public final ArrayList d;

    public qbn(Context context, jbn jbnVar, cq5 cq5Var, lrk lrkVar) {
        this.a = jbnVar;
        this.b = lrkVar;
        ywc.d();
        Set<String> setKeySet = ywc.a.keySet();
        ArrayList arrayListC = ywc.c();
        ArrayList arrayList = new ArrayList();
        for (String str : setKeySet) {
            if (!arrayListC.contains(str)) {
                xwc xwcVarA = ywc.a(str);
                arrayList.add(new lbn(sfe.S(str), context.getString(xwcVarA.b), xwcVarA.a));
            }
        }
        n95.r(new rp2((byte) 2), arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0, mbn.a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.a.b());
        linkedHashSet.addAll(((nok) cq5Var.getValue()).d());
        linkedHashSet.removeAll(CollectionsKt.n0(arrayListC));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Locale localeF = wwc.f((String) it.next());
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    lbn lbnVar = (lbn) obj;
                    if (wwc.b(wwc.d(wwc.f(lbnVar.a)), wwc.d(localeF))) {
                        arrayList2.add(lbnVar);
                        break;
                    }
                }
            }
        }
        arrayList2.add(kbn.a);
        arrayList2.addAll(arrayList);
        this.d = arrayList2;
        this.c = true;
        setHasStableIds(true);
    }

    public final int getItemCount() {
        return this.d.size();
    }

    public final long getItemId(int i) {
        return i;
    }

    public final int getItemViewType(int i) {
        nbn nbnVar = (nbn) this.d.get(i);
        if (nbnVar != null) {
            if (nbnVar instanceof mbn) {
                return 1;
            }
            if (nbnVar instanceof kbn) {
                return 2;
            }
            if (nbnVar instanceof lbn) {
                return 3;
            }
        }
        h9o.p();
        return 0;
    }

    public final void onBindViewHolder(i iVar, int i) {
        if (iVar instanceof pbn) {
            pbn pbnVar = (pbn) iVar;
            lbn lbnVar = (lbn) this.d.get(i);
            boolean z = i == this.c;
            y83 y83Var = pbnVar.b;
            ((TextView) y83Var.f).setText(lbnVar.b);
            ((TextView) y83Var.c).setText(lbnVar.c);
            ((FrameLayout) y83Var.e).setVisibility(z ? 0 : 8);
            ((LinearLayout) y83Var.b).setOnClickListener(new obn(pbnVar, lbnVar, (byte) 0));
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 3) {
            return new pbn(y83.e(layoutInflaterFrom, viewGroup), this.b);
        }
        yq1 yq1Var = mn5.a(layoutInflaterFrom.inflate(2131559301, viewGroup, false)).b;
        boolean z = i == 2;
        zl5 zl5Var = new zl5(yq1Var);
        yq1Var.setText(z ? 2132019375 : 2132019376);
        return zl5Var;
    }
}
