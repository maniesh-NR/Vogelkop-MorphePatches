package defpackage;

import com.leanplum.internal.FileTransferManager;
import com.leanplum.internal.Request;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class qj implements ekj, dkj, Request.ResponseCallback, Request.ErrorCallback, n5o, m9n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ qj(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // defpackage.dkj
    public final void a() {
        this.b.run();
    }

    @Override // defpackage.ekj
    public final void b(hjm hjmVar) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }

    @Override // com.leanplum.internal.Request.ErrorCallback
    public final void error(Exception exc) {
        FileTransferManager.lambda$downloadFile$1(this.b, exc);
    }

    public final Object g(Object obj) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 4:
                runnable.run();
                break;
            case 5:
                runnable.run();
                break;
            case 6:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
        return null;
    }

    @Override // defpackage.m9n
    public final void j() {
        this.b.run();
    }

    @Override // com.leanplum.internal.Request.ResponseCallback
    public final void response(JSONObject jSONObject) {
        FileTransferManager.lambda$downloadFile$0(this.b, jSONObject);
    }
}
