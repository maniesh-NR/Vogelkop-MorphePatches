package defpackage;

import com.opera.api.Callback;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final /* synthetic */ class s1a implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v1a b;

    public /* synthetic */ s1a(v1a v1aVar, byte b) {
        this.a = b;
        this.b = v1aVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        v1a v1aVar = this.b;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (b) {
            case 0:
                na2.B(v1aVar.b, (CoroutineContext) null, (rx5) null, new u1a(v1aVar, zBooleanValue, null, (byte) 1), 3);
                break;
            default:
                na2.B(v1aVar.b, (CoroutineContext) null, (rx5) null, new u1a(v1aVar, zBooleanValue, null, (byte) 0), 3);
                break;
        }
    }
}
