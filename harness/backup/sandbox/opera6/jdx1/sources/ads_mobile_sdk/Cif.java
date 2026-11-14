package ads_mobile_sdk;

import defpackage.u2j;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* renamed from: ads_mobile_sdk.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements u2j {
    public static final Cif a = new Cif();
    public static final af b = af.o();

    @Override // defpackage.u2j
    public final Object getDefaultValue() {
        return b;
    }

    @Override // defpackage.u2j
    public final Object readFrom(InputStream inputStream) {
        try {
            return af.a(inputStream);
        } catch (Exception unused) {
            return b;
        }
    }

    @Override // defpackage.u2j
    public final Unit writeTo(Object obj, OutputStream outputStream) {
        ((af) obj).a(outputStream);
        return Unit.a;
    }
}
