package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class h6 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ h6(Collection collection, byte b) {
        this.a = b;
        this.b = collection;
    }

    public final Object invoke(Object obj) {
        boolean zContains;
        byte b = this.a;
        Collection<?> collection = this.b;
        switch (b) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                ilh ilhVar = (ilh) obj;
                boolean z = false;
                if (collection != null && collection.contains(Long.valueOf(ilhVar.a))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                zContains = collection.contains(obj);
                break;
            case 3:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
