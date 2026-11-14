package defpackage;

import android.content.Context;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class zs5 extends cej {
    public final ChromiumContent a;
    public final qs5 b;
    public final k73 c;
    public final byte d;
    public final Callback e;
    public final x5f f;
    public final ru9 g;

    /* JADX WARN: Multi-variable type inference failed */
    public zs5(ChromiumContent chromiumContent, qs5 qs5Var, k73 k73Var, int i, Callback callback, x5f x5fVar, ru9 ru9Var) {
        this.a = chromiumContent;
        this.b = qs5Var;
        this.c = k73Var;
        this.d = i;
        this.e = callback;
        this.f = x5fVar;
        this.g = ru9Var;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        return new at5(mejVar, this.a, this.b, this.c, b2lVar, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.cej
    public final mej createSheetHost(Context context) {
        return new vq3(new s8n(context, 2130969943));
    }

    @Override // defpackage.jjm
    public final ijm getDefaultPriority() {
        return ijm.a;
    }
}
