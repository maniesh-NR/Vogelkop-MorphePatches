package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gxk implements lkf {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ gxk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Fragment b(Class cls) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (Intrinsics.a(cls, c49.class)) {
                    return new c49((db) ((li) ((ki) obj).b).get());
                }
                return null;
            default:
                if (Intrinsics.a(cls, tpn.class)) {
                    return new tpn((gjm) obj);
                }
                return null;
        }
    }
}
