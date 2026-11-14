package defpackage;

import android.os.Handler;
import android.os.Message;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class msf implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ osf b;

    public /* synthetic */ msf(osf osfVar, byte b) {
        this.a = b;
        this.b = osfVar;
    }

    public final Object invoke(Object obj) throws IOException {
        byte b = this.a;
        osf osfVar = this.b;
        switch (b) {
            case 0:
                osfVar.c.I(Message.obtain((Handler) null, 4));
                return Unit.a;
            default:
                t56 t56Var = (t56) osfVar.e.h();
                if (t56Var == null) {
                    return Unit.a;
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    try {
                        dataOutputStream.writeByte(2);
                        xq0.c4(dataOutputStream, t56Var);
                        dataOutputStream.close();
                        osfVar.c.H(byteArrayOutputStream.toByteArray());
                    } catch (Throwable th) {
                        dataOutputStream.close();
                        throw th;
                    }
                } catch (IOException unused) {
                }
                return Unit.a;
        }
    }
}
