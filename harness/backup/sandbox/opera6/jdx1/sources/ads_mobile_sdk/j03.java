package ads_mobile_sdk;

import defpackage.u2j;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class j03 implements u2j {
    public static final j03 a = new j03();
    public static final i03 b = i03.p();

    @Override // defpackage.u2j
    public final Object getDefaultValue() {
        return b;
    }

    @Override // defpackage.u2j
    public final Object readFrom(InputStream inputStream) {
        try {
            return i03.a(inputStream);
        } catch (Exception e) {
            vr3 vr3Var = xu0.a;
            xu0.c("Stored data has been corrupted: " + e, null);
            return b;
        }
    }

    @Override // defpackage.u2j
    public final Unit writeTo(Object obj, OutputStream outputStream) {
        ((i03) obj).a(outputStream);
        return Unit.a;
    }
}
