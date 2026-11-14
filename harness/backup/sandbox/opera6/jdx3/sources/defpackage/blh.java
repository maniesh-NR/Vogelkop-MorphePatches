package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class blh extends d implements kkm, lkm {
    public final glh a;
    public final zg7 b;
    public final tzi c;
    public final e5d d;
    public final xvj e;
    public final HashMap f = new HashMap();
    public final xkh g;
    public final ArrayList h;
    public l46 i;
    public final nlh j;
    public final vi7 k;

    public blh(glh glhVar, zg7 zg7Var, tzi tziVar, nlh nlhVar, vi7 vi7Var, int i, ArrayList arrayList) {
        this.a = glhVar;
        this.b = zg7Var;
        this.c = tziVar;
        this.j = nlhVar;
        this.k = vi7Var;
        this.d = tziVar.a;
        xkh xkhVar = new xkh(this);
        xkhVar.b = i;
        this.g = xkhVar;
        this.e = new xvj(wkh.class, xkhVar);
        this.h = arrayList;
        setHasStableIds(true);
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            xvj xvjVar = this.e;
            if (i >= xvjVar.h) {
                return arrayList;
            }
            ilh ilhVar = ((wkh) xvjVar.f(i)).a;
            if (((LinkedHashSet) this.d.c).contains(Long.valueOf(ilhVar.a))) {
                arrayList.add(ilhVar);
            }
            i++;
        }
    }

    @Override // defpackage.kkm
    public final e5d N(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wkh wkhVar = (wkh) this.f.get(Long.valueOf(((ilh) it.next()).a));
            if (wkhVar != null) {
                this.e.g(wkhVar);
                arrayList.add(new guh(wkhVar.a, -1));
            }
        }
        return new e5d(arrayList, Collections.EMPTY_LIST, (byte) 2);
    }

    @Override // defpackage.kkm
    public final void O(l46 l46Var) {
        this.i = l46Var;
    }

    public final void R(ArrayList arrayList) {
        HashMap map;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            map = this.f;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            ilh ilhVar = (ilh) obj;
            if (((wkh) map.get(Long.valueOf(ilhVar.a))) != null) {
                map.remove(Long.valueOf(ilhVar.a));
            }
        }
        ArrayList arrayList2 = this.h;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                it.remove();
            }
        }
        glh glhVar = ((v8f) this.b.m).a;
        ArrayList arrayList3 = new ArrayList(k95.o(arrayList, 10));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList3.add(Long.valueOf(((ilh) obj2).a));
        }
        glhVar.a(arrayList3, true);
        this.j.L0(arrayList2);
    }

    public final int getItemCount() {
        return this.e.h;
    }

    public final long getItemId(int i) {
        return ((wkh) this.e.f(i)).a.a;
    }

    public final void onBindViewHolder(i iVar, int i) throws Resources.NotFoundException {
        alh alhVar = (alh) iVar;
        wkh wkhVar = (wkh) this.e.f(i);
        int i2 = alh.m;
        alhVar.j = wkhVar;
        ilh ilhVar = wkhVar.a;
        pt1 pt1Var = alhVar.i;
        yq1 yq1Var = (StylingTextView) pt1Var.c;
        yq1 yq1Var2 = (StylingTextView) pt1Var.b;
        CharSequence charSequence = ilhVar.c;
        String str = ilhVar.e;
        yq1Var.setText(charSequence);
        String str2 = ilhVar.b;
        String hostString = BrowserUtils.getHostString(str2);
        if (!TextUtils.isEmpty(hostString)) {
            str2 = hostString;
        }
        Long l = ilhVar.i;
        CharSequence charSequenceH = wqm.H(str2);
        if (l == null) {
            yq1Var2.setText(charSequenceH);
        } else {
            Context context = ((i) alhVar).itemView.getContext();
            yq1Var2.setText(context.getString(2132020147, aik.i(l.longValue(), context), charSequenceH));
        }
        int dimensionPixelSize = ((i) alhVar).itemView.getResources().getDimensionPixelSize(2131167243);
        ((StylingImageView) pt1Var.e).setVisibility(alhVar.l.a.g.contains(Long.valueOf(ilhVar.a)) ? 0 : 8);
        if (TextUtils.isEmpty(str)) {
            alhVar.k = null;
            Context context2 = ((i) alhVar).itemView.getContext();
            String str3 = ilhVar.b;
            int i3 = vmj.g;
            alhVar.b0(tmj.m(context2, str3, 0, 0, null, 60));
        } else {
            dwh dwhVarH = yne.b.h(new File(str));
            dwhVarH.b.b(dimensionPixelSize, dimensionPixelSize);
            dwhVarH.j();
            dwhVarH.f(new phi(new eof((Object) alhVar, (Object) ilhVar, (byte) 10)));
        }
        alhVar.h0();
        alhVar.U();
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new alh(this, pt1.e(LayoutInflater.from(new dkf(viewGroup.getContext(), 2132083122)), viewGroup), this.c);
    }

    public final void onViewRecycled(i iVar) {
        ((alh) iVar).e0();
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        List listUnmodifiableList = Collections.unmodifiableList((ArrayList) e5dVar.c);
        for (int size = listUnmodifiableList.size() - 1; size >= 0; size--) {
            wkh wkhVar = (wkh) this.f.get(Long.valueOf(((ilh) ((guh) listUnmodifiableList.get(size)).a).a));
            if (wkhVar != null) {
                this.e.a(wkhVar);
            }
        }
    }
}
