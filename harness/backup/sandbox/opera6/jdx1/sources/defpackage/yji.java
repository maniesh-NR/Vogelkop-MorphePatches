package defpackage;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class yji implements vji, rki {
    public final /* synthetic */ wji a;
    public qdc b;
    public qki c;

    public yji(wji wjiVar) {
        this.a = wjiVar;
        Object objE = wjiVar.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objE instanceof Bundle ? (Bundle) objE : null;
        if (bundle != null && this.c == null) {
            qki qkiVar = new qki(new ijd(this, new j3i(this, (byte) 8)));
            this.c = qkiVar;
            qkiVar.a(bundle);
        }
        wjiVar.a("androidx.savedstate.SavedStateRegistry", new j3i(this, (byte) 6));
    }

    @Override // defpackage.vji
    public final p8f a(String str, Function0 function0) {
        return this.a.a(str, function0);
    }

    @Override // defpackage.vji
    public final boolean c(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.vji
    public final Map d() {
        return this.a.d();
    }

    @Override // defpackage.vji
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.ndc
    public final tcc getLifecycle() {
        qdc qdcVar = this.b;
        if (qdcVar != null) {
            return qdcVar;
        }
        qdc qdcVar2 = new qdc(this, false);
        this.b = qdcVar2;
        return qdcVar2;
    }

    @Override // defpackage.rki
    public final pki getSavedStateRegistry() {
        qki qkiVar = this.c;
        if (qkiVar == null) {
            qki qkiVar2 = new qki(new ijd(this, new j3i(this, (byte) 8)));
            this.c = qkiVar2;
            qkiVar2.a(null);
            qkiVar = qkiVar2;
        }
        return qkiVar.b;
    }
}
