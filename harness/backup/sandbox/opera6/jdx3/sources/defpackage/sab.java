package defpackage;

import android.icu.text.Collator;
import android.icu.text.RuleBasedCollator;
import android.icu.text.StringSearch;
import android.widget.Filter;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class sab extends Filter {
    public final RuleBasedCollator a;
    public final /* synthetic */ tab b;

    public sab(tab tabVar) {
        this.b = tabVar;
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(0);
        this.a = (RuleBasedCollator) collator;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        zt1 zt1Var = obj instanceof zt1 ? (zt1) obj : null;
        String name = zt1Var != null ? zt1Var.getName() : null;
        return name == null ? "" : name;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        List list = this.b.d;
        if (list.isEmpty() || charSequence == null || charSequence.length() == 0) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = list.size();
            filterResults.values = list;
            return filterResults;
        }
        ArrayList arrayList = new ArrayList();
        String string = charSequence.toString();
        arrayList.add(new yt1(string));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (new StringSearch(string, new StringCharacterIterator(((zt1) obj).getName()), this.a).next() == 0) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        List listK0 = CollectionsKt.k0(arrayList);
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.count = listK0.size();
        filterResults2.values = listK0;
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults == null) {
            return;
        }
        Object obj = filterResults.values;
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            list = l08.a;
        }
        tab tabVar = this.b;
        tabVar.e = list;
        if (list.isEmpty()) {
            tabVar.notifyDataSetInvalidated();
        } else {
            tabVar.notifyDataSetChanged();
        }
    }
}
