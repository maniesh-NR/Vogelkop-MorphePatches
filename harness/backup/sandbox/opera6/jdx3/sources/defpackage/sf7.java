package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.chromium.components.download.DownloadCollectionBridge;

/* loaded from: classes.dex */
public final class sf7 {
    public final rf7 a;
    public final igi b;
    public final fg7 c;
    public final ev4 d;
    public final jnm e;

    public sf7(Context context, umi umiVar, ydn ydnVar) {
        rf7 rf7Var = new rf7(context);
        this.a = rf7Var;
        igi igiVar = new igi(context, (byte) 19);
        this.b = igiVar;
        rf7Var.b((ag) igiVar.g);
        rf7Var.b((ag) new c5o(context, (byte) 13).b);
        this.c = new fg7(rf7Var);
        this.d = new ev4(context, rf7Var);
        jnm jnmVar = new jnm(context, umiVar);
        this.e = jnmVar;
        npl nplVar = new npl(jnmVar, rf7Var, (byte) 13);
        nrl nrlVar = rf7Var.g;
        nrlVar.d(nplVar);
        ff7 ff7Var = new ff7();
        ArrayList arrayList = DownloadCollectionBridge.a;
        tgk tgkVarL = tgk.l();
        try {
            DownloadCollectionBridge.b = ff7Var;
            tgkVarL.close();
            new len(umiVar, ydnVar, rf7Var);
            nrlVar.d(new gl6((Object) this, (Object) context, (Object) umiVar, (byte) 7));
        } catch (Throwable th) {
            try {
                tgkVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
