package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.recyclerview.widget.i;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fq2 extends tp2 {
    public final TextInputLayout c;
    public final AutoCompleteTextView d;
    public ArrayAdapter e;
    public gq2 f;
    public final /* synthetic */ iq2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq2(iq2 iq2Var, View view) {
        super(iq2Var, view);
        Objects.requireNonNull(iq2Var);
        this.g = iq2Var;
        this.c = ((i) this).itemView.findViewById(2131361943);
        this.d = (AutoCompleteTextView) ((i) this).itemView.findViewById(2131361944);
    }

    @Override // defpackage.hq2
    public final void U() {
        gq2 gq2Var = this.f;
        if (gq2Var != null) {
            this.e.unregisterDataSetObserver(gq2Var);
            this.f = null;
        }
    }

    @Override // defpackage.tp2
    public final void V(final fw fwVar) {
        final ArrayAdapter arrayAdapter;
        String strX = X(fwVar);
        TextInputLayout textInputLayout = this.c;
        textInputLayout.t(strX);
        zp2 zp2Var = new zp2(this, (byte) 1);
        AutoCompleteTextView autoCompleteTextView = this.d;
        autoCompleteTextView.setOnFocusChangeListener(zp2Var);
        ew ewVar = fwVar.a;
        int iOrdinal = ewVar.ordinal();
        iq2 iq2Var = this.g;
        if (iOrdinal == 0) {
            arrayAdapter = new ArrayAdapter(autoCompleteTextView.getContext(), 2131559350, iq2Var.C);
        } else if (iOrdinal != 1) {
            return;
        } else {
            arrayAdapter = new ArrayAdapter(autoCompleteTextView.getContext(), 2131559350, iq2Var.D);
        }
        autoCompleteTextView.setAdapter(arrayAdapter);
        this.e = arrayAdapter;
        gq2 gq2Var = new gq2(iq2Var, ewVar, arrayAdapter, autoCompleteTextView);
        this.f = gq2Var;
        this.e.registerDataSetObserver(gq2Var);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: eq2
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String str = ((sp2) arrayAdapter.getItem(i)).a;
                fq2 fq2Var = this.a;
                iq2 iq2Var2 = fq2Var.g;
                fw fwVar2 = fwVar;
                iq2Var2.O0(fwVar2.a, str);
                fq2Var.Y(fwVar2, str);
                fq2Var.c.p(fwVar2.e);
            }
        });
        String str = (String) iq2Var.v.get(ewVar);
        int i = 0;
        while (true) {
            if (i >= arrayAdapter.getCount()) {
                break;
            }
            if (((sp2) arrayAdapter.getItem(i)).a.equals(str)) {
                q9n.F(textInputLayout, ((sp2) arrayAdapter.getItem(i)).b);
                break;
            }
            i++;
        }
        textInputLayout.p(fwVar.e);
    }
}
