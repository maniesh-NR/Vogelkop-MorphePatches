package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashSet;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final /* synthetic */ class tbp implements n1p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ylp b;
    public final /* synthetic */ gcp c;

    public /* synthetic */ tbp(gcp gcpVar, ylp ylpVar) {
        this.a = (byte) 0;
        this.c = gcpVar;
        this.b = ylpVar;
    }

    public /* synthetic */ tbp(ylp ylpVar, gcp gcpVar, byte b) {
        this.a = b;
        this.b = ylpVar;
        this.c = gcpVar;
    }

    @Override // defpackage.n1p
    public final void invoke(Object obj) {
        p7p p7pVar;
        p7p p7pVar2;
        byte b = 1;
        mt5 mt5Var = null;
        switch (this.a) {
            case 0:
                gcp gcpVar = this.c;
                ylp ylpVar = this.b;
                Object obj2 = ((t0i) obj).a;
                if (!(obj2 instanceof q0i)) {
                    gcpVar.e = gcpVar.e.g();
                    Context context = gcpVar.a;
                    if (ylpVar.q != null) {
                        tmj tmjVar = qb7.h;
                        tmjVar.f(context).a(new tbp(ylpVar, gcpVar, b));
                        tmjVar.f(context).c(new tbp(ylpVar, gcpVar, (byte) 2));
                    }
                    uuj uujVar = gcpVar.c;
                    if (uujVar != null) {
                        uujVar.a();
                    }
                }
                Throwable thD = t0i.d(obj2);
                if (thD != null) {
                    gcpVar.e = gcpVar.e.a();
                    uuj uujVar2 = gcpVar.c;
                    if (uujVar2 != null) {
                        uujVar2.g(b8h.a(thD));
                        break;
                    }
                }
                break;
            case 1:
                ylp ylpVar2 = this.b;
                gcp gcpVar2 = this.c;
                Object obj3 = ((t0i) obj).a;
                if (!(obj3 instanceof q0i)) {
                    na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new ubp((File) obj3, ylpVar2, mt5Var, (byte) 0), 3);
                }
                if (t0i.d(obj3) != null && (p7pVar = gcpVar2.i) != null) {
                    LinkedHashSet linkedHashSet = p7p.c;
                    p7pVar.g(9004, null);
                    break;
                }
                break;
            default:
                ylp ylpVar3 = this.b;
                gcp gcpVar3 = this.c;
                Object obj4 = ((t0i) obj).a;
                if (!(obj4 instanceof q0i)) {
                    na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new ubp((File) obj4, ylpVar3, mt5Var, b), 3);
                }
                if (t0i.d(obj4) != null && (p7pVar2 = gcpVar3.i) != null) {
                    LinkedHashSet linkedHashSet2 = p7p.c;
                    p7pVar2.g(9012, null);
                    break;
                }
                break;
        }
    }
}
