package defpackage;

import com.opera.api.Callback;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class aul implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cul b;

    public /* synthetic */ aul(cul culVar, byte b) {
        this.a = b;
        this.b = culVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        cul culVar = this.b;
        switch (b) {
            case 0:
                for (hq8 hq8Var : (List) obj) {
                    if (culVar.c.get(hq8Var.c()) == null && !culVar.a(0, hq8Var.c())) {
                        break;
                    }
                }
                break;
            default:
                culVar.c.clear();
                culVar.b.clear();
                culVar.d();
                break;
        }
    }
}
