package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class haf implements gdk {
    public static final LinkedHashSet f = new LinkedHashSet();
    public static final avj g = new avj((byte) 3);
    public final g29 a;
    public final yhe b;
    public final nf8 c;
    public final gb3 d;
    public final zyk e;

    public haf(g29 g29Var, yhe yheVar, gb3 gb3Var) {
        nf8 nf8Var = new nf8((byte) 23);
        this.a = g29Var;
        this.b = yheVar;
        this.c = nf8Var;
        this.d = gb3Var;
        this.e = z4c.b(new gaf(this, (byte) 1));
    }

    @Override // defpackage.gdk
    public final hdk a() {
        String strW = ((w6g) this.e.getValue()).a.w();
        synchronized (g) {
            LinkedHashSet linkedHashSet = f;
            if (linkedHashSet.contains(strW)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strW + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(strW);
        }
        return new kaf(this.a, (w6g) this.e.getValue(), this.b, (ylj) this.c.invoke((w6g) this.e.getValue(), this.a), new gaf(this, (byte) 0));
    }
}
