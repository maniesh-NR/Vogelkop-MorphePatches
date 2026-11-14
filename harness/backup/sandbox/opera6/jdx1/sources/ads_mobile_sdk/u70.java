package ads_mobile_sdk;

import defpackage.u2j;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class u70 implements u2j {
    public static final u70 a = new u70();
    public static final t70 b = t70.p();

    @Override // defpackage.u2j
    public final Object getDefaultValue() {
        return b;
    }

    @Override // defpackage.u2j
    public final Object readFrom(InputStream inputStream) {
        try {
            return t70.a(inputStream);
        } catch (Exception e) {
            vr3 vr3Var = xu0.a;
            xu0.c("Stored CSRB data has been corrupted: " + e, null);
            return b;
        }
    }

    @Override // defpackage.u2j
    public final Unit writeTo(Object obj, OutputStream outputStream) {
        ((t70) obj).a(outputStream);
        return Unit.a;
    }
}
