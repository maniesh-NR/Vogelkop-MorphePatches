package defpackage;

import android.os.Handler;
import android.os.Message;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class i5f implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x5f b;

    public /* synthetic */ i5f(x5f x5fVar, byte b) {
        this.a = b;
        this.b = x5fVar;
    }

    public final Object invoke(Object obj) throws IOException {
        byte b = this.a;
        x5f x5fVar = this.b;
        switch (b) {
            case 0:
                x5fVar.g.I(Message.obtain((Handler) null, 1));
                return Unit.a;
            default:
                x56 x56Var = (x56) x5fVar.f.h();
                if (x56Var == null) {
                    return Unit.a;
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    try {
                        dataOutputStream.writeByte(2);
                        xq0.g4(dataOutputStream, x56Var);
                        dataOutputStream.close();
                        x5fVar.g.H(byteArrayOutputStream.toByteArray());
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
