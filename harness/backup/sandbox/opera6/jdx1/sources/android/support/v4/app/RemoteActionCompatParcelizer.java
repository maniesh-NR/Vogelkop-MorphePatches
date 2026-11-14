package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import defpackage.e2n;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(e2n e2nVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(e2nVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, e2n e2nVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, e2nVar);
    }
}
