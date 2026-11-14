package defpackage;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c83 extends Filter {
    public final /* synthetic */ byte a;
    public Filterable b;

    public /* synthetic */ c83(d dVar, byte b) {
        this.a = b;
        this.b = (Filterable) dVar;
    }

    public c83(gvc gvcVar) {
        this.a = (byte) 2;
        Objects.requireNonNull(gvcVar);
        this.b = gvcVar;
    }

    public c83(qmj qmjVar) {
        this.a = (byte) 3;
        Objects.requireNonNull(qmjVar);
        this.b = qmjVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        switch (this.a) {
            case 1:
                return this.b.c((Cursor) obj);
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r10) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c83.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        switch (this.a) {
            case 0:
                d83 d83Var = (d83) this.b;
                List list = d83Var.c;
                if (list == null || !list.isEmpty() || filterResults.count != 0) {
                    d83Var.c = (List) filterResults.values;
                    d83Var.notifyDataSetChanged();
                    break;
                }
                break;
            case 1:
                m46 m46Var = this.b;
                Cursor cursor = m46Var.c;
                Object obj = filterResults.values;
                if (obj != null && obj != cursor) {
                    m46Var.b((Cursor) obj);
                    break;
                }
                break;
            case 2:
                gvc gvcVar = (gvc) this.b;
                List list2 = gvcVar.c;
                List list3 = (List) filterResults.values;
                gvcVar.c = list3;
                uup.k(new evc(gvcVar, list2, list3), false).b(gvcVar);
                break;
            case 3:
                qmj qmjVar = (qmj) this.b;
                List list4 = qmjVar.e;
                List list5 = (List) filterResults.values;
                qmjVar.e = list5;
                uup.k(new evc(qmjVar, list4, list5), false).b(qmjVar);
                break;
            default:
                d83 d83Var2 = (d83) this.b;
                ArrayList arrayList = (ArrayList) d83Var2.d;
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                arrayList.addAll(y9m.q(filterResults.values));
                uup.k(new js8(arrayList2, arrayList, (byte) 2), false).b(d83Var2);
                break;
        }
    }
}
