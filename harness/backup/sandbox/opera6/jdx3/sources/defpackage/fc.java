package defpackage;

import com.leanplum.Var;
import com.leanplum.internal.ActionArg;
import com.leanplum.internal.VarCache;
import java.io.InputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class fc implements VarCache.StreamProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // com.leanplum.internal.VarCache.StreamProvider
    public final InputStream openStream() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ActionArg) obj).defaultStream();
            default:
                return ((Var) obj).defaultStream();
        }
    }
}
