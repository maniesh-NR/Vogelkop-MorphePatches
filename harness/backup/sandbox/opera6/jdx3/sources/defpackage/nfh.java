package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.opera.android.BrowserActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class nfh implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;
    public final /* synthetic */ umi c;

    public /* synthetic */ nfh(BrowserActivity browserActivity, umi umiVar, byte b) {
        this.a = b;
        this.b = browserActivity;
        this.c = umiVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.content.Context, com.opera.android.BrowserActivity, java.lang.Object] */
    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 7;
        umi umiVar = this.c;
        ?? r6 = this.b;
        switch (b) {
            case 0:
                t0a t0aVar = (t0a) obj;
                if (t0aVar != null) {
                    if (t0aVar instanceof r0a) {
                        return Unit.a;
                    }
                    if (t0aVar instanceof s0a) {
                        if (!ru9.c(r6).a.getBoolean("qr.google_lens_supported", false)) {
                            return Unit.a;
                        }
                        nv6 nv6VarB = ru9.c(r6).b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("qr.google_lens_supported", false);
                        nv6VarB.w();
                        String string = r6.getString(2132020980);
                        nhj nhjVar = new nhj();
                        nhjVar.a = r6;
                        nhjVar.b = "qrWidgetShortcut";
                        nhjVar.e = string;
                        nhjVar.h = IconCompat.c(2131820548, (Context) r6);
                        Intent intentB = mdb.b(r6);
                        intentB.setAction("com.opera.android.action.SCAN_QR_CODE_FROM_SHORTCUT_WIDGET");
                        nhjVar.c = new Intent[]{intentB};
                        if (TextUtils.isEmpty(nhjVar.e)) {
                            qp2.o("Shortcut must have a non-empty label");
                            return null;
                        }
                        Intent[] intentArr = nhjVar.c;
                        if (intentArr == null || intentArr.length == 0) {
                            qp2.o("Shortcut must have an intent");
                            return null;
                        }
                        Unit unit = Unit.a;
                        new rml(unit, umiVar).a(new vvf(r6, nhjVar, b2)).l();
                        return unit;
                    }
                }
                h9o.p();
                return null;
            default:
                boolean zH = ((f8f) obj).h();
                Unit unit2 = Unit.a;
                if (zH) {
                    new rml(unit2, umiVar).a(new st3(r6, b2)).l();
                } else {
                    new rml(unit2, umiVar).a(new qfl((Object) r6, (byte) 19)).l();
                }
                return unit2;
        }
    }
}
