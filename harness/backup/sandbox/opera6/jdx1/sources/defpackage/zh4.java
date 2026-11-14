package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zh4 {
    public final List a;

    public zh4(List list) {
        if (list == null || list.isEmpty()) {
            qp2.o("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.a = Collections.unmodifiableList(new ArrayList(list));
    }
}
