package defpackage;

import android.text.TextUtils;
import com.opera.android.suggestion.SuggestionProviderBridge;
import java.util.Collections;

/* loaded from: classes.dex */
public final class wsi extends SuggestionProviderBridge {
    public final grk d;
    public final eu3 e;
    public final boolean f;

    public wsi(grk grkVar, eu3 eu3Var) {
        super(20);
        this.d = grkVar;
        this.e = eu3Var;
        this.f = true;
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
        ((eri) this.d.b.h.f.g()).cancel();
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void g(String str, boolean z, boolean z2, yv4 yv4Var) {
        if (TextUtils.isEmpty(str) || wqm.A(str) || wqm.F(str, true)) {
            yv4Var.d(Collections.EMPTY_LIST);
            return;
        }
        boolean zX = wqm.x(str);
        eri eriVar = (eri) this.d.b.h.f.g();
        tn tnVar = new tn();
        tnVar.b = str;
        tnVar.a = zX;
        tnVar.c = yv4Var;
        tnVar.d = this;
        eriVar.i(str, z2, tnVar);
    }
}
