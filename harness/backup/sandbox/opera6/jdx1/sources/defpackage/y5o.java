package defpackage;

import android.os.Trace;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y5o extends ozb implements Function1 {
    public final /* synthetic */ ajc i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ String k;
    public final /* synthetic */ z5o l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5o(ajc ajcVar, boolean z, String str, z5o z5oVar) {
        super(1);
        this.i = ajcVar;
        this.j = z;
        this.k = str;
        this.l = z5oVar;
    }

    public final Object invoke(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (th instanceof q5o) {
            this.i.c.compareAndSet(-256, ((q5o) th).a);
        }
        if (this.j && (str = this.k) != null) {
            z5o z5oVar = this.l;
            ydp ydpVar = z5oVar.e.j;
            int iHashCode = z5oVar.a.hashCode();
            String strSubstring = str.length() <= 127 ? str : null;
            if (strSubstring == null) {
                strSubstring = str.substring(0, 127);
            }
            Trace.endAsyncSection(strSubstring, iHashCode);
        }
        return Unit.a;
    }
}
