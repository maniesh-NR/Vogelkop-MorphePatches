package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ame implements fz8 {
    public final zyk a;
    public final zyk b;
    public final wci c;
    public final zyk d;

    public ame(Function0 function0, fza fzaVar, int i) {
        uuc uucVar = new uuc((byte) 19);
        zle zleVar = zle.a;
        fzaVar = (i & 8) != 0 ? new uuc((byte) 20) : fzaVar;
        this.a = z4c.b(function0);
        this.b = z4c.b(uucVar);
        wci wciVar = new wci((byte) 2);
        wciVar.b = zleVar;
        wciVar.c = zpa.l;
        this.c = wciVar;
        this.d = z4c.b(fzaVar);
    }

    @Override // defpackage.fz8
    public final hz8 a(Object obj, vrf vrfVar, ylh ylhVar) {
        apm apmVar = (apm) obj;
        if (!Intrinsics.a(apmVar.c, "http") && !Intrinsics.a(apmVar.c, "https")) {
            return null;
        }
        String str = apmVar.a;
        zyk zykVar = this.a;
        zyk zykVarB = z4c.b(new d8e(ylhVar, (byte) 3));
        zyk zykVar2 = this.b;
        wci wciVar = this.c;
        Context context = vrfVar.a;
        Object obj2 = wciVar.c;
        zpa zpaVar = zpa.l;
        if (obj2 == zpaVar) {
            synchronized (wciVar) {
                obj2 = wciVar.c;
                if (obj2 == zpaVar) {
                    Object objInvoke = ((Function1) wciVar.b).invoke(context);
                    wciVar.c = objInvoke;
                    wciVar.b = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new fme(str, vrfVar, zykVar, zykVarB, zykVar2, new u7b(obj2), this.d);
    }
}
