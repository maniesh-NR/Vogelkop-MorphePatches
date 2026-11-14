package defpackage;

import android.database.DataSetObserver;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gq2 extends DataSetObserver {
    public final ew a;
    public final ArrayAdapter b;
    public final AutoCompleteTextView c;
    public final /* synthetic */ iq2 d;

    public gq2(iq2 iq2Var, ew ewVar, ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(iq2Var);
        this.d = iq2Var;
        this.a = ewVar;
        this.b = arrayAdapter;
        this.c = autoCompleteTextView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        String str = (String) this.d.v.get(this.a);
        int i = 0;
        while (true) {
            ArrayAdapter arrayAdapter = this.b;
            if (i >= arrayAdapter.getCount()) {
                return;
            }
            if (((sp2) arrayAdapter.getItem(i)).a.equals(str)) {
                this.c.setListSelection(i);
                return;
            }
            i++;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
    }
}
