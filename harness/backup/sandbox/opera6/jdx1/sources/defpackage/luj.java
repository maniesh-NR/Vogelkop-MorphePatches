package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class luj {
    public static final p8f a = new p8f((byte) 20);
    public static final p8f b = new p8f((byte) 20);

    public static final dfe a() {
        p8f p8fVar = b;
        dfe dfeVar = (dfe) p8fVar.get();
        if (dfeVar != null) {
            return dfeVar;
        }
        dfe dfeVar2 = new dfe(new ut9[0]);
        p8fVar.F(dfeVar2);
        return dfeVar2;
    }

    public static final i37 b(Function0 function0) {
        return new i37(function0, null);
    }
}
