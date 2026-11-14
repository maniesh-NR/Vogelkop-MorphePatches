package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class m6e implements n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q6e b;

    public /* synthetic */ m6e(q6e q6eVar, byte b) {
        this.a = b;
        this.b = q6eVar;
    }

    public final Object g(Object obj) throws Resources.NotFoundException {
        byte b = this.a;
        q6e q6eVar = this.b;
        switch (b) {
            case 0:
                iri iriVar = q6eVar.b;
                try {
                    ArrayList arrayListL = iriVar.l(q6eVar.c, q6eVar.m, q6eVar.h);
                    if (arrayListL.isEmpty()) {
                        arrayListL.addAll(0, q6eVar.h(iriVar));
                    } else {
                        int size = arrayListL.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayListL.get(i);
                            i++;
                            if (((l6e) obj2).h != 5) {
                            }
                        }
                        arrayListL.addAll(0, q6eVar.h(iriVar));
                    }
                    return arrayListL;
                } finally {
                    iriVar.close();
                }
            case 1:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    q6eVar.a.addAll(0, list);
                    q6eVar.j();
                    if (((ibf) q6eVar.i.i()).a(512)) {
                        q6eVar.g(true);
                    }
                    q6eVar.i(q6eVar.b());
                    q6eVar.l();
                }
                return null;
            default:
                q6eVar.a.add((l6e) obj);
                q6eVar.l();
                return null;
        }
    }
}
