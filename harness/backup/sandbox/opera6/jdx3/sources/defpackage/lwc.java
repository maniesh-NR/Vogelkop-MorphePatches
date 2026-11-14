package defpackage;

import android.text.TextUtils;
import android.util.Range;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lwc extends Filter {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Object c;
    public final Object d;

    public lwc(kze kzeVar, z8b z8bVar, wse wseVar) {
        this.b = kzeVar;
        this.c = z8bVar;
        this.d = wseVar;
    }

    public lwc(oy oyVar) {
        this.d = oyVar;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        switch (this.a) {
            case 0:
                List<ate> list = (List) ((kze) this.b).g();
                ArrayList arrayList = new ArrayList();
                for (ate ateVar : list) {
                    ateVar.getClass();
                    String strValueOf = !TextUtils.isEmpty(charSequence) ? String.valueOf(charSequence) : null;
                    ateVar.d = ate.b(ateVar.b, strValueOf);
                    Range rangeB = ate.b(ateVar.c, strValueOf);
                    ateVar.e = rangeB;
                    if (ateVar.d != null || rangeB != null) {
                        arrayList.add(ateVar);
                    }
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            default:
                Filter.FilterResults filterResults2 = new Filter.FilterResults();
                oy oyVar = (oy) this.d;
                esi esiVar = (esi) this.b;
                if (esiVar == null) {
                    esiVar = null;
                }
                List list2 = (List) this.c;
                List list3 = list2 != null ? list2 : null;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list3) {
                    List listD = oyVar.d(obj);
                    if (!(listD instanceof Collection) || !listD.isEmpty()) {
                        Iterator it = listD.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (esiVar.a((String) it.next()) != -1) {
                                arrayList2.add(obj);
                            }
                        }
                    }
                }
                filterResults2.values = arrayList2;
                filterResults2.count = arrayList2.size();
                return filterResults2;
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                wse wseVar = (wse) obj;
                List list = null;
                String string = charSequence != null ? charSequence.toString() : null;
                if (string == null) {
                    string = "";
                }
                if (filterResults != null) {
                    Object obj2 = filterResults.values;
                    List list2 = (!(obj2 instanceof List) || ((obj2 instanceof ptb) && !(obj2 instanceof rtb))) ? null : (List) obj2;
                    if (list2 != null) {
                        n95.r((jk) ((z8b) this.c).b, list2);
                        list = list2;
                    }
                }
                wseVar.getClass();
                bte bteVar = wseVar.o;
                bteVar.getClass();
                if (((Boolean) bteVar.c.g()).booleanValue() && string.equals(wseVar.n)) {
                    if (list == null) {
                        list = l08.a;
                    }
                    wseVar.l.r(list);
                    break;
                }
                break;
            default:
                oy oyVar = (oy) obj;
                if (filterResults != null && oyVar.e()) {
                    ((h42) oyVar.f).r((List) filterResults.values);
                    break;
                }
                break;
        }
    }
}
