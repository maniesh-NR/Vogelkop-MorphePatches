package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class mbd extends t5 {
    public final /* synthetic */ Map.Entry a;
    public final /* synthetic */ nbd b;

    public mbd(Map.Entry entry, nbd nbdVar) {
        this.a = entry;
        this.b = nbdVar;
    }

    public final Object getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.e(entry.getKey(), entry.getValue());
    }
}
