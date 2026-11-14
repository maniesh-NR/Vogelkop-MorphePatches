package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.opera.android.qr.ScanQrCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class pli implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ScanQrCodeActivity b;

    public /* synthetic */ pli(ScanQrCodeActivity scanQrCodeActivity, byte b) {
        this.a = b;
        this.b = scanQrCodeActivity;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        fp1 fp1Var = this.b;
        switch (b) {
            case 0:
                gfh gfhVar = (gfh) obj;
                if (gfhVar instanceof cfh) {
                    int i = ScanQrCodeActivity.k;
                    String string = mfh.q(((cfh) gfhVar).a).a(fp1Var.getResources()).toString();
                    Intent intent = new Intent();
                    intent.putExtra("error-message", string);
                    fp1Var.setResult(1, intent);
                    fp1Var.finish();
                } else {
                    int i2 = ScanQrCodeActivity.k;
                }
                break;
            default:
                hmi hmiVar = (hmi) obj;
                int i3 = ScanQrCodeActivity.k;
                Intent intent2 = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("raw-value", hmiVar.a);
                bundle.putInt("value-type", hmiVar.b);
                bundle.putInt("format", hmiVar.c.ordinal());
                intent2.putExtra("scan-result", bundle);
                fp1Var.setResult(-1, intent2);
                fp1Var.finish();
                break;
        }
        return Unit.a;
    }
}
