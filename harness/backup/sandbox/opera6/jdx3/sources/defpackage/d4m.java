package defpackage;

import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class d4m implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ plk b;

    public /* synthetic */ d4m(plk plkVar, byte b) {
        this.a = b;
        this.b = plkVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        plk plkVar = this.b;
        switch (b) {
            case 0:
                g4m g4mVar = (g4m) obj;
                plkVar.p(g4mVar.a);
                ((ode) plkVar.d).n(new HashSet(g4mVar.b));
                break;
            case 1:
                plkVar.getClass();
                if (!((g4m) obj).b.isEmpty()) {
                    plkVar.s(new ArrayList());
                    break;
                }
                break;
            case 2:
                ((ode) plkVar.d).n(new HashSet((List) obj));
                break;
            default:
                plkVar.p((List) obj);
                break;
        }
    }
}
