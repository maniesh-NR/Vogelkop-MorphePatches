package ads_mobile_sdk;

import defpackage.xzo;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class ct3 implements Supplier {
    public final /* synthetic */ boolean a;
    public static final /* synthetic */ ct3 c = new ct3(1);
    public static final /* synthetic */ ct3 b = new ct3(0);

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ct3(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? st3.a((Object) null) : new xzo();
    }
}
