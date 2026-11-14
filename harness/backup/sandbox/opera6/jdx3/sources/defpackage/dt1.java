package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.AccentSelector;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public class dt1 extends d {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public dt1() {
        this.a = (byte) 3;
        this.b = new ArrayList();
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
    }

    public dt1(Context context, List list, it1 it1Var) {
        this.a = (byte) 0;
        this.b = context;
        this.c = list;
        this.d = it1Var;
    }

    public dt1(iq2 iq2Var) {
        this.a = (byte) 2;
        this.d = iq2Var;
        this.c = new ArrayList(0);
        this.b = new int[0];
        setHasStableIds(true);
    }

    public dt1(mu1 mu1Var) {
        this.a = (byte) 1;
        this.b = mu1Var;
        this.c = new ArrayList();
    }

    public final akj G(Object obj) {
        ckj ckjVar = (ckj) ((LinkedHashMap) this.c).get(obj.getClass());
        if (ckjVar != null) {
            ArrayList arrayList = ckjVar.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                bkj bkjVar = (bkj) obj2;
                if (bkjVar.b.accept(obj)) {
                    return bkjVar.a;
                }
            }
        }
        qp2.n("No matching type for item");
        return null;
    }

    public final Object H(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        if (i < 0 || i > arrayList.size() - 1) {
            return null;
        }
        return arrayList.get(i);
    }

    public final void I(Class cls, yjj yjjVar, xjj xjjVar) {
        J(cls, yjjVar, xjjVar, new a3j((byte) 4));
    }

    public final void J(Class cls, yjj yjjVar, xjj xjjVar, zjj zjjVar) {
        ArrayList arrayList = (ArrayList) this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object ckjVar = linkedHashMap.get(cls);
        if (ckjVar == null) {
            ckjVar = new ckj();
            linkedHashMap.put(cls, ckjVar);
        }
        akj akjVar = new akj(arrayList.size(), yjjVar, xjjVar);
        arrayList.add(akjVar);
        ((ckj) ckjVar).a.add(new bkj(akjVar, zjjVar));
    }

    public final void K(Collection collection) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.clear();
        arrayList.addAll(collection);
        notifyDataSetChanged();
    }

    public final void L(List list, o87 o87Var) {
        eme emeVar = new eme(this);
        ArrayList arrayList = (ArrayList) this.d;
        j87 j87VarR = o87Var.r(arrayList, list);
        arrayList.clear();
        arrayList.addAll(list);
        j87VarR.a(emeVar);
    }

    public final void M(g7j g7jVar, boolean z) {
        int iIndexOf;
        ArrayList arrayList = (ArrayList) this.c;
        g7j g7jVar2 = (g7j) this.d;
        if (g7jVar2 != g7jVar) {
            int iIndexOf2 = arrayList.indexOf(g7jVar2);
            this.d = g7jVar;
            if (iIndexOf2 > -1) {
                notifyItemChanged(iIndexOf2);
            }
            if (z || (iIndexOf = arrayList.indexOf(g7jVar)) <= -1) {
                return;
            }
            notifyItemChanged(iIndexOf);
        }
    }

    public final int getItemCount() {
        switch (this.a) {
            case 0:
                return ((List) this.c).size();
            case 1:
                return ((ArrayList) this.c).size();
            case 2:
                return ((List) this.c).size() + 3;
            default:
                return ((ArrayList) this.d).size();
        }
    }

    public long getItemId(int i) {
        switch (this.a) {
            case 2:
                int size = ((List) this.c).size();
                List list = (List) this.c;
                if (i < size) {
                    return ((fw) list.get(i)).a.a;
                }
                return list.size() + ((-1) - i);
            default:
                return super.getItemId(i);
        }
    }

    public final int getItemViewType(int i) {
        switch (this.a) {
            case 2:
                int size = ((List) this.c).size();
                List list = (List) this.c;
                if (i >= size) {
                    int size2 = i - list.size();
                    if (size2 == 0) {
                        return 3;
                    }
                    if (size2 != 1) {
                        return size2 == 2 ? 5 : 2;
                    }
                    return 4;
                }
                int iOrdinal = ((fw) list.get(i)).a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        return 2;
                    }
                    if (!(!((iq2) this.d).E ? true : !r4.D.isEmpty())) {
                        return 2;
                    }
                }
                return 1;
            case 3:
                return G(((ArrayList) this.d).get(i)).a;
            default:
                return super.getItemViewType(i);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.i r18, int r19) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt1.onBindViewHolder(androidx.recyclerview.widget.i, int):void");
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        byte b = 5;
        switch (this.a) {
            case 0:
                View viewN = j7c.n(viewGroup, 2131558487, viewGroup, false);
                int i2 = 2131364429;
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131364429, viewN);
                if (stylingImageView != null) {
                    i2 = 2131364430;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364430, viewN);
                    if (stylingTextView != null) {
                        return new ct1(this, new bt1((LinearLayout) viewN, stylingImageView, stylingTextView, (byte) 0));
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i2)));
                return null;
            case 1:
                View viewN2 = j7c.n(viewGroup, 2131559438, viewGroup, false);
                if (viewN2 != null) {
                    return new zu1(this, new cq3((AccentSelector) viewN2, b));
                }
                t3p.q("rootView");
                return null;
            case 2:
                iq2 iq2Var = (iq2) this.d;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                if (i == 1) {
                    return new fq2(iq2Var, layoutInflaterFrom.inflate(2131558514, viewGroup, false));
                }
                if (i == 2) {
                    return new wp2(iq2Var, layoutInflaterFrom.inflate(2131558512, viewGroup, false));
                }
                if (i == 3) {
                    return new aq2(iq2Var, layoutInflaterFrom.inflate(2131558512, viewGroup, false));
                }
                if (i == 4) {
                    return new xp2(iq2Var, layoutInflaterFrom.inflate(2131558512, viewGroup, false));
                }
                if (i == 5) {
                    return new cq2(iq2Var, layoutInflaterFrom.inflate(2131558513, viewGroup, false));
                }
                return null;
            default:
                return ((akj) ((ArrayList) this.b).get(i)).b.c(viewGroup);
        }
    }

    public void onViewRecycled(i iVar) {
        switch (this.a) {
            case 2:
                ((hq2) iVar).U();
                break;
            default:
                super.onViewRecycled(iVar);
                break;
        }
    }
}
