package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mm3 implements lkf {
    public final /* synthetic */ byte a;
    public final esk b;
    public final esk c;
    public final esk d;

    public /* synthetic */ mm3(esk eskVar, esk eskVar2, esk eskVar3, byte b) {
        this.a = b;
        this.b = eskVar;
        this.c = eskVar2;
        this.d = eskVar3;
    }

    public final Fragment b(Class cls) {
        byte b = this.a;
        esk eskVar = this.d;
        esk eskVar2 = this.c;
        esk eskVar3 = this.b;
        switch (b) {
            case 0:
                Lazy lazy = (Lazy) eskVar;
                if (Intrinsics.a(cls, im3.class)) {
                    return new im3((pm3) ((yv3) eskVar3).get(), (hxk) ((yv3) eskVar2).get(), (gjm) lazy.get());
                }
                if (Intrinsics.a(cls, e2b.class)) {
                    return new e2b();
                }
                if (Intrinsics.a(cls, qx7.class)) {
                    return new qx7((gjm) lazy.get());
                }
                return null;
            default:
                if (Intrinsics.a(cls, wg7.class)) {
                    return new wg7(((dw3) eskVar3).b.m(), (orm) ((dw3) eskVar2).get(), (d8j) ((ew3) eskVar).get());
                }
                return null;
        }
    }
}
