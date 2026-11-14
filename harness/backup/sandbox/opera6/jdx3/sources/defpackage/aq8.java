package defpackage;

import J.N;
import com.opera.android.webcore.FastResizeWebViewContainer;

/* loaded from: classes.dex */
public final /* synthetic */ class aq8 implements pwe {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aq8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.pwe
    public final void a(bp bpVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zll zllVar = ((FastResizeWebViewContainer) obj).c;
                if (zllVar != null) {
                    int i = bpVar.a;
                    long j = zllVar.a.d;
                    if (j != 0) {
                        N.MwkfWGl7(j, i);
                        break;
                    }
                }
                break;
            default:
                ((fzk) obj).a();
                break;
        }
    }
}
