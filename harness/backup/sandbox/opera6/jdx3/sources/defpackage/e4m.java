package defpackage;

import com.opera.api.Callback;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class e4m implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ plk b;
    public final /* synthetic */ String c;

    public /* synthetic */ e4m(plk plkVar, String str, byte b) {
        this.a = b;
        this.b = plkVar;
        this.c = str;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        String str = this.c;
        plk plkVar = this.b;
        g4m g4mVar = (g4m) obj;
        plkVar.getClass();
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList(g4mVar.b);
                if (arrayList.add(str)) {
                    plkVar.s(arrayList);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = new ArrayList(g4mVar.b);
                if (arrayList2.remove(str)) {
                    plkVar.s(arrayList2);
                    break;
                }
                break;
        }
    }
}
