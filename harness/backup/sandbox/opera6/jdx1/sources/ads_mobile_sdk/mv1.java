package ads_mobile_sdk;

import defpackage.u2j;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class mv1 implements u2j {
    public static final mv1 a = new mv1();
    public static final zu1 b = zu1.q();

    @Override // defpackage.u2j
    public final Object getDefaultValue() {
        return b;
    }

    @Override // defpackage.u2j
    public final Object readFrom(InputStream inputStream) {
        try {
            return zu1.a(inputStream);
        } catch (Exception e) {
            vr3 vr3Var = xu0.a;
            xu0.c("Stored data has been corrupted: " + e, null);
            return b;
        }
    }

    @Override // defpackage.u2j
    public final Unit writeTo(Object obj, OutputStream outputStream) {
        ((zu1) obj).a(outputStream);
        return Unit.a;
    }
}
