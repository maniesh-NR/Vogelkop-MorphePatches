package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class jg1 {
    public static /* synthetic */ OutputConfiguration a(int i, Size size) {
        return new OutputConfiguration(i, size);
    }

    public static /* synthetic */ SessionConfiguration b(int i, List list) {
        return new SessionConfiguration(i, list);
    }
}
