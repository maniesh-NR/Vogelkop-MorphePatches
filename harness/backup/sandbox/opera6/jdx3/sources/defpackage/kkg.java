package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class kkg implements od3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ okg b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ kkg(okg okgVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = okgVar;
        this.c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [dgd] */
    @Override // defpackage.od3
    public final void c(Integer num, qjd qjdVar) {
        byte b = this.a;
        ArrayList arrayList = this.c;
        okg okgVar = this.b;
        switch (b) {
            case 0:
                egd egdVarC = okgVar.c(qjdVar);
                String str = qjdVar.a;
                if (egdVarC != null) {
                    arrayList.add(new mkg(okgVar.c.a(qjdVar.e, egdVarC), egdVarC, (Bitmap) okgVar.d.get(str), str));
                    break;
                }
                break;
            default:
                egd egdVarC2 = okgVar.c(qjdVar);
                if (egdVarC2 != null) {
                    Bundle bundle = qjdVar.e.I;
                    if (bundle != null && bundle.getBoolean("com.opera.android.media.NOT_PERSISTENT_IN_QUEUE", false)) {
                        arrayList.add(null);
                        break;
                    } else {
                        if (egdVarC2.e == Integer.MIN_VALUE) {
                            re7 re7Var = egdVarC2.a;
                            long j = re7Var != null ? re7Var.o : 0L;
                            Uri uri = egdVarC2.b;
                            dgdVar = new dgd(uri != null ? uri.toString() : null, egdVarC2.d, egdVarC2.c, j);
                        }
                        arrayList.add(dgdVar);
                        break;
                    }
                }
                break;
        }
    }
}
