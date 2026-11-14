package defpackage;

import android.content.Context;
import android.net.Uri;
import com.opera.android.ui.catalog.widget.OperaChip;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class vii implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iji b;

    public /* synthetic */ vii(iji ijiVar, byte b) {
        this.a = b;
        this.b = ijiVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, dx3] */
    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        iji ijiVar = this.b;
        switch (b) {
            case 0:
                Uri uri = (Uri) obj;
                if (!ijiVar.p.equals(uri)) {
                    ijiVar.p = uri;
                    ijiVar.Z();
                    ijiVar.m(true);
                    ((OperaChip) ijiVar.o.h).setText(v61.b(ijiVar.b.getContext(), ijiVar.p));
                    break;
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ?? r0 = ijiVar.c;
                w8d w8dVar = new w8d((byte) 2, ijiVar, zBooleanValue);
                int[][] iArr = lg7.a;
                if (!r9n.X((Context) r0)) {
                    f03.U(r0.j, "android.permission.WRITE_EXTERNAL_STORAGE", new dz4(w8dVar));
                    break;
                } else {
                    w8dVar.run(Boolean.TRUE);
                    break;
                }
        }
    }
}
