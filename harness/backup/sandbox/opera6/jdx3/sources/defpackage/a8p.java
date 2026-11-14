package defpackage;

import android.view.View;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class a8p implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t8p b;

    public /* synthetic */ a8p(t8p t8pVar, byte b) {
        this.a = b;
        this.b = t8pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        String str;
        byte b = this.a;
        t8p t8pVar = this.b;
        switch (b) {
            case 0:
                t8pVar.c.a(t8pVar);
                t8pVar.j(view);
                break;
            default:
                xho xhoVar = t8pVar.z;
                if (xhoVar != null && (str = xhoVar.s) != null) {
                    euo euoVar = t8pVar.u;
                    int i = euoVar.a;
                    if (i == 7 || i == 4) {
                        euoVar.b();
                    } else {
                        euoVar.r = str;
                        euoVar.c();
                        t8pVar.H = true;
                    }
                    t8p.J = false;
                    break;
                }
                break;
        }
    }
}
