package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public interface u2j {
    Object getDefaultValue();

    Object readFrom(InputStream inputStream);

    Unit writeTo(Object obj, OutputStream outputStream);
}
