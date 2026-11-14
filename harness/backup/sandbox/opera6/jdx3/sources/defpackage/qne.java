package defpackage;

import android.content.Context;
import com.opera.android.browser.obml.MiniHttpClient$Call;
import java.net.URI;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qne extends kch {
    public final Context a;

    public qne(Context context) {
        this.a = context;
    }

    @Override // defpackage.mch
    public final void a(io7 io7Var, int i, nch nchVar, jch jchVar) {
        try {
            if ((nchVar.readUnsignedByte() & 1) != 0) {
                g77 g77Var = new g77(new URI(nchVar.h()), new HashMap(), (Object) null);
                pp6 pp6Var = new pp6(this.a);
                hzd hzdVar = hzd.b;
                Objects.requireNonNull(hzdVar);
                new MiniHttpClient$Call(hzdVar, g77Var, pp6Var);
            }
        } catch (Throwable unused) {
        }
        jchVar.run(Boolean.FALSE);
    }
}
