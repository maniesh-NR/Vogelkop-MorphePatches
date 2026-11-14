package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class w19 implements gdk {
    public static final LinkedHashSet d = new LinkedHashSet();
    public static final Object e = new Object();
    public final u2j a;
    public final d58 b;
    public final Function0 c;

    public w19(u2j u2jVar, Function0 function0) {
        d58 d58Var = new d58((byte) 14);
        this.a = u2jVar;
        this.b = d58Var;
        this.c = function0;
    }

    @Override // defpackage.gdk
    public final hdk a() throws IOException {
        File canonicalFile = ((File) this.c.invoke()).getCanonicalFile();
        synchronized (e) {
            String absolutePath = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = d;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(absolutePath);
        }
        return new z19(canonicalFile, this.a, (ylj) this.b.invoke(canonicalFile), new al7(canonicalFile, (byte) 7));
    }
}
