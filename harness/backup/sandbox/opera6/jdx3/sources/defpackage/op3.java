package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class op3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nwf b;

    public /* synthetic */ op3(nwf nwfVar, byte b) {
        this.a = b;
        this.b = nwfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        nwf nwfVar = this.b;
        switch (b) {
            case 0:
                new bbl(nwfVar, view, (byte) 0);
                break;
            case 1:
                new xp3(nwfVar, (byte) 3);
                break;
            case 2:
                new bbl(nwfVar, view, (byte) 3);
                break;
            default:
                new xp3(nwfVar, (byte) 3);
                break;
        }
    }
}
