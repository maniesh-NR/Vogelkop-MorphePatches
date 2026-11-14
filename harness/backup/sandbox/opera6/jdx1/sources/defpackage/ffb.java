package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public interface ffb extends List, RandomAccess {
    boolean isModifiable();

    void makeImmutable();

    ffb mutableCopyWithCapacity(int i);
}
