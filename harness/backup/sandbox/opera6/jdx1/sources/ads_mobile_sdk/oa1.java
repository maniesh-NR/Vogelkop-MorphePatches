package ads_mobile_sdk;

import defpackage.u2j;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class oa1 implements u2j {
    public static final oa1 a = new oa1();
    public static final ia1 b = ia1.p();

    @Override // defpackage.u2j
    public final Object getDefaultValue() {
        return b;
    }

    @Override // defpackage.u2j
    public final Object readFrom(InputStream inputStream) {
        try {
            return ia1.a(inputStream);
        } catch (Exception unused) {
            xu0.c("Stored data has been corrupted", null);
            return b;
        }
    }

    @Override // defpackage.u2j
    public final Unit writeTo(Object obj, OutputStream outputStream) {
        ((ia1) obj).a(outputStream);
        return Unit.a;
    }
}
