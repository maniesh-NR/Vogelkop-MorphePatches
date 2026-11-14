package defpackage;

import android.net.Uri;
import com.opera.api.Callback;
import java.io.File;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class e0a implements Callback {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ tah b;
    public final /* synthetic */ String c;
    public final /* synthetic */ File d;

    public /* synthetic */ e0a(tah tahVar, File file, String str) {
        this.b = tahVar;
        this.d = file;
        this.c = str;
    }

    public /* synthetic */ e0a(tah tahVar, String str, File file) {
        this.b = tahVar;
        this.c = str;
        this.d = file;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        File file = this.d;
        String str = this.c;
        tah tahVar = this.b;
        switch (b) {
            case 0:
                int iOrdinal = ((m32) obj).ordinal();
                if (iOrdinal == 0) {
                    ((LinkedHashSet) tahVar.j).remove(file);
                    break;
                } else if (iOrdinal != 1) {
                    h9o.p();
                    break;
                } else {
                    yo7 yo7Var = new yo7(tahVar, str, file, (byte) 4);
                    new rml(Unit.a, (umi) tahVar.c).b(new wx1(file, (byte) 5)).t(new tu7(yo7Var, (byte) 19)).l();
                    break;
                }
            default:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    tahVar.a(uri, str);
                } else {
                    joh.h((ysj) ((f0a) tahVar.g).a.getValue(), new rxh(2132019200));
                }
                ((LinkedHashSet) tahVar.j).remove(file);
                break;
        }
    }
}
