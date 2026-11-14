package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.webcore.AiAssistantUpdateBridge;

/* loaded from: classes.dex */
public final class jw0 extends lim {
    public final /* synthetic */ byte a;
    public final BrowserActivity b;

    public jw0(BrowserActivity browserActivity) {
        this.a = (byte) 0;
        this.b = browserActivity;
        browserActivity.getLifecycle().a(this);
    }

    public /* synthetic */ jw0(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        switch (this.a) {
            case 0:
                ndcVar.getLifecycle().b(this);
                if (AiAssistantUpdateBridge.a == this) {
                    AiAssistantUpdateBridge.a = null;
                    break;
                }
                break;
            case 1:
                ndcVar.getLifecycle().b(this);
                vml.c(new qt3(this.b, (byte) 18));
                break;
            default:
                super.onDestroy(ndcVar);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        switch (this.a) {
            case 2:
                ndcVar.getLifecycle().b(this);
                int i = BrowserActivity.E1;
                b2l b2lVarW0 = this.b.w0();
                if (b2lVarW0 != null) {
                    ((d7l) b2lVarW0).M(true);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        switch (this.a) {
            case 3:
                BrowserActivity browserActivity = this.b;
                gbf gbfVar = browserActivity.M;
                if (gbfVar == null) {
                    gbfVar = null;
                }
                if (gbfVar.i()) {
                    gbf gbfVar2 = browserActivity.M;
                    (gbfVar2 != null ? gbfVar2 : null).f();
                    break;
                }
                break;
        }
    }
}
