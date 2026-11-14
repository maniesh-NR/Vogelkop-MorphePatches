package defpackage;

import android.content.res.Resources;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class g5m implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h5m b;

    public /* synthetic */ g5m(h5m h5mVar, byte b) {
        this.a = b;
        this.b = h5mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws InterruptedException, Resources.NotFoundException {
        byte b = this.a;
        h5m h5mVar = this.b;
        switch (b) {
            case 0:
                h5mVar.d.run();
                break;
            default:
                h5mVar.d.run();
                break;
        }
    }
}
