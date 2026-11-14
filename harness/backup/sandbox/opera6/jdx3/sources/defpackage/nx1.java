package defpackage;

import android.content.Context;
import com.opera.android.Lazy;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class nx1 extends i7c {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx1(byte b) {
        super((byte) 0);
        this.d = b;
    }

    @Override // defpackage.i7c
    public final Object e(Object obj) {
        ctg ctgVar;
        byte b = 1;
        switch (this.d) {
            case 0:
                Pair pair = (Pair) obj;
                return new a12((Context) pair.a, (tcl) pair.b);
            case 1:
                return new yl6((Context) obj, vml.d);
            case 2:
                return new loc((Context) obj);
            case 3:
                return new s6e((Context) obj);
            case 4:
                Context context = (Context) obj;
                AtomicReference atomicReference = dtg.a;
                synchronized (atomicReference) {
                    if (!dtg.b) {
                        dtg.b = true;
                        atomicReference.set(dtg.a(context));
                    }
                    ctgVar = (ctg) atomicReference.get();
                }
                return ctgVar;
            case 5:
                return new tjh((Context) obj, vml.d);
            case 6:
                return new c36((Context) obj, vml.d);
            case 7:
                return new t28((Context) obj, vml.d);
            case 8:
                return s6e.b((Context) obj).c() ? new bu6(b) : new bu6((byte) 0);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                k32 k32Var = new k32(this, (Context) obj, (byte) 9);
                Lazy.e(k32Var, vml.d);
                return k32Var;
            default:
                android.util.Pair pair2 = (android.util.Pair) obj;
                return new hlm((Context) pair2.first, (tcl) pair2.second);
        }
    }
}
