package defpackage;

import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class gvc extends d implements Filterable {
    public final bvc a;
    public List b = Collections.EMPTY_LIST;
    public List c;

    public gvc(bvc bvcVar, ArrayList arrayList) {
        this.a = bvcVar;
        this.c = arrayList;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new c83(this);
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final void onBindViewHolder(i iVar, int i) {
        fvc fvcVar = (fvc) iVar;
        bre breVar = (bre) this.c.get(i);
        fvcVar.c = breVar;
        fvcVar.b.setText(x77.h(breVar));
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        fvc fvcVar = new fvc((ViewGroup) j7c.n(viewGroup, 2131559306, viewGroup, false));
        ((i) fvcVar).itemView.setOnClickListener(new jf7(this, fvcVar, (byte) 18));
        return fvcVar;
    }
}
