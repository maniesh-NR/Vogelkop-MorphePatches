package defpackage;

import android.content.Context;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class jko {
    public static final TreeSet a;
    public static final AtomicBoolean b;
    public static final zyk c;

    static {
        txo.Companion.getClass();
        TreeSet treeSet = new TreeSet(txo.c);
        e82.A(new txo[0], treeSet);
        a = treeSet;
        b = new AtomicBoolean();
        c = z4c.b(a43.F);
    }

    public static final void a(Context context, boolean z) {
        if (o95.u(a, new uho(System.currentTimeMillis() - aap.f().F, (byte) 0), true) && z) {
            b(context);
        }
    }

    public static final void b(Context context) {
        na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new hkm((byte) 7, (mt5) null, context.getApplicationContext()), 3);
    }
}
