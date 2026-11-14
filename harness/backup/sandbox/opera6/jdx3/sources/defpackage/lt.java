package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class lt implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Set b;

    public /* synthetic */ lt(Set set, byte b) {
        this.a = b;
        this.b = set;
    }

    public final Object invoke(Object obj) {
        boolean zContains;
        byte b = this.a;
        Set set = this.b;
        switch (b) {
            case 0:
                zContains = set.contains(((st) obj).b);
                break;
            default:
                zContains = !set.contains(Integer.valueOf(((m4l) obj).a));
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
