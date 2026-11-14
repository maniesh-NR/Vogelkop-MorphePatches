package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class h7l implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n7l b;
    public final /* synthetic */ int c;

    public /* synthetic */ h7l(n7l n7lVar, int i, byte b) {
        this.a = b;
        this.b = n7lVar;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        m7l m7lVar;
        m7l m7lVar2;
        switch (this.a) {
            case 0:
                n7l n7lVar = this.b;
                int i = this.c;
                synchronized (n7lVar.a()) {
                    f58 f58VarA = n7lVar.a();
                    m7lVar = (m7l) kfo.Y(f58VarA.a, true, false, new r95(i, f58VarA));
                }
                return m7lVar;
            default:
                n7l n7lVar2 = this.b;
                int i2 = this.c;
                synchronized (n7lVar2.a()) {
                    f58 f58VarA2 = n7lVar2.a();
                    m7lVar2 = (m7l) kfo.Y(f58VarA2.a, true, false, new r95(i2, f58VarA2));
                    if (m7lVar2 != null) {
                        f58 f58VarA3 = n7lVar2.a();
                        kfo.Y(f58VarA3.a, false, true, new c58(f58VarA3, m7lVar2, (byte) 0));
                    }
                }
                return m7lVar2;
        }
    }
}
