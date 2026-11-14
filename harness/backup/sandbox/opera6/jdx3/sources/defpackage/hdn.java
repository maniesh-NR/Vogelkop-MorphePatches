package defpackage;

import android.content.Context;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class hdn implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eve b;

    public /* synthetic */ hdn(eve eveVar, byte b) {
        this.a = b;
        this.b = eveVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        eve eveVar = this.b;
        fdn fdnVar = (fdn) obj;
        switch (b) {
            case 0:
                zhj.a(new g3b(fdnVar, (tah) eveVar.d), 4099).c((Context) eveVar.c);
                break;
            case 1:
                zhj.a(new g3b(fdnVar, (tah) eveVar.d), 4099).c((Context) eveVar.c);
                break;
            default:
                zhj.a(new g3b(fdnVar, (tah) eveVar.d), 4099).c((Context) eveVar.c);
                break;
        }
    }
}
