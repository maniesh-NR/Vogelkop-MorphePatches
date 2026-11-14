package ads_mobile_sdk;

import defpackage.u2j;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class o1 implements u2j {
    public static final o1 a = new o1();
    public static final h1 b = h1.q();

    @Override // defpackage.u2j
    public final Object getDefaultValue() {
        return b;
    }

    @Override // defpackage.u2j
    public final Object readFrom(InputStream inputStream) {
        h1 h1VarA;
        WeakHashMap weakHashMap = hh3.a;
        rg3 rg3VarA = hh3.a(fw0.CUI_NAME_PERSISTENT_CACHE_METADATA_READ, l08.a, true);
        try {
            try {
                h1VarA = h1.a(inputStream);
            } catch (Throwable th) {
                try {
                    rg3VarA.b(th);
                    if (th instanceof iyo) {
                        throw th;
                    }
                    rg3VarA.a(th);
                    if (th instanceof kql) {
                        throw new uw0((kql) th);
                    }
                    if (th instanceof CancellationException) {
                        throw new ou0(th);
                    }
                    if (th instanceof mv0) {
                        throw th;
                    }
                    throw new tu0(th);
                } finally {
                }
            }
        } catch (Exception e) {
            xh3.a("Stored data has been corrupted: " + e, null, 6);
            vr3 vr3Var = xu0.a;
            xu0.c("Stored data has been corrupted: " + e, null);
            h1VarA = b;
        }
        rg3VarA.close();
        return h1VarA;
    }

    @Override // defpackage.u2j
    public final Unit writeTo(Object obj, OutputStream outputStream) {
        ((h1) obj).a(outputStream);
        return Unit.a;
    }
}
