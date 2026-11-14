package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class ark implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mrk b;

    public /* synthetic */ ark(mrk mrkVar, byte b) {
        this.a = b;
        this.b = mrkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        mrk mrkVar = this.b;
        switch (b) {
            case 0:
                mrkVar.b();
                break;
            default:
                mrkVar.b();
                break;
        }
    }
}
