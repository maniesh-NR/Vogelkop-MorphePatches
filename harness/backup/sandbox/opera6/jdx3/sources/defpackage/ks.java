package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ks extends qr {
    public final bs c;
    public final boolean d;
    public final Function0 e;

    public ks(bs bsVar, boolean z, Function0 function0, Function0 function02) {
        super(function0);
        this.c = bsVar;
        this.d = z;
        this.e = function02;
    }

    @Override // defpackage.qr
    public final d a(RecyclerView recyclerView) {
        es esVar = new es(j14.B(recyclerView.getContext(), ((Boolean) this.e.invoke()).booleanValue()), this.d, this.c);
        esVar.I(recyclerView);
        recyclerView.y0(esVar);
        return esVar;
    }
}
