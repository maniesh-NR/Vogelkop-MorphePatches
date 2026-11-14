package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ft3 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim b;

    public /* synthetic */ ft3(qim qimVar, byte b) {
        this.a = b;
        this.b = qimVar;
    }

    public final Object invoke() {
        byte b = this.a;
        qim qimVar = this.b;
        switch (b) {
            case 0:
                return qimVar.g;
            case 1:
                return qimVar.g;
            default:
                return qimVar.c;
        }
    }
}
