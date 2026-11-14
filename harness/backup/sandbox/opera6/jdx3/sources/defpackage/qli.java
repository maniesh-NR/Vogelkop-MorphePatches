package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.opera.android.qr.ScanQrCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class qli implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ScanQrCodeActivity b;

    public /* synthetic */ qli(ScanQrCodeActivity scanQrCodeActivity, byte b) {
        this.a = b;
        this.b = scanQrCodeActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        fp1 fp1Var = this.b;
        switch (b) {
            case 0:
                int i = ScanQrCodeActivity.k;
                fp1Var.finish();
                break;
            default:
                int i2 = ScanQrCodeActivity.k;
                Toast.makeText((Context) fp1Var, 2132019200, 0).show();
                break;
        }
        return Unit.a;
    }
}
