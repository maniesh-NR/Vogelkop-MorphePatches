package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class nsc extends r62 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nsc(ekc ekcVar, Callback callback, byte b) {
        super(ekcVar, callback, (byte) 1);
        this.f = b;
    }

    public final boolean a(Object obj) {
        switch (this.f) {
            case 0:
                ipf ipfVar = (ipf) obj;
                if (ipfVar != null && !(ipfVar instanceof epf)) {
                    break;
                }
                break;
            default:
                sb sbVar = (sb) obj;
                if (sbVar != null && sbVar != sb.a) {
                    break;
                }
                break;
        }
        return true;
    }
}
