package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b6i extends ekc {
    public final y5i l;
    public final yqa m;
    public final boolean n;
    public final g6i o;
    public final AtomicBoolean p = new AtomicBoolean(true);
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);
    public final CoroutineContext s;
    public final Function1 t;

    public b6i(y5i y5iVar, yqa yqaVar, boolean z, String[] strArr, Function1 function1) {
        CoroutineContext coroutineContext;
        this.l = y5iVar;
        this.m = yqaVar;
        this.n = z;
        this.o = new g6i(strArr, this);
        if (y5iVar.n()) {
            if (z) {
                CoroutineContext coroutineContext2 = y5iVar.b;
                if (coroutineContext2 != null) {
                    coroutineContext = coroutineContext2;
                }
            } else {
                CoroutineContext coroutineContext3 = y5iVar.a;
                coroutineContext = ((a64) (coroutineContext3 != null ? coroutineContext3 : null)).b;
            }
        } else {
            coroutineContext = h.a;
        }
        this.s = coroutineContext;
        this.t = function1;
    }

    @Override // defpackage.ekc
    public final void l() {
        ((Set) this.m.c).add(this);
        nx5 nx5Var = this.l.a;
        if (nx5Var == null) {
            nx5Var = null;
        }
        na2.B(nx5Var, this.s, null, new f6i(this, null, (byte) 1), 2);
    }

    @Override // defpackage.ekc
    public final void m() {
        ((Set) this.m.c).remove(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[Catch: Exception -> 0x00cc, all -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cc, blocks: (B:12:0x0031, B:42:0x00ba), top: B:61:0x0031, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #2 {all -> 0x00de, blocks: (B:12:0x0031, B:40:0x00b4, B:42:0x00ba, B:50:0x00d7, B:47:0x00cd, B:48:0x00d4), top: B:61:0x0031, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b2 -> B:40:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e3 -> B:56:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(nt5 r19) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6i.s(nt5):java.lang.Object");
    }
}
