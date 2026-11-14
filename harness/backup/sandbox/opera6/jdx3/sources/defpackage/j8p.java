package defpackage;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class j8p extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ p8p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8p(p8p p8pVar, byte b) {
        super(0);
        this.i = b;
        this.j = p8pVar;
    }

    public final Object invoke() {
        String q0iVar;
        byte b = this.i;
        p8p p8pVar = this.j;
        switch (b) {
            case 0:
                crb crbVar = p8p.e;
                try {
                    p0i p0iVar = t0i.b;
                    crbVar.getClass();
                    q0iVar = crbVar.b(p8pVar, p8p.Companion.serializer());
                } catch (Throwable th) {
                    p0i p0iVar2 = t0i.b;
                    q0iVar = new q0i(th);
                }
                Throwable thD = t0i.d(q0iVar);
                if (thD != null) {
                    try {
                        if (!(thD instanceof o2j)) {
                            throw thD;
                        }
                        s15 s15VarA = uqh.a(p8pVar.getClass());
                        KSerializer kSerializerR = zwg.r(s15VarA);
                        if (kSerializerR == null) {
                            wxe.Y(s15VarA);
                            throw null;
                        }
                        q0iVar = crbVar.b(p8pVar, kSerializerR);
                    } catch (Throwable th2) {
                        p0i p0iVar3 = t0i.b;
                        q0iVar = new q0i(th2);
                    }
                }
                return new t0i(q0iVar);
            default:
                return new d7p(p8pVar);
        }
    }
}
