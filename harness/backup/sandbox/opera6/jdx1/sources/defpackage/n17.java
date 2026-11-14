package defpackage;

import ads_mobile_sdk.ab3;
import ads_mobile_sdk.jl2;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class n17 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n17(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return ((o17) obj3).a.submit(new fh4(obj2, obj, (byte) 27));
            case 1:
                String str = (String) obj;
                WorkDatabase workDatabase = ((t1h) obj3).e;
                ((ArrayList) obj2).addAll(workDatabase.D().m(str));
                return workDatabase.C().g(str);
            default:
                ((ab3) obj3).a.a((jl2) obj2, null, (byte[]) obj);
                return null;
        }
    }
}
