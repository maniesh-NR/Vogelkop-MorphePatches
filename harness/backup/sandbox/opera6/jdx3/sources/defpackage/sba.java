package defpackage;

import android.widget.TextView;

/* loaded from: classes.dex */
public final class sba extends lz3 {
    public boolean f;
    public boolean g;

    public sba(qba qbaVar) {
        TextView textView;
        super(qbaVar.a, qbaVar.g, 0L, new l11(qbaVar.b, qbaVar.d, qbaVar.c));
        TextView textView2 = (TextView) this.b.findViewById(2131363509);
        textView2.setText(qbaVar.e.a(textView2.getResources()));
        oc ocVar = qbaVar.h;
        if (ocVar != null && (textView = (TextView) this.b.findViewById(2131361862)) != null) {
            textView.setText(ocVar.a.a(textView.getResources()));
            textView.setOnClickListener(new jf7(this, qbaVar, (byte) 11));
        }
        if (qbaVar.f != null || qbaVar.i) {
            a(new pba(this, qbaVar));
        }
    }
}
