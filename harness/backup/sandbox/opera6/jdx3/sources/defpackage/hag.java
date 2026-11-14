package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingTextView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hag extends d {
    public final Context a;
    public final uoj b;
    public final ArrayList c = new ArrayList();
    public final lag d;
    public String e;

    public hag(Context context, lag lagVar, uoj uojVar) {
        this.a = context;
        this.d = lagVar;
        this.b = uojVar;
        H(null);
    }

    public final void G(int i, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        eag eagVar = new eag(this.a.getString(i));
        ArrayList arrayList2 = this.c;
        arrayList2.add(eagVar);
        arrayList2.addAll(arrayList);
    }

    public final void H(String str) {
        ArrayList arrayList;
        lag lagVar;
        kag kagVarA;
        this.e = str;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.c.clear();
        for (String str2 : s9g.h.i(false)) {
            jag jagVarF = s9g.h.f(str2, false);
            kag kagVar = null;
            if (jagVarF != null && (kagVarA = jagVarF.a((lagVar = this.d), (kag) null)) != null) {
                kagVar = Boolean.TRUE.equals(jagVarF.b(lagVar)) ? kagVarA : kag.ASK;
            }
            if (kagVar != null) {
                int iOrdinal = kagVar.ordinal();
                if (iOrdinal == 0) {
                    arrayList = arrayList2;
                } else if (iOrdinal == 1) {
                    arrayList = arrayList3;
                } else if (iOrdinal == 2) {
                    arrayList = arrayList4;
                }
                if (str == null || str2.contains(str)) {
                    arrayList.add(new gag(str2));
                }
            }
        }
        G(2132020426, arrayList2);
        G(2132020425, arrayList3);
        G(2132020422, arrayList4);
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final int getItemViewType(int i) {
        gag gagVar = (gag) this.c.get(i);
        gagVar.getClass();
        if (gagVar instanceof eag) {
            int i2 = fag.c;
            return 2131558912;
        }
        int i3 = pmj.d;
        return 2131559337;
    }

    public final void onBindViewHolder(i iVar, int i) {
        int itemViewType = getItemViewType(i);
        ArrayList arrayList = this.c;
        if (itemViewType == 2131558912) {
            ((fag) iVar).b.setText(((gag) arrayList.get(i)).a);
        } else {
            pmj pmjVar = (pmj) iVar;
            pmjVar.b.setText(((gag) arrayList.get(i)).a);
            pmjVar.c = null;
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int i2 = fag.c;
        if (i == 2131558912) {
            return new fag(layoutInflaterFrom.inflate(i, viewGroup, false));
        }
        kf kfVarJ = kf.j(layoutInflaterFrom, viewGroup);
        pmj pmjVar = new pmj((LayoutDirectionLinearLayout) kfVarJ.b, (StylingTextView) kfVarJ.c);
        ((i) pmjVar).itemView.setOnClickListener(new ohi(new j5g(this, pmjVar, (byte) 1), (byte) 0));
        return pmjVar;
    }
}
