package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class gg5 extends RuntimeException {
    public final dee a;
    public final dee b;
    public final ide c;
    public final int d;

    public gg5(dee deeVar, dee deeVar2, ide ideVar, int i, Exception exc) {
        super(exc);
        this.a = deeVar;
        this.b = deeVar2;
        this.c = ideVar;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        l08 l08VarSingletonList;
        k1j k1jVarA = t1j.a(new fg5(this, null));
        if (k1jVarA.hasNext()) {
            Object next = k1jVarA.next();
            if (k1jVarA.hasNext()) {
                l08 arrayList = new ArrayList();
                arrayList.add(next);
                while (k1jVarA.hasNext()) {
                    arrayList.add(k1jVarA.next());
                }
                l08VarSingletonList = arrayList;
            } else {
                l08VarSingletonList = Collections.singletonList(next);
            }
        } else {
            l08VarSingletonList = l08.a;
        }
        return kik.d("\n            |Failed to execute op number " + this.d + ":\n            |" + CollectionsKt.P(CollectionsKt.f0(50, l08VarSingletonList), "\n", (CharSequence) null, (String) null, 0, (Function1) null, 62) + "\n            ");
    }
}
